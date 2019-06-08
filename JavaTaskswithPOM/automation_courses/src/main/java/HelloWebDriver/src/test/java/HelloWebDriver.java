import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWebDriver {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://pastebin.com");
        WebElement searchinput=driver.findElement(By.id("paste_code"));

        searchinput.sendKeys("Hello from WebDriver");
        WebElement searchBtn=driver.findElement(By.xpath("*//*[@value='Go']"));
        searchBtn.click();
        Thread.sleep(2000);
        driver.quit();


    }
}
