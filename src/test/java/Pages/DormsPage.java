package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DormsPage extends PagePrototype {
    @FindBy(how = How.XPATH, using = "//*[@id='navigation']/li[12]/span/a")
    private WebElement dormsLink;
    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement dormsPageHeader;


    public DormsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public DormsPage(){
    }

    public void OpenDormPage(){
        dormsLink.click();
        Assert.assertEquals(dormsPageHeader.getText(),"Общежития");
    }
}
