package DataproviderIntestNG;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;

import java.io.IOException;

public class DataProviderWithExcel
{
    public static WebDriver driver;

    @DataProvider(name="test data")
    public Object[][] dataProviderExcelFunction() throws IOException
    {
      Object[][] arrObj=  getDataFromExcel("C:\\Users\\HP-PC\\Desktop\\Data_provider_Sheet.xlsx","Testcase1");

      return arrObj;
    }
    public String[][] getDataFromExcel(String filePath,String SheetName) throws IOException
    {
        FileInputStream fileInputStream =new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=workbook.getSheet(SheetName);
        XSSFRow rows =sheet.getRow(0);
        int noOfRow =sheet.getPhysicalNumberOfRows();
        int noOfCol=rows.getLastCellNum();

        Cell cell;
        String[][] data=new String[noOfRow-1][noOfCol];
        for (int i=1;i<noOfRow;i++)
        {
            for (int j=0;j<noOfCol;j++)
            {
                rows=sheet.getRow(i);
                cell=rows.getCell(j);

                data[i-1][j]=cell.getStringCellValue();
            }
        }
        return data;
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
