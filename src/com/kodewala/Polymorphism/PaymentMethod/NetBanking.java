package com.kodewala.Polymorphism.PaymentMethod;

public class NetBanking extends Payment {
    @Override
    public void doPayment() {
        System.out.println("NetBanking.doPayment.....NetBanking");
    }
}
