package com.company;




import org.junit.Assert;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Max on 20-Mar-17.
 */
public class RandomStringTest {

    @Test
    public void stringTest(){
        int length = RandomString.randomString().length();
        boolean isTrue = (length>= 8 && length<=16);
        assertEquals(true,isTrue);
    }

    @Test
    public void arrayTest(){
        int underTest = RandomString.stringCollection().size();
        assertEquals(10,underTest);

    }

    @Test
    public void stringContainsTest(){
        String underTest = RandomString.randomString();
        boolean test = underTest.contains("q");
        assertEquals(true,test);
    }

    @Test
    public void getRandomTest(){
        int rnd = new RandomString().randomNumber(0,2);
        boolean numberIsCorrect = false;
        numberIsCorrect = (rnd >= 0 && rnd <=2);
        assertEquals(true,numberIsCorrect);
    }

    @Test
    public void randomStringWithDogTest(){
        String rnd = new RandomString().randomString();
        String someEmail = new RandomString().randomStringWithDog(rnd);
        boolean accE = false;
        accE = someEmail.contains(rnd);
        assertEquals(true,accE);
    }

    @Test
    public void  randomEmailTest(){
        int count = 0;
        String someEmail = new RandomString().randomEmailAdress();
        char[] chars = someEmail.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if (chars[i]=='@'){
                count++;
            }
        }
        assertEquals(1,count);
    }

    @Test
    public void  randomEmailDotTest(){
        int count = 0;
        String someEmail = new RandomString().randomEmailAdress();
        char[] chars = someEmail.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if (chars[i]=='.'){
                count++;
            }
        }
        assertEquals(1,count);
    }

    @Test
    public void  randomEmailDotIndexTest(){
        String someEmail = new RandomString().randomEmailAdress();
        char[] chars = someEmail.toCharArray();
        boolean isTrue = false;
        int indexAt = 0;
        int indexDot = 0;
        for(int i = 0; i < chars.length; i++){
            if (chars[i]=='@'){
                indexAt = i;
            }
            if (chars[i]=='.'){
                indexDot=i;
            }
            isTrue = indexAt < indexDot;
        }
        assertEquals(true,isTrue);
    }

}