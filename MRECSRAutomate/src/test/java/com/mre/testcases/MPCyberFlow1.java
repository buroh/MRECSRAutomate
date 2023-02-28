package com.mre.testcases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mre.base.BaseSetup;
import com.mre.pages.MPCyberDashboardPage;
import com.mre.pages.MPCyberProductsPage;
import com.mre.pages.SFCyberBusinessPage;
import com.mre.pages.SFCyberCoveragePage;
import com.mre.pages.SFCyberEligibilityPage;
import com.mre.pages.SFCyberEsignAndPaymentPage;
import com.mre.pages.SFCyberHomePage;
import com.mre.pages.SFCyberRecommendedPlanPage;
import com.mre.pages.SFCyberSummaryPage;
import com.mre.utils.TestUtils;


public class MPCyberFlow1 extends BaseSetup {

	@Test
	public void validateHomePage() throws InterruptedException, IOException {

		inputTestData = com.mre.utils.XLUtils.getInputData(readConfig.getXlsxInputPath(), "CANInput", "Testcases",
				"MPCyberFlow1");
		driver.get(inputTestData.get(1));
		ps = new PrintStream(new File("./src/main/java/com/mre/qa/testdata/MPCyberFlow1.txt"));
		SFCyberHomePage shp = new SFCyberHomePage(driver);
		shp.login();
		Thread.sleep(10000);
		TestUtils.mpiframe();
		MPCyberDashboardPage mdp = new MPCyberDashboardPage(driver);
		mdp.getProductOneDetailsText();
		mdp.getFirstRecentActivityText();
		// mdp.viewYourNewCoverageLinkClick();
		Thread.sleep(10000);
		mdp.getSecondRecentActivityText();
		Thread.sleep(5000);
		mdp.getThirdRecentActivityText();
		mdp.getHelpCenter();
		mdp.productOneGearIconClick();
		mdp.cancelMyPolicyButtonClick();
		mdp.iChangedMyMindButtonClick();
		mdp.productOneGearIconClick();
		mdp.cancelMyPolicyButtonClick();
		Thread.sleep(4000);
		mdp.cancelPolicy();
		Thread.sleep(4000);
		mdp.getFirstRecentActivityText();
		MPCyberProductsPage mpp = new MPCyberProductsPage(driver);
		mpp.productsTab();
		mpp.terminationTabClick();
		mpp.getTerminatedProductDetailsText();
		mdp.signOutLinkClick();

	}

}
