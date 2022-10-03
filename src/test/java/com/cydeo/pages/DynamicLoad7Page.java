package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad7Page {

    //1- Create constructor and instantiate driver and object of the class

    public DynamicLoad7Page(){
        PageFactory.initElements(Driver.getDriver(), this);


    }



}
/*
        TC#4 : Dynamically Loaded Page Elements 7
        1. Go to https://practice.cydeo.com/dynamic_loading/7
        2. Wait until title is “Dynamic title”
        3. Assert: Message “Done” is displayed.
        4. Assert: Image is displayed.
        Note: Follow POM
 */
