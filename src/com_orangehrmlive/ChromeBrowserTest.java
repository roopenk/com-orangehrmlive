package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // Launching the browser
        driver.get("https://opensource-demo.orangehrmlive.com/");
        // Maximizing the browser Window
        driver.manage().window().maximize();
        // Applying the implicit wait to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        // Getting the page title
        System.out.println(driver.getTitle());
        // Getting the current URL
        System.out.println("The Current URL : " + driver.getCurrentUrl());
        // Getting the page source
        System.out.println("The Page Source : " + driver.getPageSource());
        // Finding the username element and sending the Value to it
        driver.findElement(By.name("username")).sendKeys("Admin");
        // Finding the password link and sending the value to it
        driver.findElement(By.name("password")).sendKeys("admin123");
        // Closing the browser window
        driver.close();


    }
}
