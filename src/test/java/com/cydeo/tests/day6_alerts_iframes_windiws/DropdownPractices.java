package com.cydeo.tests.day6_alerts_iframes_windiws;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

   public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/dropdown");

    }

    @Test
    public void dropdown_task5(){



        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        stateDropdown.selectByVisibleText("Illinois");
        stateDropdown.selectByValue("VA");
        stateDropdown.selectByIndex(5); //californiayi verdirmek istiyoruz

        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText(); //get first selected bize currently selected hangisi onu getir diyoruz

        Assert.assertEquals(actualOptionText, expectedOptionText);

    }

    //TC 6

    @Test
    public void dropDown_task6(){

        Select yearDropdown= new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown= new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown= new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //select year
        yearDropdown.selectByVisibleText("1923");

        //select month
        monthDropdown.selectByValue("11");

        //select day
        dayDropdown.selectByIndex(0);

        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";


        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //create assertions
        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);

    }

    @AfterMethod
            public void teardownMethod(){

        driver.close();
    }



}
/*

        TC #5: Selecting state from State dropdown and verifying result
        1. Open Chrome browser
        2. Go to http://practice.cydeo.com/dropdown
        3. Select Illinois
        4. Select Virginia
        5. Select California
        6. Verify final selected option is California.
        Use all Select options. (visible text, value, index)



        TC #6: StaleElementReferenceException Task
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com/abtest
        3- Locate “CYDEO” link, verify it is displayed.
        4- Refresh the page.
        5- Verify it is displayed, again.



        This is a simple StaleElementReferenceException to understand what is
        this exception and how to handle it.

 */

