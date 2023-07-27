package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Driver {
    static void createInstance(String browserType){
        System.out.println("Browser type:"+browserType);
        switch (browserType){
            case "chrome":
                DriverManager.driver = createChromeDriverInstance();
                break;
            case "edge":
                DriverManager.driver = createEdgeDriverInstance();
                break;
        }
    }

    static WebDriver createChromeDriverInstance() {
        System.out.println("Creating chrome instance");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximised");
        options.addArguments("disable-extensions");
        return new ChromeDriver(options);
    }

    static WebDriver createEdgeDriverInstance() {
        System.out.println("Creating edge instance");
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("start-maximised");
        options.addArguments("disable-extensions");
        return new EdgeDriver(options);
    }
}
