package steps;

import io.cucumber.java.en.*;
import hooks.hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.loginPage;

import java.time.Duration;

public class login {

    WebDriver driver;

    loginPage page ;
    @Given("open webPage")
    public void open_web_page() {
        // Write code here that turns the phrase above into concrete actions
       driver = hooks.setup1();
       page = new loginPage(driver);

    }

    @And("redirect to Website")
    public void redirectToWebsite() {
        Assert.assertEquals(driver.getTitle() ,"Online Shopping for Women, Men, Kids – Clothing, Footwear | AJIO");
    }

    @And("open signIn page and send {string}")
    public void open_sign_in_page_and_send(String string) {
       page.signInAndSendKey(string);
    }

    @When("user clicks on countinue button")
    public void user_clicks_on_countinue_button() {
       page.clickButton();
    }

    @And("user Waits for otp and enters otp")
    public void user_waits_for_otp_and_enters_otp() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Then("user redirect to homepage and validate username")
    public void userRedirectToHomepageAndValidateUsername() {
        String ans = page.userName();
        Assert.assertEquals(ans , "vishal bhondu");
    }
}
