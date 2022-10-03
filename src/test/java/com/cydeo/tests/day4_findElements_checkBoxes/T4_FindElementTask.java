package com.cydeo.tests.day4_findElements_checkBoxes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_FindElementTask {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //providing extra wait time for our driver before it throws NoSuchElementexception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://practice.cydeo.com/abtest");

        //3     short cut for list seyi icin opt + enter, ama opt tusu yok bende :D introduce local variable diye bir sey cikiyor
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));


        //4
        System.out.println("allLinks.size() = " + allLinks.size());


        //5
        //6
        for (WebElement each : allLinks) {  //kisa yol olarak iter yazdik, fori cikti
            System.out.println("Text of link: " + each.getText()); //sadece each olarak print yaparsak WebElement olarak yazdiriyor,
                                                                    // ama biz string olarak yazmasini istiyoruz okumak icin

            System.out.println("HREF values: " + each.getAttribute("href") ); //burada da href olan attribute u cagiriyoruz
        }



        //not: how to move lines up and down kisayol, commad+shift





    }

}
/*
        TC #4: FindElements Task
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com/abtest
        3- Locate all the links in the page.
        4- Print out the number of the links on the page.
        5- Print out the texts of the links.
        6- Print out the HREF attribute values of the links

 */
