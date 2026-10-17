package com.kodewala.Inheritance.Disadvantage;

public class UserDriver {
    public static void main(String[] args)
    {
            SuperUserSubs subscription = new SuperUserSubs();
            subscription.doSomething();
            FreeUser free = new FreeUser();
            free.doSomething();
    }

}
