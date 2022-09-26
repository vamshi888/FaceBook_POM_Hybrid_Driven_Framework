package com.fb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;
import com.fb.qa.pages.ReelsPage;

public class ReelsPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ReelsPage reelsPage;
	
	public ReelsPageTest() {
		super();	
}
	@BeforeMethod
	public void setUp()  {
		initialization();
		 loginPage = new LoginPage();
		 reelsPage= new ReelsPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		reelsPage = homePage.clickOnReelsLink();

	}
	@Test(priority=1)
	public void verifyReelsPageLabel() {
		Assert.assertTrue(reelsPage.verifyReelsLabel(), "reels label is missing in page");
	}
	@Test(priority=2)
	public void selectReelsTest() {
		reelsPage.selectReelsByName("test2");
	}
	@Test(priority=3)
	public void verifyUserNameTest() {
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
