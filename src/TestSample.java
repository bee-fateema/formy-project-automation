import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\beefa\\Downloads\\97chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();
        driver.quit();

    }
}
