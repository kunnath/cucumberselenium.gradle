package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumTest {

    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","D:\\Selenium Webdriver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://www.linkedin.com");

        driver.findElement(By.id("login-email")).sendKeys("yourusername");

        driver.findElement(By.id("login-password")).sendKeys("yourpassword");

        driver.findElement(By.id("login-submit")).click();

        String username = driver.findElement(By.xpath(".//*[@id='voyager-feed']/div[2]/aside[1]/div/div/div/div[1]/a[2]")).getText();

        Assert.assertEquals(username, "Ashish Deshmukh");//Replace with your profile name

        driver.quit();

    }
}