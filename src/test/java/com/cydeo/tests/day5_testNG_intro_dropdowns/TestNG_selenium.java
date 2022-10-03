package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_selenium {

    WebDriver driver; //buraya assign yaptik ki her iki public classtaki drive lari reassign yapabilelim diye

    @BeforeMethod
    public void setupMethod(){
        //Do browser driver setup
        //Open browser
         driver = WebDriverFactory.getDriver("chrome");

        //Maximize the page
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void selenium_test(){
        //Do browser drive setup
        //Open browser



        //Get "https://google.com"
        driver.get("https://google.com");
        WebElement cookiesButton = driver.findElement(By.id("L2AGLb"));
        cookiesButton.click();


        //Assert: title is "Google"
        Assert.assertEquals(driver.getTitle(), "Google", "Title is not matching here.");
                                            //message i buraya koyuyoruz, eger match lesmezse run olacak

    }



}
