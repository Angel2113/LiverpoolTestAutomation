package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mainSearchbar")
    WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"sayt\"]/div/div/div")
    WebElement btnSearch;

    public void searchProduct(String product, Boolean clickIcon){
        try {
            searchBar.sendKeys(product);
            if (clickIcon){
                btnSearch.click();
            } else {
                searchBar.sendKeys(Keys.ENTER);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
