package com.mre.testcases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Set;

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


public class SFCyberFlow4OpenModelCheck extends BaseSetup {

	@Test
	public void validateHomePage() throws InterruptedException, IOException {
		inputTestData = com.mre.utils.XLUtils.getInputData(readConfig.getXlsxInputPath(), "CANInput", "Testcases",
				"SFCyberFlow4");
		ps = new PrintStream(new File("./src/main/java/com/mre/qa/testdata/SFCyberFlow4OpenModelCheck.txt"));

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
		SFCyberHomePage shp = new SFCyberHomePage(driver);
		TestUtils.sfiframe();
		Assert.assertEquals(false, SFCyberCoveragePage.confirmEmailAddressTextBox.isEnabled());
		scp.continueButtonClick();
		scp.errorValidation();
		scp.emailAddressTextBoxValidation();
		scp.confirmEmailAddressTextBoxValidation();
		Thread.sleep(10000);
		shp.login();
		Thread.sleep(8000);
		TestUtils.sfiframe();
		scp.continueButtonClick();
	}

	@Test(dependsOnMethods = { "validateCoveragePage" })
	public void validateRecommendedPlanPage() throws IOException, InterruptedException {
		SFCyberRecommendedPlanPage srp = new SFCyberRecommendedPlanPage(driver);
		Thread.sleep(10000);
		TestUtils.sfiframe();
		srp.getRiskDetails();
		srp.getRecommendedCoverageMonthlyDetails();
		srp.showYearlyLinkClick();
		srp.getRecommendednCoverageYearlyDetails();
		srp.exclusionsAndLimitationLink();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		TestUtils.sfiframe();
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
		sep.questionOneYesRadioButtonClick();
		sep.questionTwoDropdownIncidentTwo();
		sep.questionThreeDropdownAveragealueIncidentTwo();
		sep.questionFourDropdownSelect();
		sep.questionSixDropdownSelect();
		sep.questionFiveDropdownSelect();
		sep.questionSevenDropdownCheck();
		sep.questionSevenDropdownSelect();
		sep.questionEightDropdownCheck();
		sep.questionEightDropdownSelect();
		sep.questionNineDropdownCheck();
		sep.questionNineDropdownSelect();
		sep.questionYesRadioButton();
		sep.eligibilityPageContinueButtonClick();
		Thread.sleep(10000);
		sep.getBussinessDetailsText();
		Thread.sleep(10000);
	}

	@Test(dependsOnMethods = { "validateEligibilityPage" })

	public void validateBusinessPage() throws InterruptedException {
		SFCyberEligibilityPage sep = new SFCyberEligibilityPage(driver);
		SFCyberBusinessPage sbp = new SFCyberBusinessPage(driver);
		sep.getBussinessDetailsText();
		sbp.buinsessNameCheck();
		sbp.provinceCheck();
		sbp.businessPageContinueButtonClick();
		sbp.businessPageContinueButtonAfterProfileSectionClick();
		Thread.sleep(10000);
	}

	@Test(dependsOnMethods = { "validateBusinessPage" })

	public void validateSummaryPage() throws InterruptedException {
		SFCyberSummaryPage ssp = new SFCyberSummaryPage(driver);
		SFCyberBusinessPage sbp = new SFCyberBusinessPage(driver);

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
			TestUtils.comparefile("SFCyberFlow4OpenModelCheck.txt", "SFCyberFlow4OpenModelCheckCompare.txt");
		} else {
			TestUtils.comparefile("SFCyberFlow4OpenModelCheck.txt", "SFCyberFlow4OpenModelCheckCompareFrench.txt");

		}

	}

}
