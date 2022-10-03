package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class T1_Circle_Drag_N_Drop {

    @Test
    public void drag_n_drop_test(){

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //Locate accept cookies button and click it, windowsta beliren cookies e basip ondan kurtuluyoruz
        WebElement cookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        cookiesButton.click();

        WebElement smallCircleButton = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircleButton = Driver.getDriver().findElement(By.id("droptarget"));

        //2
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircleButton,bigCircleButton).perform();

    }

}
/*
        TC #: Drag and drop
        1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        2. Drag and drop the small circle to bigger circle.
        3. Assert:
        -Text in big circle changed to: “You did great!”
 */
