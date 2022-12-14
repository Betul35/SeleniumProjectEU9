package com.cydeo.tests.day8_properties_confif_reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTableOrderVerify {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");

    }

    @Test
    public void order_name_verify_test(){

        //locate the cell that hS BOB Mrtin text in it.
        WebElement bobMArtinCell= driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        //2
        String expencetBobName = "Bob Martin";
        String actualBobName = bobMArtinCell.getText();

        Assert.assertEquals(actualBobName,expencetBobName);


        //3
        WebElement bobMArtinDateCell =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        String expectedDate = "12/31/2021";
        String actualDate = bobMArtinDateCell.getText();

        Assert.assertEquals(actualDate,expectedDate);

    }


}
/*
        TC #1: Web table practice

        1. Go to: https://practice.cydeo.com/web-tables
        2. Verify Bob’s name is listed as expected.
        Expected: “Bob Martin”
        3. Verify Bob Martin’s order date is as expected
        Expected: 12/31/2021

 */
