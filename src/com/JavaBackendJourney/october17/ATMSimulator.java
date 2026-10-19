package com.JavaBackendJourney.october17;

import java.util.Scanner;

public class ATMSimulator {
    static double balance = 50000;
    static String username = "jasrajbarik";
    static String password = "jasraj12345";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean loggedIn = false;

        for(int attempt =1;attempt <=3; attempt ++) {
            System.out.println("Enter username: ");
            String enteredUser = sc.nextLine();

            System.out.println("Enter Password: ");
            String enteredPassword = sc.nextLine();

            if(enteredUser.equalsIgnoreCase(username) && enteredPassword.equals(password)) {
                loggedIn = true;
                break;
            }
            System.out.println("Invalid login. "+ (3-attempt)+" attempt left");
        }
        if(!loggedIn) {
            System.out.println("Account locked for this session ");
            sc.close();
            return;
        }

        int choice =0;
        while(choice !=5)
        {
            System.out.println("\n1. Check Balance ");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw");
            System.out.println("4. Change Password ");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.println("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    deposit(deposit);
                    break;
                case 3:
                    System.out.println("Enter Withdrawal Amount ");
                    double withdrawal = sc.nextDouble();
                    withdraw(withdrawal);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Enter New Password: ");
                    String newPassword = sc.nextLine();
                    changePassword(newPassword);
                    break;
                case 5:
                    System.out.println("Thank You for using the ATM. ");
                    break;

                default:
                    System.out.println("Invalid choice: ");
            }
        }
        sc.close();
    }

    static void checkBalance()
    {
        System.out.println("Balance: Rs"+balance);
    }
    static void deposit(double  amount) {
        if(amount<=0) {
            System.out.println("Deposit must be positive ");
        }
        else {
            balance+=amount;
            System.out.println("Deposit Successful. ");
        }
    }
    static void withdraw(double amount) {
        if(amount<0) {
            System.out.println("Withdrawal must be positive");
        }
        else if (amount> balance)
        {
            System.out.println("Insufficient Balance.");
        }
        else {
            balance-=amount;
            System.out.println("Withdrawal Successful.");
        }
    }
    static void changePassword(String pass) {
        if(pass.length()<8){
            System.out.println("Password must be 8 characters atleast");
        }
        else {
            password=pass;
            System.out.println("Password changed Successfully.");
        }
    }
}
