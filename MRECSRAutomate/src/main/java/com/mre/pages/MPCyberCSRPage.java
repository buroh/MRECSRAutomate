package com.mre.pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.mre.base.BaseSetup;


public class MPCyberCSRPage extends BaseSetup {
	public MPCyberCSRPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	boolean invoked = false, alert= false;
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
	@FindBy(xpath = "//div[text()='Business address']")
	public WebElement businessAddressLabel;
	@FindBy(id = "PegaRULESErrorFlag")
	List<WebElement> errorText = new ArrayList<WebElement>();
	
	String chars = "abcdefghijklmnopqrstuvwxyz";
	Random random = new Random();
	StringBuilder sb = new StringBuilder();
	
	//MP LOGIN
	@FindBy(id = "username") public WebElement mp_userName;
	@FindBy(id = "password") public WebElement mp_pwd;
	@FindBy(xpath = "//button[@class='btn btn-primary' and @type='submit'] ")
	public WebElement mp_loginButton;
	
	public void mp_login() {
		int i = 0;
		while(i < 3) {
			try {
				wait.until(ExpectedConditions.visibilityOf(mp_userName));
				wait.until(ExpectedConditions.visibilityOf(mp_pwd));
				wait.until(ExpectedConditions.visibilityOf(mp_loginButton));
				mp_userName.sendKeys(inputTestData.get(4));
				Thread.sleep(2000);
				mp_pwd.sendKeys(inputTestData.get(27));
				Thread.sleep(4000);
				mp_loginButton.click();
				break;
			}
			catch(Exception e) {
				i++;
			}
			if(i == 3) 
				loginButton.click();
		}
	}
	
