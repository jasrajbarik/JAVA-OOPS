package Inheritance.Disadvantage;

public class AccountDriver {
    public static void main(String[] args) {
        PensionAccount pension = new PensionAccount();
        pension.openAccount("Jasraj606","jasraj@gmail.com");
        pension.openAccountNew();
        SrCzAccount sz = new SrCzAccount();
        sz.openAccount("raj","raj@gmail.com");
    }
}
