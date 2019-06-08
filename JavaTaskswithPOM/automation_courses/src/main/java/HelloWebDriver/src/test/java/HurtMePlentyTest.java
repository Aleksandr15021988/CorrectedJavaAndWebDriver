import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HurtMePlentyTest {


    HurtMePlenty hurtMePlenty=new HurtMePlenty(new ChromeDriver());
    @Before
    public void setUp() throws InterruptedException {
        hurtMePlenty.runWeb();
        hurtMePlenty.findAndClickExploreAllProduct();
        hurtMePlenty.findAndClickSeePrising();
        hurtMePlenty.findAndClickCalculator();
        hurtMePlenty.findAndClickCalcFrameElements();
    }
    @Test
    public void compareVMClass()  {
        Assert.assertTrue(hurtMePlenty.getStringOfVMClassFromTable()
                .contains(hurtMePlenty.getStringOfVMClassFromDropDown()));
    }
@Test
    public void compareInstance() {
        Assert.assertTrue(hurtMePlenty.getStringOfInstanceTypeFromTable()
                .contains(hurtMePlenty.getStringOfInstanceTypeFromDropDown()));
    }
    @Test
    public void compareRegion(){
        Assert.assertTrue(hurtMePlenty.getRegionFromTable()
                .contains(hurtMePlenty.getRegionFromDropDown()));
    }
    @Test
    public void compareLocalSSD(){
        Assert.assertTrue(hurtMePlenty.getLocalSSDFromTable()
            .contains(hurtMePlenty.getLocalSSDFromDropDown()));

    }
    @Test
    public void compareCommitmentTerm(){
        Assert.assertTrue(hurtMePlenty.getCommitmentTermFtomTable()
        .contains(hurtMePlenty.getCommitmentTermFromDropDown()));
    }
    @After
    public void webQuit(){
        hurtMePlenty.driver.quit();
    }

}
