import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BringItOnMain  {
    private WebDriver driver;

    BringItOnMain(WebDriver driver){

        this.driver=driver;

    }

    public void getPage(String nameOfPage){
        driver.get(nameOfPage);
        //new WebDriverWait(driver,0,5);

    }
    public void findPasteCodeSendKeys(String nameOfElement,String inputText){

        new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(By.name(nameOfElement)))
                .sendKeys(inputText);
    }
    public void selectBush(String xpathForSelectBush,String selectByValue){
        Select s=new Select(new WebDriverWait(driver,10)
        .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathForSelectBush))));
        s.selectByValue(selectByValue);
    }
    public void selectTenMinutes(String xpathForselectTenMinutes,String selectByValue){
        Select s=new Select(new WebDriverWait(driver,10)
        .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathForselectTenMinutes))));
        s.selectByValue(selectByValue);
    }
    public void findTitleandSendKeys(String cssSelectorOfElement,String inputText) {
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.cssSelector(cssSelectorOfElement))).sendKeys(inputText);

    }
    public void findButtonCreateNewPasteAndClick(String nameOfButton){
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.name(nameOfButton))).click();

    }
    public String getTileOfPage(){
      return   driver.getTitle();
    }
    public List<String>getColorOfBush(String findBushStringsByClassName){
        List<WebElement> webElements = new WebDriverWait(driver,10)
        .until(ExpectedConditions.presenceOfAllElementsLocatedBy
                (By.className(findBushStringsByClassName)));
        List<String> hex = new ArrayList();
        for(int i = 0; i < webElements.size(); ++i) {
            hex.add(Color.fromString(((WebElement) webElements.get(i)).getCssValue("color")).asHex());
        }
        return hex;
    }
    public String getTextinPasteCode(String NameOfTextArea){
        return new WebDriverWait(driver,10)
        .until(ExpectedConditions.presenceOfElementLocated(By.name(NameOfTextArea))).getText();
    }
    public void clothePage(){
        driver.quit();
    }



    }




