package Pages;

import Utility.DriverManager;
import Utility.Log;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GooglePage extends PageLocators {

    final WebDriver driver;

    public GooglePage() {
        this.driver = DriverManager.driver;
        PageFactory.initElements(driver, this);
        Log.logInfo("Initiated driver..");
    }

    public void navigateGoogle() {
        driver.navigate().to("http://www.google.com");
        Log.logInfo("Navigated to google");
    }

    public void enterTextInSearchBox(String text){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(searchBoxLocator));
        searchBoxLocator.sendKeys("hi google "+text);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(firstLink));
        firstLink.click();
        Log.logInfo("clicked on first link");
    }

    public void navigateBrowserStack() {
        driver.navigate().to("http://www.browserstack.com");
        Log.logInfo("Navigated to BrowserStack");
    }
}
