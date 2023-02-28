package com.mre.testcases;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mre.base.BaseSetup;
import com.mre.pages.SFCyberBusinessPage;
import com.mre.pages.SFCyberCoveragePage;
import com.mre.pages.SFCyberEligibilityPage;
import com.mre.pages.SFCyberEsignAndPaymentPage;
import com.mre.pages.SFCyberHomePage;
import com.mre.pages.SFCyberRecommendedPlanPage;
import com.mre.pages.SFCyberSummaryPage;
import com.mre.utils.TestUtils;


public class SFCyberFlow1 extends BaseSetup {

		public static PrintStream SFCyberFlow1 ;
	
		@Test
		public void validateHomePage() throws InterruptedException, IOException {
			inputTestData = com.mre.utils.XLUtils.getInputData(readConfig.getXlsxInputPath() , "CANInput","Testcases" , "SFCyberFlow1");
			ps =  new PrintStream(new File("./src/main/java/com/mre/qa/testdata/SFCyberFlow1.txt"));
			driver.get(inputTestData.get(1));
			SFCyberHomePage shp = new SFCyberHomePage(driver);
			if(inputTestData.get(35).contains("English")) {
				
			}
			else {
				shp.frenchSwitchUpdate();
			
			}
			Thread.sleep(5000);
			shp.getProtectedButtonClick();	

		}
		
		@Test(dependsOnMethods={"validateHomePage"})
		public void validateCoveragePage() throws InterruptedException {
			SFCyberCoveragePage scp = new SFCyberCoveragePage(driver);
			TestUtils.sfiframe();
			Assert.assertEquals(false, SFCyberCoveragePage.confirmEmailAddressTextBox.isEnabled());
			scp.continueButtonClick();
			scp.errorValidation();
			scp.emailAddressTextBoxValidation();
			scp.confirmEmailAddressTextBoxValidation();
			scp.businessWebsiteTextBoxValidation();
			scp.businessNameTextBox();
			scp.provinceDropdown();
			scp.businessClassAndTypeDropdownOptionOneCheck();
			Thread.sleep(2000);
			scp.businessTierOneSelect();
			scp.annualGrossRevenueAndNoOfEmployeesTextBoxValidation();
			scp.continueButtonClick();
			driver.switchTo().defaultContent();
			Thread.sleep(10000);
		}
	@Test(dependsOnMethods={"validateCoveragePage"})
	public void validateRecommendedPlanPage() throws IOException, InterruptedException {
			SFCyberRecommendedPlanPage srp = new SFCyberRecommendedPlanPage(driver);
			//TestUtils.sfiframe();
			TestUtils tu = new TestUtils(driver);
			tu.sfiframe();
			srp.getRiskDetails();
			srp.getRecommendedCoverageMonthlyDetails();
			srp.showYearlyLinkClick();
			if(inputTestData.get(35).contains("English")){
			TestUtils.comparefile("SFCyberFlow1.txt" ,"SFCyberFlow1Compare.txt");
			}
			else {
				TestUtils.comparefile("SFCyberFlow1.txt" ,"SFCyberFlow1CompareFrench.txt");

			}
	}
}
