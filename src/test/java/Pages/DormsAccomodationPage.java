package Pages;

        import org.junit.Assert;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.How;
        import org.openqa.selenium.support.PageFactory;

public class DormsAccomodationPage extends PagePrototype {
    @FindBy(how = How.ID, using = "337")
    private WebElement accLink;
    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement accPageHeader;
    @FindBy(how = How.XPATH, using = "id('right_column')/div/ul/li[1]")
    private WebElement accDoc1;
    @FindBy(how = How.XPATH, using = "id('right_column')/div/ul/li[2]")
    private WebElement accDoc2;




    public DormsAccomodationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public DormsAccomodationPage(){
    }

    public void OpenAccomodationPage(){
        accLink.click();
        Assert.assertEquals(accPageHeader.getText(),"Ред за настаняване в общежитие");
    }

    public void OpenAccomodatiionLinks(WebDriver driver, WebElement link){
        Assert.assertTrue(link.isDisplayed());
        link.click();
       // Helpers.Helpers.switchTab(driver);
        driver.navigate().back();
        accLink.click();

    }

    public WebElement getAccDoc1() {
        return accDoc1;
    }

    public void setAccDoc1(WebElement accDoc1) {
        this.accDoc1 = accDoc1;
    }

    public WebElement getAccDoc2() {
        return accDoc2;
    }

    public void setAccDoc2(WebElement accDoc2) {
        this.accDoc2 = accDoc2;
    }
}
