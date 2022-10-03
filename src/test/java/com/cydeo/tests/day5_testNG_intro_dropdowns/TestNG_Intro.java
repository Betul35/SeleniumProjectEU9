package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass //before everything is executed, it will run
    public void setupMethod(){
        System.out.println("---> Before Class is running!");
    }

    @AfterClass //after everything is executed, it will run
    public void tearDownClass(){
        System.out.println("---> After class is running!");
    }

    @BeforeMethod //her test oncesi bir kere run oluyor
    public void setUpMethod(){
        System.out.println("Before Method is running!");
    }


    @AfterMethod
    public void tearDownMethod(){//her test sonrasi bir kere run oluyor
        System.out.println("---> After Method is running!");
    }

    @Test //(priority = 1) eger bir osrun varsa runlama siralamasinda boyle yazabilirsin
    public void test1(){

        System.out.println("Test1 is running....");

        //ASSERT EQUAL: compare 2 otf the same things
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);

    }

    @Test // (priority = 2)
    public void test2(){

        System.out.println("Test2 is running....");

        //AssertTrue
        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));

    }
}


