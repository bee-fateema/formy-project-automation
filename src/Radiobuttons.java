import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\beefa\\Downloads\\97chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/radiobutton");

        WebElement radio1 = driver.findElement(By.id("radio-button-1"));
        radio1.click();

        WebElement radio2 = driver.findElement(By.cssSelector("input[value = 'option2']"));
        radio2.click();
        WebElement radio3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radio3.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

        driver.quit();
    }
}
