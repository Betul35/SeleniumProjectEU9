package com.cydeo.tests.day6_alerts_iframes_windiws;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_windows_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_window_test(){

        //Storing the main pages window handle as string is good practice for future re-usable purposes
        String mainHandle = driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);

        //asserting
        String expectedTitle =  "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        System.out.println("Title before click:  " + actualTitle);

        //click
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();


        //6
        for (String each: driver.getWindowHandles()){

            driver.switchTo().window(each);
            System.out.println("CURRENT TITLE WHILE SWITCHING WINDOWS: " +driver.getTitle());
        }

        //7
        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitleAfterClick);




        actualTitle = driver.getTitle();

        System.out.println("Title after click:  " + actualTitle);

        //Eger tekrardan main page e gitmek istersek sunu yapacagiz
        //driver.switchTo().window(mainHandle);

    }

    @AfterMethod
    public  void tearDown(){
        driver.quit(); // 2 windowsu da kapatsin diye
    }


}
/*
        TC #5: Window Handle practice

        1. Create a new class called: T5_WindowsPractice
        2. Create new test and make set ups
        3. Go to : https://practice.cydeo.com/windows
        4. Assert: Title is ???Windows???
        5. Click to: ???Click Here??? link
        6. Switch to new Window.
        7. Assert: Title is ???New Window???
 */
