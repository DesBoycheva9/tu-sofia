package Pages;

import Helpers.Helpers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InternshipPage extends PagePrototype {
    @FindBy(how = How.ID, using = "192")
    private WebElement internshipLink;
    @FindBy(how = How.XPATH,using = "//*[@href='http://career.tu-sofia.bg/internships.php']")
    private WebElement tuSofiaLink;
    @FindBy(how = How.XPATH,using = "//*[@href='http://oldweb.tu-sofia.bg/Erasmus/dir/zaminavashtiSTPRhtml.html']")
    private WebElement erasumLink;
    @FindBy (how = How.XPATH, using = "id('right_column')/h1")
    private WebElement inteshipPageHeader;


    public InternshipPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public InternshipPage() {
     getInternshipLink().click();
     }

    public void OpenInternshipPage(){
        getInternshipLink().click();

    }

    public void OpenTuSofiaLink(){
        tuSofiaLink.click();
        Helpers.switchTab(driver);
        }


    public void OpenErasumLink() {
        erasumLink.click();
        Helpers.switchTab(driver);
    }

    public WebElement getTuSofiaLink() {
        return tuSofiaLink;
    }

    public void setTuSofiaLink(WebElement tuSofiaLink) {
        this.tuSofiaLink = tuSofiaLink;
    }

    public WebElement getInternshipLink() {
        return internshipLink;
    }

    public void setInternshipLink(WebElement internshipLink) {
        this.internshipLink = internshipLink;
    }

    public WebElement getErasumLink() {
        return erasumLink;
    }

    public void setErasumLink(WebElement erasumLink) {
        this.erasumLink = erasumLink;
    }
}