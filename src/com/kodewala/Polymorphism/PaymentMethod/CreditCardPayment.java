package com.kodewala.Polymorphism.PaymentMethod;

public class CreditCardPayment extends Payment {
    @Override
    public void doPayment() {
        System.out.println("CreditCard.doPayment,,,,,,Credit Card");
    }
}
