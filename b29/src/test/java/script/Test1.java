package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;

public class Test1 extends BaseTest{
	@Test
	public void testA() {
		String u=getValue("URL");
		Reporter.log(u,true);
		
		String title=driver.getTitle();
		Reporter.log(title,true);
		
		String v=Excel.getData("./data/book1.xlsx","sheet1", 0, 0);
		Reporter.log(v,true);
		
		String v2=Excel.getData("./data/book1.xlsx","sheet2", 1, "UserName");
		Reporter.log(v2,true);
	}

}
