package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class search {

    WebDriver driver;

    @FindBy(css = "input.react-autosuggest__input.react-autosuggest__input--open")
    WebElement searchBar;

    public  search (WebDriver driver){
       this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver ,10);
        PageFactory.initElements(factory , this);
    }

    public void  setSearch(String product){
        searchBar.sendKeys(product);
        searchBar.sendKeys(Keys.ENTER);
    }
}
