package com.cydeo.tests.day3_xpath_css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {

    public static void main(String[] args) {

        //1
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2
        driver.get("https://login1.nextbasecrm.com/");

        //3
        //driver.findElement(By.className("login-inp")).sendKeys("incorrect"); //direk buraya da send keys yazabiliriz,
                                                                            //ama bunu sonradan kullanamayiz, onun icin sensible degil

       WebElement inputUserName = driver.findElement(By.className("login-inp"));
       inputUserName.sendKeys("incorrect");


       //4

       WebElement inputPassword =  driver.findElement(By.name("USER_PASSWORD"));
       inputPassword.sendKeys("incorrect");

       //5
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText(); //getText veriyoruz, cunku errorMessage return typei Web element, ama biz String
                                                            // donsun istiyoruz, ondan getText veriyoruz

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }




    }


}
/*
        TC #1: NextBaseCRM, locators and getText() practice
        1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/
        3- Enter incorrect username: “incorrect”
        4- Enter incorrect password: “incorrect”
        5- Click to login button.
        6- Verify error message text is as expected:
        Expected: Incorrect login or password


        PS: Inspect and decide which locator you should be using to locate web
        elements.
 */
