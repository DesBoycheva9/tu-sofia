package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ExamsPage extends PagePrototype {

    @FindBy(how = How.XPATH, using = "//*[@href='/university/exams']")
    private WebElement exams;

    @FindBy (how = How.ID, using = "Faculty_id")
    private WebElement dropdown;

    @FindBy (how = How.CLASS_NAME, using = "searchBtnN")
    private WebElement filterButton;

    @FindBy(how = How.XPATH, using = "//*[@href= 'javascript:;'][@name='management']")
    private WebElement bachelor;

    @FindBy(how = How.XPATH, using = "//*[@href= 'javascript:;'][@name='courses']")
    private WebElement master;

    @FindBy(how = How.XPATH, using = "//*[@href= 'javascript:;'][@name='master']")
    private WebElement mastereq;

    @FindBy(how = How.XPATH, using = "//*[@href= 'javascript:;'][@name='master2']")
    private WebElement mastercompl;

    @FindBy (how = How.XPATH, using = "//*[@href='/examsfiles/ФКСУ-ИТИ--potok-10-kurs-1.html']")
    private WebElement bacSchedule;

    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement examPageHeader;

    public ExamsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public ExamsPage(){

    }
    public void AllElementsPresent() {
        Assert.assertTrue(exams.isDisplayed());
        Assert.assertTrue(filterButton.isDisplayed());
        Assert.assertEquals(examPageHeader.getText(), "Изпитни сесии");
    }

    public void OpenExams() {
        exams.click();
    }
    public void OpenExamSchedule (WebElement e) {
        e.click();
        driver.switchTo().defaultContent();
    }

    public void FilterFaculty() {
        filterButton.click();
    }


    public WebElement getDropdown() {
        return dropdown;
    }

    public void setDropdown(WebElement dropdown) {
        this.dropdown = dropdown;

    }

    public WebElement getBachelor() {
        return bachelor;
    }

    public void setBachelor(WebElement bachelor) {
        this.bachelor = bachelor;
    }

    public WebElement getMaster() {
        return master;
    }

    public void setMaster(WebElement master) {
        this.master = master;
    }

    public WebElement getMastereq() {
        return mastereq;
    }

    public void setMastereq(WebElement mastereq) {
        this.mastereq = mastereq;
    }

    public WebElement getMastercompl() {
        return mastercompl;
    }

    public void setMastercompl(WebElement mastercompl) {
        this.mastercompl = mastercompl;
    }

    public WebElement getBacSchedule() {
        return bacSchedule;
    }

    public void setBacSchedule(WebElement bacSchedule) {
        this.bacSchedule = bacSchedule;
    }
}
