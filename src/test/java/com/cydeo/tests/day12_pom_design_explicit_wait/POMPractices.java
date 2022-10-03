package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;

    @Test
    public void required_field_error_message_test(){

        Driver.getDriver().get("https://library1.cydeo.com");

        //3
        libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.signInButton.click();

        //5
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

        Driver.closeDriver();

    }


    @Test
    public void invalid_email_format_error_message_test(){

        Driver.getDriver().get("https://library1.cydeo.com");

        //3
        libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.inputUserName.sendKeys("somethingwrong");

        libraryLoginPage.signInButton.click();

        //4 assert
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void library_negative_login_test(){

        Driver.getDriver().get("https://library1.cydeo.com");

        libraryLoginPage = new LibraryLoginPage();

        //3
        libraryLoginPage.inputUserName.sendKeys("wrong@efaf.com");
        libraryLoginPage.inputPassword.sendKeys("hehehe");

        libraryLoginPage.signInButton.click();

        //4
        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());

        Driver.closeDriver();
    }


}
/*
    TC #1: Required field error message test
        1- Open a chrome browser
        2- Go to: https://library1.cydeo.com
        3- Do not enter any information
        4- Click to “Sign in” button
        5- Verify expected error is displayed:
        Expected: This field is required.

    NOTE: FOLLOW POM DESIGN PATTERN


    TC #2: Invalid email format error message test
        1- Open a chrome browser
        2- Go to: https://library1.cydeo.com
        3- Enter invalid email format
        4- Verify expected error is displayed:
        Expected: Please enter a valid email address.

NOTE: FOLLOW POM DESIGN PATTERN


    TC #3: Library negative login
        1- Open a chrome browser
        2- Go to: https://library1.cydeo.com
        3- Enter incorrect username or incorrect password
        4- Verify title expected error is displayed:
        Expected: Sorry, Wrong Email or Password

    NOTE: FOLLOW POM DESIGN PATTERN


 */
