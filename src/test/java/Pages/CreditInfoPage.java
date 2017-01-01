package Pages;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.How;
    import org.openqa.selenium.support.PageFactory;

    public class CreditInfoPage extends PagePrototype {
        @FindBy(how = How.XPATH, using = "//*[@href='/university/110']")
        private WebElement creditInfoButton;

        @FindBy(how = How.XPATH, using = "//*[@href= 'javascript:;'][@name='tab-114']")
        private WebElement lawTab;

        @FindBy(how = How.ID, using = "slide_toggle_btn")
        private WebElement toggleButton;

        public CreditInfoPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(this.driver, this);
        }
        public CreditInfoPage(){

        }

        public void ClickCreditInfoButton(){
            getCreditInfoButton().click();
        }

        public void ClickToggleButton(){
            getToggleButton().click();
        }

        public void ClickLawTab(){
            lawTab.click();
        }
        public WebElement getLawTab() {
            return lawTab;
        }

        public void setLawTab(WebElement lawTab) {
            this.lawTab = lawTab;
        }

        public WebElement getToggleButton() {
            return toggleButton;
        }

        public void setToggleButton(WebElement toggleButton) {
            this.toggleButton = toggleButton;
        }

        public WebElement getCreditInfoButton() {
            return creditInfoButton;
        }

        public void setCreditInfoButton(WebElement creditInfoButton) {
            this.creditInfoButton = creditInfoButton;
        }
    }
