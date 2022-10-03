package com.cydeo.tests.day6_alerts_iframes_windiws;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_AlertPractices {


    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        //1
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //2
        driver.get("https://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void alert_Test1(){
        //3
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        informationAlertButton.click();

        //4
        //To be able to click to Alert OK button, we need to switch driver's focus to Alert itself
        Alert alert = driver.switchTo().alert();
        alert.accept();//alertin kendisi inspect te degil, onu kabul edip click lemek icin alert.accept diyoruz


        //5
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //failure message will only be displayed if assertion fails.
        Assert.assertTrue(resultText.isDisplayed(),"result text is NOT displayed.");

        String expectedText = "You successfully clicked an alert";
        String actual = resultText.getText();

        Assert.assertEquals(actual, expectedText,"Actual result test is not expected!");

    }

}
/*

        TC #1: Information alert practice
        1. Open browser
        2. Go to website: http://practice.cydeo.com/javascript_alerts
        3. Click to “Click for JS Alert” button
        4. Click to OK button from the alert
        5. Verify “You successfully clicked an alert” text is displayed.
 */