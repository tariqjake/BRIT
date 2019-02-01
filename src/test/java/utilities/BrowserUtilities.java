package utilities;

import com.google.common.base.Function;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BrowserUtilities {
    public static void wait(int secs) {
        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
        }
    }

    public static String getScreenshot(String name) {

        String time = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();

        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);

        String target = System.getProperty("user.dir") + "/test-output/Screenshots" + name + time + ".png";

        File finalDestination = new File(target);

        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException io) {
        }

        return target;
    }

    public void selectCheckBox(WebElement element, boolean check){
        if(check){
            if(!element.isSelected()){
                element.click();
            }
        } else {
            if(element.isSelected()){
                element.click();
            }
        }
    }





    public static boolean isClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));

        }catch(Exception e){
            return false;
        }
        return true;
    }




}
