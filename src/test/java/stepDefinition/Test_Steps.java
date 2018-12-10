package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class Test_Steps {
    public static WebDriver driver;
    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page(){
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Python27\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.linkedin.com");
    }

    @When("^User enters UserName$")
    public void user_enters_UserName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("login-email")).sendKeys("kunnathsreelesh@gmail.com");
    }

    @When("^User enters Password$")
    public void user_enters_Password() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("login-password")).sendKeys("2018");
        driver.findElement(By.id("login-submit")).click();
        //Thread.sleep(1000);
    }

    @Then("^User is logged in successfully$")
    public void user_is_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions

        String username = driver.findElement(By.xpath("//*[@class=\"tap-target profile-rail-card__actor-link block link-without-hover-visited ember-view\"]")).getText();

        Assert.assertEquals(username, "Sreelesh Kunnath");
        driver.quit();
    }
}