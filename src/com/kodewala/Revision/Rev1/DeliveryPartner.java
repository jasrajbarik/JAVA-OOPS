package com.kodewala.Revision.Rev1;

public class DeliveryPartner {
public void doDelivery() {
    System.out.println("DeliveryPartner.doDelivery....");
}
}
class XpressBee extends DeliveryPartner {
   //we can reuse the parent class methods here + we can override too
@Override
    public void doDelivery() {
        System.out.println("XpressBee.doDelivery....override");
    }
}

class Ekart extends DeliveryPartner {

}
