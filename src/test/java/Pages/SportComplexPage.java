package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SportComplexPage extends PagePrototype {
    @FindBy(how = How.ID, using = "118")
    private WebElement sportComplexLink;
    @FindBy(how = How.XPATH, using = "id('right_column')/h1")
    private WebElement sportComplexPageHeader;


    public SportComplexPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public SportComplexPage(){
    }

    public void OpenSportComplexPage(){
        sportComplexLink.click();
        Assert.assertEquals(sportComplexPageHeader.getText(),"Спортен комплекс");
    }
}