package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.WebdrivercommonUtils;

public class AddNewUser extends WebdrivercommonUtils{
	
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement userFirstNameEdt;
	
	@FindBy(id="userDataLightBox_lastNameField")
	private WebElement userLastNameEdt;
	
	@FindBy(id="userDataLightBox_emailField")
	private WebElement usereMailEdt;
	
	@FindBy(id="userDataLightBox_usernameField")
	private WebElement userNameEdt;
	
	@FindBy(id="userDataLightBox_passwordField")
	private WebElement userPasswordEdt;
	
	@FindBy(id="userDataLightBox_passwordCopyField")
	private WebElement userRePasswordEdt;
	
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement createUserBtn;
	
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement saveChangesBtn;
	
	public void addUser(String userFirstName, String userLastName, String useremailId, String userName, String userPassword, String userRePassword) {
		userFirstNameEdt.sendKeys(userFirstName);
		userLastNameEdt.sendKeys(userLastName);
		
		usereMailEdt.sendKeys(useremailId);
		userNameEdt.sendKeys(userName);
		userPasswordEdt.sendKeys(userPassword);
		userRePasswordEdt.sendKeys(userRePassword);
		waitForElemnetAndClick(createUserBtn);
		
			
	}
	
	public void modifyUser(String useremailId) {
		usereMailEdt.clear();
		usereMailEdt.sendKeys(useremailId);
		
		waitForElemnetAndClick(saveChangesBtn);
		
			
	}
}
