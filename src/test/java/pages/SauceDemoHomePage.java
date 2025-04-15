package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.Driver.getDriver;


public class SauceDemoHomePage {
    // Locatorlar -> @FindBy


    // Constructor içerisinde PageFactory.initElements(driver,this);

    public SauceDemoHomePage() {
        PageFactory.initElements(getDriver(),this);
    }


    // Web saydasında elementler ile ilgili methodlar

}