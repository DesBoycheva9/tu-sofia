package Pages;


import Helpers.Helpers;
import org.openqa.selenium.WebDriver;

public class PagePrototype extends Helpers {
    WebDriver driver;
    private String baseURL;

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public void Wait (int milliseconds) throws InterruptedException{
        Thread.sleep(milliseconds);


    }
}

