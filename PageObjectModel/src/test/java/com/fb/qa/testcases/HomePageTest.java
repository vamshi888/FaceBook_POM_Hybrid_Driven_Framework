package com.fb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;
import com.fb.qa.pages.ReelsPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ReelsPage reelsPage;
	
	public HomePageTest() {
		super();	
}
	@BeforeMethod
	public void setUp()  {
		initialization();
		 loginPage = new LoginPage();
		 reelsPage= new ReelsPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}
	@Test(priority=1)
	public void verifyHomePageTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Facebook – log in or sign up");
	}
		//@Test(invocationCount=1, enabled=false)
		@Test(priority=2)
		public void verifyUserNameTest() {
			Assert.assertTrue(homePage.verifyCorrectUserName());
		}
		@Test(priority=3)
		public void verifyReelsLinkTest() {
			reelsPage = homePage.clickOnReelsLink();
			
		}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
