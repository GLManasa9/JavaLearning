package singletonDesignPattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

class PageLocators {

    @FindBy(how= How.XPATH,using="//a[.='Speakers']")
    WebElement firstLink;

    @FindBys({
        @FindBy(id="APjFqb")
    })
    WebElement searchBoxLocator;
}
