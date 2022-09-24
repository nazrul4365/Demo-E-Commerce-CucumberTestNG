package pages.components;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

public class AppDownloadPage extends BasePage {


    public AppDownloadPage(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
    }

    public String getAppStoreTitle(){
//        driver.switchTo().newWindow(WindowType.TAB);

        Set<String> windowHandle = driver.getWindowHandles();
        Iterator<String> it = windowHandle.iterator();

//        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
        driver.get("https://www.apple.com/in/app-store/");
        return  driver.getTitle();
    }

    public String getGooglePlayStoreTitle(){
//        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> windowHandle = driver.getWindowHandles();
        Iterator<String> it = windowHandle.iterator();

//        String parentWindow = it.next();
        String childWindow = it.next();

        driver.switchTo().window(childWindow);
        driver.get("https://play.google.com/store/games");
        return driver.getTitle();

    }



}
