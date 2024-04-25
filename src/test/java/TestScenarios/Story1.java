package TestScenarios;

import Pages.HomePage;
import DataProviders.Story1DataProvider;
import Utilities.CommonFunctions;
import Utilities.JsonReader;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Story1 extends BaseTest{

    private String testCaseName;

    @Test( dataProvider = "TC_Search_Bar_001",
            dataProviderClass = Story1DataProvider.class,
            groups = {"story1", "searchbar"},
            priority = 1,
            description = "Find one article"
    )
    public void TC_Search_Bar_001(HashMap<String, String> data) throws IOException {

        String product = data.get("name");

        HomePage homePage = new HomePage(driver);
        CommonFunctions.getScreenShot(driver);
        homePage.searchProduct(product, false);
        // TODO: add test case name on screenshot
        CommonFunctions.getScreenShot(driver);
        List<WebElement> products = homePage.getProducts();
        Assert.assertFalse(products.isEmpty());
    }

    @Test( dataProvider = "TC_Search_Bar_002",
            groups = {"story1", "searchbar"},
            priority = 2,
            description = "Find two different articles"
    )
    public void TC_Search_Bar_002() throws IOException {}

    @Test( dataProvider = "TC_Search_Bar_003",
            groups = {"story1", "searchbar"},
            priority = 3,
            description = "Find one article using the magnify glass icon"
    )
    public void TC_Search_Bar_003() throws IOException {}

    @Test( dataProvider = "TC_Search_Bar_004",
            groups = {"story1", "searchbar"},
            priority = 4,
            description = "Fill the search bar and validate the X icon "
    )
    public void TC_Search_Bar_004() throws IOException {}

    @Test( dataProvider = "TC_Search_Bar_005",
            groups = {"story1", "searchbar"},
            priority = 5,
            description = "Look for a non-existent product"
    )
    public void TC_Search_Bar_005() throws IOException {}

    @Test( dataProvider = "TC_Search_Bar_006",
            groups = {"story1", "searchbar"},
            priority = 6,
            description = "Look for a product by brand"
    )
    public void TC_Search_Bar_006() throws IOException {}

    @Test( dataProvider = "TC_Search_Bar_007",
            groups = {"story1", "searchbar"},
            priority = 7,
            description = "Look for a  product by physical characteristic"
    )
    public void TC_Search_Bar_007() throws IOException {}

    @Test( dataProvider = "TC_Search_Bar_008",
            groups = {"story1", "searchbar"},
            priority = 8,
            description = "Look for a product by model "
    )
    public void TC_Search_Bar_008() throws IOException {}

}
