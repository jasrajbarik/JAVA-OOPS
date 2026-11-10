package com.kodewala.Revision.Rev1;

public class DeliveryDriver {
    public static void main(String[] args) {
        DeliveryPartner deliveryPartner = new DeliveryPartner();
        //Compile time --> it will check the method in Delivery Class
        //Runtime --> it will call the method of Delivery Class
        deliveryPartner.doDelivery();
        deliveryPartner.hashCode(); //hashCode() is in the Object Class

        //Parent Class can refer child class object
        DeliveryPartner delivery = new XpressBee();
        delivery.doDelivery(); 
        XpressBee xbee = (XpressBee) delivery;
        xbee.doDelivery();
    }
}
