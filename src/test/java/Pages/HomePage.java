package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mainSearchbar")
    private WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"sayt\"]/div/div/div")
    private WebElement btnSearch;

    @FindBy(xpath = "//*[@id='__next']/div[1]/div[1]/div/div[3]/div[1]/div/div/div/ul/li[2]/a")
    private WebElement listName;

    @FindBys({ @FindBy(className = "m-product__card") })
    private List<WebElement> products;

    public void searchProduct(String product, Boolean clickIcon){
        try {
            searchBar.sendKeys(product);
            if (clickIcon){
                btnSearch.click();
            } else {
                searchBar.sendKeys(Keys.ENTER);
            }
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            wait.until(ExpectedConditions.visibilityOf(listName));
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public List<WebElement> getProducts() {
        return this.products;
    }
}
