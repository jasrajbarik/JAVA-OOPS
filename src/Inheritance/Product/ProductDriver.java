package Inheritance.Product;

public class ProductDriver {
    public static void main(String[] args) {
        Product prod = new Product("Iphone","ios device", 12, "in stock");
        ElectronicProducts ep = new ElectronicProducts("Iphone","ios device", 12, "in stock", true, 1);
        ClothingProducts cp = new ClothingProducts("Tshirt", "cotton t shirt",123,"available all size","Male",44);
        prod.viewProductDetails();
        System.out.println("**********");
        ep.viewElecDetails();
        System.out.println("**********");
        cp.showClothingDetails();
    }
}
