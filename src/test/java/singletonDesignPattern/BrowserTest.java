package singletonDesignPattern;

import Pages.GooglePage;
import org.testng.annotations.Test;

public class BrowserTest extends SingletonBaseClass{

    @Test(priority=1)
    public void verifyDriverTest(){
        GooglePage googlePage = new GooglePage();
        googlePage.navigateGoogle();
        googlePage.enterTextInSearchBox("selenium");
    }


    @Test(priority=2)
    public void verifyDriver(){
        GooglePage googlePage = new GooglePage();
        googlePage.navigateBrowserStack();
    }
}
