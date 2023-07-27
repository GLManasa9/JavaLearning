package Utility;

import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

public class DriverManager {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver==null){
            String browserName = readProjPropertiesFile("browser");
            Driver.createInstance(browserName);
        }
        return driver;
    }

    /**
     * read project properties file
     * @param propertyName
     * @return
     */
    public static String readProjPropertiesFile(String propertyName) {
        Properties prop = new Properties();
        try {
            prop.load(DriverManager.class.getClassLoader().getResourceAsStream("config.properties"));
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop.getProperty(propertyName);
    }
}
