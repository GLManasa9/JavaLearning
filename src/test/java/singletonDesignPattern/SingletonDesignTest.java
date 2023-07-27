package singletonDesignPattern;

import Pages.GooglePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SingletonDesignTest {
    WebDriver driver1;
    WebDriver driver2;

    @BeforeClass
    public void setUp(){
        SingletonBaseClass.init();
    }

    @Test(priority=1)
    public void verifyDriver_1(){
        driver1=SingletonBaseClass.getDriver();
        System.out.println("driver1:"+driver1);
        driver1.navigate().to("https://www.google.com");
    }

    @Test(priority=2)
    public void verifyDriver_2(){
        driver2=SingletonBaseClass.getDriver();
        System.out.println("driver2:"+driver2);
        driver2.navigate().to("https://www.google.com");
        GooglePage googlePage = new GooglePage();
        googlePage.enterTextInSearchBox("automation");
    }

    @AfterClass
    public void tearDown(){
        SingletonBaseClass.quit();
    }
}
