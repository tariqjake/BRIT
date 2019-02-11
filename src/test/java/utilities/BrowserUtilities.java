package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.*;

public class BrowserUtilities {

    public static void wait(int secs) {
        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
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
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }


    public static String getScreenshot(String name) {

        String time = new SimpleDateFormat("_yyyy_MM_dd_hh:mm:ss").format(new Date());

        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();

        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);

        String target = System.getProperty("user.dir") + "/test-output/screenshots/" + name + time + ".png";

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

    public WebElement selectRandomTextFromDropdown(Select select) {
        Random random = new Random();
        List<WebElement> weblist = select.getOptions();
        int optionIndex = 1 + random.nextInt(weblist.size() - 1);
        select.selectByIndex(optionIndex);
        return select.getFirstSelectedOption();
    }



    public static void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));

        }catch(Exception e){
            throw new ElementNotVisibleException(element + " is NOT VISIBLE");
        }
        return;

    }



    public static int getStringToNumber(WebElement element){
        String text;
        if(element.getText().contains("-")) {
            int indexOfNumber = element.getText().indexOf("-");
            text = element.getText().substring(indexOfNumber + 1).trim();
        }else{
            text = element.getText().trim();
        }
        String number = "";
        for (int i = 0; i < text.length();i++){
            if(!('9' >= text.charAt(i)  && text.charAt(i) >='0'))
                break;
            number = number + text.charAt(i);
        }
    return Integer.parseInt(number);
    }



    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }



}
