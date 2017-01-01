package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SportPage extends PagePrototype {
    @FindBy(how = How.XPATH, using = "//*[@id='navigation']/li[13]/span/a")
    private WebElement sportLink;
    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement sportPageHeader;


    public SportPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public SportPage(){
    }

    public void OpenSportPage(){
        sportLink.click();
        Assert.assertEquals(sportPageHeader.getText(),"Спорт и почивка");
    }
}

