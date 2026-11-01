package com.kodewala.Polymorphism.PaymentMethod;

public class DebitCardPayment extends Payment {
    @Override
    public void doPayment() {
        System.out.println("DebitCard.doPayment....DebitCardPayment");
    }
}
