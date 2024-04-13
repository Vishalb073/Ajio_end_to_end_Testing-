package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class products {
    WebDriver driver;

    @FindBy(css = "a[href='/shop/men']")
    WebElement mensBtn;

    @FindBy(xpath = "(//a[contains(text(), 'BRANDS')])[1]")
    WebElement brands;

    @FindBy(css = "a[href='/s/superdry-3483-6296']")
    WebElement brandName;

    @FindBy(css = ".items")
    List<WebElement> products;

    public products(WebDriver driver){
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver , 10);
        PageFactory.initElements(factory , this);
    }

    public void clickOnMens(){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(mensBtn));
        actions.moveToElement(mensBtn).perform();
    }
    public  void brandsBtnAndBrand(){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(brands));
        actions.moveToElement(brands).perform();
        brandName.click();
    }
    public List<WebElement> items(){

        List<WebElement> superDryItems = products;

        return superDryItems;
    }
}

