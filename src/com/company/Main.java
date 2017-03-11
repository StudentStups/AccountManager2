package com.company;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

public class Main {



    public static Account createNewAccount(){
        Account newAccount = new Account();
        newAccount.setLogin(RandomString.randomEmailAdress());
        newAccount.setPassword("MyPass");
        newAccount.setBirthDate(1988,11,2);
        return newAccount;
    }

    public static ArrayList<Account> createNumberOfRandomAccounts(int number){
        ArrayList<Account> accounts = new ArrayList<Account>();
        for (int i = 0; i < number; i++){
            accounts.add(createNewAccount());
        }
        return accounts;
    }



    public static void main(String[] args) {
        System.out.println("Hello");

    }
}
