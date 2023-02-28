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


public class SFCyberFlow3OpenModelCheck extends BaseSetup {

	@Test
	public void validateHomePage() throws InterruptedException, IOException {
		inputTestData = com.mre.utils.XLUtils.getInputData(readConfig.getXlsxInputPath(), "CANInput", "Testcases",
				"SFCyberFlow3");
		ps = new PrintStream(new File("./src/main/java/com/mre/qa/testdata/SFCyberFlow3OpenModelCheck.txt"));

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
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()) {
			subWindowHandler = iterator.next();
		}

		driver.switchTo().window(subWindowHandler);
		shp.saveQuotePopUpCloseButtonClick();
		driver.switchTo().window(parentWindowHandler);
		Thread.sleep(5000);
		com.mre.utils.TestUtils.sfiframe();
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
		// driver.navigate().refresh();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		TestUtils.sfiframe();
		sbp.updateApplicantDetails();
		sbp.businessPageContinueButtonClick();
		Thread.sleep(5000);
		sbp.businessPageContinueButtonAfterProfileSectionClick();
	}

	@Test(dependsOnMethods = { "validateBusinessPage" })

	public void validateSummaryPage() throws InterruptedException {
		SFCyberSummaryPage ssp = new SFCyberSummaryPage(driver);
		SFCyberBusinessPage sbp = new SFCyberBusinessPage(driver);
		SFCyberRecommendedPlanPage srp = new SFCyberRecommendedPlanPage(driver);
		Thread.sleep(10000);
		ssp.getSummaryDetails();
		ssp.getCoverageDetails();
		ssp.getriskText();
		ssp.coverageUpdateLinkClick();
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		TestUtils.sfiframe();
		srp.updateCoverageAfterSummary();
		srp.buyButtonAfterCustomizeYourPlan();
		sbp.updateApplicantDetails();
		sbp.businessPageContinueButtonAfterProfileSectionClick();
		Thread.sleep(10000);
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
			TestUtils.comparefile("SFCyberFlow3OpenModelCheck.txt", "SFCyberFlow3OpenModelCheckCompare.txt");
		} else {
			TestUtils.comparefile("SFCyberFlow3OpenModelCheck.txt", "SFCyberFlow3OpenModelCheckCompareFrench.txt");

		}
	}

}
