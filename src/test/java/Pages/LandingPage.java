package Pages;

import Pages.PagePrototype;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends PagePrototype {

    @FindBy(how = How.XPATH, using = "//*[@href='/students']")
    WebElement studentsButton;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        setBaseURL("http://www.tu-sofia.bg");
        PageFactory.initElements(this.driver, this);
    }

    public LandingPage() {

    }

    public void OpenPage() {
        driver.get(this.getBaseURL());
    }

    public void AllElementsPresent() {
        Assert.assertTrue(studentsButton.isDisplayed());
    }


    public void OpenStudentsPage() {
        studentsButton.click();

    }

}

