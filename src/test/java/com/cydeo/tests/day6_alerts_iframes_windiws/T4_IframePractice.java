package com.cydeo.tests.day6_alerts_iframes_windiws;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void iframe_test(){

        //we need to switch driver's focus to frame
        //option 1 using with id attribute value, in iframe
        driver.switchTo().frame("mce_0_ifr");

        //opt2 passing index number of iframe
        //driver.switchTo().frame(0);

        //opt3 locate as web element and pass in frame() method
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //locate the pharagrapg tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //verify "An iFrame containing the TinyMCE WSIWTG Editor"
        //to be able to verify the hearder, we must switch back to "main HTML"
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        //assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed(),"not displayed!");

    }

}
/*
        TC #4: Iframe practice

        1. Create a new class called: T4_Iframes
        2. Create new test and make set ups
        3. Go to: https://practice.cydeo.com/iframe
        4. Assert: “Your content goes here.” Text is displayed.
        5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */
