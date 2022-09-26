package com.fb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.FindFriends;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;
import com.fb.qa.util.TestUtil;

public class FindFriendsTest extends TestBase{

    LoginPage loginPage;
    HomePage homePage;
    FindFriends findFriends;
   // TestUtil testUtil;
 

    public FindFriendsTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
    	initialization();
        
        //testUtil = new TestUtil();
        loginPage = new LoginPage();        
        System.out.println("Logging in");        
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  
        findFriends = new FindFriends();
        findFriends.clickOnFindFriends();
    }

    @Test(priority = 1)
    public void verifyFindFriendsTitleTest() {
        String findFriendsTitle = findFriends.verifyFindFriendsTitle();
        Assert.assertEquals(findFriendsTitle, "Facebook", "Home Page is Incorrect");
    }

    @Test(priority = 2)
    public void verifyFriendRequestLink(){
        findFriends.clickonFindFriend();
    }

    @Test(priority = 3)
    public void verifySuggestionsLink(){
        findFriends.clickonSuggestions();
    }

    @Test(priority = 4)
    public void verifyBirthdaysLink() {
        findFriends.clickonBithdays();
    }

    @Test(priority = 5)
    public void verifyCustomsLink()  {
        findFriends.clickonCustomLists();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
        log.info("Closing Browser....");
    }
}
