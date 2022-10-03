package com.cydeo.tests.day3_xpath_css;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getTextGetAttribute {

    public static void main(String[] args) {

        //1
        // WebDriverFactory.getDriver("chome"); bununla input yaptigimizdan call yapiyoruz chrome u acmak icin,
        // ama yine reuse yapmak icin assign ediyoruz

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2
        driver.get("https://login1.nextbasecrm.com/");

        //3
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberTest = "remember me on this computer";
        String actualRememberText = rememberMeLabel.getText();

        if (actualRememberText.equals(expectedRememberTest)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        //4
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotLink = "Forgot your password?";
        String actualForgotLink = forgotPasswordLink.getText();

        if (actualForgotLink.equals(expectedForgotLink)){
            System.out.println("BRAVOO");
        }else {
            System.out.println("LOOSEERR :D");
        }




    }



}
/*
        TC #2: NextBaseCRM, locators, getText(), getAttribute() practice

        1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/
        3- Verify “remember me” label text is as expected:
        Expected: Remember me on this computer
        4- Verify “forgot password” link text is as expected:
        Expected: Forgot your password?
        5- Verify “forgot password” href attribute’s value contains expected:
        Expected: forgot_password=yes

 */
