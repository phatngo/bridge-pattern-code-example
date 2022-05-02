package com.example.pattern.client;

import com.example.pattern.model.*;

public class Client {
    public static void main(String[] args) {
        Bank vietComBank = new VietcomBank(new CheckingAccount());
        vietComBank.openAccount();

        Bank tpBank = new TPBank(new CheckingAccount());
        tpBank.openAccount();

        Bank vietComBank2 = new VietcomBank(new SavingAccount());
        vietComBank2.openAccount();

        Bank tpBank2 = new TPBank(new SavingAccount());
        tpBank2.openAccount();
    }
}
