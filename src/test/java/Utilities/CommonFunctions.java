package Utilities;

import TestScenarios.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CommonFunctions extends BaseTest {

    public static void getScreenShot(WebDriver driver) throws IOException {
        Date currentDate = new Date();
        String filename = currentDate.toString().replace(" ", "-").replace(":", "-");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File((System.getProperty("user.dir") + "/src/test/resources/screenshots/" + filename + ".png")));

    }

}
