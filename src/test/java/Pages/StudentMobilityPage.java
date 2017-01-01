package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StudentMobilityPage  extends PagePrototype {
    @FindBy (how = How.ID, using = "138")
    private WebElement studentMobilityLink;
    @FindBy (how = How.XPATH, using = "id('right_column')/h1")
    private WebElement StudentMobilityHeader;

    public StudentMobilityPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public StudentMobilityPage() {

    }

    public void OpenStudentMobilityPage(){
        studentMobilityLink.click();
    }

    public void AssertStudentMobiltyPage(){
        Assert.assertEquals(StudentMobilityHeader.getText(),"Студентска мобилност");

    }
}
