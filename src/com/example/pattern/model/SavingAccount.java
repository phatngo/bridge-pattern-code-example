package com.example.pattern.model;

public class SavingAccount implements IAccount{
    @Override
    public void openAccount() {
        System.out.println("Saving Account");
    }
}
