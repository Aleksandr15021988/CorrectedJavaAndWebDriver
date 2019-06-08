import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ICanWin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://pastebin.com");
        WebElement pastecode=driver.findElement(By.name("paste_code"));
        pastecode.sendKeys("Hello from WebDriver");

        WebElement PasteExpiration=driver.findElement(By.xpath("//form[@id='myform']/div[3]/div[2]/div[2]/select"));
        Thread.sleep(2000);
        Select s=new Select(PasteExpiration);
        s.selectByValue("10M");
        Thread.sleep(2000);

        WebElement title =driver.findElement(By.cssSelector("#myform > div.form_frame_left > div:nth-child(5) > div.form_right > input"));
        title.sendKeys("helloweb");
        Thread.sleep(2000);
        WebElement searchbtn=driver.findElement(By.name("submit"));
        searchbtn.click();
        driver.quit();


    }
}
