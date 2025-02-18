package com.electro.service.order;

import com.electro.model.reponse.client.ClientConfirmedOrderResponse;
import com.electro.model.request.client.ClientSimpleOrderRequest;

public interface OrderService {

    void cancelOrder(String code);

    ClientConfirmedOrderResponse createClientOrder(ClientSimpleOrderRequest request);

    void captureTransactionPaypal(String paypalOrderId, String payerId);

}
