package singletonDesignPattern;

import Utility.DriverManager;
import Utility.Log;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class SingletonBaseClass {
    private static WebDriver driver = null;

    public SingletonBaseClass(){}

    /**
     * static method is used to initialise the Webdriver object only when the Webdriver object is null.
     * If driver has a value (not been destroyed/ not null), init() method will not be executed
     * and the same driver would be used for the further execution.
     * This serves the actual purpose of Singleton design pattern
     */
    @BeforeClass
    public static void init() {
        System.out.println("Driver Initialization....");
        Log.logInfo("Initializing the browser...");
        if(driver==null) {
            driver = DriverManager.getDriver();
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

//    @BeforeClass
//    public static void beforeClass(){
//        System.out.println("before class");
//    }
//
//    @AfterClass
//    public static void afterClass(){
//        System.out.println("after class");
//    }

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
    @AfterClass
    public static void quit(){
        Log.logInfo("Closing the browser..");
        driver.quit();
        driver=null;
    }
}
