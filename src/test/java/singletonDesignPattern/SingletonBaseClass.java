package singletonDesignPattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SingletonBaseClass {
    private static WebDriver driver = null;
    private static String browserName = "edge";

    // doesn't allow to create constructor
    private SingletonBaseClass(){}

    /**
     * static method is used to initialise the Webdriver object only when the Webdriver object is null.
     * If driver has a value (not been destroyed/ not null), init() method will not be executed
     * and the same driver would be used for the further execution.
     * This serves the actual purpose of Singleton design pattern
     */
    public static void init() {
        if(driver==null) {
            if(browserName.equalsIgnoreCase("edge")){
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    /**
     * getDriver() static method returns driver object to be used in test class.
     * @return
     */
    public static WebDriver getDriver(){
        return driver;
    }

    /**
     * quit() static method quits the driver and makes the driver as null
     * to destroy the driver object completely.
     */
    public static void quit(){
        driver.quit();
        driver=null;
    }
}
