package com.electro.controller.client;

import com.electro.constant.AppConstants;
import com.electro.model.common.CollectionWrapper;
import com.electro.model.reponse.cashbook.ClientPaymentMethodResponse;
import com.electro.mapper.cashbook.PaymentMethodMapper;
import com.electro.repository.cashbook.PaymentMethodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client-api/payment-methods")
@RequiredArgsConstructor
@CrossOrigin(AppConstants.FRONTEND_HOST)
public class ClientPaymentMethodController {

    private final PaymentMethodRepository paymentMethodRepository;
    private final PaymentMethodMapper paymentMethodMapper;

    @GetMapping
    public ResponseEntity<CollectionWrapper<ClientPaymentMethodResponse>> getAllPaymentMethods() {
        List<ClientPaymentMethodResponse> clientPaymentMethodResponses = paymentMethodMapper
                .entityToClientResponse(paymentMethodRepository.findAllByStatus(1));
        return ResponseEntity.status(HttpStatus.OK).body(CollectionWrapper.of(clientPaymentMethodResponses));
    }

}
