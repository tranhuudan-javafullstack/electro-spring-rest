package com.electro.service.inventory;

import com.electro.constant.FieldName;
import com.electro.constant.ResourceName;
import com.electro.constant.SearchFields;
import com.electro.model.common.ListResponse;
import com.electro.model.request.inventory.DocketRequest;
import com.electro.model.reponse.inventory.DocketResponse;
import com.electro.model.entity.client.Preorder;
import com.electro.model.entity.general.Notification;
import com.electro.model.enums.NotificationType;
import com.electro.model.entity.inventory.Docket;
import com.electro.exception.ResourceNotFoundException;
import com.electro.mapper.general.NotificationMapper;
import com.electro.mapper.inventory.DocketMapper;
import com.electro.repository.client.PreorderRepository;
import com.electro.repository.general.NotificationRepository;
import com.electro.repository.inventory.DocketRepository;
import com.electro.service.general.NotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class DocketServiceImpl implements DocketService {

    private final DocketRepository docketRepository;

    private final DocketMapper docketMapper;

    private final PreorderRepository preorderRepository;

    private final NotificationRepository notificationRepository;

    private final NotificationService notificationService;

    private final NotificationMapper notificationMapper;

    @Override
    public ListResponse<DocketResponse> findAll(int page, int size, String sort, String filter, String search, boolean all) {
        return defaultFindAll(page, size, sort, filter, search, all, SearchFields.DOCKET.getFields(), docketRepository, docketMapper);
    }

    @Override
    public DocketResponse findById(Long id) {
        return defaultFindById(id, docketRepository, docketMapper, ResourceName.DOCKET.getResourceName());
    }

    @Override
    public DocketResponse save(DocketRequest request) {
        Docket docket = docketRepository.save(docketMapper.requestToEntity(request));
        afterCreateOrUpdateCallback(docket);
        return docketMapper.entityToResponse(docket);
    }

    @Override
    public DocketResponse save(Long id, DocketRequest request) {
        Docket docket = docketRepository.findById(id)
                .map(existingEntity -> docketMapper.partialUpdate(existingEntity, request))
                .map(docketRepository::save)
                .orElseThrow(() -> new ResourceNotFoundException(ResourceName.DOCKET.getResourceName(), FieldName.ID.getFieldName(), id));
        afterCreateOrUpdateCallback(docket);
        return docketMapper.entityToResponse(docket);
    }

    private void afterCreateOrUpdateCallback(Docket docket) {
        // Docket nhập (1) có trạng thái Hoàn thành (3)
        if (docket.getType().equals(1) && docket.getStatus().equals(3)) {
            List<Long> productIds = docket.getDocketVariants().stream()
                    .map(docketVariant -> docketVariant.getVariant().getProduct().getId())
                    .distinct()
                    .collect(Collectors.toList());

            List<Preorder> preorders = preorderRepository.findByProduct_IdInAndStatus(productIds, 1);

            List<Notification> notifications = preorders.stream()
                    .map(preorder -> new Notification()
                            .setUser(preorder.getUser())
                            .setType(NotificationType.PREORDER)
                            .setMessage(String.format("Sản phẩm %s đã có hàng. Vui lòng kiểm tra.", preorder.getProduct().getName()))
                            .setAnchor("/product/" + preorder.getProduct().getSlug())
                            .setStatus(1))
                    .collect(Collectors.toList());

            notificationRepository.saveAll(notifications);

            notifications.forEach(notification -> notificationService
                    .pushNotification(notification.getUser().getUsername(), notificationMapper.entityToResponse(notification)));

            preorders.forEach(preorder -> {
                preorder.setUpdatedAt(Instant.now());
                preorder.setStatus(2);
            });

            preorderRepository.saveAll(preorders);

            List<String> usernames = notifications.stream()
                    .map(notification -> notification.getUser().getUsername())
                    .collect(Collectors.toList());

            log.info("Push notifications for users: " + usernames);
        }
    }

    @Override
    public void delete(Long id) {
        docketRepository.deleteById(id);
    }

    @Override
    public void delete(List<Long> ids) {
        docketRepository.deleteAllById(ids);
    }

}
