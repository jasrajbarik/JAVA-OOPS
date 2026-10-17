package com.kodewala.Encapsulation;

public class BankPortalDriver {
    public static void main(String[] args) {
        BankPortal bank = new BankPortal(250000,"Jasraj Barik","6525410012487");
        System.out.println("Current Balance: Rs "+bank.getBalance());
        bank.doCredit(2500);
        bank.doCredit(-200);
        bank.doDebit(65000);
        bank.doCredit(30);
        bank.doDebit(-200);
        bank.getDetails();
    }
}
