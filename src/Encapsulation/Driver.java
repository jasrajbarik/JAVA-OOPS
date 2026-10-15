package Encapsulation;

public class Driver {
    public static void main(String[] args) {
        Payment pay = new Payment(20000);
        System.out.println("Current Balance: Rs "+pay.getBalance());
        pay.doCredit(12000);
        System.out.println("Current Balance : Rs "+pay.getBalance());
        pay.doDebit(25000);
        System.out.println("Current Balance : Rs "+pay.getBalance());
    }
}
