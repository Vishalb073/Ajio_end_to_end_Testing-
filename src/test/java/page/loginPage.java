package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class loginPage {

    WebDriver driver;

    @FindBy(id = "loginAjio")
    WebElement loginButton;

    @FindBy(css = "input.username")
    WebElement phoneNo;

    @FindBy(css = "input.login-btn")
    WebElement button;

    @FindBy(css = "span.ignore-sentence-case")
    WebElement useName;

    public loginPage(WebDriver driver) {
        this.driver = driver;
       PageFactory.initElements(driver , this);
    }

    public void signInAndSendKey(String number) {
        loginButton.click();
        phoneNo.sendKeys(number);
    }

    public void clickButton() {
        button.click();
    }
    public String userName(){
       return useName.getAccessibleName();
    }
}


