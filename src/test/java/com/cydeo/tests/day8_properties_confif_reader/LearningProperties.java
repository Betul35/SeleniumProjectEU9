package com.cydeo.tests.day8_properties_confif_reader;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_reading_test(){

        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name")); //os is operational system ..
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name")); //betulpiyade yazdiracak

    }

}
