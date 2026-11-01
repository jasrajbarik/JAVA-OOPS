package com.kodewala.Polymorphism.PaymentMethod;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        //for 1st User:
        CreditCardPayment cardPayment = new CreditCardPayment();
        paymentProcessor.processPayment(cardPayment);

        //for 2nd User:
        NetBanking netPaymnt = new NetBanking();
        paymentProcessor.processPayment(netPaymnt);

        //for 3rd User:
        UPIPayment upiPayment = new UPIPayment();
        paymentProcessor.processPayment(upiPayment);

        //for 4th User:
        DebitCardPayment debitCardPayment = new DebitCardPayment();
        paymentProcessor.processPayment(debitCardPayment);

    }
}
