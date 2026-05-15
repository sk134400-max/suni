package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basepageexcel;

public class loginexcel extends Basepageexcel {
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id="login-button")
     WebElement loginbtn;
	
	public loginexcel() {
		PageFactory.initElements(driver, this);
		
	}
		public Inventorypage loginthepage(String user,String pass) {
			username.sendKeys(user);
			password.sendKeys(pass);
			loginbtn.click();
			return new Inventorypage();
		
		
	}
	
}
