package com.electro.service.statistic;

import com.electro.model.projection.statistic.StatisticResource;
import com.electro.model.reponse.statistic.StatisticResponse;
import com.electro.repository.authentication.UserProjectionRepository;
import com.electro.repository.customer.CustomerRepository;
import com.electro.repository.order.OrderProjectionRepository;
import com.electro.repository.order.OrderRepository;
import com.electro.repository.product.BrandRepository;
import com.electro.repository.product.ProductRepository;
import com.electro.repository.product.SupplierRepository;
import com.electro.repository.promotion.PromotionRepository;
import com.electro.repository.review.ReviewProjectionRepository;
import com.electro.repository.review.ReviewRepository;
import com.electro.repository.waybill.WaybillProjectionRepository;
import com.electro.repository.waybill.WaybillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StatisticServiceImpl implements StatisticService {

    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;
    private final WaybillRepository waybillRepository;
    private final PromotionRepository promotionRepository;
    private final SupplierRepository supplierRepository;
    private final BrandRepository brandRepository;
    private final ReviewRepository reviewRepository;
    private final UserProjectionRepository userProjectionRepository;
    private final OrderProjectionRepository orderProjectionRepository;
    private final WaybillProjectionRepository waybillProjectionRepository;
    private final ReviewProjectionRepository reviewProjectionRepository;

    @Override
    public StatisticResponse getStatistic() {
        StatisticResponse statisticResponse = new StatisticResponse();

        // TODO: Nên dùng tên hàm `count` hợp lý hơn, như `countAll()`
        int totalCustomer = customerRepository.countByCustomerId();
        int totalProduct = productRepository.countByProductId();
        int totalOrder = orderRepository.countByOrderId();
        int totalWaybill = waybillRepository.countByWaybillId();
        int totalReview = reviewRepository.countByReviewId();
        int totalActivePromotion = promotionRepository.countByPromotionId();
        int totalSupplier = supplierRepository.countBySupplierId();
        int totalBrand = brandRepository.countByBrandId();

        List<StatisticResource> statisticRegistration = userProjectionRepository.getUserCountByCreateDate();
        List<StatisticResource> statisticOrder = orderProjectionRepository.getOrderCountByCreateDate();
        List<StatisticResource> statisticReview = reviewProjectionRepository.getReviewCountByCreateDate();
        List<StatisticResource> statisticWaybill = waybillProjectionRepository.getWaybillCountByCreateDate();

        statisticResponse.setTotalCustomer(totalCustomer);
        statisticResponse.setTotalProduct(totalProduct);
        statisticResponse.setTotalOrder(totalOrder);
        statisticResponse.setTotalWaybill(totalWaybill);
        statisticResponse.setTotalReview(totalReview);
        statisticResponse.setTotalActivePromotion(totalActivePromotion);
        statisticResponse.setTotalSupplier(totalSupplier);
        statisticResponse.setTotalBrand(totalBrand);
        statisticResponse.setStatisticRegistration(statisticRegistration);
        statisticResponse.setStatisticOrder(statisticOrder);
        statisticResponse.setStatisticReview(statisticReview);
        statisticResponse.setStatisticWaybill(statisticWaybill);

        return statisticResponse;
    }

}
