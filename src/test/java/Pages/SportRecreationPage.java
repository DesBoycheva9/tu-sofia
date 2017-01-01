package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SportRecreationPage extends PagePrototype {
    @FindBy(how = How.ID, using = "119")
    private WebElement sportRecreationLink;
    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement sportRecreationPageHeader;


    public SportRecreationPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public SportRecreationPage (){
    }

    public void OpenSportRecreationPage (){
        sportRecreationLink.click();
        Assert.assertEquals(sportRecreationPageHeader.getText(),"Почивни бази");
    }
}