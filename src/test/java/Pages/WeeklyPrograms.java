package Pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WeeklyPrograms extends PagePrototype {
    @FindBy(how=How.ID,using = "189")
    private WebElement weeklyPrograms;

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

    @FindBy (how = How.XPATH, using = "//*[@href='/weeklyprogram/2016-2017-zimen/bakalavar/ФКСУ-potok-10-kurs-1.pdf']")
    private WebElement bacSchedule;

    @FindBy (how = How.XPATH, using = "//*[@href='/weeklyprogram/2016-2017-zimen/magistar/ФКСУ-potok-213-kurs-1.pdf']")
    private WebElement masterSchedule;

    @FindBy (how = How.XPATH, using = "//*[@href='/weeklyprogram/2016-2017-zimen/m-podgotvitelen/ФКСУ-potok---kurs-магистри-изравнително обучение.pdf']")
    private WebElement mastereqSchedule;

    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement weeklyProgramsPageHeader;


    public WeeklyPrograms(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public WeeklyPrograms(){

    }

    public void OpenWeeklyProgramsPage() {
        driver.switchTo().defaultContent();
        weeklyPrograms.click();

    }

    public void AllElementsPresent() {
        Assert.assertTrue(weeklyPrograms.isDisplayed());
        Assert.assertTrue(filterButton.isDisplayed());
        Assert.assertTrue(getBachelor().isDisplayed());
        Assert.assertTrue(getMaster().isDisplayed());
        Assert.assertTrue(getMastercompl().isDisplayed());
        Assert.assertTrue(getMastereq().isDisplayed());
        Assert.assertEquals(weeklyProgramsPageHeader.getText(), "Седмични разписи");
    }

    public void ClickFilterButton(){
        filterButton.click();
    }


    public void ClickWeeklyProgram (WebElement e)throws Exception {
        e.click();
       driver.navigate().back();
    }

    public WebElement getDropdown() {
        return dropdown;
    }

    public void setDropdown(WebElement dropdown) {
        this.dropdown = dropdown;
        filterButton.click();
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

    public WebElement getMasterSchedule() {
        return masterSchedule;
    }

    public void setMasterSchedule(WebElement masterSchedule) {
        this.masterSchedule = masterSchedule;
    }

    public WebElement getMastereqSchedule() {
        return mastereqSchedule;
    }

    public void setMastereqSchedule(WebElement mastereqSchedule) {
        this.mastereqSchedule = mastereqSchedule;
    }
}
