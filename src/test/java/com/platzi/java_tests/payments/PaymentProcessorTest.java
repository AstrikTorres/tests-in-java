package com.platzi.java_tests.payments;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.platzi.java_tests.payments.PaymentResponse.PaymentStatus.*;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PaymentProcessorTest {

    @InjectMocks
    PaymentProcessor paymentProcessor;

    @Mock
    PaymentGateway paymentGateway;

    @Test
    public void paymentIsCorrect() {
        // any(): Simulate with mockito classes that can not be tested directly (PaymentRequest).
        when(paymentGateway.requestPayment(any()))
                .thenReturn(new PaymentResponse(OK));

        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void makePayment_whenPaymentIsWrong() {
        when(paymentGateway.requestPayment(any()))
                .thenReturn(new PaymentResponse(ERROR));

        assertFalse(paymentProcessor.makePayment(1000));
    }
}