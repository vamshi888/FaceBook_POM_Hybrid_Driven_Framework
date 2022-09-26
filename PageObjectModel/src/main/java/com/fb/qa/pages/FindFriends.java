package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class FindFriends extends TestBase {
	 
	  @FindBy(xpath = "//span[contains(text(),'Friends')]")
	    WebElement findFriends;

	    @FindBy(xpath = "//span[contains(text(),'Friend requests')]")
	    WebElement friendRequests;

	    @FindBy(xpath = "//span[contains(text(),'Suggestions')]")
	    WebElement suggestions;

	    @FindBy(xpath = "//span[contains(text(),'Birthdays')]")
	    WebElement birthdays;

	    @FindBy(xpath = "//span[contains(text(),'Custom lists')]")
	    WebElement customLists;

	    public FindFriends() {
	        PageFactory.initElements(driver, this);
	    }

	    public void clickOnFindFriends() {
	        findFriends.click();
	    }

	    public String verifyFindFriendsTitle() {
	        return driver.getTitle();
	    }

	    public void clickonFindFriend(){
	        friendRequests.click();
	    }

	    public void clickonSuggestions() {
	        suggestions.click();
	    }

	    public void clickonBithdays() {
	        birthdays.click();
	    }

	    public void clickonCustomLists() {
	        customLists.click();
	    }

	}
