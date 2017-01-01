package Pages;

import Helpers.Helpers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ScholarshipPage extends PagePrototype {
    @FindBy(how = How.XPATH, using = "//*[@id='navigation']/li[6]/span/a")
    private WebElement schoolarship;

    @FindBy(how = How.XPATH, using = "//*[@class='ckedited']/ul/li[8]")
    private WebElement faculty;

    @FindBy(how = How.XPATH, using = "//*[@href='/kcfinder/upload/files/zapoved%20zima%202016-2017.pdf']")
    private WebElement notice;

    @FindBy(how = How.XPATH, using = "//*[@href='/university/276']")
    private WebElement studentCardButton;

    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement getSchoolarshipPageHeader;


    public ScholarshipPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public void ScholarshipPage(){

    }

    public void OpenScholarshipPage(){
        schoolarship.click();
    }

    public void AssertAllElementsArePresent(){
        Assert.assertTrue(schoolarship.isDisplayed());
        Assert.assertTrue(faculty.isDisplayed());
        Assert.assertEquals(schoolarship.getText(),"Стипендии и награди");

    }

    public void OpenNotice(){
        Helpers.scrollToElement(getNotice(),driver);
        Assert.assertTrue(getNotice().isDisplayed());
       // getNotice().click();
        driver.switchTo().defaultContent();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-250)", "");
    }

    public WebElement getNotice() {
        return notice;
    }

    public void setNotice(WebElement notice) {
        this.notice = notice;
    }
}
