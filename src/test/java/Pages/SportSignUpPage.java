package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SportSignUpPage extends PagePrototype {
    @FindBy(how = How.ID, using = "120")
    private WebElement sportSignUpLink;
    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement sportSignUpPageHeader;
    @FindBy (how = How.XPATH, using = "id('right_column')/div/p[2]")
    private WebElement signUpSportLink;


    public SportSignUpPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public SportSignUpPage (){
    }

    public void OpenSportSignUpPage (){
        sportSignUpLink.click();
        Assert.assertEquals(sportSignUpPageHeader.getText(),"Записване за спорт");
    }

    public void OpenLinks(WebDriver driver, WebElement link) {
        Assert.assertTrue(link.isDisplayed());
        link.click();
        Helpers.Helpers.switchTab(driver);

    }


    public WebElement getSignUpSportLink() {
        return signUpSportLink;
    }

    public void setSignUpSportLink(WebElement signUpSportLink) {
        this.signUpSportLink = signUpSportLink;
    }
}