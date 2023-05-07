package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class MaviPages {
    public MaviPages(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement login;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement email;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//*[@id ='dropdown-basic-button']")
    public WebElement verify;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement login2;
    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement forlogout;
    @FindBy(xpath = "//*[@role='button']")
    public WebElement logout;
    @FindBy(xpath = "//*[@class='ajs-button ajs-ok']")
    public WebElement ok;
    @FindBy(xpath = "//*[@name='car']")
    public WebElement aracSecimi;
}
