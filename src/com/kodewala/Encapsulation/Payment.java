package com.kodewala.Encapsulation;

public class Payment {
    private int balance; //private so that other class can't change this value
    // com.kodewala.Encapsulation: you don't share your data directly, can use getter methods.
    public Payment(int _balance) {
        super();
        this.balance = _balance;
    }
    //setter
    public void doDebit(int _amount) {
        if(_amount<balance) {
            //Modifying the data
            balance = balance - _amount;
            System.out.println("Debit of : Rs "+_amount);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public void doCredit(int _amount) {
        if(_amount>0) {
            //Modifying the data
            balance = balance + _amount;
            System.out.println("Credit of : Rs "+_amount);
        }
        else {
            System.out.println("Enter valid Amount ");
        }
    }
    //getter
    public int getBalance() {
        return balance;
    }
}
