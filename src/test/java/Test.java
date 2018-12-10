import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class Test {
    WebDriver driver;
    WebDriverWait wait;
    WalletHubLoginPage objLogin;

    @BeforeTest
    public void loginTest() {
        String username = "username";
        String password = "password";
        System.setProperty("webdriver.chrome.driver", "C:\\Python27\\chromedriver.exe");
        driver = new ChromeDriver();
        objLogin = new WalletHubLoginPage(driver);
        driver.get("https://wallethub.com/join/login");
        objLogin.login(username, password);
    }
}