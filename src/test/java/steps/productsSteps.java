package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.products;


import java.util.List;

import static hooks.hooks.setup1;


public class productsSteps {

    WebDriver driver;

    products  mensProducts;

    @Given("i am on homepage")
    public void i_am_on_homepage() {
        driver = setup1();
        mensProducts = new products(driver);
    }
    @Given("i am click on mens section")
    public void i_am_click_on_mens_section() {
        mensProducts.clickOnMens();
    }
    @Given("go to brands select the brand")
    public void go_to_brands_select_the_brand() {
       mensProducts.brandsBtnAndBrand();
    }
    @When("store the products in a list")
    public void store_the_products_in_a_list() {
      mensProducts.items();
    }
    @When("get a product and its name")
    public void get_a_product_and_its_name() {
       String product = " ";
        List<WebElement> productlist = mensProducts.items();
        for (int i = 0; i < productlist.size(); i++) {
            product+= productlist.get(5).getText();
        }
        System.out.println(product);
    }
}
