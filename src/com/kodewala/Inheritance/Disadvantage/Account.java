package com.kodewala.Inheritance.Disadvantage;

public class Account {
    public void openAccount(String userId , String email)
    {
        System.out.println("Account.openAccount()");
    }
}

/*Disadvanges of inheritance:
* 1. Tightly couple
* 2. Heavy Loading
*/

class SavingAccount extends Account
{
    @Override // changing the super class method funcionalities
    public void openAccount(String userId, String email)
    {
        System.out.println("SavingAccount.openAccount()");
    }
    public void openAccountNew()
    {
        System.out.println("SavingAccount.openAccountNew()");
    }
}
class SrCzAccount extends SavingAccount
{
    @Override
    public void openAccount(String userId, String email)
    {
        System.out.println("SrCzAccount.openAccount()");
    }
}
class PensionAccount extends SrCzAccount
{
    @Override
    public void openAccount(String userId, String email)
    {
        System.out.println("PensionAccount.openAccount()");
    }
}