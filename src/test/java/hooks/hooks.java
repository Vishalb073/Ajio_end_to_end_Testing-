package hooks;

import io.cucumber.java.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {

    public static WebDriver driver;

    @Before
    public static WebDriver setup1() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ajio.com/");

        return driver;
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
