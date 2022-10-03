package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_continuing {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/radio_buttons");


        clickAndVerifyRadioButton(driver,"sport","hockey");


        //Locate name='sports' radio buttons and store them in a list of Web Element, bunu findElements() ile yapacagiz, "s" olan,
        // cunku radio button oldugu icin bunlarin name i ayni, bir team olarak hareket ediyorlar

        /*
        List<WebElement> sportRadioButton = driver.findElements(By.name("sport"));


        //Loop through the list of WebElement and selected matching result of "hockey"
        for (WebElement each : sportRadioButton) {

            String eachId = each.getAttribute("id");

            System.out.println("eachId = " + eachId); //burada tum name leri sport olan id leri yazdirdik loop ile.

            if (eachId.equals("hockey")){

                each.click();
                System.out.println("hockey is selected : " + each.isSelected());
                break; // burada hockeye gelince tikla, yani sec ve loopu runlamayi durdur dedik
            }
        }
        */

        //simdi de asagida olusturdugumuz class i uyguluyoruz


    }


    //simdi burada bir utility class kurmaya calisacagiz, radio button olan class larda kullanim kolayligi olsun diye

    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {

        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButtons) {

            String eachId = each.getAttribute("id");

            System.out.println("eachId = " + eachId); //burada tum name leri sport olan id leri yazdirdik loop ile.

            if (eachId.equals(idValue)) {

                each.click();
                System.out.println(eachId + " is selected : " + each.isSelected());
                break; // burada hockeye gelince tikla, yani sec ve loopu runlamayi durdur dedik
            }


        }


    }
}
/*
            XPATH PRACTICES
            DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
            TC #3: Utility method task for (continuation of Task2)
            1. Open Chrome browser
            2. Go to https://practice.cydeo.com/radio_buttons
            3. Click to “Hockey” radio button
            4. Verify “Hockey” radio button is selected after clicking.

    USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

    Create a utility method to handle above logic.
    Method name: clickAndVerifyRadioButton
    Return type: void or boolean
    Method args:
    1. WebDriver
    2. Name attribute as String (for providing which group of radio buttons)
    3. Id attribute as String (for providing which radio button to be clicked)

    Method should loop through the given group of radio buttons. When it finds the
    matching option, it should click and verify option is Selected.
    Print out verification: true
 */
