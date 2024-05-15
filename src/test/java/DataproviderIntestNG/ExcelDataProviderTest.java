package DataproviderIntestNG;

import org.apache.poi.ss.usermodel.*;
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

/*public class ExcelDataProviderTest
{
    public static WebDriver driver;

    @DataProvider(name = "numericData")
    public Object[][] numericData() throws IOException {
        String excelFilePath = "C:\\Users\\HP-PC\\Desktop\\Numeric_data_sheet.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);

        Sheet sheet = workbook.getSheet("TestData1");

        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i + 1);
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                data[i][j] = cell.getNumericCellValue();
            }
        }

        workbook.close();
        inputStream.close();

        return data;
    }

    @Test(dataProvider = "numericData")
    public void testNumericData(double numericValue)
    {
        System.out.println("Numeric Value: " + numericValue);
        // Your test logic using the numeric value
        // Add your assertions or test logic here
    }
    @Test(dataProvider ="Testdata1")

    public void verifyNeedsOfParameters(String cityName, double postalCode) throws InterruptedException
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
}*/
