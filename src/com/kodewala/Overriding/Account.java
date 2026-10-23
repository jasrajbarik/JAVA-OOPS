package com.kodewala.Overriding;

public class Account {
    int minBalance = 10000;
    public String openAccount(String name, int intiBal) {
        // some.. 100 lines of code
        System.out.println("Account.openAccount()......");
        return "some String";
    }
}

class SavingAccount extends Account {
    /* 1. Method name should be same.
    *  2. Type, order and Number of args should be same.
    *  3. Return type should be same except covariant.
    *  4. Access Modifier --> should be same or widen(public --> public, protected --> protected or public.  */

    @Override  // you are telling the compiler that- i am overriding the method, please check all the rules.
    public String openAccount(String name, int initBal) {
        // 200 lines of code
        System.out.println("SavingAccount.openAccount()...........");
        return "Some other String";
    }
}