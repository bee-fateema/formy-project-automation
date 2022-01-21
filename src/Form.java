import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\beefa\\Downloads\\97chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");

        FormPage formpage =new FormPage();
        formpage.submitForm(driver);

        ConfirmationPage cp = new ConfirmationPage();
        cp.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!",cp.getAlertBannerText(driver));
        driver.quit();
    }

}
