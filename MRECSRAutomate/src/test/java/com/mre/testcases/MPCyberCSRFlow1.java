package com.mre.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.mre.base.BaseSetup;
import com.mre.pages.MPCyberCSRPage;
import com.mre.utils.TestUtils;

public class MPCyberCSRFlow1 extends BaseSetup {
	
	@Test
	public void memberPortalDetailsPrint() throws IOException, InterruptedException, AWTException {
		inputTestData = com.mre.utils.XLUtils.getInputData(readConfig.getXlsxInputPath(),"CANInput","Testcases","MPCyberCSRFlow2");
		ps = new PrintStream(new File("./src/main/java/com/mre/qa/testdata/MPCyberCSRFlow1.txt"));
		driver.get(inputTestData.get(26));
		Thread.sleep(5000);
		int i = 0;
		Robot zoom = new Robot();
		while (i < 5) {
			zoom.keyPress(KeyEvent.VK_CONTROL);
			zoom.keyPress(KeyEvent.VK_SUBTRACT);
			zoom.keyRelease(KeyEvent.VK_SUBTRACT);
			zoom.keyRelease(KeyEvent.VK_CONTROL); 
			i++;
		}
		
		MPCyberCSRPage mcp = new MPCyberCSRPage(driver);
		mcp.mp_login();
		//TestUtils.login();
		Thread.sleep(15000);
		TestUtils.mpiframe();
		Thread.sleep(2000);
		mcp.accountTabClick();
		Thread.sleep(6000);
		mcp.mp_printBusinessDetail(1);
		Thread.sleep(2000);
		mcp.mp_printPaymentDetail(1);
		
	}
	
	@Test
	public void validateAddTask() throws IOException, InterruptedException, AWTException {
		inputTestData = com.mre.utils.XLUtils.getInputData(readConfig.getXlsxInputPath(),"CANInput","Testcases","MPCyberCSRFlow2");
		ps = new PrintStream(new File("./src/main/java/com/mre/qa/testdata/MPCyberCSRFlow1.txt"));
		JavascriptExecutor newTab = (JavascriptExecutor) driver;
		newTab.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(inputTestData.get(1));
		Thread.sleep(4000);
		int i = 0;
		Robot zoom = new Robot();
		while (i < 6) {
			zoom.keyPress(KeyEvent.VK_CONTROL);
			zoom.keyPress(KeyEvent.VK_SUBTRACT);
			zoom.keyRelease(KeyEvent.VK_SUBTRACT);
			zoom.keyRelease(KeyEvent.VK_CONTROL); 
			i++;
		}
		Thread.sleep(3000);
		MPCyberCSRPage mcp = new MPCyberCSRPage(driver);
		mcp.login();
		Thread.sleep(15000);
		mcp.newButtonClick();
		Thread.sleep(5000);
		mcp.phoneCallButtonClick();
		driver.switchTo().frame("PegaGadget1Ifr");
		Thread.sleep(3000);
		mcp.emailAddressEnter();
		Thread.sleep(5000);
		mcp.searchButtonClick();
		Thread.sleep(6000);
		mcp.anyFieldNameClick();
		Thread.sleep(5000);
		mcp.submitButtonClick();
		Thread.sleep(5000);
		mcp.radioButtonsClick();
		Thread.sleep(12000);
		mcp.verifiedButtonClick();
		Thread.sleep(8000);
		
	}
	
	@Test(dependsOnMethods= {"validateAddTask"})
	public void clickBusinessInfoIntentTask() throws InterruptedException {
		
		MPCyberCSRPage mcp = new MPCyberCSRPage(driver);
		mcp.printBusinessDetail(1);
		Thread.sleep(4000);
		mcp.addTaskIconClick();
		Thread.sleep(3000);
		mcp.updateBusinessInfoButtonClick();
		Thread.sleep(3000);
		mcp.addTasksButtonClick();
		
	}
	