	//ACCOUNT TAB CLICK
	@FindBy(xpath="(//span[@class='menu-item-title'])[5]")
	public WebElement accountTab;
	public void accountTabClick() {
		int i = 0;
		while(i < 3) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(accountTab));
				accountTab.click();
				Thread.sleep(8000);
			}
			catch(Exception e) {
				i++;
			}
			if(i == 3)
				accountTab.click();
		}
	}
					
	//PRINT MP BUSINESS AND PAYMENT DETAILS BEFORE AND AFTER UPADATE 
	@FindBy(xpath="//div[@node_name='DisplayPolicyHolderDetails']")
	public WebElement mp_businessInfoDetails;
	@FindBy(xpath="(//div[@class='rdlWrapperDiv'])[4]")
	public WebElement mp_paymentMethodDetails;
	public void mp_printBusinessDetail(int count) {
		int i = 0;
		while(i < 3) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(accountTab));
				accountTab.click();
				Thread.sleep(8000);
				wait.until(ExpectedConditions.visibilityOf(mp_businessInfoDetails));
				ps.println(timeStamp);
				if(count == 1)
					ps.println("MP BUSINESS DETAILS BEFORE UPDATE:");
				else
					ps.println("MP BUSINESS DETAILS AFTER UPDATE:");
				ps.println(mp_businessInfoDetails.getText());
				Thread.sleep(3000);
				System.out.println(i);
				break;
			}
			catch(Exception e) {
				i++;
			}
			if(i == 3)
				accountTab.click();				
		}
	}
	
	public void mp_printPaymentDetail(int count) throws InterruptedException {
		int i = 0;
		while(i < 3) {
			try {
				wait.until(ExpectedConditions.visibilityOf(mp_paymentMethodDetails));
				ps.println(timeStamp);
				Thread.sleep(3000);
				if(count ==1)
					ps.println("//MP CARDS BEFORE UPDATE");
				else
					ps.println("//MP CARDS AFTER UPDATE");
				ps.println(mp_paymentMethodDetails.getText());
			}
			catch(Exception e) {
				i++;
			}
		}
	}
	
	////PRINT CYBER BUSINESS DETAILS BEFORE AND AFTER UPDATE
	@FindBy(xpath = "//div[@aria-label='Account details']/h3")
	public WebElement accountDetails;
	@FindBy (xpath = "//h2/div[@class='dl-accordion-btn' and @aria-label='Business info']")
	public WebElement businessInfo;
	@FindBy(xpath = "(//div[@id='EXPAND-INNERDIV']/div[@class='rdlWrapperDiv'])[4]")
	public WebElement businessInfoDetails;
	public void printBusinessDetail(int count) {
		int i = 0;
		while(i < 5) {
			try {
				if(count == 1) {
					wait.until(ExpectedConditions.elementToBeClickable(accountDetails));
					accountDetails.click();
					Thread.sleep(2000);
					wait.until(ExpectedConditions.elementToBeClickable(businessInfo));
					businessInfo.click();
					wait.until(ExpectedConditions.visibilityOf(businessInfoDetails));
					ps.println(timeStamp);
					ps.println("BEFORE UPDATE:");
				}
			    else if(count == 2) {
					accountDetails.click();
					Thread.sleep(3000);
					businessInfo.click();
					ps.println("AFTER UPDATE:");
				}
				ps.println(businessInfoDetails.getText());
				System.out.println(i);
				break;
			}
			catch(Exception e) {
				System.out.println("EXCEPTION!!! " + e);
				i++;
			}
		}
	}
	
	////PRINT CYBER PAYMENT DETAILS BEFORE AND AFTER UPDATE
	@FindBy(xpath = "//td[@data-attribute-name='Card Number']")
	List<WebElement> cardNumbersList = new ArrayList<WebElement>();
	
	public void printPaymentDetail(int count) {
		wait.until(ExpectedConditions.visibilityOfAllElements(cardNumbersList));
		if(count == 1)
			ps.println("PAYMENT DETAILS BEFORE UPDATE ");
		else
			ps.println("PAYMENT DETAILS AFTER UPDATE ");
		for(WebElement e : cardNumbersList) {
			ps.println(e.getText());
		}
	}
	
	////CYBER LOGIN AND ADD TASK 
	@FindBy(id = "txtUserID") public WebElement userName;
	@FindBy(id = "txtPassword") public WebElement pwd;
	@FindBy(className = "loginButton") public WebElement loginButton;
	public void login() throws IOException {
		int i = 0;
		while(i < 3) {
			try {
				wait.until(ExpectedConditions.visibilityOf(userName));
				wait.until(ExpectedConditions.visibilityOf(pwd));
				wait.until(ExpectedConditions.visibilityOf(loginButton));
				userName.sendKeys(inputTestData.get(2));
				Thread.sleep(2000);
				pwd.sendKeys(inputTestData.get(3));
				Thread.sleep(4000);
				loginButton.click();
				break;
			}
			catch(Exception e) {
				i++;
			}
			if(i == 3) 
				loginButton.click();
		}
	}
	
	//ADD TASK
	@FindBy(xpath = "//a[@class='Header_nav']") 
	public WebElement newButton;
	public void newButtonClick() {
		int i = 0;
		wait.until(ExpectedConditions.elementToBeClickable(newButton));
		while(i < 10){
			 try {
				 newButton.click();
			     break;
			 }
			 catch(Exception e) {
				 i++;
			 }
			 if(i == 3)
				 newButton.click();
		}
	}  
	
	@FindBy(xpath = "//li[@title='Launch a new phone call interaction']")
	public WebElement phoneCallButton;
	public void phoneCallButtonClick() {
		int i = 0;
		while(i < 3) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(phoneCallButton));
			    phoneCallButton.click();
			    break;
			}
			catch(Exception e) {
				i++;
			}
		}
		
    }
	
	@FindBy(xpath = "//input[@title='Search String Email']")
	public WebElement emailAddress;
	@FindBy(xpath = "//button[@class='pzhc pzbutton' and @title='Clear']")
	public WebElement clearButton;
	public void emailAddressEnter() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(emailAddress));
    	emailAddress.sendKeys(inputTestData.get(4));   
    	Thread.sleep(2000);
    	clearButton.click();
    	Thread.sleep(2000);
    	emailAddress.sendKeys(inputTestData.get(4));
	}
	
	@FindBy(xpath = "//button[@title='Search']")
	public WebElement searchButton;
	public void searchButtonClick() {
		int i = 0;
		while(i < 2){
			 try {
				 wait.until(ExpectedConditions.elementToBeClickable(searchButton));
				 searchButton.click();
				 System.out.println("Search " + i);
				 break;
			 }
			 catch(Exception e) {
				i++;
			 }
		}
	}
	
	@FindBy(xpath = "//td[@data-attribute-name='Last name']")
	public WebElement anyField;
	public void anyFieldNameClick() {
		int i = 0;
		while(i < 4) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(anyField));
			    anyField.click();
			    anyField.click();
				break;
			}
			catch(Exception e) {
				i++;
			}
		}
    }
	
	@FindBy(css = "div.content-inner button[class*='Strong']")
	public WebElement submitButton;
	public void submitButtonClick() {
		int i = 0;
		wait.until(ExpectedConditions.elementToBeClickable(submitButton));
		while(i < 4){
			 try{
				 submitButton.click();
				 break;
			 }
			 catch(Exception e){
				 i++;
			 }
		}
    }
	
	@FindBy(xpath = "(//input[@value='Pass'])")
	public List<WebElement> passButtons = new ArrayList<WebElement>();
	@FindBy(xpath = "(//input[@value='Fail'])")
	public List<WebElement> failButtons = new ArrayList<WebElement>();
	@FindBy(css= "section.workarea-view-content")
	public WebElement outerSection;
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	public void radioButtonsClick() throws InterruptedException {
		int i = 0;
		wait.until(ExpectedConditions.visibilityOfAllElements(passButtons));
		wait.until(ExpectedConditions.visibilityOfAllElements(failButtons));
	    
		for(WebElement e: failButtons) {
			jse.executeScript("arguments[0].click()", e);
			Thread.sleep(500);
		}
		Thread.sleep(8000);
		for(WebElement e: passButtons) {
	    	jse.executeScript("arguments[0].click()", e);
	    }
    }
	
	@FindBy(css = "div.item-4 button[class*='Strong']")
	public WebElement verifiedButton;	
	public void verifiedButtonClick() {
		int i = 0;
		while(i < 4) {
			try{
				wait.until(ExpectedConditions.elementToBeClickable(verifiedButton));
			    verifiedButton.click();
			    System.out.println("Verified " + i);
			    break;
			}
			catch(Exception e) {
				System.out.println("Exception " + e);
				i++;
			}
			if(i == 4)
				verifiedButton.click();
		}
	}
	
	////CLICK BUSINESS INFO  INTENT TASK
		
	@FindBy(xpath = "(//i[@class='pi pi-plus pi-mini pi-white'])")
	public WebElement addTaskIcon;
	public void addTaskIconClick() {
		int i = 0;
		while(i < 4){
			 try {
				 wait.until(ExpectedConditions.visibilityOf(addTaskIcon));
				 addTaskIcon.click();
				 break;
			 }
			 catch(Exception e) {
				i++;
			 }
		}
		    	    
	}
	
	@FindBy(css = "a.Add_task[title='Select  Update Business Information  ']")
	public WebElement updateBusinessInfoButton;
	@FindBy(css = "button[title='Add tasks']")
	public WebElement addTasksButton;
	
	public void updateBusinessInfoButtonClick() {
		wait.until(ExpectedConditions.visibilityOf(updateBusinessInfoButton));
		updateBusinessInfoButton.click();    	    
	}
	
	public void addTasksButtonClick() {
		wait.until(ExpectedConditions.visibilityOf(addTasksButton));
		addTasksButton.click();
	}
	
	@FindBy(xpath = "(//span[@class='account_tab_text_input']/input[@class='leftJustifyStyle'][1])")
	public WebElement businessNameField;
	public void businessNameFieldUpdate() {
		int i = 0;
		while(i < 2){
			 try {
				wait.until(ExpectedConditions.elementToBeClickable(businessNameField));
				businessNameField.clear();
				Thread.sleep(2000);
				businessNameField.sendKeys(inputTestData.get(5));
				break;
			 }
			 catch(Exception e){
				i++;
			 }
			 if(i == 2) {
				 businessNameField.clear();
				 businessNameField.sendKeys(inputTestData.get(5));
			 }
		}
	}
	
	
	@FindBy(xpath = "(//span[@class='account_tab_text_input']/input[@name='$PpyWorkPage$pPolicyHolderProfileDetails$pBusinessWebSite'])")
	public WebElement businessWebsiteField;
	public void businessWebsiteFieldUpdate() {
		int i = 0;
		while(i < 3){
			 try {
				 wait.until(ExpectedConditions.visibilityOf(businessWebsiteField));
				 businessWebsiteField.clear();
				 businessWebsiteField.sendKeys(inputTestData.get(6));
				 break;
			 }
			 catch(Exception e) {
				 i++;
			 }
			 if(i == 3) {
				 businessWebsiteField.clear();
				 businessWebsiteField.sendKeys(inputTestData.get(6));
			 }
		}
	}
	
	////PHONE NUMBER VALIDATION
	@FindBy(xpath = "//div[@node_name='CapturePhoneDetails']")
	public List<WebElement> availableNumbers = new ArrayList<WebElement>(); 
	@FindBy(xpath = "(//span[@class='accounttabtextcyber']/ input[@name='$PpyWorkPage$pPolicyHolderProfileDetails$pPhoneList$l1$pMobilePhone'])")
	public WebElement primaryNumber;
	@FindBy(xpath = "(//span[@class='accounttabtextcyber']/ input[@name='$PpyWorkPage$pPolicyHolderProfileDetails$pPhoneList$l2$pMobilePhone'])")
	public WebElement secondaryNumber;
	@FindBy(xpath = "(//span[@class='accounttabtextcyber']/ input[@name='$PpyWorkPage$pPolicyHolderProfileDetails$pPhoneList$l3$pMobilePhone'])")
	public WebElement thirdNumber;
	@FindBy(xpath = "(//select[@name='$PpyWorkPage$pPolicyHolderProfileDetails$pPhoneList$l1$pTypeofPhoneCyber'])")
	public WebElement selectPrimaryNumberCategory;
	@FindBy(xpath = "(//select[@name='$PpyWorkPage$pPolicyHolderProfileDetails$pPhoneList$l2$pTypeofPhoneCyber'])")
	public WebElement selectSecondaryNumberCategory;
	@FindBy(xpath = "(//select[@name='$PpyWorkPage$pPolicyHolderProfileDetails$pPhoneList$l3$pTypeofPhoneCyber'])")
	public WebElement thirdNumberCategory;
	@FindBy(xpath = "(//a[@name='UpdateProfile_pyWorkPage_32'])")
	public WebElement addPhoneButton;
	@FindBy(xpath = "(//span /a[@class='RedLink16px'])")
	public List<WebElement> removeButtons = new ArrayList<WebElement>();
	@FindBy(xpath = "(//button[@class='Account_save_button pzhc pzbutton'])")
	public WebElement saveInfoButton;
	
	//primary phone number
	
	public void primaryNumberValidation() throws InterruptedException {

		//blank field
	 	/*wait.until(ExpectedConditions.visibilityOf(primaryNumber));
		primaryNumber.clear();
		Thread.sleep(3000);
		primaryNumber.sendKeys("  ");
		Thread.sleep(6000);
	
		wait.until(ExpectedConditions.visibilityOf(saveInfoButton));
		saveInfoButton.click();
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(0))));
	    ps.println("Error occurred :" + errorText.get(0).getText());
		if(errorText.get(0).getText().equals(inputTestData.get(9)))
			ps.println("Error Matched :" + errorText.get(0).getText());
		*/
	
		primaryNumber.clear();
		Thread.sleep(2000);
		primaryNumber.sendKeys("35");
		Thread.sleep(4000);
		saveInfoButton.click();
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(0))));
		ps.println("Error occured :" + errorText.get(0).getText());
		if(errorText.get(0).getText().equals(inputTestData.get(11)))
			ps.println("Error Matched :" + errorText.get(0).getText());
		
		primaryNumber.clear();
		Thread.sleep(2000);
		primaryNumber.sendKeys(inputTestData.get(7));
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.visibilityOf(selectPrimaryNumberCategory));
		selectPrimaryNumberCategory.click();
		Thread.sleep(1000);
		selectPrimaryNumberCategory.sendKeys(Keys.UP);
		Thread.sleep(1000);
		selectPrimaryNumberCategory.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		saveInfoButton.click();
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(0))));
		ps.println("Error occured :" + errorText.get(0).getText());
		if(errorText.get(0).getText().equals(inputTestData.get(10)))
			ps.println("Error Matched :" + errorText.get(0).getText());
		
		selectPrimaryNumberCategory.click();
		Thread.sleep(2000);
		selectPrimaryNumberCategory.sendKeys(Keys.DOWN);
		selectPrimaryNumberCategory.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		selectPrimaryNumberCategory.sendKeys(Keys.ENTER);
		businessAddressLabel.click();
		Thread.sleep(8000);
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(0))));
		ps.println("Error occured :" + errorText.get(0).getText());
		if(errorText.get(0).getText().equals(inputTestData.get(12)))
			ps.println("Error Matched :" + errorText.get(0).getText());
		
		selectPrimaryNumberCategory.click();
		Thread.sleep(2000);
		selectPrimaryNumberCategory.sendKeys(Keys.UP);
		Thread.sleep(1000);
		selectPrimaryNumberCategory.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
			
	}
	
	public void secondaryNumberValidation() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(secondaryNumber));
		secondaryNumber.sendKeys("  ");
		wait.until(ExpectedConditions.visibilityOf(saveInfoButton));
		saveInfoButton.click();
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(0))));
		ps.println("Error occured :" + errorText.get(0).getText());
		if(errorText.get(0).getText().equals(inputTestData.get(10)))
			ps.println("Error Matched :" + errorText.get(0).getText());
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(1))));
		ps.println("Error occured :" + errorText.get(1).getText());
		if(errorText.get(1).getText().equals(inputTestData.get(10)))
			ps.println("Error Matched :" + errorText.get(1).getText());
		
		secondaryNumber.clear();
		Thread.sleep(2000);
		secondaryNumber.sendKeys("35");
		Thread.sleep(4000);
		saveInfoButton.click();
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(0))));
		ps.println("Error occured :" + errorText.get(0).getText());
		if(errorText.get(0).getText().equals(inputTestData.get(11)))
			ps.println("Error Matched :" + errorText.get(0).getText());
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(1))));
		ps.println("Error occured :" + errorText.get(1).getText());
		if(errorText.get(1).getText().equals(inputTestData.get(10)))
			ps.println("Error Matched :" + errorText.get(1).getText());
		
		secondaryNumber.clear();
		Thread.sleep(2000);
		secondaryNumber.sendKeys(inputTestData.get(8));
		Thread.sleep(5000);
		
		
		wait.until(ExpectedConditions.visibilityOf(selectSecondaryNumberCategory));
		selectSecondaryNumberCategory.click();
		Thread.sleep(2000);
		selectSecondaryNumberCategory.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		selectSecondaryNumberCategory.sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(0))));
		ps.println("Error occured :" + errorText.get(0).getText());
		if(errorText.get(0).getText().equals(inputTestData.get(12)))
			ps.println("Error Matched :" + errorText.get(0).getText());
		
		selectSecondaryNumberCategory.click();
		Thread.sleep(2000);
		selectSecondaryNumberCategory.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		selectSecondaryNumberCategory.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
			
	} 
	
	public void thirdNumberValidation() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(addPhoneButton));
		addPhoneButton.click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(thirdNumber));
		thirdNumber.clear();
		thirdNumber.sendKeys(inputTestData.get(9));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(thirdNumberCategory));
		thirdNumberCategory.click();
		Thread.sleep(2000);
		thirdNumberCategory.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		thirdNumberCategory.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(0))));
		ps.println("Error occured :" + errorText.get(0).getText());
		if(errorText.get(0).getText().equals(inputTestData.get(12)))
			ps.println("Error Matched :" + errorText.get(0).getText());
		
		thirdNumberCategory.click();
		Thread.sleep(2000);
		thirdNumberCategory.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		thirdNumberCategory.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(0))));
		ps.println("Error occured :" + errorText.get(0).getText());
		if(errorText.get(0).getText().equals(inputTestData.get(12)))
			ps.println("Error Matched :" + errorText.get(0).getText());
	
	} 
	
	public void addPhoneButtonClick() throws InterruptedException {
		if(availableNumbers.size() > 1)
			return;
		wait.until(ExpectedConditions.visibilityOf(addPhoneButton));
		addPhoneButton.click();    	    
	}
	
	public void removePhoneButtonClick() {
				
		if(invoked) {
			System.out.println("Remove Buttons " + removeButtons.size());
			wait.until(ExpectedConditions.visibilityOf(removeButtons.get(2)));
			removeButtons.get(2).click(); 
			
			return;
		}
		
		System.out.println("Remove Buttons " + removeButtons.size());
		System.out.println(removeButtons.get(0).getText());
		
		wait.until(ExpectedConditions.visibilityOf(removeButtons.get(0)));
		removeButtons.get(0).click();    	    
		invoked = true;
	} 
	
	////BUSINESS AND MAILING ADDRESS
	@FindBy(xpath = "//input[contains(@name,'AddressLine1')]")
	public List<WebElement> addressFields = new ArrayList<WebElement>();
	@FindBy(css = "input[type='checkbox'].checkbox")
	public WebElement checkBox;
	@FindBy(xpath = "//span[@class='accounttabtext']/input[contains(@name,'City')]") //1 and 2
	public List<WebElement> cityName = new ArrayList<WebElement>();
	@FindBy(xpath = "//span[@class='accounttabpostcode']/input[contains(@name,'ZipCode')]") //1 and 2
	public List<WebElement> postalCode = new ArrayList<WebElement>();
	@FindBy(xpath = "//select[contains(@name,'AddressList')]")
	public WebElement businessProvinceDropdown;
	@FindBy(xpath = "//select[contains(@name,'MailingList')]")
	public WebElement mailingProvinceDropdown;
	@FindBy(xpath = "//i[@class='icons' and @aria-hidden='true']")
	public WebElement alertOnProvince;
	
	public void cityValidation(int count) throws InterruptedException {
		
		if(count == 1) {
			wait.until(ExpectedConditions.elementToBeClickable(cityName.get(0)));
			cityName.get(0).clear();
		}
		else {
			wait.until(ExpectedConditions.elementToBeClickable(cityName.get(1)));
			cityName.get(1).clear();
		}
		
		Thread.sleep(8000);
		wait.until(ExpectedConditions.visibilityOf(saveInfoButton));
		saveInfoButton.click();
		Thread.sleep(6000);
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(0))));
		ps.println("Error occured - City :" + errorText.get(0).getText());
		if(errorText.get(0).getText().equals(inputTestData.get(14)))
			ps.println("Error Matched - City :" + errorText.get(0).getText());
		
		if(count == 1)
			cityName.get(0).sendKeys(inputTestData.get(18));
		else
			cityName.get(1).sendKeys(inputTestData.get(22));
		Thread.sleep(2000);
		businessAddressLabel.click();
		Thread.sleep(3000);
		saveInfoButton.click();
		Thread.sleep(6000);
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(0))));
		ps.println("Error occured - city :" + errorText.get(0).getText());
		if(errorText.get(0).getText().equals(inputTestData.get(15)))
			ps.println("Error Matched - city :" + errorText.get(0).getText());
		
		
		if(count == 1) {
			cityName.get(0).clear();
			cityName.get(0).sendKeys(inputTestData.get(19));
		}
		else {
			cityName.get(1).clear();
			cityName.get(1).sendKeys(inputTestData.get(23));
		}
		Thread.sleep(4000);
		businessAddressLabel.click();
		Thread.sleep(4000);
	
	}

	public void postalCodeValidation(int count) throws InterruptedException {
		
		if(count == 1) {
			wait.until(ExpectedConditions.visibilityOf(postalCode.get(0)));
			postalCode.get(0).clear();
		}
		else {
			wait.until(ExpectedConditions.visibilityOf(postalCode.get(1)));
			postalCode.get(1).clear();
		}
		Thread.sleep(5000);
		saveInfoButton.click();
		Thread.sleep(6000);
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(0))));
		ps.println("Error occured - postal code :" + errorText.get(0).getText());
		if(errorText.get(0).getText().equals(inputTestData.get(16)))
			ps.println("Error Matched - postal code :" + errorText.get(0).getText());
		
		Thread.sleep(3000);
		if(count == 1) 
			postalCode.get(0).sendKeys(inputTestData.get(20));
		else
			postalCode.get(1).sendKeys(inputTestData.get(24));
		Thread.sleep(5000);
		businessAddressLabel.click();
		Thread.sleep(6000);
		saveInfoButton.click();
		Thread.sleep(5000);
		
		ps.println("Error occured - postal code :" + errorText.get(0).getText());
		if(errorText.get(0).getText().equals(inputTestData.get(16)))
			ps.println("Error Matched - postal code :" + errorText.get(0).getText());
		
		Thread.sleep(3000);
		if(count == 1) {
			postalCode.get(0).clear();
			postalCode.get(0).sendKeys(inputTestData.get(21));
		}
		else {
			postalCode.get(1).clear();
			postalCode.get(1).sendKeys(inputTestData.get(25));
		}
		Thread.sleep(4000);
		businessAddressLabel.click();
		Thread.sleep(4000);

	}
	
	public void provinceValidation(int count) throws InterruptedException {
		
		int i = 0, j = 0, drpdwnindexcount;
		Select bdrpdwn;
		
		if(count == 1) {
			wait.until(ExpectedConditions.visibilityOf(businessProvinceDropdown));
			bdrpdwn = new Select(businessProvinceDropdown);
		}
		else {
			wait.until(ExpectedConditions.visibilityOf(mailingProvinceDropdown));
			bdrpdwn = new Select(mailingProvinceDropdown);
		}
		drpdwnindexcount = bdrpdwn.getOptions().size() - 1;
		System.out.println("Count " + drpdwnindexcount);
		if(count == 1)
			businessProvinceDropdown.click();
		else
			mailingProvinceDropdown.click();
		Thread.sleep(3000);
		//String currentElement = bdrpdwn.getFirstSelectedOption().getText();
		while(i < drpdwnindexcount) {
			if(count == 1)
				businessProvinceDropdown.sendKeys(Keys.UP);
			else
				mailingProvinceDropdown.sendKeys(Keys.UP);
			Thread.sleep(500);
			i++;
		}
		System.out.println("PROVINCE VALUE");
		if(count == 1)
			businessProvinceDropdown.sendKeys(Keys.ENTER);
		else
			mailingProvinceDropdown.sendKeys(Keys.ENTER);		
		
		Thread.sleep(5000);
		saveInfoButton.click();
		Thread.sleep(6000);
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(0))));
		ps.println("Error occured - province :" + errorText.get(0).getText());
		if(errorText.get(0).getText().equals(inputTestData.get(17)))
			ps.println("Error Matched - province :" + errorText.get(0).getText());
		
		int p_scrolldown = random.nextInt(drpdwnindexcount);
		System.out.println("Province Scrolldown " + p_scrolldown);
		if(count == 1)
			businessProvinceDropdown.click();
		else
			mailingProvinceDropdown.click();
		Thread.sleep(4000);
		while(j <= p_scrolldown) {
			if(count == 1)
				businessProvinceDropdown.sendKeys(Keys.DOWN);
			else
				mailingProvinceDropdown.sendKeys(Keys.DOWN);   
			Thread.sleep(500);
			j++;
		}
		if(count == 1)
			businessProvinceDropdown.sendKeys(Keys.ENTER);
		else
			mailingProvinceDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(6000);
	
	}
	
	public void addressValidation(int count) throws InterruptedException {
		
		int i = 0;
		
		if(count == 1) {
			wait.until(ExpectedConditions.visibilityOf(addressFields.get(0)));
			addressFields.get(0).clear();
		}
		else {
			wait.until(ExpectedConditions.visibilityOf(addressFields.get(1)));
			addressFields.get(1).clear();
		}
		
		Thread.sleep(5000);
		saveInfoButton.click();
		Thread.sleep(12000);
		
		wait.until(ExpectedConditions.visibilityOf((errorText.get(0))));
		ps.println("Error occured - address :" + errorText.get(0).getText());
		if(errorText.get(0).getText().equals(inputTestData.get(13)))
			ps.println("Error Matched - address :" + errorText.get(0).getText());
		
		sb.append(chars.charAt(random.nextInt(chars.length())));
		if(count == 1)
			addressFields.get(0).sendKeys(sb.toString());
		else
			addressFields.get(1).sendKeys(sb.toString());
		Thread.sleep(3000);
		System.out.println("sb append " + sb.toString());
		int scrolldown = random.nextInt(7);
		System.out.println("Scrolldown " + scrolldown);
		while(i <= scrolldown) {
			if(count == 1)
				addressFields.get(0).sendKeys(Keys.DOWN);   
			else
				addressFields.get(1).sendKeys(Keys.DOWN);
			Thread.sleep(2000);
			i++;
		}
		if(count == 1)
			addressFields.get(0).sendKeys(Keys.ENTER);   
		else
			addressFields.get(1).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		
		if(count == 1) {
			try {
				System.out.println("Alert " + alertOnProvince.isDisplayed());
				if(alertOnProvince.isDisplayed()) {
					System.out.println("Alert on province");
					alert = true;
				}
			}
			catch(Exception e) {}
		}
		
		Thread.sleep(3000);
	}
	
	public void checkBoxClick() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(checkBox));
		System.out.println(addressFields.get(1).isDisplayed());
		if(addressFields.get(1).isDisplayed())
			checkBox.click();
		Thread.sleep(4000);
		checkBox.click();   	    
	}
	
	public void saveInfoButtonClick() {
		int i = 0;
		while(i < 2){
			 try{
				 wait.until(ExpectedConditions.visibilityOf(saveInfoButton));
				 saveInfoButton.click();    	    
				 break;
			 }
			 catch(Exception e){
				i++;
			 }
		}
	}
	
	////UPDATE PAYMENT METHOD
	@FindBy(xpath = "(//a[@title='Select  Update Payment Method  '])")
	public WebElement updatePaymentButton;
	@FindBy(xpath = "//td[@data-attribute-name='Card Number']")
	List<WebElement> cardNumbers = new ArrayList<WebElement>();
	@FindBy(xpath = "(//select[@class='accounttabtext'])")
	public WebElement paymentAllDrpdwn;
	@FindBy(xpath = "(//button[@class='Account_save_button_Med pzhc pzbutton'])")
	public WebElement paymentMethodConfirmButton;
	Select drpdwnSelect;
	
	public void updatePaymentButtonClick() {
		wait.until(ExpectedConditions.visibilityOf(updatePaymentButton));
		updatePaymentButton.click();    	    
	}
	
	public void paymentDrpdwnValuesCheck() {
		drpdwnSelect = new Select(paymentAllDrpdwn);
		List<WebElement> options = drpdwnSelect.getOptions();
		int size = options.size();
		for(int i = 0, j= 1; j < size; i++,j++) {
			if(options.get(j).getText().contains(cardNumbers.get(i).getText())){
				ps.println("Expected card dropdown value " + cardNumbers.get(i).getText() + " matches displayed value " + options.get(j).getText());
			}
		}
	}
	
	public void paymentDrpdwnSelect() throws InterruptedException {
		int i = 0;
		wait.until(ExpectedConditions.visibilityOf(paymentAllDrpdwn));
		drpdwnSelect = new Select(paymentAllDrpdwn);
		int size = drpdwnSelect.getOptions().size();
		paymentAllDrpdwn.click();
		if(size > 2) {
			int scrollDownCount = random.nextInt(size - 1);
			while(scrollDownCount == 0) {
				scrollDownCount = random.nextInt(size - 1);
			}
			while(i <= scrollDownCount) {
				paymentAllDrpdwn.sendKeys(Keys.DOWN);
				Thread.sleep(1000);
				i++;
			}
		}
		paymentAllDrpdwn.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    
	} 
	
	////CONFIRMATIONS AND WRAP-UP
	public void paymentMethodConfirmButtonClick() {
		wait.until(ExpectedConditions.visibilityOf(paymentMethodConfirmButton));
		paymentMethodConfirmButton.click();    	    
	}
	
	@FindBy(xpath = "(//button[@class='Confirm_Button pzhc pzbutton'])")
	public WebElement updatedtaxConfirmButton;
	public void updatedtaxConfirmButtonClick() throws InterruptedException {
		 int i = 0;
		 wait.until(ExpectedConditions.visibilityOf(updatedtaxConfirmButton));
		 while(i < 3)
			 try {
			 updatedtaxConfirmButton.click();   	    
			 }
		 	catch(Exception e) {
		 		i++;
		 	}
		 Thread.sleep(2000);
 	}
	
	@FindBy(xpath = "(//button[@title='Confirm'])")
	public WebElement confirmButton;
	public void confirmButtonClick() throws InterruptedException {
		if(alert == true) {
			Thread.sleep(3000);
			updatedtaxConfirmButtonClick();
		}
		Thread.sleep(8000);
		wait.until(ExpectedConditions.visibilityOf(confirmButton));
		int i = 0;
		while(i < 3){
			 try{
				 confirmButton.click();
				 break;
			 }
			 catch(Exception e){
				 i++;
			 }
		}
	}
	
	@FindBy(xpath = "(//button[@class='Wrap_up_button pzhc pzbutton'])")
	public WebElement wrapupButton;
	public void wrapupButtonClick() {
		wait.until(ExpectedConditions.visibilityOf(wrapupButton));
		wrapupButton.click();    	    
	}
	
	@FindBy(xpath = "//button[@class='Strong pzhc']")
	public WebElement lastSubmitButton;
	public void lastSubmitButtonClick() {
		wait.until(ExpectedConditions.visibilityOf(lastSubmitButton));
		lastSubmitButton.click();    	    
	}
	
}
