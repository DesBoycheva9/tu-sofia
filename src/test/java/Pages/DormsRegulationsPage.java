package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class DormsRegulationsPage extends PagePrototype {
    @FindBy(how = How.ID, using = "111")
    private WebElement regLink;
    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement regPageHeader;
    @FindBy(how = How.XPATH, using = "id('right_column')/div/ul/li[1]")
    private WebElement regDoc1;
    @FindBy(how = How.XPATH, using = "id('right_column')/div/ul/li[2]")
    private WebElement regDoc2;


    public DormsRegulationsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public DormsRegulationsPage() {
    }

    public void OpenDormsRegulationsPage() {
        regLink.click();
        Assert.assertEquals(regPageHeader.getText(), "Правилници");
    }

    public void OpenDormsRegulationsLinks(WebDriver driver, WebElement link) {
        Assert.assertTrue(link.isDisplayed());
        link.click();
        driver.navigate().back();
        //Helpers.Helpers.switchTab(driver);

    }

    public WebElement getRegDoc1() {
        return regDoc1;
    }

    public void setRegDoc1(WebElement regDoc1) {
        this.regDoc1 = regDoc1;
    }

    public WebElement getRegDoc2() {
        return regDoc2;
    }

    public void setRegDoc2(WebElement regDoc2) {
        this.regDoc2 = regDoc2;
    }
}
