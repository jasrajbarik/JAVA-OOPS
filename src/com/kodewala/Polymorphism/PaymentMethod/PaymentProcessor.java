package com.kodewala.Polymorphism.PaymentMethod;

public class PaymentProcessor {
    public void processPayment(Payment payment) { //can accept any type of Payment object
        payment.doPayment(); //Polymorphism // Payment payment = new NetBanking();
    }
}
