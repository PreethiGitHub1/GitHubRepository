package com.acttime.usertest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.acttime.genericlib.BaseClass;
import com.acttime.genericlib.FileDataUtiles;
import com.acttime.genericlib.WebdrivercommonUtils;
import com.acttime.objectrepositorylib.AddNewUser;
import com.acttime.objectrepositorylib.CreateNewcustomer;
import com.acttime.objectrepositorylib.Home;
import com.acttime.objectrepositorylib.ModifyUser;
import com.acttime.objectrepositorylib.Task;
import com.acttime.objectrepositorylib.User;

public class UserTest extends BaseClass{
	
	FileDataUtiles file = new FileDataUtiles();
    WebdrivercommonUtils wLib = new WebdrivercommonUtils();
	
	@Test
	public void createUserTest() throws Throwable {
		
		System.out.println("create USer");
		//read the data
		String firstName = file.getExcelData("Sheet1", 12, 2);
		String lastName = file.getExcelData("Sheet1", 12, 3);
		String email = file.getExcelData("Sheet1", 12, 4);
		String userName = file.getExcelData("Sheet1", 12, 5);
		String password = file.getExcelData("Sheet1", 12, 6);
		//String retypepassword = file.getExcelData("Sheet1", 11, );
		//step2 : navigate to User Page
		Home hp = PageFactory.initElements(driver,Home.class);
		
		hp.navigateToUSerPage();
		//step 3 : navigate to create AddUser Page
				User up= PageFactory.initElements(driver, User.class);
				up.naviagteToAddUserPage();
		//step 4 : create user
		AddNewUser au = PageFactory.initElements(driver, AddNewUser.class);
		au.addUser(firstName, lastName, email, userName, password, password);
	}
	
	@Test
	public void modifyUserTest() throws Throwable {
		System.out.println("modify User");
		String lastName = file.getExcelData("Sheet1", 12, 3);
		String email = file.getExcelData("Sheet1", 12, 4);
		//step2 : navigate to User Page
		Home hp = PageFactory.initElements(driver,Home.class);				
		hp.navigateToUSerPage();
		User up= PageFactory.initElements(driver, User.class);
		up.selectDisabledUserChkbox();
		Thread.sleep(2000);
		up.searchUser(lastName);
		
		AddNewUser au = PageFactory.initElements(driver, AddNewUser.class);
		au.modifyUser(email);
		
		
	}
	
	@Test
	public void searchUserTest() {
		System.out.println("search USer");
	}

}
