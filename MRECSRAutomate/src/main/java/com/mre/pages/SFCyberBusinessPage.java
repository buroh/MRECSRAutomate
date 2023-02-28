package com.mre.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.mre.base.BaseSetup;

public class SFCyberBusinessPage extends BaseSetup {
	public SFCyberBusinessPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pApplicantFirstName']")
	WebElement applicantFirstNameTextBox;
	@FindBy(xpath = "//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pApplicantLastName']")
	WebElement applicantLastNameTextBox;
	@FindBy(xpath = "//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pJobTitle']")
	WebElement jobTitleTextBox;
	@FindBy(xpath = "//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pPhoneNumber']")
	WebElement phoneNumberTextBox;
	@FindBy(xpath = "//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pExtension']")
	WebElement extensionTextBox;
	public void applicantValidationCheck() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(applicantFirstNameTextBox));
	        	applicantFirstNameTextBox.sendKeys("@!@");
	        	applicantLastNameTextBox.sendKeys("@!@");
	        	jobTitleTextBox.sendKeys("@!@");
	        	phoneNumberTextBox.sendKeys("123");
	        	result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	}
	public void enterApplicantDetails() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(applicantFirstNameTextBox));
	        	applicantFirstNameTextBox.clear();
	        	applicantFirstNameTextBox.sendKeys("FirstTest");
	        	applicantLastNameTextBox.clear();
	        	applicantLastNameTextBox.sendKeys("LastTest");
	        	jobTitleTextBox.clear();
	        	jobTitleTextBox.sendKeys("Tester");
	        	phoneNumberTextBox.sendKeys("1231231231");
	        	extensionTextBox.sendKeys("213");
	        	result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	}
	public void updateApplicantDetails() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(applicantFirstNameTextBox));
	        	applicantFirstNameTextBox.clear();
	        	applicantFirstNameTextBox.sendKeys("FirstTestUpdate");
	        	applicantLastNameTextBox.clear();
	        	applicantLastNameTextBox.sendKeys("LastTestUpdate");
	        	jobTitleTextBox.clear();
	        	jobTitleTextBox.sendKeys("TesterUpdate");
	        	phoneNumberTextBox.clear();
	        	phoneNumberTextBox.sendKeys("9879879879");
	        	extensionTextBox.clear();
	        	extensionTextBox.sendKeys("213");
	        	result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	}
	@FindBy(xpath = "//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pBusinessName']")
	WebElement businessNameTextBox;
	public void buinsessNameCheck() {
		  wait.until(ExpectedConditions.visibilityOf(businessNameTextBox));
	 		if(businessNameTextBox.getAttribute("value").equals("CB Inc")) {
	             ps.print("Value Matching :"+"Actual Value="+businessNameTextBox.getAttribute("value")+" And Expected Value="+"CB Inc" + "\n");
	 	     }
	 	     else {
	             ps.print("Value Not Matching :"+"Actual Value="+businessNameTextBox.getAttribute("value")+" And Expected Value="+"CB Inc" + "\n");
	 	     }
	 		
	 		 
	}
	@FindBy(xpath = "(//input[@class='autocomplete_input ac_autocomplete_540w ErrorShade'])")
	WebElement businessAddressStreetAddressTextBox;
	public void enterbusinessAddressStreetAddress() {
	boolean result = false;
	int attempts = 0;
    while(attempts < 2) {
        try {
    		wait.until(ExpectedConditions.visibilityOf(businessAddressStreetAddressTextBox));
    		businessAddressStreetAddressTextBox.sendKeys(inputTestData.get(21));
    		for(int i = 0 ; i < 3 ; i++) {
    			businessAddressStreetAddressTextBox.click();
    			businessAddressStreetAddressTextBox.sendKeys(Keys.ARROW_DOWN);
    				Thread.sleep(2000);			
    			}
    			Thread.sleep(5000);
    			businessAddressStreetAddressTextBox.sendKeys(Keys.ENTER);
    			businessAddressStreetAddressTextBox.sendKeys(Keys.ENTER);
    			Thread.sleep(5000);
  	            break;
        } catch(Exception e) {
        }
        attempts++;
    }
	
}
	@FindBy(xpath = "//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pCanadaAddress$gPolicyholder$ppyNote']")
	WebElement provinceTextBox;
	public void provinceCheck() {
		  wait.until(ExpectedConditions.visibilityOf(provinceTextBox));
	 		if(provinceTextBox.getAttribute("value").equals(inputTestData.get(5))) {
	             ps.print("Value Matching :"+"Actual Value="+provinceTextBox.getAttribute("value")+" And Expected Value="+inputTestData.get(5) + "\n");
	 	     }
	 	     else {
	             ps.print("Value Not Matching :"+"Actual Value="+provinceTextBox.getAttribute("value")+" And Expected Value="+inputTestData.get(5) + "\n");
	 	     }
	 		
	 		 
	}
	
	@FindBy(xpath = "//input[@class='checkbox chkBxCtl ']")
	WebElement mailingAddressDifferentCheckBox;
	public void mailingAddressDifferentCheckBox() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(mailingAddressDifferentCheckBox));
	        	mailingAddressDifferentCheckBox.click();
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	}
	
	@FindBy(xpath = "(//button[@class='Primary_Button_540X54 pzhc pzbutton'])[1]")
	WebElement businessPageContinueButton;
	public void businessPageContinueButtonClick() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(businessPageContinueButton));
	        	businessPageContinueButton.click();
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	}
	@FindBy(xpath = "(//input[@class='autocomplete_input ac_autocomplete_540w'])[2]")
	WebElement mailingAddressStreetAddressTextBox;
	public void enterMailingAddressStreetAddressTextBox() {
		boolean result = false;
		int attempts = 0;
	    while(attempts < 2) {
	        try {
	    		wait.until(ExpectedConditions.visibilityOf(mailingAddressStreetAddressTextBox));
	    		mailingAddressStreetAddressTextBox.sendKeys("556");
	    		for(int i = 0 ; i < 3 ; i++) {
	    			mailingAddressStreetAddressTextBox.sendKeys(Keys.ARROW_DOWN);
	    				Thread.sleep(2000);			
	    			}
	    			Thread.sleep(5000);
	    			mailingAddressStreetAddressTextBox.sendKeys(Keys.ENTER);
	    			mailingAddressStreetAddressTextBox.sendKeys(Keys.ENTER);
	    			Thread.sleep(5000);
	  	            break;
	        } catch(Exception e) {
	        }
	        attempts++;
	    }
		
	}
	@FindBy(xpath = "(//button[@class='Primary_Button_540X54 pzhc pzbutton'])[2]")
	WebElement businessPageContinueButtonAfterProfileSection;
	public void businessPageContinueButtonAfterProfileSectionClick() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(businessPageContinueButtonAfterProfileSection));
	        	businessPageContinueButtonAfterProfileSection.click();
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	}
	@FindBy(xpath = "//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pEmailAddress']")
	WebElement emailAddressTextBox;
	public void emailAddressCheck() {
		  wait.until(ExpectedConditions.visibilityOf(emailAddressTextBox));
		  if(emailAddressTextBox.isEnabled()) {
			  ps.print("Email Address is Enabled");
		  }
		  else {
			  ps.print("Email Address is Disabled");

		  }
	 		if(emailAddressTextBox.getAttribute("value").equals(inputTestData.get(2))) {
	             ps.print("Value Matching :"+"Actual Value="+businessNameTextBox.getAttribute("value")+" And Expected Value="+inputTestData.get(2) + "\n");
	 	     }
	 	     else {
	             ps.print("Value Not Matching :"+"Actual Value="+businessNameTextBox.getAttribute("value")+" And Expected Value="+inputTestData.get(2) + "\n");
	 	     }
	 		
	 		 
	}
	@FindBy(xpath = "//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pPassword']")
	WebElement passwordTextBox;
	@FindBy(xpath = "//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pConfirmPassword']")
	WebElement confirmPasswordTextBox;
	public void passwordIsDisplayed() {
		        try {
		        	wait.until(ExpectedConditions.elementToBeClickable(passwordTextBox));
		    		passwordTextBox.click();       
		        } catch(Exception e) {
		        }
	}
	public void passwordValidation() throws InterruptedException {
		passwordTextBox.sendKeys("rules");
		Thread.sleep(2000);
		confirmPasswordTextBox.sendKeys("rules");
		Thread.sleep(2000);
		businessPageContinueButtonAfterProfileSectionClick();
         ps.print("Actual Value="+errorValidationText.get(0).getText()+" And Expected Value="+"The field should be at least 8 characters long." + "\n");

		passwordTextBox.clear();
		passwordTextBox.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		Thread.sleep(3000);
		passwordTextBox.sendKeys("Rules@123");
		Thread.sleep(2000);
		confirmPasswordTextBox.clear();
		confirmPasswordTextBox.sendKeys("Rules@456");
		confirmPasswordTextBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		businessPageContinueButtonAfterProfileSectionClick();
        ps.print("Actual Value="+errorValidationText.get(0).getText()+" And Expected Value="+"Values entered do not match." + "\n");
		confirmPasswordTextBox.clear();
		confirmPasswordTextBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		confirmPasswordTextBox.sendKeys("Rules@123");
		Thread.sleep(2000);
		
    
	}
	@FindBy(xpath = "(//label[@class='rb_radio_segment_290px rb_standard radioLabel'])[1]")
	WebElement languagePreferenceEnglishRadioButton;
	public void languagePreferenceEnglishRadioButtonClick() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	if(inputTestData.get(35).contains("English")) {
	        	wait.until(ExpectedConditions.elementToBeClickable(languagePreferenceEnglishRadioButton));
	        	languagePreferenceEnglishRadioButton.click();}
	        	else {
		        	wait.until(ExpectedConditions.elementToBeClickable(languagePreferenceFrenchRadioButton));
		        	languagePreferenceFrenchRadioButton.click();

	        	}
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	}
	@FindBy(xpath = "(//label[@class='rb_radio_segment_290px rb_standard radioLabel'])[2]")
	WebElement languagePreferenceFrenchRadioButton;
	public void languagePreferenceFrenchRadioButtonClick() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(languagePreferenceFrenchRadioButton));
	        	languagePreferenceFrenchRadioButton.click();
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	}
	@FindBy(id = "PegaRULESErrorFlag")
	List<WebElement> errorValidationText;
	public void  errorValidation() {
  	  int count = 0;
  		int countOfValidation = errorValidationText.size();
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
		    		for(int i = 0 ; i < countOfValidation ; i++)
		    		{
		 			if(errorValidationText.get(i).getText().contains(inputTestData.get(24)))
		 			{
		 				count = i +1 ;
		 			}
		 			else {
		 				ps.print("Validation is not displayed");
		 			}
		    		}
	 	             ps.print("Actual Value="+count+" And Expected Value="+"11" + "\n");
		    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	  
	}
	
	public void  invalidErrorValidation() {
	  	  int count = 0;
	  		int countOfValidation = errorValidationText.size();
			boolean result1 = false;
			int attempts1 = 0;
		    while(attempts1 < 2) {
		        try {
			    		for(int i = 0 ; i < countOfValidation ; i++)
			    		{
			 			if(errorValidationText.get(i).getText().contains(inputTestData.get(25)))
			 			{
			 				count = i +1 ;
			 			}
			 			else {
			 				ps.print("Validation is not displayed");
			 			}
			    		}
		 	             ps.print("Actual Value="+count+" And Expected Value="+"11" + "\n");
			    		result1 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts1++;
		    }
		  
		}
		
}
