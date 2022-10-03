package com.cydeo.tests.day10_upload_actions_jsexecutar;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.annotation.Tainted;

public class RegistrationForm {

    @Test
    public void registration_form_test(){

        //Driver.getDriver() --> is returning us driver element
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //Create Java Faker object
        Faker faker = new Faker();
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName()); //first name icin

        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        //5
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //inputUserName.sendKeys(faker.name().username().replaceAll(".","")); //aradaki noktayi silmek icin random userin
        String user = faker.bothify("helpdesk###");
        inputUserName.sendKeys(user);

        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user + "@email.com");

        //7
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.numerify("########"));
        System.out.println("faker.internet().password() = " + faker.internet().password());

        //8
        WebElement inputPhone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));

        //9
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        //10
        WebElement inputDateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //faker.number().numberBetween(2004,1920);
        inputDateOfBirth.sendKeys("03/08/2000");

        //11
        Select departmentDropDown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropDown.selectByIndex(faker.number().numberBetween(1,9));



    }

}
/*
    TC#1: Registration form confirmation
    Note: Use JavaFaker OR read from configuration.properties file when possible.
    1. Open browser
    2. Go to website: https://practice.cydeo.com/registration_form
    3. Enter first name
    4. Enter last name
    5. Enter username
    6. Enter email address
    7. Enter password
    8. Enter phone number
    9. Select a gender from radio buttons
    10. Enter date of birth
    11. Select Department/Office
    12. Select Job Title
    13. Select programming language from checkboxes
    14. Click to sign up button
    15. Verify success message “You’ve successfully completed registration.” is
    displayed.


    Note:
    1. Use new Driver utility class and method
    2. User JavaFaker when possible
    3. User ConfigurationReader when it makes sense
 */
