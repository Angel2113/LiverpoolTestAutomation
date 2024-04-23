package TestScenarios;

import Pages.HomePage;
import Utilities.CommonFunctions;
import Utilities.JsonReader;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

public class Story1 extends BaseTest{

    @DataProvider(name = "TC_Search_Bar_001")
    public Object[][] TC_Search_Bar_001() throws IOException, ParseException {
        return JsonReader.getJsonData("TS_Story01_TC_Search_Bar_001", "uc1");
    }

    @Test( dataProvider = "TC_Search_Bar_001", groups = {"story1", "searchbar"}, priority = 1)
    public void searchBar(HashMap<String, String> data) throws IOException {
        String product = data.get("name");

        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("product", false);
        // TODO: add test case name on screenshot
        CommonFunctions.getScreenShot(driver);
        Assert.assertTrue(false);
    }
}
