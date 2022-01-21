import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\beefa\\Downloads\\97chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/datepicker");

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("13/01/2022");
        date.sendKeys(Keys.RETURN);

        driver.quit();
    }
}
