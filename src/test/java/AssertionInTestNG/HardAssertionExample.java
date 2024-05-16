package AssertionInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionExample
{
    @Test
    public void openFacebook()
    {
        System.setProperty("WebDriver.chrome.driver", "D:\\SDET CLASSES\\setup_chromedriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        WebElement usernametextbox=driver.findElement(By.name("email"));
        Assert.assertEquals(title, "Facebook – log in or sign up","Facebook – log in or sign up titile should be match");
        Assert.assertTrue(usernametextbox.isDisplayed(),"user name text box should be display");
        System.out.println("Hello Everyone ");
        driver.close();

    }
}
