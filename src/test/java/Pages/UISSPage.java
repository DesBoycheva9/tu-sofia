package Pages;

import Helpers.Helpers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UISSPage extends PagePrototype {

    @FindBy(how = How.XPATH, using = "//a[@href='http://student.tu-sofia.bg/'] ")
    private WebElement uissLink;

    @FindBy(how = How.XPATH, using = "//*[@href='/university/161']")
    private WebElement uissButton;

    @FindBy(how = How.ID, using = "login")
    private WebElement uissLogin;

    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement uissPageHeader;

    public UISSPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public UISSPage(){

    }
    public void AllElementsPresent() {
        Assert.assertTrue(getUissLink().isDisplayed());
        Assert.assertTrue(uissButton.isDisplayed());
        Assert.assertEquals(uissPageHeader.getText(), "Университетска Информационна Система - Студент");
    }

    public void OpenUISSPage() {
        uissButton.click();
    }

    public void OpenLinks(WebDriver driver, WebElement link) {
        Assert.assertTrue(link.isDisplayed());
        link.click();
        Helpers.switchTab(driver);

    }


    public WebElement getUissLink() {
        return uissLink;
    }

    public void setUissLink(WebElement uissLink) {
        this.uissLink = uissLink;
    }
}

