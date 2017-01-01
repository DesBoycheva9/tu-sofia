package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DormsRentPage extends PagePrototype
{
    @FindBy(how = How.ID, using = "113")
    private WebElement rentLink;
    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement rentPageHeader;


    public DormsRentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public DormsRentPage(){}

    public void OpenDormRentPage(){
        rentLink.click();
        Assert.assertEquals(rentPageHeader.getText(),"Наем");
    }
}
