package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class SignUpPage extends TestBase{
	 

		 @FindBy(linkText = "Create New Account")
		 WebElement signUp;

		 @FindBy(xpath = "//input[@placeholder='First name']")
		 WebElement firstname;

		 @FindBy(name = "lastname")
		 WebElement lastname;

		 @FindBy(name = "reg_email__")
		 WebElement reg_email__;

		 @FindBy(name = "reg_email_confirmation__")
		 WebElement reg_email_confirmation__;

		 @FindBy(id = "password_step_input")
		 WebElement reg_passwd__;

		 @FindBy(name = "birthday_day")
		 WebElement birthday_day;

		 @FindBy(name = "birthday_month")
		 WebElement birthday_month;

		 @FindBy(name = "birthday_year")
		 WebElement birthday_year;

		 @FindBy(name = "sex")
		 WebElement gender;

		 @FindBy(name = "websubmit")
		 WebElement signUpBtn;

		 public SignUpPage() {
		 PageFactory.initElements(driver, this);
		 signUp.click();
		 }

		 public String validateSignUpPageTitle() {
		 return driver.getTitle();
		 }

		 public LoginPage signUp(String fn, String ln, String em, String vk, String pwd, String bd, String bm, String by,
		 String m) {
		 firstname.sendKeys(fn);
		 lastname.sendKeys(ln);
		 reg_email__.sendKeys(em);
		 reg_email_confirmation__.sendKeys(vk);
		 reg_passwd__.sendKeys(pwd);
		 birthday_day.sendKeys(bd);
		 birthday_month.sendKeys(bm);
		 birthday_year.sendKeys(by);
		 gender.sendKeys(m);
		 signUpBtn.click();
		 return new LoginPage();
		 }
}