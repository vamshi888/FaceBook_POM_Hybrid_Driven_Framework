package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[text()='Vamshi Krishna']")
	WebElement userNameLabel;
	
	
	@FindBy(xpath="//span[contains(text(),'Reels')]")
	WebElement reelsLink;
	
	@FindBy(xpath="//span[normalize-space()='Rooms']") 
	WebElement roomsLink;
	
	@FindBy(xpath="//span[text()='Friends']")
	WebElement friendsLink;
	
	
	
	//Initializing the page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() { 
		return userNameLabel.isDisplayed();
	}
	
	public ReelsPage clickOnReelsLink() {
		reelsLink.click();
		return new ReelsPage();
	
	
	}
	public FindFriends clickOnFriendsLink() {
		friendsLink.click();
		return new FindFriends();
	}

}
