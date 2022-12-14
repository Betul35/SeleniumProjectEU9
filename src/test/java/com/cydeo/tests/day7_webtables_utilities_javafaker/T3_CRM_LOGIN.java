package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN extends TestBase{



    @Test
    public void crm_login_test(){

        //2
        driver.get("https://login1.nextbasecrm.com/");

        //3
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com");

        //4
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //5
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        //6
        BrowserUtils.verifyTitle(driver,"Portal");

    }

    @Test
    public void crm_login_test_2(){

        //2
        driver.get("https://login1.nextbasecrm.com/");

        //CAlling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver);

        //6
        BrowserUtils.verifyTitle(driver,"Portal");

    }

    @Test
    public void crm_login_test_3(){

        //2
        driver.get("https://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver, "helpdesk2@cybertekschool.com", "UserUser");

        //6
        BrowserUtils.verifyTitle(driver,"(2) Portal");

    }

}
/*
        TC #3: Login scenario

        1. Create new test and make setups
        2. Go to : https://login1.nextbasecrm.com/
        3. Enter valid username
        4. Enter valid password
        5. Click to `Log In` button
        6. Verify title is as expected:
        Expected: Portal





        USERNAME  PASSWORD
        helpdesk1@cybertekschool.com  UserUser
        Helpdesk2@cybertekschool.com  UserUser
 */
