import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {
    public static void main(String[] args) {

        //For windows
        //Driver path is required for selenium webdriver versions >3
        System.setProperty("webdriver.chrome.driver", "C:\\Python27\\chromedriver.exe");

        //initialize chrome driver instance
        WebDriver driver = new ChromeDriver();

        //start a new chrome browser
        driver.get("https://www.google.com");
        //quit driver instance
        //Closes chrome browser
        driver.quit();
    }
}