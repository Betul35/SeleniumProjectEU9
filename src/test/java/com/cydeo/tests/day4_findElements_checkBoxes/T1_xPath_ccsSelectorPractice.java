package com.cydeo.tests.day4_findElements_checkBoxes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xPath_ccsSelectorPractice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");


        //simdi xPath ile locate edelim
        //locate header using xPath():
        WebElement header_ex = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //c.
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        WebElement inputBoxEx1 = driver.findElement(By.xpath("//input[@name='email']"));

        WebElement inputBoxEx2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //.......


        //4

        System.out.println("header_ex.isDisplayed() = " + header_ex.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBoxEx1.isDisplayed() = " + inputBoxEx1.isDisplayed());
        System.out.println("inputBoxEx2.isDisplayed() = " + inputBoxEx2.isDisplayed());


    }


}
/*
        XPATH and CSS Selector PRACTICES
        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.

        TC #1: XPATH and cssSelector Practices
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com/forgot_password
        3. Locate all the WebElements on the page using XPATH and/or CSS
        locator only (total of 6)
        a. “Home” link
        b. “Forgot password” header
        c. “E-mail” text
        d. E-mail input box
        e. “Retrieve password” button
        f. “Powered by Cydeo text
        4. Verify all web elements are displayed.
        First solve the task with using cssSelector only. Try to create 2 different
        cssSelector if possible

        Then solve the task using XPATH only. Try to create 2 different
        XPATH locator if possible
 */
