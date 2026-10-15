package Inheritance.Product;

public class Product {
    //Generic Products
    String productName;
    String description;
    int quantity;
    String status;

    public Product(String _productName, String _description, int _quantity, String _status)
    {
    super();
    this.description=_description;
    this.productName=_productName;
    this.quantity=_quantity;
    this.status=_status;
    }
    public void viewProductDetails()
    {
        System.out.println(productName);
        System.out.println(description);
        System.out.println(quantity);
        System.out.println(status);
    }
}
