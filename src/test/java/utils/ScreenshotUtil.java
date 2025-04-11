package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String testName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String dest = "target/screenshots/" + testName + "_" + System.currentTimeMillis() + ".png";
        FileUtils.copyFile(src, new File(dest));
    }
}
