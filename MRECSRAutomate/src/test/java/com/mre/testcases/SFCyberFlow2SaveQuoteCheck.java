package com.mre.testcases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

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


public class SFCyberFlow2SaveQuoteCheck extends BaseSetup {

	@Test
	public void validateSaveQuotePage() throws IOException, InterruptedException {
		SFCyberHomePage shp = new SFCyberHomePage(driver);
		inputTestData = com.mre.utils.XLUtils.getInputData(readConfig.getXlsxInputPath() , "CANInput","Testcases" , "SFCyberFlow2");
		ps =  new PrintStream(new File("./src/main/java/com/mre/qa/testdata/SFCyberFlow2SaveQuoteCheck.txt"));
		shp.savequotelaunchingPage();
		shp.login();
		Thread.sleep(10000);
		TestUtils.sfiframe();
		}
	@Test(dependsOnMethods={"validateSaveQuotePage"})

		public void validateSummaryPage() throws InterruptedException {
			SFCyberSummaryPage ssp = new SFCyberSummaryPage(driver);
			SFCyberBusinessPage sbp = new SFCyberBusinessPage(driver);
			SFCyberEligibilityPage sep = new SFCyberEligibilityPage(driver);
			SFCyberRecommendedPlanPage srp = new SFCyberRecommendedPlanPage(driver);
			ssp.getSummaryDetails();
			ssp.getCoverageDetails();
			ssp.getriskText();
			ssp.coverageUpdateLinkClick();
			Thread.sleep(20000);
			driver.switchTo().defaultContent();
			TestUtils.sfiframe();
			srp.updateCoverageAfterSummary();
			srp.buyButtonAfterCustomizeYourPlan();
			Thread.sleep(10000);
			sep.questionNoRadioButton();
			sep.eligibilityPageContinueButtonClick();
			sbp.updateApplicantDetails();
			sbp.businessPageContinueButtonAfterProfileSectionClick();
			Thread.sleep(10000);
			ssp.getCoverageDetails();
			ssp.checkoutButtonClick();
			Thread.sleep(4000);
			//ssp.exclusionsCheckBoxClick();
			//ssp.exclusionConfirmCheckBoxClick();
			
		}
		
		@Test(dependsOnMethods={"validateSummaryPage"})
		public void validateEsignPaymentAndConfirmationPage() throws InterruptedException, IOException {
			SFCyberEsignAndPaymentPage sepp = new SFCyberEsignAndPaymentPage(driver);
			sepp.esign();
			Thread.sleep(10000);
			driver.switchTo().frame("globalPay_frame");
			Thread.sleep(5000);
			sepp.cardnumber();
			sepp.expiry();
			sepp.cardholdername();
			sepp.securitycod();
			sepp.activatecoverage();
			driver.switchTo().defaultContent();
			SFCyberSummaryPage ssp = new SFCyberSummaryPage(driver);
			Thread.sleep(10000);
			TestUtils.sfiframe();
			if(inputTestData.get(35).contains("English"))
			{
			ssp.getCoverageDetails();
			}
			else
			{
				ssp.getCoverageDetailsConfirmationPageFrench();
			}			
			if(inputTestData.get(35).contains("English")){
				TestUtils.comparefile("SFCyberFlow2SaveQuoteCheck.txt" ,"SFCyberFlow2SaveQuoteCheckCompare.txt");
				}
				else {
					TestUtils.comparefile("SFCyberFlow2SaveQuoteCheck.txt" ,"SFCyberFlow2SaveQuoteCheckCompareFrench.txt");

				}
		
		}
			
		}
