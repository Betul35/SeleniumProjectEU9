package com.cydeo.tests.day9_javafaker_testbase_driveUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {



    @Test
    public void test1(){
        //creating object to reach methods
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

        System.out.println("faker.numerify(\"342-###-###\") = " + faker.numerify("342-###-###"));//burada 342 sabit kalacak

        System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???-????")); //will return random letters

        System.out.println("faker.bothify(\"##???-?##\") = " + faker.bothify("##???-?##"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris","Betul"));
    }
}
