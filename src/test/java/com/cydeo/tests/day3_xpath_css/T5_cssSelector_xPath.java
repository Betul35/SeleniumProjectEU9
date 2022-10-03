package com.cydeo.tests.day3_xpath_css;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_cssSelector_xPath {

    public static void main(String[] args) {

        //1
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3
        WebElement getLoginBox = driver.findElement(By.className("login-inp"));
       getLoginBox.sendKeys("Betulpiyados");

       //4
        WebElement clickingButton = driver.findElement(By.cssSelector("button[class='login-btn']"));
        clickingButton.click();


    }


}
/*
        TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        3- Enter incorrect username into login box:
        4- Click to `Reset password` button
        5- Verify “error” label is as expected
        Expected: Login or E-mail not found


        PS: Inspect and decide which locator you should be using to locate web
        elements.
        PS2: Pay attention to where to get the text of this button from
 */
