package com.page;

import org.openqa.selenium.By;

import com.base.BasePage;
import com.base.basepage2;

public class Checkout4  extends basepage2{
   	By checkoutbox = By.id("checkout");
	 By firstname   = By.id("first-name");
	 By lastname   = By.id("last-name");   
	 By zipcode    = By.id("postal-code");
	 By continuebox   = By.id("continue");
	 By finis          = By.id("finish");
	 By msg          = By.className("complete-header");
	 
	 
	 public void checkout() {
		 driver.findElement(checkoutbox).click();
	 }
	 public void  Checkout(String nm,String lnm , String code) {
		 driver.findElement(firstname).sendKeys(nm);
		 driver.findElement(lastname).sendKeys(lnm);
		 driver.findElement(zipcode).sendKeys(code);
		 driver.findElement(continuebox).click();
		 driver.findElement(finis).click();
		 
	 }
	 public String msgg() {
		 return driver.findElement(msg).getText();
	 }
	 
	 

	 
}
