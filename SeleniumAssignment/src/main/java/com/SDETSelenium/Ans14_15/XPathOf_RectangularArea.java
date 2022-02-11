package com.SDETSelenium.Ans14_15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class XPathOf_RectangularArea {
	
	WebDriver driver;
	public XPathOf_RectangularArea	(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='menu_admin_viewAdminModule']")
	public WebElement linkAdmin;
	
	@FindBy(xpath="//*[@id='MP_link']")
	public WebElement linkMarketPlace;
	
	@FindBy(xpath="//*[@id='welcome']")
	public WebElement linkWelcomeUser;

	@FindBy(xpath="//span[text()='Leave List']/ancestor::td/div")
	public WebElement tabLeaveList;
}