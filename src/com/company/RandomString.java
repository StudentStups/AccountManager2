package com.company;

import java.util.ArrayList;


/**
 * Created by Max on 10-Mar-17.
 */
public class RandomString {

    public static String randomString(){
        String returnedString = "";
        String validChars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        char[] charsArray = validChars.toCharArray();
        int randomLenght = randomNumber(8,16);
        for(int i = 0; i < randomLenght; i++){
            int randomIndex = randomNumber(0,charsArray.length);
            returnedString = returnedString+charsArray[randomIndex];
        }
        return returnedString;
    }

    public static String randomStringWithDog(String someString){
        return someString+"@";
    }

    public static ArrayList<String > stringCollection(){
        ArrayList<String> myCollection = new ArrayList<String>();
        for (int i = 0; i < 10; i++){
            myCollection.add(randomStringWithDog(randomString()));
        }
        return myCollection;
    }

    public static String randomEmailAdress(){
        String emailAdress = stringCollection().get(randomNumber(0,stringCollection().toArray().length))+RandomDomain.randomDomain();
        return emailAdress;
    }

    private static   int randomNumber(int min, int max){
        return (int)(Math.random()*(max-min)+min);
    }



}
