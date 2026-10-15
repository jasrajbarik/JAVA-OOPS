package Encapsulation;

public class BankPortal {

    private int balance; //private so that other class can't change this value
    // Encapsulation: you don't share your data directly, can use getter methods.
    private String accHolderName;
    private String accNumber;

    public BankPortal(int _balance, String _accHolderName, String _accNumber) {
        super();
        this.balance = _balance;
        this.accHolderName = _accHolderName;
        this.accNumber = _accNumber;
    }

    //setter
    public void doDebit(int _amount) {
        if (_amount <= balance && _amount>0) {
            //Modifying the data
            balance = balance - _amount;
            System.out.println("Debit of : Rs " + _amount);
            System.out.println("Current Balance: Rs "+getBalance());
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void doCredit(int _amount) {
        if (_amount > 0) {
            //Modifying the data
            balance = balance + _amount;
            System.out.println("Credit of : Rs " + _amount);
            System.out.println("Current Balance : Rs "+getBalance());
        } else {
            System.out.println("Enter valid Amount ");
        }
    }

    //getter
    public int getBalance() {
        return balance;
    }
    public void getDetails()
    {
        System.out.println("Account Holder Name: "+accHolderName);
        System.out.println("Account Number: "+accNumber);
    }
}
