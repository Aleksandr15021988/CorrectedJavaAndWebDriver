import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class HardcoreTest {
    Hardcore hardcore =new Hardcore(new ChromeDriver());
    String receiveSumFromTable;
    @Before
    public void setUp() throws InterruptedException {
        hardcore.runWeb();
        hardcore.findAndClickExploreAllProduct();
        hardcore.findAndClickSeePrising();
        hardcore.findAndClickCalculator();
        hardcore.findAndClickCalcFrameElements();
        receiveSumFromTable = hardcore.getSumFromTable();

        hardcore.findAndClickSendMail();
        hardcore.switchToMailPageAntCopyAdress();
        hardcore.returnToCalcPasteAndSendMail();
        hardcore.switchToMailAndOpenLetter();


    }
    @Test
    public void compareSumFromTableAndLetter() {
        Assert.assertTrue(receiveSumFromTable.contains(hardcore.findSumInLetter()));
    }
   @After
   public void webQuit(){
       hardcore.driver.quit();
    }
}
