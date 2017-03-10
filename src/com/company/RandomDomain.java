package com.company;

import java.util.ArrayList;

/**
 * Created by Max on 10-Mar-17.
 */
public class RandomDomain {

    public static String randomDomain(){
        String randomDomain = "";
        randomDomain = domainCollection().get(randomNumber(0,domainCollection().toArray().length));
        return randomDomain;
    }

    public static ArrayList<String> domainCollection(){
        ArrayList<String> domains = new ArrayList<String>();
        domains.add("ukr.net");
        domains.add("mail.ru");
        domains.add("gmail.com");
        domains.add("yahoo.com");
        domains.add("rambler.ru");
        return domains;
    }


    private static int randomNumber(int min, int max){
        return (int)(Math.random()*(max-min)+min);
    }
}
