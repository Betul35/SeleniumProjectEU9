package com.cydeo.tests.day4_findElements_checkBoxes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");


        //We have to locate checkboxes

        WebElement checkBox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //2
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected()); //expecting false

        //3
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());//expecting true


        //4
        checkBox1.click();

        //5
        checkBox2.click();

        //6
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());//simdi true

        //7
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());// simdi false


    }

}
/*
        Practice: Checkboxes
        1. Go to https://practice.cydeo.com/checkboxes
        2. Confirm checkbox #1 is NOT selected by default
        3. Confirm checkbox #2 is SELECTED by default.
        4. Click checkbox #1 to select it.
        5. Click checkbox #2 to deselect it.
        6. Confirm checkbox #1 is SELECTED.
        7. Confirm checkbox #2 is NOT selected.
 */
