package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        //1-setup the browser driver

        WebDriverManager.chromedriver().setup();

        //2- Create instance of the Selenium Web Driver
        WebDriver driver = new ChromeDriver(); //opernin empty browser

        //3- Go to https://www.tesla.com/
        driver.get("https://www.tesla.com/");

        //Stop the code execution for 3 seconds, actigin sayfada 3 saniyor dur diyoruz
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        Thread.sleep(3000);


        driver.navigate().forward();

        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //use navigate().to():
        driver.navigate().to("https://www.google.com/");

        // get the title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());
        String currentTitle  = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //get the current url using selenium
        String currentUrl= driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        driver.manage().window().maximize();// bu da full screen yapiyor


        //this will close the currently opened window
        driver.close();

        //this will close the currently opened windows
        driver.quit();


    }




}
