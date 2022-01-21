import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\beefa\\Downloads\\97chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/fileupload");
        WebElement file = driver.findElement(By.id("file-upload-field"));
        file.sendKeys("Planet9_3840x2160.jpg");


        driver.quit();
    }
}
