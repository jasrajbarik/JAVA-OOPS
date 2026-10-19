package com.kodewala.Abstraction.Oct19;


class PlaceOrder {

    // Exposed functionality
    public void placeOrder(String productName, int quantity) {

        validateOrder(productName, quantity);
        checkStock(productName, quantity);
        processPayment();
        updateInventory(productName, quantity);

        System.out.println("Order placed successfully! : "+productName+" , Quantity: "+quantity);
    }

    // Hidden core functionalities

    private void validateOrder(String productName, int quantity) {
        System.out.println("Validating order...");
    }

    private void checkStock(String productName, int quantity) {
        System.out.println("Checking stock...");
    }

    private void processPayment() {
        System.out.println("Processing payment...");
    }

    private void updateInventory(String productName, int quantity) {
        System.out.println("Updating inventory...");
    }
}

public class Customer {

    public static void main(String[] args) {

        PlaceOrder order = new PlaceOrder();

        order.placeOrder("Laptop", 1);
    }
}
