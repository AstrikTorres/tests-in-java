package com.platzi.java_tests.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
