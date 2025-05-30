package tests;

import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import utils.Driver;

import static utils.Driver.closeDriver;
import static utils.Driver.getDriver;

public class C04UsePageClassWithPageFactory {
    //Navigate to https://www.saucedemo.com/
    //Enter the username as standard_user
    //Enter the password as secret_sauce
    //Click on login button.
    //- Choose price low to high
    //- Verify item prices are sorted from low to high with hard Assert.


    @Test
    public void pageFactoryTest() {
        SauceDemoLoginPage saucepage = new SauceDemoLoginPage();
        //Navigate to https://www.saucedemo.com/
        getDriver().get("https://www.saucedemo.com/");

        //Enter the username as standard_user
        saucepage.fillNameField("standard_user");

        //Enter the password as secret_sauce
        saucepage.fillPasswordField("secret_sauce");

        //Click on login button.
        saucepage.clickSubmitButton();

        //- Choose price low to high
        //- Verify item prices are sorted from low to high with hard Assert.
        closeDriver();
    }
}