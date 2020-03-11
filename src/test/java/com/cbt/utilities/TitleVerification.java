package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class TitleVerification {

    public static void main(String[] args) throws Exception {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",

                "http://practice.cybertekschool.com/dropdown",

                "http://practice.cybertekschool.com/login");



        List<String>title=new ArrayList<>();

        WebDriver driver= BrowserFactory.getDriver("chrome");

        for (String eachurl: urls){

            driver.get(eachurl);

            title.add(driver.getTitle());

            Thread.sleep(2000);



            if (driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com")){

                System.out.println("Test Passed");

            }else{

                System.out.println("Test Failed");

            }

        }

        for (int i = 0; i <title.size()-1 ; i++) {

            StringUtility.verifyEquals(title.get(i),title.get(i+1));

        }

        driver.quit();



    }

}
