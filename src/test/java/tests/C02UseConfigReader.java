package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class C02UseConfigReader {

    @Test
    public void configReaderTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(ConfigReader.getProperty("googleUrl"));
        System.out.println(ConfigReader.getProperty("username"));
        System.out.println(ConfigReader.getProperty("eposta"));
        System.out.println(ConfigReader.getProperty("password"));

        Thread.sleep(1000);
        driver.quit();
    }
}
