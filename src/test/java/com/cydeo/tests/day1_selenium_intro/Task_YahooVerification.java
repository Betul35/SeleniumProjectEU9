package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_YahooVerification {

    public static void main(String[] args) {

        //1. Open Chrome Verification
        //2. Go to https://www.yahoo.com
        //3. Verify title:
        // expected: Yahoo

        //do setup for browser driver
        WebDriverManager.chromedriver().setup();

        //1. open the chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();// full screen yapmak icin

        //2.
        driver.get("https://www.yahoo.com");

        //3.Expected: Yahoo | Mail,Weather,Search, Politics, News, Finance, Sports & Videos

        String expectedTitle = "Yahoo | Mail,Weather,Search, Politics, News, Finance, Sports & Videos";

        //actual title comes from the browser
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is expected. Verification PASSED!");
        }else{
            System.out.println("Title is  NOT expected. Verification FAILED!");
        }






    }

}
