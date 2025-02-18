package com.huudan.ecommerce.service;

import com.huudan.ecommerce.dto.PaymentInfo;
import com.huudan.ecommerce.dto.Purchase;
import com.huudan.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}
