package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.WebdrivercommonUtils;

public class Home {
	
	@FindBy(xpath="//div[text()='TASKS']/..")
	private WebElement taskImg;
	
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement userImg;
	
	public WebElement getTaskImg() {
		return taskImg;
	}

	public WebElement getUserImg() {
		return userImg;
	}

	//business libraries
	public void navigateToTaskPage() {
		WebdrivercommonUtils wlib = new WebdrivercommonUtils();
		wlib.waitForElemnetAndClick(taskImg);
	}
	
	public void navigateToUSerPage() {
		WebdrivercommonUtils wlib = new WebdrivercommonUtils();
		wlib.waitForElemnetAndClick(userImg);		
	}

}