	@Test(dependsOnMethods= {"clickBusinessInfoIntentTask"})
	public void validateBusinessFieldAndPhoneNumber() throws InterruptedException {
		
		MPCyberCSRPage mcp = new MPCyberCSRPage(driver);
		Thread.sleep(10000);
		mcp.businessNameFieldUpdate();
		Thread.sleep(6000);
		mcp.businessWebsiteFieldUpdate();
		Thread.sleep(6000);
		mcp.addPhoneButtonClick();
		Thread.sleep(4000);
		mcp.removePhoneButtonClick();
		Thread.sleep(5000);
		mcp.addPhoneButtonClick();
		Thread.sleep(5000);
		mcp.secondaryNumberValidation();
		Thread.sleep(5000);
		mcp.thirdNumberValidation();
		Thread.sleep(5000);
		mcp.removePhoneButtonClick();
		Thread.sleep(5000);
		mcp.primaryNumberValidation();
		
	}
	
	@Test(dependsOnMethods= {"clickBusinessInfoIntentTask"})
	public void validateBusinessAddress() throws InterruptedException {
	
		MPCyberCSRPage mcp = new MPCyberCSRPage(driver);
		Thread.sleep(7000);
		mcp.cityValidation(1);
		Thread.sleep(2000);
		mcp.postalCodeValidation(1);
		Thread.sleep(2000);
		mcp.provinceValidation(1);
		Thread.sleep(2000);
		mcp.addressValidation(1);
		
	}
	
	@Test(dependsOnMethods= {"clickBusinessInfoIntentTask"})
	public void validateMailingAddress() throws InterruptedException {
		
		MPCyberCSRPage mcp = new MPCyberCSRPage(driver);
		Thread.sleep(8000);
		mcp.checkBoxClick();
		Thread.sleep(7000);
		mcp.cityValidation(2);
		Thread.sleep(2000);
		mcp.postalCodeValidation(2);
		Thread.sleep(2000);
		mcp.provinceValidation(2);
		Thread.sleep(2000);
		mcp.addressValidation(2);	
		
	}
	
	@Test(dependsOnMethods= {"validateBusinessFieldAndPhoneNumber"})
	public void updateBusinessTaskCompletion() throws InterruptedException {
		
		MPCyberCSRPage mcp = new MPCyberCSRPage(driver);
		Thread.sleep(5000);
		mcp.saveInfoButtonClick();
		Thread.sleep(5000);
		mcp.confirmButtonClick();
		Thread.sleep(8000);
		driver.navigate().refresh();
		driver.switchTo().frame("PegaGadget1Ifr");
		Thread.sleep(12000);
		mcp.printBusinessDetail(2);
		Thread.sleep(4000);
		
	}
	
	@Test(dependsOnMethods= {"validateAddTask"})
	public void clickUpdatePaymentIntentTask() throws InterruptedException {
		
		MPCyberCSRPage mcp = new MPCyberCSRPage(driver);
		mcp.printPaymentDetail(1);
		Thread.sleep(3000);
		mcp.addTaskIconClick();
		Thread.sleep(3000);
		mcp.updatePaymentButtonClick();
		Thread.sleep(3000);
		mcp.addTasksButtonClick();
		Thread.sleep(3000);
		mcp.paymentDrpdwnValuesCheck();
		Thread.sleep(3000);
		mcp.paymentDrpdwnSelect();
		Thread.sleep(3000);
		
	}
	
	@Test(dependsOnMethods= {"clickUpdatePaymentIntentTask"})
	public void updatePaymentTaskCompletion() throws InterruptedException {
		
		MPCyberCSRPage mcp = new MPCyberCSRPage(driver);
		mcp.paymentMethodConfirmButtonClick();
		Thread.sleep(8000);
		mcp.confirmButtonClick();
		Thread.sleep(8000);
		driver.navigate().refresh();
		driver.switchTo().frame("PegaGadget1Ifr");
		Thread.sleep(12000);
		mcp.printPaymentDetail(2);
		Thread.sleep(4000);
		
	}
	
	@Test(dependsOnMethods= {"updateBusinessTaskCompletion"})
	public void finalWrapUp() throws InterruptedException {
		
		MPCyberCSRPage mcp = new MPCyberCSRPage(driver);
		mcp.wrapupButtonClick();
		Thread.sleep(8000);
		mcp.lastSubmitButtonClick();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		TestUtils.mpiframe();
		mcp.mp_printBusinessDetail(2);
		Thread.sleep(2000);
		mcp.mp_printPaymentDetail(2);
		
	}
}
