public class FormPage {
    public static void submitForm(WebDriver driver){
        driver.findElement(By.id("first-name")).sendKeys("Bee Fateema");
        driver.findElement(By.id("last-name")).sendKeys("Shiras");
        driver.findElement(By.id("job-title")).sendKeys("Software Developer");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.cssSelector("input[value = 'checkbox-2']")).click();
        driver.findElement(By.cssSelector("option[value = '1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("20012022");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.linkText("Submit")).click();
    }
}