package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

    public static WebDriver driver;
    @Given("^I am on Home Page of \"([^\"]*)\"$")
    public void i_am_on_Home_Page_of(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Python27\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(arg1);
    }
    @Then("^I see Trivago's logo$")
    public void i_m_taken_to_Contact_Page() throws Throwable {
        // Some code to grab and assert the logo visibility
    }
}