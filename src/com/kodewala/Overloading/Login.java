package com.kodewala.Overloading;

public class Login {
    public void doLogin(String mobile, int otp) {
        System.out.println("Login.doLogin().......(String mobile, int otp)");
    }
    public void doLogin(String email, String password) {
        System.out.println("Login.doLogin().......(String email, String password)");
    }
    public void doLogin(String gmail) {
        System.out.println("Login.doLogin().....(String gmail)");
    }
}
