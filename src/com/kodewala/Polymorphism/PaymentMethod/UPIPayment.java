package com.kodewala.Polymorphism.PaymentMethod;

public class UPIPayment extends Payment {
    @Override
    public void doPayment()
    {
        System.out.println("UPIPayment.doPayment....UPIPayment");
    }
}
