package com.SDETSelenium.Ans6_13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.SDETSelenium.Pages.OrangeHRMAdminPage;
import com.SDETSelenium.Pages.OrangeHRMLoginPage;
import com.SDETSelenium.Pages.OrangeHRMPageTitle;
import com.SDETSelenium.Ans6_13.RetryAnalyzer;

/**
 * 
 * <p>6- Launch a browser in @Beforesuite annotation and open ur <br>
 *	7- Login to application again in @Test method, set priority 1 of the same method Afterlogging<br>
 *	8- Write Test method and page title for different menus- in order(Admin, PIM, Leave Dashboard, Directory and Maintenance)<br>
 *	9- Write a method (avoid using Test annotation) to minimize the window.<br>
 *	10-Read Dashboard heading using [driver.findelement(by.xpath()).gettext()]<br>
 *	11-Implement ITestListener for above scenario where full-page screenshot needs to be capture where ever test is pass or failed<br>
 *	12-Implement Retry analyzer – retry 3 times only for the above scenario.<br>
 *	</p>
 */
public class ReadDashboard extends TestBase
{
    public static WebDriver driver;
    OrangeHRMLoginPage orangeORLogin;
	OrangeHRMAdminPage orangeORAdmin;
	OrangeHRMPageTitle orangeORPageTitle;
	public static FileInputStream fileLoc;
	public static Properties prop;
  
	@BeforeSuite
	public void Initialize() throws IOException {
		prop = new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\SDETSelenium\\resources\\config.properties");
		prop.load(fis);
		driver = InitializeDriver();
		driver.get(prop.getProperty("Url"));
		orangeORLogin = new OrangeHRMLoginPage(driver);
    	orangeORPageTitle = new OrangeHRMPageTitle(driver);
    	orangeORAdmin = new OrangeHRMAdminPage(driver);
	}
	@Test(priority=1)
	public void LogInApp() throws InterruptedException {
		orangeORLogin.UserName().clear();
		orangeORLogin.UserName().sendKeys(prop.getProperty("username"));
		orangeORLogin.Password().clear();
		orangeORLogin.Password().sendKeys(prop.getProperty("passwd"));
		orangeORLogin.LoginButton().click();
		Thread.sleep(1000);
	}
	
	@Test(priority=3)
	public void VerifyPageTitle() throws Exception {
		//String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		orangeORPageTitle.linkAdmin.click();
		Assert.assertTrue(orangeORPageTitle.txtMenuHeader.getText().contains("System Users"), "Admin page title is not displayed");
		captureScreenshot(driver,orangeORPageTitle.linkAdmin,"Admin");
		orangeORPageTitle.linkPIM.click();
		Assert.assertTrue(orangeORPageTitle.txtMenuHeader.getText().contains("Employee Information"), "PIM page title is not displayed");
		captureScreenshot(driver,orangeORPageTitle.linkPIM,"PIM");
		orangeORPageTitle.linkLeave.click();
		Assert.assertTrue(orangeORPageTitle.txtMenuHeader.getText().contains("Leave List"), "Leave page title is not displayed");
		captureScreenshot(driver,orangeORPageTitle.linkLeave,"Leave");
		orangeORPageTitle.linkDashboard.click();
		Assert.assertTrue(orangeORPageTitle.txtMenuHeader.getText().contains("Dashboard"), "Dashboard page title is not displayed");
		captureScreenshot(driver,orangeORPageTitle.linkDashboard,"Dashboard");
		orangeORPageTitle.linkDirectory.click();
		Assert.assertTrue(orangeORPageTitle.txtMenuHeader.getText().contains("Search Directory"), "Directory page title is not displayed");
		captureScreenshot(driver,orangeORPageTitle.linkDirectory,"Directory");
		orangeORPageTitle.linkMaintenance.click();
		Assert.assertTrue(orangeORPageTitle.txtMenuHeader.getText().contains("Purge Employee Records"), "Maintenance page title is not displayed");
		captureScreenshot(driver,orangeORPageTitle.linkMaintenance,"Maintenance");
	}
	
	
    @Test(priority=2, retryAnalyzer=RetryAnalyzer.class)
    public void VerifyDashboard() throws Exception
	{	this.MinimizeWindow();//TestCase-9
    	Assert.assertTrue(orangeORPageTitle.txtMenuHeader.getText().equalsIgnoreCase("Dashboard"), "DashBoard not displayed");
    	driver.manage().window().maximize();
	}
	
	public void MinimizeWindow() throws InterruptedException 
	{
		//this.driver=driver;
		driver.manage().window().minimize();
		Thread.sleep(1000);
		Dimension d = new Dimension(300,1080);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
	}

	@AfterSuite
	public void Close() {
		driver.quit();
	}
}
