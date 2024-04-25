package DataProviders;

import Utilities.JsonReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class Story1DataProvider {

    @DataProvider(name = "TC_Search_Bar_001")
    public Object[][] DP_Search_Bar_001() throws IOException, ParseException {
        return JsonReader.getJsonData("TS_Story01_TC_Search_Bar_001", "uc1");
    }

    @DataProvider(name = "TC_Search_Bar_002")
    public Object[][] DP_Search_Bar_002() throws IOException, ParseException {
        return JsonReader.getJsonData("TS_Story01_TC_Search_Bar_001", "uc2");
    }

    @DataProvider(name = "TC_Search_Bar_003")
    public Object[][] DP_Search_Bar_003() throws IOException, ParseException {
        return JsonReader.getJsonData("TS_Story01_TC_Search_Bar_001", "uc3");
    }

    @DataProvider(name = "TC_Search_Bar_004")
    public Object[][] DP_Search_Bar_004() throws IOException, ParseException {
        return JsonReader.getJsonData("TS_Story01_TC_Search_Bar_001", "uc4");
    }

    @DataProvider(name = "TC_Search_Bar_005")
    public Object[][] DP_Search_Bar_005() throws IOException, ParseException {
        return JsonReader.getJsonData("TS_Story01_TC_Search_Bar_001", "uc5");
    }

    @DataProvider(name = "TC_Search_Bar_006")
    public Object[][] DP_Search_Bar_006() throws IOException, ParseException {
        return JsonReader.getJsonData("TS_Story01_TC_Search_Bar_001", "uc6");
    }

    @DataProvider(name = "TC_Search_Bar_007")
    public Object[][] DP_Search_Bar_007() throws IOException, ParseException {
        return JsonReader.getJsonData("TS_Story01_TC_Search_Bar_001", "uc7");
    }

    @DataProvider(name = "TC_Search_Bar_008")
    public Object[][] DP_Search_Bar_008() throws IOException, ParseException {
        return JsonReader.getJsonData("TS_Story01_TC_Search_Bar_001", "uc8");
    }

}
