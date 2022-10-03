package com.cydeo.tests.day3_xpath_css;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {

        //1
       WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();


       //2
       driver.get("https://login1.nextbasecrm.com/");

       //3
        // <input type="submit" value="Log In" class="login-btn" onclick="BX.addClass(this, 'wait');">
       //WebElement loginButton = driver.findElement(By.cssSelector("input[class ='login-btn']")); // bu da locate yapmanin cssSelector hali
        //veya soyle yazariz
        WebElement loginButton = driver.findElement(By.cssSelector("input.login-btn"));

        String expectedButton = "Log in";

        String actualButton = loginButton.getAttribute("class");

        System.out.println("actualButton = " + actualButton);

        if (actualButton.equals(expectedButton)){
            System.out.println("AFERIN");
        }else {
            System.out.println("BIDAHAA");
        }



    }



}
/*
        TC #3: NextBaseCRM, locators, getText(), getAttribute() practice

        1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/
        3- Verify “Log in” button text is as expected:
        Expected: Log In



        PS: Inspect and decide which locator you should be using to locate web
        elements.
        PS2: Pay attention to where to get the text of this button from
 */