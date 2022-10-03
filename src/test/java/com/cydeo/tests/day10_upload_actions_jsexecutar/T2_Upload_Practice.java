package com.cydeo.tests.day10_upload_actions_jsexecutar;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {


    @Test
    public void upload_test(){

        Driver.getDriver().get("https://practice.cydeo.com/upload");

        String path = "/Users/betulpiyade/Desktop/Screenshot 2022-09-26 at 15.39.51.png";

        //3
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload")); //choose file in id si
        fileUpload.sendKeys(path); // choose file a desktop tan bir resim sectiriyoruz

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit")); //upload buttonu buluyoruz

        //4 asserting
        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));


        Assert.assertTrue(fileUploadedHeader.isDisplayed()); //header display oldu mu diye bakiyoruz


    }

}
/*
    TC #2 Upload Test
    1. Go to https://practice.cydeo.com/upload
    2. Find some small file from your computer, and get the path of it.
    3. Upload the file.
    4. Assert:
    -File uploaded text is displayed on the page
 */
