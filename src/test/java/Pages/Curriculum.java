package Pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

public class Curriculum extends PagePrototype {
    @FindBy(how = How.XPATH, using = "//*[@href='/uplan/uplan']")
    private WebElement activeSchedule;

    @FindBy (how = How.ID, using = "Faculty_id")
    private WebElement dropdown;

    @FindBy(how = How.CLASS_NAME, using = "searchBtnN")
    private WebElement filterButton;

    @FindBy(how = How.XPATH, using = "//*[@href= 'javascript:;'][@name='courses']")
    private WebElement master;

    @FindBy(how = How.XPATH, using = "//*[@href= 'javascript:;'][@name='master']")
    private WebElement mastereq;

    @FindBy(how = How.XPATH, using = "//*[@href= 'javascript:;'][@name='master2']")
    private WebElement mastercompl;

    @FindBy(how = How.XPATH, using = "//*[@href= 'javascript:;'][@name='master3']")
    private WebElement mastereqbach;

    @FindBy(how = How.XPATH, using = "//*[@href= 'javascript:;'][@name='master4']")
    private WebElement masterprofbach;

    @FindBy(how = How.XPATH, using = "//*[@href= 'javascript:;'][@name='master6']")
    private WebElement profbach;

    @FindBy(how = How.XPATH, using = "//*[@href= 'javascript:;'][@name='master7']")
    private WebElement teacher;

    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement cirriculumPageHeader;



    public Curriculum(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public Curriculum() {

    }

    public void OpenActiveSchedule() {
        driver.switchTo().defaultContent();
        activeSchedule.click();

    }

    public void AssertElementsArePresent(){
        Assert.assertTrue(filterButton.isDisplayed());
        Assert.assertTrue(getMaster().isDisplayed());
        Assert.assertTrue(getMastercompl().isDisplayed());
        Assert.assertTrue(getMastereq().isDisplayed());
        Assert.assertTrue(getMastereqbach().isDisplayed());
        Assert.assertTrue(getProfbach().isDisplayed());
        Assert.assertTrue(getTeacher().isDisplayed());
        Assert.assertEquals(cirriculumPageHeader.getText(),"Учебни планове");
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

    public WebElement getMastereqbach() {
        return mastereqbach;
    }

    public void setMastereqbach(WebElement mastereqbach) {
        this.mastereqbach = mastereqbach;
    }

    public WebElement getMasterprofbach() {
        return masterprofbach;
    }

    public void setMasterprofbach(WebElement masterprofbach) {
        this.masterprofbach = masterprofbach;
    }

    public WebElement getProfbach() {
        return profbach;
    }

    public void setProfbach(WebElement profbach) {
        this.profbach = profbach;
    }

    public WebElement getTeacher() {
        return teacher;
    }

    public void setTeacher(WebElement teacher) {
        this.teacher = teacher;
    }
}
