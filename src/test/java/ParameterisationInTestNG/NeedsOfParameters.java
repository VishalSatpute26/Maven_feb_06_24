package ParameterisationInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedsOfParameters
{
    @Test
    public void verifyNeedsOfParameters() throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "D:\\SDET CLASSES\\setup_chromedriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchTextBox=driver.findElement(By.name("q"));
        searchTextBox.sendKeys("Java"+" "+"Pune");
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}
