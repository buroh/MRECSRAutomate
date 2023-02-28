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


public class SFCyberFlow3 extends BaseSetup {

	@Test
	public void validateHomePage() throws InterruptedException, IOException {
		inputTestData = com.mre.utils.XLUtils.getInputData(readConfig.getXlsxInputPath(), "CANInput", "Testcases",
				"SFCyberFlow3");
		ps = new PrintStream(new File("./src/main/java/com/mre/qa/testdata/SFCyberFlow3.txt"));

		driver.get(inputTestData.get(1));
		SFCyberHomePage shp = new SFCyberHomePage(driver);
		if (inputTestData.get(35).contains("English")) {

		} else {
			shp.frenchSwitchUpdate();
		}
		Thread.sleep(5000);
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
		scp.businessTierThreeelect();
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
		srp.exclusionsAndLimitationLink();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		TestUtils.sfiframe();
		srp.saveQuoteWithoutValidation();
		srp.customizeYouPlanLimitButtonClick();
		srp.defaultCoverageCheclk();
		srp.defaultDeductiblesCheck();
		srp.updateCoverageAndDeductibleDropdownValue();
		srp.buyButtonAfterCustomizeYourPlan();
		Thread.sleep(10000);
	}

	@Test(dependsOnMethods = { "validateRecommendedPlanPage" })
	public void validateEligibilityPage() throws InterruptedException {
		SFCyberEligibilityPage sep = new SFCyberEligibilityPage(driver);
		Thread.sleep(10000);
		sep.questionNoRadioButton();
		sep.eligibilityPageContinueButtonClick();

	}

	@Test(dependsOnMethods = { "validateEligibilityPage" })

	public void validateBusinessPage() throws InterruptedException {
		SFCyberEligibilityPage sep = new SFCyberEligibilityPage(driver);
		SFCyberBusinessPage sbp = new SFCyberBusinessPage(driver);
		Thread.sleep(10000);
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
	public void validateSummaryPage() throws InterruptedException, IOException {
		SFCyberSummaryPage ssp = new SFCyberSummaryPage(driver);
		SFCyberBusinessPage sbp = new SFCyberBusinessPage(driver);
		SFCyberRecommendedPlanPage srp = new SFCyberRecommendedPlanPage(driver);
		ssp.getSummaryDetails();
		ssp.getCoverageDetails();

		if (inputTestData.get(35).contains("English")) {
			TestUtils.comparefile("SFCyberFlow3.txt", "SFCyberFlow3Compare.txt");
		} else {
			TestUtils.comparefile("SFCyberFlow3.txt", "SFCyberFlow3CompareFrench.txt");

		}

	}

}
