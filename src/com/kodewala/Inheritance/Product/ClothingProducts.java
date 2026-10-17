package com.kodewala.Inheritance.Product;

public class ClothingProducts extends Product {
    String gender;
    int size;
    public ClothingProducts(String _productName, String _description, int _quantity, String _status, String _gender, int _size)
    {
        super(_productName,_description,_quantity,_status);
        this.gender=_gender;
        this.size=_size;
    }
    public void showClothingDetails()
    {
        System.out.println(productName);
        System.out.println(description);
        System.out.println(quantity);
        System.out.println(status);

        System.out.println(gender);
        System.out.println(size);
    }
}
