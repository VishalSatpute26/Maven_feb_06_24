import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MavenBaseExample
{
    public static void main(String[] args) throws IOException
    {
        System.setProperty("WebDriver.chrome.driver", "D:\\SDET CLASSES\\setup_chromedriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest= new File("D:\\SDET CLASSES\\ScreenShot_here\\ScreenShot_here_"+timestamp()+".png");
        FileUtils.copyFile(src,dest);

        driver.close();
    }
    public static String timestamp()
    {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());

    }
}
