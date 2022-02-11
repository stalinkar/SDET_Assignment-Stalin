package com.SDETSelenium.Ans6_13;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;


public class TestBase {

	public static WebDriver driver;
	public static FileInputStream fileLoc;
	public static Properties prop;
	public static String screenShotPath = System.getProperty("user.dir")+"\\ScreenShot\\";

	public WebDriver  InitializeDriver() throws IOException {
		TestBase bc = new TestBase();
		prop = new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\SDETSelenium\\resources\\config.properties");
		prop.load(fis);
		if (prop.getProperty("browser").contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\com\\SDETSelenium\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}else if(prop.getProperty("browser").contains("firefox")){
			driver=new FirefoxDriver();
			//will include code if needed.
		}else {
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}


	public static void captureScreenshot(WebDriver webdriver,String fileWithPath) throws Exception{

//		//Convert web driver object to TakeScreenshot
//
//		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//
//		//Call getScreenshotAs method to create image file
//
//		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//
//		//Move image file to new destination
//
//		File DestFile=new File(fileWithPath+".png");
//
//		//Copy file at destination
//
//		FileUtils.copyFile(SrcFile, DestFile);
		
		Shutterbug.shootPage(webdriver, ScrollStrategy.WHOLE_PAGE_CHROME).withName(fileWithPath).save(screenShotPath+"\\");
		
	}
	public static void captureScreenshot(WebDriver webdriver,WebElement webElm, String fileWithPath) {
		String callingFunction =Thread.currentThread().getStackTrace()[2].getMethodName();
		Shutterbug.shootPage(webdriver, ScrollStrategy.BOTH_DIRECTIONS,true).highlightWithText(webElm, fileWithPath).withName(fileWithPath).save(screenShotPath+callingFunction);
	}
}
