package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;

import java.util.List;

import static com.cbt.utilities.BrowserFactory.getDriver;



public class TitleVerification2 {

    public static void main(String[] args) throws Exception {

        List<String> urls = Arrays.asList("https://luluandgeorgia.com",

                "https://wayfair.com/", "https://walmart.com", "https://westelm.com");



        WebDriver driver = getDriver("chrome");

        for (int i = 0; i < urls.size() ; i++) {

            driver.get(urls.get(i));

            String title = driver.getTitle().replace(" ", "").toLowerCase();

            Thread.sleep(3000);

            if (driver.getCurrentUrl().toLowerCase().contains(title)) {

                System.out.println("PASS");

            } else {

                System.out.println("FAILED");

            }

        }



        driver.close();







    }



}
