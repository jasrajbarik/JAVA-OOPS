package com.kodewala.Polymorphism;
class User
{
    void userClass() {
        System.out.println("UserClass");
        }
}
class AdminUser extends User {          // adminUser IS-A User
    void adminClass() {
        System.out.println("AdminUser");
    }
}

public class Driver {
    public static void main(String[] args) {
        //normal object creation and refering
        User user = new User();
        AdminUser admin = new AdminUser();
        user.userClass();
        admin.userClass();
        admin.adminClass();

 //upcasting: parent class can refer child class object
        User au = new AdminUser();
        au.userClass();
        //au.adminClass(); --> compilation error


        AdminUser aduser = (AdminUser) au; //downcastin: child class is referring to parent class object
        aduser.userClass();
        aduser.adminClass();
    }
}
