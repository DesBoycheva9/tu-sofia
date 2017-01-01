package Pages;

import Helpers.Helpers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AcademicCalendar extends PagePrototype {
    @FindBy(how = How.XPATH, using = "//*[@href='/university/calendar']")
    private WebElement academicCalendar;

    @FindBy(how = How.NAME, using = "management")
    private WebElement bachelor;

    @FindBy(how = How.NAME, using = "courses")
    private WebElement master;

    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement academicPageHeader;

    @FindBy(how = How.XPATH, using = "//a[@href='/kcfinder/upload/files/grafik-bak-2016-2017.pdf']")
    private WebElement printer;

    public AcademicCalendar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public AcademicCalendar(){

    }

    public void AllElementsPresent() {
        Assert.assertTrue(bachelor.isDisplayed());
        Assert.assertTrue(master.isDisplayed());
        Assert.assertEquals(academicPageHeader.getText(),"Академичен Календар");
    }



    public void OpenMasterTab() {
        master.click();

    }
    public void OpenAcademicCalendar() {
        academicCalendar.click();
    }

    public void OpenBacherlorPDF(){
     //scroll down
        bachelor.click();
        Helpers.scrollToElement(printer,driver);
        printer.click();
        driver.navigate().back();
        Helpers.scrollToElement(bachelor,driver);

    }

}
