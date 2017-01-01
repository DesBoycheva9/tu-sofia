package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StudentOrganisationPage  extends PagePrototype {
    @FindBy(how = How.ID, using = "125")
    private WebElement studentOrganisationLink;
    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement studentOrganisationHeader;
    @FindBy(how = How.XPATH, using = "//*[@href='http://aiesec.bg/']")
    private WebElement aisecLink;
    @FindBy(how = How.XPATH, using = "//*[@href='http://bestsofia.org/']")
    private WebElement bestLink;
    @FindBy(how = How.XPATH, using = "//*[@href='https://www.estiem.org/']")
    private WebElement estiemLink;

    public StudentOrganisationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public StudentOrganisationPage() {

    }

    public void OpenStudentOrganisationPage() {
        studentOrganisationLink.click();
    }

    public void AssertStudentOrganisationPage() {
        Assert.assertEquals(studentOrganisationHeader.getText(), "Студентски организации");

    }

    public void OpenLinks(WebDriver driver, WebElement link) {
        Assert.assertTrue(link.isDisplayed());
        link.click();
        Helpers.Helpers.switchTab(driver);

    }

    public WebElement getAisecLink() {
        return aisecLink;
    }

    public void setAisecLink(WebElement aisecLink) {
        this.aisecLink = aisecLink;
    }

    public WebElement getBestLink() {
        return bestLink;
    }

    public void setBestLink(WebElement bestLink) {
        this.bestLink = bestLink;
    }

    public WebElement getEstiemLink() {
        return estiemLink;
    }

    public void setEstiemLink(WebElement estiemLink) {
        this.estiemLink = estiemLink;
    }
}
