package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.WebGeneric;

public class LoginPage {

	@FindBy(id="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(.,'Invalid')]")
	private WebElement errMessage;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public void setUserName(String uname) {
		un.sendKeys(uname);
	}
	
	public void setPassword(String password) {
		pwd.sendKeys(password);
	}
	
	public void clickLogin()
	{
		loginBTN.click();
	}
	
	public boolean isDisplayedErrMsg(WebDriverWait wait)
	{
		return WebGeneric.verifyElementDisplayed(wait, errMessage);
	}
	
}
