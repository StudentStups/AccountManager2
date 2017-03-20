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


}