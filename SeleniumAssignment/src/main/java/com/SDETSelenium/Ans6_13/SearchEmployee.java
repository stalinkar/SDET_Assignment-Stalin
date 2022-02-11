package com.SDETSelenium.Ans6_13;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SDETSelenium.Pages.OrangeHRMPIMPage;

/**
 * <p>Execute followingscenario <br>
	• Login to OrangeHRM<br>
	• Click on PIM<br>
	• Enter Employee Name-Linda Anderson in Search box<br>
	• Validate and capture screenshot</p>
 *
 */

public class SearchEmployee extends TestBase {

	public static WebDriver driver;

	@Test(priority = 4)
	public void SearchPIMEmployee() throws IOException {
		String strEmpName = "Linda Anderson";
		this.driver = TestBase.driver;
		OrangeHRMPIMPage orangeORPIMPage = new OrangeHRMPIMPage(driver);
		orangeORPIMPage.linkPIM.click();
		Assert.assertTrue(orangeORPIMPage.pageTitle.isDisplayed(), "PIM page title is not displayed");
		captureScreenshot(driver, orangeORPIMPage.linkPIM, "BeforeSearch");
		orangeORPIMPage.txtEmployeeName.clear();
		orangeORPIMPage.txtEmployeeName.sendKeys(strEmpName);
		orangeORPIMPage.btnSearch.click();
		captureScreenshot(driver, orangeORPIMPage.linkPIM, "AfterSearch");
		ArrayList<String> strTableData = new ArrayList();
		for (WebElement tblData : orangeORPIMPage.tblRowData) {
			strTableData.add(tblData.getText());
		}
		Assert.assertTrue(strTableData.get(2).contains(strEmpName.split("\\s+")[0]),
				"The Searched Employee FirstName is not correct");
		Assert.assertTrue(strTableData.get(3).contains(strEmpName.split("\\s+")[1]),
				"The Searched Employee LastName is not correct");
	}

}
