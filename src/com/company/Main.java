package com.company;


import java.util.ArrayList;


public class Main {



    public static Account createNewAccount(){
        Account newAccount = new Account();
        newAccount.setName(RandomString.randomString());
        newAccount.setLogin(newAccount.getName());
        newAccount.setPassword("MyPass");
        newAccount.setDateOfLastLogin(System.currentTimeMillis());
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

    }
}
