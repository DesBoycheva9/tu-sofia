package Pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StudentCardPage extends PagePrototype {


    @FindBy(how = How.XPATH, using = "//*[@href='/university/276']")
    private WebElement studentCardButton;

    // To be revised
    @FindBy(how = How.XPATH, using = "//*[@href='/university/calendar']")
    private WebElement isicCard;

    @FindBy(how = How.XPATH, using = "//*[@href='http://www.isic.bg/']")
    private WebElement isicLink;

    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement studentCardPageHeader;

    public StudentCardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public StudentCardPage(){

    }
    public void AllElementsPresent() {
        Assert.assertTrue(studentCardButton.isDisplayed());
        Assert.assertEquals(studentCardPageHeader.getText(),"Студентска карта");
    }


    public void OpenStudentCardPage(){
        studentCardButton.click();
    }

    public void ClickISICLink(){
        isicLink.click();
        driver.navigate().back();

    }
}
