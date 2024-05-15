package MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGExample
{
   //@Test
   //public void basicTestng()
   //{
   //    System.setProperty("WebDriver.chrome.driver", "D:\\SDET CLASSES\\setup_chromedriver\\chromedriver-win64\\chromedriver.exe");
   //    WebDriver driver = new ChromeDriver();
   //    driver.get("https://jqueryui.com/datepicker/");
   //    driver.manage().window().maximize();
   //    driver.close();
   //}
   //@Test
   // public void openAmazon()
   //{
   //System.setProperty("WebDriver.chrome.driver", "D:\\SDET CLASSES\\setup_chromedriver\\chromedriver-win64\\chromedriver.exe");
   //WebDriver driver = new ChromeDriver();
   //driver.get("https://www.amazon.in/");
   //driver.manage().window().maximize();
   //driver.close();
   //}

    @Test
    public void openFacebook()
    {
        System.setProperty("WebDriver.chrome.driver", "D:\\SDET CLASSES\\setup_chromedriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.close();
    }

}
