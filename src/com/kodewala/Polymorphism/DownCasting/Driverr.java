package com.kodewala.Polymorphism.DownCasting;

class User {

    void login() {
        System.out.println("User logged in successfully");
    }

    void userClass() {
        System.out.println("Accessing User Profile");
    }
}

class AdminUser extends User {

    @Override
    void login() {
        System.out.println("Admin logged in successfully");
    }

    void adminClass() {
        System.out.println("Accessing Admin Dashboard");
    }
}

public class Driverr {

    public static void main(String[] args) {

        // Normal object creation
        User u1 = new User();

        u1.login();
        u1.userClass();

        System.out.println("-------------------");

        // Normal child object creation
        AdminUser a1 = new AdminUser();

        a1.login();
        a1.userClass();
        a1.adminClass();

        System.out.println("-------------------");

        // UPCASTING
        User u2 = new AdminUser();

        u2.login();
        u2.userClass();

        // u2.adminClass(); // Compilation error

        System.out.println("-------------------");

        // DOWNCASTING
        AdminUser a2 = (AdminUser) u2;

        a2.login();
        a2.userClass();
        a2.adminClass();
    }
}
