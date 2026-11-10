package com.kodewala.Revision.Rev2;

public class Driver {
    public static void main(String[] args) {
    DeliveryProcessor deliveryProcessor = new DeliveryProcessor();
    deliveryProcessor.processDelivery(new Ekart());
    deliveryProcessor.processDelivery(new XpressBee());
    deliveryProcessor.processDelivery(new ShipRocket());
    }
}
