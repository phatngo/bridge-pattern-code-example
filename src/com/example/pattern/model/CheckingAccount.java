package com.example.pattern.model;

public class CheckingAccount implements IAccount{
    @Override
    public void openAccount() {
        System.out.println("Checking Account");
    }
}
