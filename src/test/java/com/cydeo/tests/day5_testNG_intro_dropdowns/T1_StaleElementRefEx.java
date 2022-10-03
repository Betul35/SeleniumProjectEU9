package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {

    public static void main(String[] args) {

       WebDriver driver =  WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


       driver.get("https://practice.cydeo.com/add_remove_elements/");


        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']")); //xpath text locate ettik
        //button[@onclick='addElement()'] olarak da locate yapabilirz diger sekil olarak

        addElementButton.click();


        //4
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));

        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        //5
        deleteButton.click();

        //6
        //System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
    //burada tekrar ayni value yu locate yapinca bize exception verecek, try catch yapmak lazim


        try{
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        }catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException is thrown");
            System.out.println("deleteButton.isDisplayed() = false");
        }

        driver.close();



    }


}
/*
        XPATH PRACTICES
        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        TC #1: StaleElementReferenceException handling
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com/add_remove_elements/
        3. Click to “Add Element” button
        4. Verify “Delete” button is displayed after clicking.
        5. Click to “Delete” button.
        6. Verify “Delete” button is NOT displayed after clicking.
        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */
