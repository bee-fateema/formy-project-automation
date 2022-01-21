import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\beefa\\Downloads\\97chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("Mangalapuzha Bridge, Aluva, Kerala 683102, India");
        Thread.sleep(1000);

        WebElement autocompleteresult = driver.findElement(By.className("pac-item"));
        autocompleteresult.click();



        //driver.quit();
    }
}