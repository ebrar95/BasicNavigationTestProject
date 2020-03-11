package com.cbt.utilities;



import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class BrowserFactory {

    public static WebDriver getDriver (String browser){

        String osName=System.getProperty("os.name");

        if (osName.contains("Windows") && browser.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();

            return new ChromeDriver();

        }else if( osName.contains("Windows") && browser.equalsIgnoreCase("firefox" )){

            WebDriverManager.firefoxdriver().setup();

            return new FirefoxDriver();

        }else if (osName.contains("Windows") && browser.equalsIgnoreCase("edge" )){

            WebDriverManager.edgedriver().setup();

            return new EdgeDriver();

        }else {

            return null;

        }

    }

}