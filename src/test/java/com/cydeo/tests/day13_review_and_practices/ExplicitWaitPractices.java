package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitPractices {


    DynamicControlsPage dynamicControlsPage;


    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");

        dynamicControlsPage = new DynamicControlsPage();
    }

    @Test
    public void remove_button_test(){

        //3
        dynamicControlsPage.removeButton.click();

        //4-Wait until “loading bar disappears”
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));

        //5
        //a
        try {
            Assert.assertTrue(!dynamicControlsPage.checkbox.isDisplayed());
            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());

        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }

        //b
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone!"));

    }


    @Test
    public void enable_button_test(){

       // 3- Click to “Enable” button
        dynamicControlsPage.enableButton.click();

        //4- Wait until “loading bar disappears”
        //calling ur ExplicitWait utility method to wait LoadingBar disappear
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);


        //5- Verify:
        //a. Input box is enabled.
        Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());


        //b. “It’s enabled!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isEnabled());

        //check the String value is matching as expected: "It's enabled!"
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's enabled!"));


    }

}
/*
    TC #2: Explicit wait practice
    1- Open a chrome browser
    2- Go to: https://practice.cydeo.com/dynamic_controls
    3- Click to “Remove” button
    4- Wait until “loading bar disappears”
    5- Verify:
    a. Checkbox is not displayed
    b. “It’s gone!” message is displayed.

    NOTE: FOLLOW POM
 */
