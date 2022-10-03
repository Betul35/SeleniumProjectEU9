package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2
        driver.get("https://practice.cydeo.com");

        //3
        //driver.findElement(By.linkText("A/B Testing")).click(); bunu boyle yazip 3. deki sonuca ulasiriz,amaaa
                                // bu linke tiklamak icin bir daha kod yazmayalim diye bunu assing edelim, ki sonradan kullanabilelim
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        String expectedTitle = "No A/B Test";
        String  actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
        }

        //5.
        driver.navigate().back();

        //6.
        String expectedTitle2 = "Practice";
        actualTitle = driver.getTitle();

        if (expectedTitle2.equals(actualTitle)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }




    }


}
/*
        TC #2: Back and forth navigation
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com
        3- Click to A/B Testing from top of the list.
        4- Verify title is:
        Expected: No A/B Test
        5- Go back to home page by using the .back();
        6- Verify title equals:
        Expected: Practice
 */
