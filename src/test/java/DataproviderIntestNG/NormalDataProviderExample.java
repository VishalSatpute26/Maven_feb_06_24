package DataproviderIntestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NormalDataProviderExample
{

    public static WebDriver driver;

    @DataProvider(name="test data")
    public Object[][] dataProviderFunction()
    {
return new Object[][]{
        {"Selenium","Mumbai"},
        {"selenium","Pune"},
        {"Selenium","Nashik"},
        {"Selenium","Hydrabad"}
};
    }


    @Test(dataProvider ="test data")
    public void verifyNeedsOfParameters(String courseName, String CityName) throws InterruptedException
    {
        System.setProperty("WebDriver.chrome.driver", "D:\\SDET CLASSES\\setup_chromedriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courseName + " " + CityName);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}
