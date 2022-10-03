package com.cydeo.tests.day10_upload_actions_jsexecutar;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_hover {

    @Test
    public void hovering_test(){

        //1
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        //locate all images under here:
        WebElement image1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement image2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement image3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //locate all the "user" texts under here:
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']")); //text() yerine . da koyabilirsin
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));


        Actions actions = new Actions(Driver.getDriver());

        //2
        actions.moveToElement(image1).perform(); //burada mouse un image1 in ustune hover yapmasini istiyoruz

        //3
        Assert.assertTrue(user1.isDisplayed());

        //4 //5
        actions.moveToElement(image2).perform();
        Assert.assertTrue(user2.isDisplayed());

        actions.moveToElement(image3).perform();
        Assert.assertTrue(user3.isDisplayed());

    }


}
/*
        TC #3: Hover Test
        1. Go to https://practice.cydeo.com/hovers
        2. Hover over to first image
        3. Assert:
        a. “name: user1” is displayed

        4. Hover over to second image
        5. Assert:
        a. “name: user2” is displayed
        b. “view profile” is displayed
        6. Hover over to third image
        7. Confirm:
        a. “name: user3” is displayed
        b. “view profile” is displayed
 */
