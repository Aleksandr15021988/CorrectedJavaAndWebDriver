import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BringItOnMainTest {
    BringItOnMain bringItOnMain=new BringItOnMain(new ChromeDriver());
    String nameOfpage="https://pastebin.com";
    String nameOfTextArea ="git config --global user.name  \"New Sheriff in Town\"\n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
            "git push origin master --force";
    String nameOfPasteCodeElement="paste_code";
    String xpathForSelectBush="//form[@id='myform']/div[3]/div[1]/div[2]/select";
    String selectByValueBush="8";
    String xpathForselectTenMinutes="//form[@id='myform']/div[3]/div[2]/div[2]/select";

    String selectByValueTenMinutes="10M";
    String cssSelectorOfTitle="#myform > div.form_frame_left > div:nth-child(5) > div.form_right > input";
    String inputText="how to gain dominance among developers";
    String nameOfButton="submit";
    String FindBushStringsByClassName="kw2";
    String standartBushColor="#c20cb9";


    @Before
    public void setUp(){
        bringItOnMain.getPage(nameOfpage);
        bringItOnMain.findPasteCodeSendKeys(nameOfPasteCodeElement, nameOfTextArea);
        bringItOnMain.selectBush(xpathForSelectBush,selectByValueBush);
        bringItOnMain.selectTenMinutes(xpathForselectTenMinutes,selectByValueTenMinutes);
        bringItOnMain.findTitleandSendKeys(cssSelectorOfTitle,inputText);
        bringItOnMain.findButtonCreateNewPasteAndClick(nameOfButton);

    }
    @Test
    public void equalsTitleOfPageWithInputText(){
        Assert.assertEquals(bringItOnMain.getTileOfPage(),inputText);
    }

    @Test
    public void equalsTextAreaAfterInputText (){
        Assert.assertEquals(nameOfTextArea,bringItOnMain.getTextinPasteCode(nameOfPasteCodeElement));
    }
    @Test
    public void equalsColorOfBush(){
        List<String>bushColor=bringItOnMain.getColorOfBush(FindBushStringsByClassName);
        for(int i=0;i<bushColor.size();i++){
         Assert.assertEquals(bushColor.get(i),standartBushColor);
        }
    }
    @After
public void clothePage(){
        bringItOnMain.clothePage();

}

}
