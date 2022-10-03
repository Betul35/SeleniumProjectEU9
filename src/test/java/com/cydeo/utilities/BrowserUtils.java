package com.cydeo.utilities;

/*
In this class only general utility methods that are not related to some specific page.
 */

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    /*
    This method wil accept int(in second) and execute Thread.sleep for
    given duration
     */
    public void sleep(int second){
        second *= 1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }


    }



    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl,String expectedTitle){


        Set<String> allWindowsHandle = driver.getWindowHandles();
        for (String each : driver.getWindowHandles()) {

            driver.switchTo().window(each);
            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }

        }

        //5
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    /*
    This method accepts a String "expectedTitle" and Asserts if it is true
     */

    public static void verifyTitle (WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }

}
