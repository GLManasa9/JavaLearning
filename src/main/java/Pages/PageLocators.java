package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

class PageLocators {

    @FindBy(how= How.XPATH,using="(//h1[.='Search Results']/..//a)[1]")
    WebElement firstLink;

    @FindBys({
        @FindBy(id="APjFqb")
    })
    WebElement searchBoxLocator;
}
