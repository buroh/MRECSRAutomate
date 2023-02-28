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


public class SFCyberFlow5 extends BaseSetup {

	@Test
	public void validateHomePage() throws InterruptedException, IOException {
		inputTestData = com.mre.utils.XLUtils.getInputData(readConfig.getXlsxInputPath(), "CANInput", "Testcases",
				"SFCyberFlow5");
		ps = new PrintStream(new File("./src/main/java/com/mre/qa/testdata/SFCyberFlow5.txt"));
		driver.get(inputTestData.get(1));
		SFCyberHomePage shp = new SFCyberHomePage(driver);
		if (inputTestData.get(35).contains("English")) {

		} else {
			shp.frenchSwitchUpdate();
		}
		Thread.sleep(10000);
		shp.getProtectedButtonClick();

	}

	@Test(dependsOnMethods = { "validateHomePage" })
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
		scp.businessTierFiveSelect();
		scp.annualGrossRevenueAndNoOfEmployeesTextBoxValidation();
		scp.continueButtonClick();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
	}

	@Test(dependsOnMethods = { "validateCoveragePage" })
	public void validateRecommendedPlanPage() throws IOException, InterruptedException {
		SFCyberRecommendedPlanPage srp = new SFCyberRecommendedPlanPage(driver);
		TestUtils.sfiframe();
		srp.getRiskDetails();
		srp.getRecommendedCoverageMonthlyDetails();
		srp.showYearlyLinkClick();
		srp.getRecommendednCoverageYearlyDetails();
		srp.buyButtonClick();
		Thread.sleep(10000);
	}

	@Test(dependsOnMethods = { "validateRecommendedPlanPage" })
	public void validateBusinessPage() throws InterruptedException {
		SFCyberEligibilityPage sep = new SFCyberEligibilityPage(driver);
		SFCyberBusinessPage sbp = new SFCyberBusinessPage(driver);
		sep.getBussinessDetailsText();
		sbp.buinsessNameCheck();
		sbp.provinceCheck();
		sbp.businessPageContinueButtonClick();
		sbp.errorValidation();
		sbp.applicantValidationCheck();
		sbp.invalidErrorValidation();
		sbp.enterApplicantDetails();
		sbp.enterbusinessAddressStreetAddress();
		sbp.mailingAddressDifferentCheckBox();
		sbp.enterMailingAddressStreetAddressTextBox();
		sbp.businessPageContinueButtonClick();
		Thread.sleep(5000);
		sbp.emailAddressCheck();
		sbp.passwordValidation();
		sbp.languagePreferenceEnglishRadioButtonClick();
		sbp.businessPageContinueButtonAfterProfileSectionClick();
		Thread.sleep(10000);
	}

	@Test(dependsOnMethods = { "validateBusinessPage" })

	public void validateSummaryPage() throws InterruptedException {
		SFCyberSummaryPage ssp = new SFCyberSummaryPage(driver);
		SFCyberBusinessPage sbp = new SFCyberBusinessPage(driver);
		SFCyberRecommendedPlanPage srp = new SFCyberRecommendedPlanPage(driver);
		ssp.getSummaryDetails();
		ssp.getCoverageDetails();
		ssp.getriskText();
		ssp.checkoutButtonClick();
		Thread.sleep(4000);
		// ssp.exclusionsCheckBoxClick();
		// ssp.exclusionConfirmCheckBoxClick();

	}

	@Test(dependsOnMethods = { "validateSummaryPage" })
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
		if (inputTestData.get(35).contains("English")) {
			ssp.getCoverageDetails();
		} else {
			ssp.getCoverageDetailsConfirmationPageFrench();
		}
		if (inputTestData.get(35).contains("English")) {
			TestUtils.comparefile("SFCyberFlow5.txt", "SFCyberFlow5Compare.txt");
		} else {
			TestUtils.comparefile("SFCyberFlow5.txt", "SFCyberFlow5CompareFrench.txt");

		}
	}

}
