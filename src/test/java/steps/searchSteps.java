package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import page.search;

import static hooks.hooks.setup1;

public class searchSteps {
    WebDriver driver;

    search spage ;

    @Given("user redirect to page")
    public void user_redirect_to_page() {
        driver = setup1();
        spage = new search(driver);

    }
    @Given("user go to search bar")
    public void user_go_to_search_bar() {
        System.out.println("user on searchBar");

    }
    @And("user go to search user search for {string}")
    public void user_go_to_search_user_search_for_watches(String product) {
        spage.setSearch(product);
    }
    @When("user search for products")
    public void user_search_for_products() {
        System.out.println("searched products ");

    }


}
