package com.fb.qa.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;
import com.fb.qa.util.TestUtil;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	String sheetName = "Sheet1";
	Logger log = Logger.getLogger(LoginPageTest.class);
	
	public LoginPageTest() {
		super();
	
}
	
	@BeforeMethod
	public void setUp()  {
		initialization();
		 loginPage = new LoginPage();

}   @Test(priority=1)
	public void loginPageTitleTest() {
	String title = loginPage.validateLoginPageTitle();
	Assert.assertEquals(title, "Facebook – log in or sign up");
}

	@DataProvider
	public Object[][] getLoginTestData() {
	Object data[][] = TestUtil.getTestData(sheetName);
	return data;
}

	@Test(dataProvider = "getLoginTestData")
	public void multipleLoginTest(String userName, String password) throws InterruptedException {
	homePage = loginPage.loginMultipleAccounts(userName, password);
	Thread.sleep(3000);
	log.info("login successful with username: " + userName);
}
	@Test(priority=2)
	    public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
