package com.cydeo.tests.day4_findElements_checkBoxes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceException {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/abtest");

        //3
        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']")); // bu sefer text i verdik locating olarak

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        //4
        driver.navigate().refresh();// sayfayi refresh yaptik,oyle yapinca aralarindaki connection i kaybettiklerindeeenn..

        //5  eger bie daha verify yaparsak hicbir seyi degistirmeden line 22 yi tekrar yazarsak yani bize bu exception i verecek

    }

}
/*
        TC #6: StaleElementReferenceException Task
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com/abtest
        3- Locate “CYDEO” link, verify it is displayed.
        4- Refresh the page.
        5- Verify it is displayed, again.



        This is a simple StaleElementReferenceException to understand what is
        this exception and how to handle it.
 */
