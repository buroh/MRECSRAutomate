package com.mre.pages;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.mre.base.BaseSetup;
import com.mre.utils.TestUtils;




public class MPCyberAccountPage extends BaseSetup {

	public MPCyberAccountPage(WebDriver driver) {
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	//----------------------------------------------------------------------------------------------------------
	//Policyholder Update
	@FindBy(xpath = "(//a[@class='menu-item-anchor '])[5]")
	WebElement accountTab;
	public void accountTabClick() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(accountTab));
	        	accountTab.click();

	        	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
		
	}
	
	@FindBy(xpath = "(//a[@class='MPDBLink_16px_white'])[3]")
	public
	WebElement policyholderEditLink;
	public void policyholderEditLinkClick() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(policyholderEditLink));
	        	policyholderEditLink.click();
	        	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
		
	}
	//Get Member Details
	@FindBy(xpath = "(//div[@class='content-item content-field item-1 remove-all-spacing flex flex-row dataValueRead'])[9]")
	WebElement businessNameText;
	@FindBy(xpath = "(//div[@class='content-item content-field item-1 remove-all-spacing flex flex-row dataValueRead'])[10]")
	WebElement streetAddressText;
	@FindBy(xpath = "(//div[@class='content-item content-field item-1 remove-all-spacing flex flex-row dataValueRead'])[11]")
	WebElement mailingAddressText;	
	@FindBy(xpath = "(//div[@class='content-item content-field item-1 remove-all-spacing flex flex-row dataValueRead'])[12]")
	WebElement emailAddressText;	
	@FindBy(xpath = "(//div[@class='content-item content-field item-1 remove-all-spacing flex flex-row dataValueRead'])[13]")
	WebElement phoneNumberText;	
	@FindBy(xpath = "(//div[@class='content-item content-field item-1 remove-all-spacing flex flex-row dataValueRead'])[14]")
	WebElement websiteText;
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row dataLabelRead member_portal_label_16_dataLabelRead'])[1]")
	WebElement businessNameLabelText;
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 flex flex-row text-word-break-all dataLabelRead member_portal_label_16_dataLabelRead'])")
	WebElement streetAddressLabelText;
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row dataLabelRead member_portal_label_16_dataLabelRead'])[2]")
	WebElement mailingAddressLabelText;	
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row dataLabelRead member_portal_label_16_dataLabelRead'])[3]")
	WebElement emailAddressLabelText;	
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row dataLabelRead member_portal_label_16_dataLabelRead'])[4]")
	WebElement phoneNumberLabelText;	
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row dataLabelRead member_portal_label_16_dataLabelRead'])[5]")
	WebElement websiteLabelText;
		
	public void getMemberDetails() throws FileNotFoundException {
		wait.until(ExpectedConditions.elementToBeClickable(policyholderEditLink));
		ps.print("Account Member Information" + "\n");
		ps.print(businessNameLabelText.getText() + businessNameText.getText() + "\n");
		ps.print(streetAddressLabelText.getText() + streetAddressText.getText() + "\n");
		ps.print(mailingAddressLabelText.getText() + mailingAddressText.getText() + "\n");
		ps.print(emailAddressLabelText.getText() + emailAddressText.getText() + "\n");
		ps.print(phoneNumberLabelText.getText() + phoneNumberText.getText() + "\n");
		ps.print(websiteLabelText.getText() + websiteText.getText() + "\n");
	}
	//Pyament 
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing flex flex-row dataLabelRead cbheading_dataLabelRead']")
	WebElement cardTypeText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 flex flex-row dataLabelRead mpcbheading_dataLabelRead']")
	WebElement cardNumberText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 remove-bottom-spacing remove-right-spacing flex flex-row standard_dataLabelRead dataLabelRead mpstandard_dataLabelRead']")
	WebElement cardExpiredText;
	@FindBy(xpath = "(//a[@class='Remove_Link_16'])[2]")
	WebElement replaceCardLink;
	public void getCardDetails() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {	
	    try {
	    
		ps.print("Account Payment Information");
		ps.print("Card Type : " + cardTypeText.getText() + "\n");
		ps.print("Card Number : " + cardNumberText.getText() + "\n");
		ps.print("Card Expried Date: " + cardExpiredText.getText() + "\n");
		ps.print("Card Replace : " + replaceCardLink.getText() + "\n");
	
		result31 = true;
        break;
    } catch(Exception e) {
    }
    attempts31++;
}
	}
	@FindBy(xpath = "(//a[@class='MPDBLink_16px_white'])[4]")
	WebElement addNewPaymentMethodLink;
	public void addNewPaymentMethodLinkClick() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(addNewPaymentMethodLink));
	        	addNewPaymentMethodLink.click();
	        	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
		
	}
	@FindBy(xpath = "(//span[@class='creditcard_dropdown'])[1]")
	WebElement productOneCardNumberText;
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-left-spacing remove-top-spacing flex flex-row padding-b-1x dataLabelRead mp_label_21px_dataLabelRead'])[1]")
	WebElement productOneNameText;
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row padding-1x left-aligned dataLabelRead mpdb_14px_bold_with_background_dataLabelRead'])")
	WebElement productOneCarrierNameText;
	@FindBy(xpath = "//span[@class='cbmpbd_datetext_14px']")
	WebElement productOnePolicyNumberText;
	
	public void getPaymentDetails() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {	
	    try {
	    
		ps.print("Account Payment Information");
		ps.print("Product Name : " + productOneNameText.getText() + "\n");
		ps.print("Used Card : " + productOneCardNumberText.getText() + "\n");
		ps.print("Product Carrier Name: " + productOneCarrierNameText.getText() + "\n");
		ps.print("Policy Number : " + productOnePolicyNumberText.getText() + "\n");
	
		result31 = true;
        break;
    } catch(Exception e) {
    }
    attempts31++;
}
	}
		@FindBy(xpath = "(//a[@class='MPDBLink_16px_white'])[5]")
		public
		WebElement editPaymentMethodLink;
		public void editPaymentMethodLinkClick() {
			boolean result31 = false;
			int attempts31 = 0;
		    while(attempts31 < 2) {
		    	
		        try {
		        	wait.until(ExpectedConditions.elementToBeClickable(editPaymentMethodLink));
		        	editPaymentMethodLink.click();
		        	result31 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts31++;
		    }
			
		}
	//Links
		@FindBy(xpath = "//div[@class='content-item content-field item-1 remove-top-spacing remove-left-spacing flex flex-row mpaccount18pxbold_grey_dataLabelRead mpaccount18pxbold_grey_dataLabelRead custom_border_bottom dataValueRead']")
		WebElement accoundDetailsLink;
		public void accoundDetailsLink() {
			boolean result31 = false;
			int attempts31 = 0;
		    while(attempts31 < 2) {
		    	
		        try {
		        	wait.until(ExpectedConditions.elementToBeClickable(accoundDetailsLink));
		        	accoundDetailsLink.click();
		        	result31 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts31++;
		    }
			
		}
		@FindBy(xpath = "//div[@class='content-item content-field item-3 flex flex-row mpaccount18pxboldgrey_dataLabelRead mpaccount18pxbold_grey_dataLabelRead custom_border_bottom dataValueRead']")
		WebElement paymentMethodLink;
		public void paymentMethodLinkClick() {
			boolean result31 = false;
			int attempts31 = 0;
		    while(attempts31 < 2) {
		    	
		        try {
		        	wait.until(ExpectedConditions.elementToBeClickable(paymentMethodLink));
		        	paymentMethodLink.click();
		        	result31 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts31++;
		    }
			
		}
		@FindBy(xpath = "//div[@class='content-item content-field item-5 flex flex-row mpaccount18pxbold_grey_dataLabelRead mpaccount18pxbold_grey_dataLabelRead dataValueRead']")
		WebElement settingsLink;
		public void settingsLinkClick() {
			boolean result31 = false;
			int attempts31 = 0;
		    while(attempts31 < 2) {
		    	
		        try {
		        	wait.until(ExpectedConditions.elementToBeClickable(settingsLink));
		        	settingsLink.click();
		        	result31 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts31++;
		    }
			
		}
		@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row dataLabelRead mphelp_32px_white_dataLabelRead']")
		WebElement helpCenterLink;
		public void helpCenterLinkClick() {
			boolean result31 = false;
			int attempts31 = 0;
		    while(attempts31 < 2) {
		    	
		        try {
		        	wait.until(ExpectedConditions.elementToBeClickable(helpCenterLink));
		        	helpCenterLink.click();
		        	result31 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts31++;
		    }
			
		}
		//Setting 
		@FindBy(xpath = "(//span[@class='mpaccount_16px_text'])[8]")
		WebElement loginEmailText;
		public void getSettingDetails() {
			boolean result31 = false;
			int attempts31 = 0;
		    while(attempts31 < 2) {
		    	
		        try {
		        	ps.print("Login Email :" + loginEmailText.getText() + "\n");
		        	result31 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts31++;
		    }
			
		}
		@FindBy(xpath = "//button[@class='CBContactUs pzhc pzbutton']")
		WebElement resetPasswordButton;
		@FindBy(id = "btnPasswordChangeModalClose")
		WebElement passwordChangeModalClose;
		public void resetPasswordButtonClick() {
			boolean result31 = false;
			int attempts31 = 0;
		    while(attempts31 < 2) {
		    	
		        try {
		        	wait.until(ExpectedConditions.elementToBeClickable(resetPasswordButton));
		        	resetPasswordButton.click();
		        	result31 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts31++;
		    }
			
		}
		@FindBy(xpath = "//input[@name= 'currentPassword']")
		WebElement currentPassworTextBox;
		@FindBy(xpath = "//input[@name= 'newPassword']")
		WebElement newPasswordTextBox;
		@FindBy(xpath = "//input[@name= 'newPasswordConfirm']")
		WebElement newPasswordConfirmTextBox;
		@FindBy(xpath = "//button[@id='btnPasswordChangeModal']")
		WebElement passwordConfirmButton;
		@FindBy(xpath = "//span[@class= 'text-danger']")
		WebElement passwordValidationText;
		public void resetPasswordUpdate() throws InterruptedException {
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			currentPassworTextBox.sendKeys("Rules@12312837123");
			newPasswordTextBox.sendKeys("Rules");
			passwordConfirmButton.click();
			ps.print(passwordValidationText.getText());
			currentPassworTextBox.clear();
			Thread.sleep(2000);
			currentPassworTextBox.sendKeys("Rules@123");
			newPasswordTextBox.clear();
			Thread.sleep(2000);
			newPasswordTextBox.sendKeys("Rules@987");		
			newPasswordConfirmTextBox.sendKeys("Rule@987");
			passwordConfirmButton.click();
			ps.print(passwordValidationText.getText());
			newPasswordConfirmTextBox.clear();
			Thread.sleep(2000);
			newPasswordConfirmTextBox.sendKeys("Rules@987");
			passwordConfirmButton.click();
			Thread.sleep(4000);
			passwordChangeModalClose.click();
			TestUtils tut = new TestUtils(driver);
			tut.mpiframe();
		}
	//Commicnaiton 
		@FindBy(xpath = "(//span[@class='mpaccount_16px_text'])[9]")
		WebElement languagePreferenceText;
		@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row dataLabelRead member_portal_label_16_dataLabelRead'])[7]")
		WebElement languagePreferenceLabelText;
		@FindBy(xpath = "(//span[@class='mpaccount_16px_text'])[10]")
		WebElement communicationPreEmailAddressText;
		@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row dataLabelRead member_portal_label_16_dataLabelRead'])[8]")
		WebElement communicationPreEmailAddressLabelText;
		@FindBy(xpath = "(//span[@class='mpaccount_16px_text'])[13]")
		WebElement communicationPreMailingAddressText;
		@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row dataLabelRead member_portal_label_16_dataLabelRead'])[11]")
		WebElement communicationPreMailingAddressLabelText;
		@FindBy(xpath = "(//span[@class='mpaccount_16px_text'])[11]")
		WebElement communicationPrePhoneNumberText;
		@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row dataLabelRead member_portal_label_16_dataLabelRead'])[9]")
		WebElement communicationPrePhoneNumberLabelText;
		public void getCommunciationDetails() {
			boolean result31 = false;
			int attempts31 = 0;
		    while(attempts31 < 2) {	
		    try {
		    
			ps.print("Account Communciation Preference");
			ps.print(languagePreferenceLabelText.getText() + languagePreferenceText.getText() + "\n");
			ps.print(communicationPreEmailAddressLabelText.getText() + communicationPreEmailAddressText.getText() + "\n");
			ps.print(communicationPreMailingAddressLabelText.getText() + communicationPreMailingAddressText.getText() + "\n");
			ps.print(communicationPrePhoneNumberLabelText.getText() + communicationPrePhoneNumberText.getText() + "\n");

			result31 = true;
	        break;
	    } catch(Exception e) {
	    }
	    attempts31++;
	}
		}
		@FindBy(xpath = "(//a[@class='MPDBLink_16px_white'])[6]")
		public
		WebElement communicationEditLink;
		public void communicationEditLink() {
			boolean result31 = false;
			int attempts31 = 0;
		    while(attempts31 < 2) {
		    	
		        try {
		        	wait.until(ExpectedConditions.elementToBeClickable(communicationEditLink));
		        	communicationEditLink.click();
		        	result31 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts31++;
		    }
			
		
	
		
}}
	

