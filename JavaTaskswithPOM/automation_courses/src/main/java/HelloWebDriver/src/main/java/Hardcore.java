import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class Hardcore extends HurtMePlenty {
    ArrayList<String> tabs;


    Hardcore(WebDriver driver) {
        super(driver);
    }
    public String getSumFromTable(){
        String sum= new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//b[@class='ng-binding']"))).getText();
        return sum;//*[@id='resultBlock']/md-card/md-card-content/div/div/div/h2/b
    }

    public void findAndClickSendMail()  {
        new WebDriverWait(driver, 50)
                .until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//*[@id='email_quote']"))).click();

    }

    public void switchToMailPageAntCopyAdress() throws InterruptedException {
       ((JavascriptExecutor) driver).executeScript("window.open()");
        TimeUnit.SECONDS.sleep(5);
        tabs= new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://10minutemail.net");
        new WebDriverWait(driver,50)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='copy-button']"))).click();}

    public void returnToCalcPasteAndSendMail() throws InterruptedException {
        driver.switchTo().window(tabs.get(0));

        driver.switchTo().frame(new WebDriverWait(driver, 60)
                .until(ExpectedConditions.presenceOfElementLocated((By.xpath("//*[@id='idIframe']")))));
        TimeUnit.SECONDS.sleep(5); //Thread.sleep(5000);
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='input_388']"))).click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.chord(Keys.LEFT_CONTROL, "v")).build().perform();
        TimeUnit.SECONDS.sleep(3);

        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='dialogContent_394']/form/md-dialog-actions/button[2]"))).click();

    }

    public void switchToMailAndOpenLetter() throws InterruptedException {
      driver.switchTo().window(tabs.get(1));
        TimeUnit.SECONDS.sleep(15);

      new WebDriverWait(driver, 10)
            .until(ExpectedConditions.presenceOfElementLocated
                    (By.xpath("//*[@id='maillist']/tbody/tr[2]/td[2]/a"))).click();

}
     public String findSumInLetter()  {
        String sumfromLetter = new WebDriverWait(driver, 10)
                 .until(ExpectedConditions.presenceOfElementLocated
                         (By.xpath("//h3[contains(text(),'USD 1,187.77')]"))).getText();
         return sumfromLetter;

     }
    }

