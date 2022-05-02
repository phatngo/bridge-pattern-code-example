package com.example.pattern.model;

public class VietcomBank extends Bank{
    public VietcomBank(IAccount account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.print("Open your account at VietcomBank is a ");
        account.openAccount();
    }
}
