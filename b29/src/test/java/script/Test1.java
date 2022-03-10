package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginPage;
import page.TimeTrackPage;

public class Test1 extends BaseTest{
	@Test
	public void testA() {
		
		LoginPage l=new LoginPage(driver);
		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLogin();
		TimeTrackPage e=new TimeTrackPage(driver);
		boolean result = e.verifyHomePageIsDisplayed(wait,"Enter");
//		Assert.assertEquals(result, true);
		Assert.assertTrue(result);
	}

}
