package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class InvalidLogin extends BaseTest
{

	@Test(priority = 2)
	public void testInvalidLogin() throws InterruptedException {
		
		int rc=Excel.getRowCount(XL_PATH, "InvalidLogin");
		for(int i=1;i<=rc;i++) {
//		Read data from excel
		String un=Excel.getData(XL_PATH, "InvalidLogin", i, "Username");
		String pw=Excel.getData(XL_PATH, "InvalidLogin", i, "Password");
		String failMsg=Excel.getData(XL_PATH, "InvalidLogin", i, "FailMsg");
		
//		•	Enter invalid user name (abcd)
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		
//		•	Enter invalid password (xyz)
		l.setPassword(pw);
		Thread.sleep(1000);
		
//		•	Click on login button
		l.clickLogin();
		
//		•	Verify that error msg is displayed
		boolean result = l.isDisplayedErrMsg(wait);
		Assert.assertTrue(result,failMsg);
		Thread.sleep(1000);
		}
	}
}

