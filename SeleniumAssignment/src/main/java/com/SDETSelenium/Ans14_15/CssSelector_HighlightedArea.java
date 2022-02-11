package com.SDETSelenium.Ans14_15;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CssSelector_HighlightedArea {
	
	WebDriver driver;
	public CssSelector_HighlightedArea(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#menu_pim_viewPimModule")
	public WebElement linkPIM;
	
	@FindBy(css="#menu_time_viewTimeModule")
	public WebElement linkTime;
	
	@FindBy(css="#menu_maintenance_purgeEmployee")
	public WebElement linkMaintenance;
	
	@FindBy(css="#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(1) > div")
	public WebElement tabAssignLeave;
	
	@FindBy(css="#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(3) > div")
	public WebElement tabTimeSheet;

}