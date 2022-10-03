package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {

    public static void main(String[] args) {

        //1.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2.
        driver.get("https://library1.cydeo.com/login.html");


        //3.

        WebElement userNameInput = driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrect@gmail.com"); //yukaridaki https yi acip classname yerine bu maili yaz diyoruz


        //4.

        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");


        //5.

        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();






    }



}
/*
    TC #4: Library verifications
    1. Open Chrome browser
    2. Go to https://library2.cybertekschool.com/login.html
    3. Enter username: “incorrect@email.com”
    4. Enter password: “incorrect password”
    5. Verify: visually “Sorry, Wrong Email or Password”
    displayed
    PS: Locate Locate Locate
    input box using “className” locator input box using “id” locator
    button using “tagName” locator
 */
