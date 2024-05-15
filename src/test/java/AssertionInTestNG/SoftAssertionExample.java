package AssertionInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample
{
    @Test
    public void openFacebook()
    {
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("WebDriver.chrome.driver", "D:\\SDET CLASSES\\setup_chromedriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        WebElement usernametextbox=driver.findElement(By.name("email"));
        softAssert.assertEquals(title, "Facebook – log in or sign up","Facebook – log in or sign up titile should be match");
        softAssert.assertTrue(usernametextbox.isDisplayed(),"user name text box should be display");
		System.out.println("bye-bye");
        softAssert.assertAll();
        driver.close();
    }
}
