package com.kodewala.Inheritance.Product;

public class ElectronicProducts extends Product {
    boolean isWarranty;
    int warrantyInYears;
    public ElectronicProducts(String _productName, String _description, int _quantity, String _status, boolean _isWarranty, int _warrantyInYears)
    {
        super(_productName,_description,_quantity,_status);
        this.isWarranty=_isWarranty;
        this.warrantyInYears=_warrantyInYears;
    }
    public void viewElecDetails()
    {
        System.out.println(productName);
        System.out.println(description);
        System.out.println(quantity);
        System.out.println(status);

        System.out.println(isWarranty);
        System.out.println(warrantyInYears);
    }
}
