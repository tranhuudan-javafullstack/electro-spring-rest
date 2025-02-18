package com.electro.service.chat;

import com.electro.constant.ResourceName;
import com.electro.constant.SearchFields;
import com.electro.model.common.ListResponse;
import com.electro.model.request.chat.MessageRequest;
import com.electro.model.reponse.chat.MessageResponse;
import com.electro.model.entity.chat.Message;
import com.electro.mapper.chat.MessageMapper;
import com.electro.repository.authentication.UserRepository;
import com.electro.repository.chat.MessageRepository;
import com.electro.repository.chat.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;
    private final RoomRepository roomRepository;
    private final UserRepository userRepository;
    private final MessageMapper messageMapper;

    @Override
    public ListResponse<MessageResponse> findAll(int page, int size, String sort, String filter, String search, boolean all) {
        return defaultFindAll(page, size, sort, filter, search, all, SearchFields.MESSAGE.getFields(), messageRepository, messageMapper);
    }

    @Override
    public MessageResponse findById(Long id) {
        return defaultFindById(id, messageRepository, messageMapper, ResourceName.MESSAGE.getResourceName());
    }

    @Override
    public MessageResponse save(MessageRequest request) {
        Message message = messageMapper.requestToEntity(request);

        userRepository.findById(request.getUserId()).ifPresent(message::setUser);

        // (1) Save message
        Message messageAfterSave = messageRepository.save(message);

        // (2) Save room
        roomRepository.findById(request.getRoomId())
                .ifPresent(room -> {
                    room.setUpdatedAt(Instant.now());
                    room.setLastMessage(messageAfterSave);
                    roomRepository.save(room);
                });

        return messageMapper.entityToResponse(messageAfterSave);
    }

    @Override
    public MessageResponse save(Long id, MessageRequest request) {
        return defaultSave(id, request, messageRepository, messageMapper, ResourceName.MESSAGE.getResourceName());
    }

    @Override
    public void delete(Long id) {
        messageRepository.deleteById(id);
    }

    @Override
    public void delete(List<Long> ids) {
        messageRepository.deleteAllById(ids);
    }

}
