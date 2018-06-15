package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.WebdrivercommonUtils;

public class User extends WebdrivercommonUtils{
	
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement addUserBtn;
	
	@FindBy(id="showDisabledUsersChBox")
	private WebElement showDisabledUserChk;
	
	@FindBy(xpath="//input[@placeholder='Start typing name']")
	private WebElement startTypeNameEdt;
	
	@FindBy(xpath="//span[@class='userNameSpan']")
	private WebElement userNameLnk;
	
	
	
	public void naviagteToAddUserPage() {
		addUserBtn.click();
	}
	
	public void selectDisabledUserChkbox() {
		showDisabledUserChk.click();;
	}
	
	public void searchUser(String userName) throws Throwable  {
		startTypeNameEdt.sendKeys(userName);
		Thread.sleep(3000);
		userNameLnk.click();
	}
	
	//modifyUser
	
}
