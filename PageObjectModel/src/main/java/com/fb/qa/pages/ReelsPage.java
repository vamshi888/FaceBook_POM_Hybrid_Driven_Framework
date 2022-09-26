package com.fb.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class ReelsPage extends TestBase {
	
	@FindBy(xpath = "//span[contains(text(),'Reels')]")
	WebElement reelsLabel; 
	
	public ReelsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyReelsLabel() {
		return reelsLabel.isDisplayed();
	}
	public void selectReelsByName(String name) {
		driver.findElement(By.xpath("//span[contains(text(),'Reels')]")).click();
	}
	

}
