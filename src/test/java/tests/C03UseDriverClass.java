package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static utils.Driver.*;

public class C03UseDriverClass {
    //Go to URL: https://opensource-demo.orangehrmlive.com/
    //Verify title contains OrangeHRM.
    //Use Driver Class.


    @Test
    public void driverClassTest() {
        getDriver().get("https://opensource-demo.orangehrmlive.com/");
        Assert.assertTrue(getDriver().getTitle().contains("OrangeHRM"));
        closeDriver();
    }
}