package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class addToCart {


    WebDriver driver;
    @FindBy(css = "input[aria-label='Search Ajio']")
    WebElement searchConsole;

   @FindBy(xpath = "//a[@class = 'rilrtl-products-list__link desktop']")
    List<WebElement> shoes;



    public addToCart(WebDriver driver){
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver ,10);
        PageFactory.initElements(factory , this);
    }

    public void  setSearch(String product){
        searchConsole.sendKeys(product);
        searchConsole.sendKeys(Keys.ENTER);
    }

    public void select_product(){

    }



}
