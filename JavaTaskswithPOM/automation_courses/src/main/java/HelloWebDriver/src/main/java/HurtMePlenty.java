
import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;



public class HurtMePlenty {
     WebDriver driver;

     HurtMePlenty(WebDriver driver) {
        this.driver = driver;

    }

    public void runWeb()  {

        driver.get("https://cloud.google.com");
    }

    public void findAndClickExploreAllProduct() {
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='cloud-site']/section[4]/div/div[1]/header/div/a"))).click();
    }

    public void findAndClickSeePrising() {
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.cssSelector
                                ("#google-cloud-platform > div:nth-child(1) > section > div.cloud-button__set > a.cloud-button.cloud-button--secondary"))).click();
    }

    public void findAndClickCalculator() {
        driver.manage().window().maximize();
       new WebDriverWait(driver,10)
               .until(ExpectedConditions.presenceOfElementLocated
                        (By.cssSelector("#cloud-site > nav > div > div > ul > li:nth-child(3) > a"))).click();
    }

    public void findAndClickCalcFrameElements() throws InterruptedException {
        Wait<WebDriver> wait =  new FluentWait<WebDriver>(driver)
                .pollingEvery(5,TimeUnit.SECONDS)
                .withTimeout(30,TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class)
                .withMessage("Element was not found");

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("idIframe")));

        wait.until(ExpectedConditions.elementToBeClickable
                (By.cssSelector("md-pagination-wrapper > .md-tab:nth-child(1) .hexagon-in2"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='input_51']"))).sendKeys("4");
        TimeUnit.SECONDS.sleep(4);
        wait.until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='select_value_label_44']"))).click();
        TimeUnit.SECONDS.sleep(4);
        wait.until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//*[@id='select_option_53']/div[1]"))).click();
        TimeUnit.SECONDS.sleep(4);
        wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//*[@id='select_value_label_45']"))).click();
        TimeUnit.SECONDS.sleep(4);
        wait.until(ExpectedConditions.visibilityOfElementLocated
                        (By.xpath("//*[@id='select_option_65']/div[1]"))).click();
        TimeUnit.SECONDS.sleep(4);
       wait.until(ExpectedConditions.visibilityOfElementLocated
               (By.xpath("//*[@id='select_value_label_47']"))).click();
                TimeUnit.SECONDS.sleep(4);
        wait.until(ExpectedConditions.visibilityOfElementLocated
                        (By.xpath("//*[@id='select_option_210']/div[1]"))).click();
        TimeUnit.SECONDS.sleep(4);
       wait.until(ExpectedConditions.elementToBeClickable//*[@id="mainForm"]/div[1]/div/md-card/md-card-content/div/div[1]/form/div[7]/div[1]/md-input-container/md-checkbox/div[1]
                        (By.xpath("//md-checkbox[@ng-model='listingCtrl.computeServer.addGPUs']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='select_value_label_333']/span[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//*[@id='select_option_340']"))).click();
        TimeUnit.SECONDS.sleep(4);
        wait.until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//*[@id='select_value_label_334']/span[1]"))).click();
        TimeUnit.SECONDS.sleep(4);
        wait.until(ExpectedConditions.presenceOfElementLocated
                (By.xpath("//*[@id='select_option_347']/div[1]"))).click();
        TimeUnit.SECONDS.sleep(4);
        wait.until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//*[@id='select_value_label_48']/span[1]"))).click();
        TimeUnit.SECONDS.sleep(4);
        wait.until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//*[@id='select_option_166']/div[1]"))).click();
        TimeUnit.SECONDS.sleep(4);//*[@id="select_value_label_48"]/span[1]//*[@id="select_option_166"]/div[1]
        wait.until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='select_value_label_49']/span[1]"))).click();
        TimeUnit.SECONDS.sleep(4);
        wait.until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//*[@id='select_option_180']/div[1]"))).click();
        TimeUnit.SECONDS.sleep(4);
        wait.until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//*[@id='select_value_label_50']/span[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//*[@id='select_option_81']/div[1]"))).click();
        TimeUnit.SECONDS.sleep(4);
        wait.until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='mainForm']/div[1]/div/md-card/md-card-content/div/div[1]/form/div[12]/button"))).click();
        TimeUnit.SECONDS.sleep(5);
    }

    public String getStringOfVMClassFromTable() {
        String VMClassFromTable = driver.findElement
                (By.xpath("//*[@id='compute']/md-list/md-list-item[2]/div")).getText();
        return VMClassFromTable;
    }

    public String getStringOfVMClassFromDropDown() {
        String VMClassFromDropDown = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='select_option_65']/div[1]"))).getText();
        return VMClassFromDropDown;
    }

    public String getStringOfInstanceTypeFromTable() {
        String instanseTypeFromTable = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='compute']/md-list/md-list-item[3]/div"))).getText();
        return instanseTypeFromTable;
    }

    public String getStringOfInstanceTypeFromDropDown() {
        String instanseTypeFromDropDown = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='select_option_210']/div[1]"))).getText();
        return instanseTypeFromDropDown;
    }

    public String getRegionFromTable() {
        String regionFromTable = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='compute']/md-list/md-list-item[4]/div"))).getText();
        return regionFromTable;
    }

    public String getRegionFromDropDown() {
        String regionFromDropDown = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='select_option_236']/div[1]"))).getText();
        return regionFromDropDown;
    }

    public String getLocalSSDFromTable() {
        String localSSDFromTable = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='compute']/md-list/md-list-item[4]/div"))).getText();
        return localSSDFromTable;
    }

    public String getLocalSSDFromDropDown() {
        String localSSDFromDropDown = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='select_option_236']/div[1]"))).getText();
        return localSSDFromDropDown;
    }

    public String getCommitmentTermFtomTable() {
        String commitmentTermFromTable = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='compute']/md-list/md-list-item[8]/div"))).getText();
        return commitmentTermFromTable;
    }

    public String getCommitmentTermFromDropDown() {
        String commitmentTermFromDropDown = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//*[@id='select_option_96']/div[1]"))).getText();
        return commitmentTermFromDropDown;
    }



}


