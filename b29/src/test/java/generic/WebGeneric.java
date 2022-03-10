package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class WebGeneric {
	
	public static boolean verifyTitle(WebDriverWait wait,String expected) {
		try
		{
			wait.until(ExpectedConditions.titleContains(expected));
			Reporter.log("Title is matching",true);
			return true;
		}
		catch (Exception e) 
		{
			Reporter.log("Title is Not matching",true);
			return false;
		}
	}
	
	public static boolean verifyUrl(WebDriverWait wait,String expected) {
		try
		{
			wait.until(ExpectedConditions.urlContains(expected));
			Reporter.log("Url is matching",true);
			return true;
		}
		catch (Exception e) 
		{
			Reporter.log("Url is Not matching",true);
			return false;
		}
	}
	
	public static boolean verifyElementDisplayed(WebDriverWait wait,WebElement element) {
		
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is displayed",true);
			return true;
		}
		catch (Exception e) 
		{
			Reporter.log("Element is not displayed",true);
			return false;
		}
	}
}
