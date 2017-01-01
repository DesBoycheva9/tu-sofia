package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StudentPage extends PagePrototype {

    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement studentPageHeader;

    public StudentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public StudentPage(){

    }
    public void AllElementsPresent() {
        Assert.assertTrue(studentPageHeader.isDisplayed());
        Assert.assertEquals(studentPageHeader.getText(),"За вас студенти");
    }

    }
