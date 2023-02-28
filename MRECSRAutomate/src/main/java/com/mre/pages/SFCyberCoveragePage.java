package com.mre.pages;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.mre.base.BaseSetup;

public class SFCyberCoveragePage extends BaseSetup {
	public SFCyberCoveragePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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
		    		for(int i = 4 ; i < countOfValidation ; i++)
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
		     
	
	
	@FindBy(xpath = "(//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pEmailAddress'])[2]")
	WebElement emailAddressTextBox;
	public void emailAddressTextBoxValidation() throws InterruptedException {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	
	    		wait.until(ExpectedConditions.elementToBeClickable(emailAddressTextBox));
	    		emailAddressTextBox.click();
	    		emailAddressTextBox.click();
	    		Thread.sleep(3000);

	    		emailAddressTextBox.sendKeys("test");
	    		emailAddressTextBox.sendKeys(Keys.TAB);
	    		emailAddressTextBox.sendKeys(Keys.TAB);
	    		Thread.sleep(5000);
	    	wait.until(ExpectedConditions.visibilityOf(errorValidationText.get(1)));
	    	if(errorValidationText.get(1).getText().equals(inputTestData.get(26))) {
	             ps.print("Value Matching :"+"Actual Value="+errorValidationText.get(1).getText()+" And Expected Value="+inputTestData.get(26) + "\n");
    	     }
    	     else {
	             ps.print("Value Not Matching :"+"Actual Value="+errorValidationText.get(1).getText()+" And Expected Value="+inputTestData.get(26) + "\n");
    	     }
		emailAddressTextBox.clear();
		emailAddressTextBox.clear();
		Thread.sleep(3000);

		emailAddressTextBox.click();
		emailAddressTextBox.click();
		Thread.sleep(3000);

		emailAddressTextBox.sendKeys(inputTestData.get(2));
		emailAddressTextBox.sendKeys(Keys.TAB);
		emailAddressTextBox.sendKeys(Keys.TAB);

		result1 = true;
        break;
    } catch(Exception e) {
    }
    attempts1++;
	   }
	}
	
	@FindBy(xpath = "(//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pConfirmEmailAddress'])[2]")
	static public WebElement confirmEmailAddressTextBox;
	public void confirmEmailAddressTextBoxValidation() throws InterruptedException {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		wait.until(ExpectedConditions.elementToBeClickable(confirmEmailAddressTextBox));
	    		confirmEmailAddressTextBox.click();
	    		confirmEmailAddressTextBox.click();
	    		Thread.sleep(3000);
	    		confirmEmailAddressTextBox.sendKeys("test");
	    		confirmEmailAddressTextBox.sendKeys(Keys.TAB);
	    		confirmEmailAddressTextBox.sendKeys(Keys.TAB);
	    		Thread.sleep(5000);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	    		
	    wait.until(ExpectedConditions.visibilityOf(errorValidationText.get(1)));
    	if(errorValidationText.get(1).getText().equals(inputTestData.get(27))) {
             ps.print("Value Matching :"+"Actual Value="+errorValidationText.get(1).getText()+" And Expected Value="+"Confirm your email address." + "\n");
	     }
	     else {
             ps.print("Value Not Matching :"+"Actual Value="+errorValidationText.get(1).getText()+" And Expected Value="+"Confirm your email address." + "\n");
	     }
		
    	boolean result2 = false;
		int attempts2 = 0;
	    while(attempts2 < 2) {
	        try {
	        	confirmEmailAddressTextBox.clear();
	    		confirmEmailAddressTextBox.clear();
	    		Thread.sleep(3000);

	    		confirmEmailAddressTextBox.click();
	    		confirmEmailAddressTextBox.click();
	    		Thread.sleep(3000);

	    		confirmEmailAddressTextBox.sendKeys("test@yopmail.com");
	    		confirmEmailAddressTextBox.sendKeys(Keys.TAB);
	    		confirmEmailAddressTextBox.sendKeys(Keys.TAB);

	    		Thread.sleep(5000);
	    		result2 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts2++;
	    }
	    wait.until(ExpectedConditions.visibilityOf(errorValidationText.get(1)));
    	if(errorValidationText.get(1).getText().equals(inputTestData.get(28))) {
             ps.print("Value Matching :"+"Actual Value="+errorValidationText.get(1).getText()+" And Expected Value="+inputTestData.get(28) + "\n");
	     }
	     else {
             ps.print("Value Not Matching :"+"Actual Value="+errorValidationText.get(1).getText()+" And Expected Value="+inputTestData.get(28) + "\n");
	     }
    	boolean result3 = false;
		int attempts3 = 0;
	    while(attempts3 < 2) {
	        try {
	        	confirmEmailAddressTextBox.clear();
	    		confirmEmailAddressTextBox.clear();
	    		Thread.sleep(3000);
	    		confirmEmailAddressTextBox.click();
	    		confirmEmailAddressTextBox.click();
	    		Thread.sleep(3000);
	    		confirmEmailAddressTextBox.sendKeys(inputTestData.get(2));
	    		Thread.sleep(3000);
	    		confirmEmailAddressTextBox.sendKeys(Keys.TAB);
	    		confirmEmailAddressTextBox.sendKeys(Keys.TAB);
	    		Thread.sleep(5000);
	    		result3 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts3++;
	    }
	    		
	}
	
	@FindBy(xpath = "(//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pBusinessWebsite'])")
	WebElement businessWebsiteTextBox;
	public void businessWebsiteTextBoxValidation() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		wait.until(ExpectedConditions.elementToBeClickable(businessWebsiteTextBox));
	    		businessWebsiteTextBox.sendKeys("test");
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    	    }
	    	
		continueButtonClick();
		boolean result3 = false;
		int attempts3 = 0;
	    while(attempts3 < 2) {
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(errorValidationText.get(0)));
	    		if(errorValidationText.get(0).getText().equals(inputTestData.get(29))) {
	                ps.print("Value Matching :"+"Actual Value="+errorValidationText.get(0).getText()+" And Expected Value="+inputTestData.get(29) + "\n");
	    	     }
	    	     else {
	                ps.print("Value Not Matching :"+"Actual Value="+errorValidationText.get(0).getText()+" And Expected Value="+inputTestData.get(29) + "\n");
	    	     }	    		result3 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts3++;
	    	    }
		

		boolean result2 = false;
		int attempts2 = 0;
	    while(attempts2 < 2) {
	        try {
	        	businessWebsiteTextBox.clear();;
	    		businessWebsiteTextBox.sendKeys(inputTestData.get(3));
	    		businessWebsiteTextBox.sendKeys(Keys.TAB);	    		
	    		result2 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts2++;
	    	    }
	    	
		
		
	}
	@FindBy(xpath = "(//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pBusinessName'])")
	WebElement businessNameTextBox;
	public void businessNameTextBox() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		wait.until(ExpectedConditions.elementToBeClickable(businessNameTextBox));
	    		businessNameTextBox.sendKeys("CB Inc");
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	}
	@FindBy(xpath = "(//select[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pCanadaAddress$gPolicyholder$pState'])")
	WebElement provinceDropdown;
	public void provinceDropdown() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select provinceDropdownSelect = new Select(provinceDropdown);
	    		provinceDropdownSelect.selectByValue(inputTestData.get(20));
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	}
	@FindBy(xpath = "(//select[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pBusinessClass'])")
	WebElement businessClassDropdown;
	@FindBy(xpath = "(//select[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pBusinessType'])")
	WebElement businessTypeDropdown;
	@FindBy(xpath = "(//div[@class='field-item dataLabelRead decline_message_dataLabelRead'])[2]")
	WebElement validationMessageText;
	@FindBy(xpath = "//input[@checked='']/following-sibling::label")
	WebElement annualGrossRadioButton;
	
	public void businessClassAndTypeDropdownOptionOneCheck() {
		  if(inputTestData.get(35).contains("English")) {
	        	    	 expectedDropDownValues.add("Select");
	        	    	 expectedDropDownValues.add("All other amusement and recreation industries"); 
	        	    	 expectedDropDownValues.add("Casinos (except casino hotels)"); 
	        	    	 expectedDropDownValues.add("Other gambling industries"); 
	        	      } 
	        	
		        else {
	        	
	        	      
	        		expectedDropDownValues.add("S�lectionner");
	        		expectedDropDownValues.add("Tous les autres secteurs des divertissements et des loisirs"); 
	        		expectedDropDownValues.add("Casinos (sauf les h�tels-casinos)"); 
	        		expectedDropDownValues.add("Autres industries du jeu"); 
	        	      } 
	        	
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
		      
	        	if(businessTypeDropdown.isEnabled()) {
	        		ps.print("Business Type Dropdown is Enabled");
	        	}
	        	else {
	        		ps.print("Business Type Dropdown is Disabled");
	        	}
	    		Select businessClassDropdownSelect = new Select(businessClassDropdown);
	    		businessClassDropdownSelect.selectByIndex(3);
	    		Thread.sleep(5000);
	    		Select businessTypeDropdownSelect = new Select(businessTypeDropdown);	
	    		List<WebElement> businessTypeDropdownOptions  = businessTypeDropdownSelect.getOptions();
	    	      int size = businessTypeDropdownOptions.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(businessTypeDropdownOptions.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+businessTypeDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    	            	ps.print("Value Not Matching :"+"Actual List Value="+businessTypeDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i));
	    	            }
	    	         }
	    	     //Validation Check  
	    	     businessTypeDropdownSelect.selectByIndex(2);
	    	     wait.until(ExpectedConditions.visibilityOf(validationMessageText));
	    	     if(validationMessageText.getText().equals(inputTestData.get(32))) {
 	             ps.print("Value Matching :"+"Actual Value="+validationMessageText.getText()+" And Expected Value="+inputTestData.get(32) + "\n");
 	            }
	    	     else {
	    	    	 ps.print("Value Not Matching :"+"Actual Value="+validationMessageText.getText()+" And Expected Value="+inputTestData.get(32) + "\n");
	    	     }
	    	     if(continueButton.isEnabled()) {
	    	    	 ps.print("Continue button is enabled" + "\n");
	    	     }
		    	     else {
		    	    	 ps.print("Continue is disabled" + "\n");
		    	     }
	    	     //Revenue or Expenses Check
	    	     businessTypeDropdownSelect.selectByIndex(3);
	    	     Thread.sleep(4000);
	    	     if(annualGrossRadioButton.getText().equals(inputTestData.get(30))) {
	 	             ps.print("Value Matching :"+"Actual Value="+annualGrossRadioButton.getText()+" And Expected Value="+inputTestData.get(30) + "\n");
		    	     }
		    	     else {
		 	             ps.print("Value Not Matching :"+"Actual Value="+annualGrossRadioButton.getText()+" And Expected Value="+inputTestData.get(30) + "\n");
		    	     }
	    	      
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	}
	public void businessTierOneSelect() {
		if(inputTestData.get(35).contains("English")) {
        	    	 expectedDropDownValues.add("Select");
        	    	 expectedDropDownValues.add("Animal production"); 
        	    	 expectedDropDownValues.add("Farming"); 
        	    	 expectedDropDownValues.add("Forestry"); 
        	      }
        else {
        	expectedDropDownValues.add("S�lectionner");
        	expectedDropDownValues.add("Production animale"); 
        	expectedDropDownValues.add("Exploitation agricole"); 
        	expectedDropDownValues.add("Foresterie"); 
        	    
        }
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {		        
	    		Select businessClassDropdownSelect = new Select(businessClassDropdown);
	    		businessClassDropdownSelect.selectByIndex(2);
	    		Thread.sleep(5000);
	    		Select businessTypeDropdownSelect = new Select(businessTypeDropdown);	
	    		List<WebElement> businessTypeDropdownOptions  = businessTypeDropdownSelect.getOptions();
	    	      int size = businessTypeDropdownOptions.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(businessTypeDropdownOptions.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+businessTypeDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    	            	ps.print("Value Not Matching :"+"Actual List Value="+businessTypeDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i));
	    	            }
	    	         }
	    	     //Validation Check  
	    	     businessTypeDropdownSelect.selectByIndex(2);
	    	     //Revenue or Expenses Check
	    	     Thread.sleep(4000);
	    	     if(annualGrossRadioButton.getText().equals(inputTestData.get(30))) {
	 	             ps.print("Value Matching :"+"Actual Value="+annualGrossRadioButton.getText()+" And Expected Value="+inputTestData.get(30) + "\n");
		    	     }
		    	     else {
		 	             ps.print("Value Not Matching :"+"Actual Value="+annualGrossRadioButton.getText()+" And Expected Value="+inputTestData.get(30) + "\n");
		    	     }
	    	      
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	}
		
	public void businessTierTwoSelect() {
		 if(inputTestData.get(35).contains("English")) {

	        	
	        	    	 expectedDropDownValues.add("Select");
	        	    	 expectedDropDownValues.add("All other miscellaneous schools and instruction"); 
	        	    	 expectedDropDownValues.add("Automobile driving schools"); 
	        	    	 expectedDropDownValues.add("Colleges, universities, and professional schools"); 
	        	    	 expectedDropDownValues.add("Computer training");
	        	    	 expectedDropDownValues.add("Cosmetology and barber schools");
	        	    	 expectedDropDownValues.add("Elementary and secondary schools");
	        	    	 expectedDropDownValues.add("Exam preparation and tutoring");
	        	    	 expectedDropDownValues.add("Professional and management development training");
	        	    
		        }else {
		        
	        	
	        	    	 expectedDropDownValues.add("S�lectionner");
	        	    	 expectedDropDownValues.add("Tous les autres enseignements et �coles divers"); 
	        	    	 expectedDropDownValues.add("�coles de conduite automobile"); 
	        	    	 expectedDropDownValues.add("Coll�ges, universit�s et �coles professionnelles"); 
	        	    	 expectedDropDownValues.add("Formation informatique");
	        	    	 expectedDropDownValues.add("�coles d�esth�tique et de coiffure pour hommes");
	        	    	 expectedDropDownValues.add("�coles primaires et secondaires");
	        	    	 expectedDropDownValues.add("Pr�paration aux examens et tutorat");
	        	    	 expectedDropDownValues.add("Formation en perfectionnement des professionnels et des gestionnaires");
	        	    }
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
		       
	    		Select businessClassDropdownSelect = new Select(businessClassDropdown);
	    		businessClassDropdownSelect.selectByIndex(6);
	    		Thread.sleep(5000);
	    		Select businessTypeDropdownSelect = new Select(businessTypeDropdown);	
	    		List<WebElement> businessTypeDropdownOptions  = businessTypeDropdownSelect.getOptions();
	    	      int size = businessTypeDropdownOptions.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(businessTypeDropdownOptions.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+businessTypeDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    	            	ps.print("Value Not Matching :"+"Actual List Value="+businessTypeDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i));
	    	            }
	    	         }
	    	     //Validation Check  
	    	     businessTypeDropdownSelect.selectByIndex(2);
	    	     //Revenue or Expenses Check
	    	     Thread.sleep(4000);
	    	     if(annualGrossRadioButton.getText().equals(inputTestData.get(30))) {
	 	             ps.print("Value Matching :"+"Actual Value="+annualGrossRadioButton.getText()+" And Expected Value="+inputTestData.get(30) + "\n");
		    	     }
		    	     else {
		 	             ps.print("Value Not Matching :"+"Actual Value="+annualGrossRadioButton.getText()+" And Expected Value="+inputTestData.get(30) + "\n");
		    	     }
	    	      
	    	     
		    		result1 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts1++;
		    }
		}
	public void businessTierThreeelect() {
		 if(inputTestData.get(35).contains("English")) {

			 expectedDropDownValues.add("Select");
   	    	 expectedDropDownValues.add("Accounting, tax preparation, bookkeeping, and payroll services"); 
   	    	 expectedDropDownValues.add("All other professional, scientific, and technical services"); 
   	    	 expectedDropDownValues.add("Business sssociations"); 
   	    	 expectedDropDownValues.add("Collection agencies");
   	    	 expectedDropDownValues.add("Employment placement agencies and executive search services");
   	    	 expectedDropDownValues.add("Non-profit organizations");
   	    	 expectedDropDownValues.add("Offices of lawyers");
   	          expectedDropDownValues.add("Political organizations");
   	          expectedDropDownValues.add("Professional organizations");
	        	         
	        	      }
	        	
		        else {

       	    	 expectedDropDownValues.add("S�lectionner");
       	    	 expectedDropDownValues.add("Services de comptabilit�, de pr�paration des d�clarations de revenus, de tenue de livres et de paie"); 
       	    	 expectedDropDownValues.add("Tous les autres services professionnels, scientifiques et techniques"); 
       	    	 expectedDropDownValues.add("Associations professionnelles"); 
       	    	 expectedDropDownValues.add("Agences de recouvrement");
       	    	 expectedDropDownValues.add("Placement en emploi");
       	    	 expectedDropDownValues.add("Organismes sans but lucratif");
       	    	 expectedDropDownValues.add("Bureaux d�avocats");
       	          expectedDropDownValues.add("Organisations politiques");
       	          expectedDropDownValues.add("Organisations professionnelles");
	        	         
	        	   
	}
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
		       
	    		Select businessClassDropdownSelect = new Select(businessClassDropdown);
	    		businessClassDropdownSelect.selectByIndex(13);
	    		Thread.sleep(5000);
	    		Select businessTypeDropdownSelect = new Select(businessTypeDropdown);	
	    		List<WebElement> businessTypeDropdownOptions  = businessTypeDropdownSelect.getOptions();
	    	      int size = businessTypeDropdownOptions.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(businessTypeDropdownOptions.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+businessTypeDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    	            	ps.print("Value Not Matching :"+"Actual List Value="+businessTypeDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i));
	    	            }
	    	         }
	    	     //Validation Check  
	    	     businessTypeDropdownSelect.selectByIndex(9);
	    	     //Revenue or Expenses Check
	    	     Thread.sleep(4000);
	    	     if(annualGrossRadioButton.getText().equals(inputTestData.get(31))) {
	 	             ps.print("Value Matching :"+"Actual Value="+annualGrossRadioButton.getText()+" And Expected Value="+inputTestData.get(31) + "\n");
		    	     }
		    	     else {
		 	             ps.print("Value Not Matching :"+"Actual Value="+annualGrossRadioButton.getText()+" And Expected Value="+inputTestData.get(31) + "\n");
		    	     }
	    	      
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	}
	
	public void businessTierFourSelect() {
		   if(inputTestData.get(35).contains("English")) {

	        	
	        	    	 expectedDropDownValues.add("Select");
	        	    	 expectedDropDownValues.add("All other financial investment activities"); 
	        	    	 expectedDropDownValues.add("Commercial banking"); 
	        	    	 expectedDropDownValues.add("Direct insurance (except life, health, and medical) carriers"); 
	        	    	 expectedDropDownValues.add("Insurance agencies and brokerages");
	        	    	 expectedDropDownValues.add("Mortgage and nonmortgage loan brokers");
	        	    	 expectedDropDownValues.add("Other depository credit intermediation");
	        	    	 expectedDropDownValues.add("Other insurance related activities");
	        	    	 expectedDropDownValues.add("Savings institutions");
	        	    	 expectedDropDownValues.add("Securities brokerage");
	        	         
	        	      
	        	
		        }else {
	        	    	 expectedDropDownValues.add("S�lectionner");
	        	    	 expectedDropDownValues.add("Toutes les autres activit�s de placement financier"); 
	        	    	 expectedDropDownValues.add("Services bancaires commerciaux"); 
	        	    	 expectedDropDownValues.add("Assureurs directs (� l�exception des assureurs vie, sant� et soins m�dicaux)"); 
	        	    	 expectedDropDownValues.add("Agences d�assurance et soci�t�s de courtage en assurance");
	        	    	 expectedDropDownValues.add("Courtiers en pr�ts (hypoth�caires et autres)");
	        	    	 expectedDropDownValues.add("Autres organismes d�interm�diation financi�re par le biais de d�p�ts");
	        	    	 expectedDropDownValues.add("Autres activit�s li�es � l�assurance");
	        	    	 expectedDropDownValues.add("�tablissements d��pargne");
	        	    	 expectedDropDownValues.add("Soci�t�s de courtage en valeurs mobili�res");
	        	         
	        	      } 
	        
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
		     
	    		Select businessClassDropdownSelect = new Select(businessClassDropdown);
	    		businessClassDropdownSelect.selectByIndex(7);
	    		Thread.sleep(5000);
	    		Select businessTypeDropdownSelect = new Select(businessTypeDropdown);	
	    		List<WebElement> businessTypeDropdownOptions  = businessTypeDropdownSelect.getOptions();
	    	      int size = businessTypeDropdownOptions.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(businessTypeDropdownOptions.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+businessTypeDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    	            	ps.print("Value Not Matching :"+"Actual List Value="+businessTypeDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i));
	    	            }
	    	         }
	    	     //Validation Check  
	    	     businessTypeDropdownSelect.selectByIndex(8);
	    	     //Revenue or Expenses Check
	    	     Thread.sleep(4000);
	    	     if(annualGrossRadioButton.getText().equals(inputTestData.get(30))) {
	 	             ps.print("Value Matching :"+"Actual Value="+annualGrossRadioButton.getText()+" And Expected Value="+inputTestData.get(30) + "\n");
		    	     }
		    	     else {
		 	             ps.print("Value Not Matching :"+"Actual Value="+annualGrossRadioButton.getText()+" And Expected Value="+inputTestData.get(30) + "\n");
		    	     }
	    	      
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	}
	public void businessTierFiveSelect() {
		if(inputTestData.get(35).contains("English")) {
        	 expectedDropDownValues.add("Select");
        	 expectedDropDownValues.add("Public Administration"); 
         }
        else 
        { 	    
        	expectedDropDownValues.add("S�lectionner");
        	expectedDropDownValues.add("Administration publique"); 
        }	
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	
	    		Select businessClassDropdownSelect = new Select(businessClassDropdown);
	    		businessClassDropdownSelect.selectByIndex(14);
	    		Thread.sleep(5000);
	    		Select businessTypeDropdownSelect = new Select(businessTypeDropdown);	
	    		List<WebElement> businessTypeDropdownOptions  = businessTypeDropdownSelect.getOptions();
	    	      int size = businessTypeDropdownOptions.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(businessTypeDropdownOptions.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+businessTypeDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    	            	ps.print("Value Not Matching :"+"Actual List Value="+businessTypeDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i));
	    	            }
	    	         }
	    	     //Validation Check  
	    	     businessTypeDropdownSelect.selectByIndex(1);
	    	     //Revenue or Expenses Check
	    	     Thread.sleep(4000);
	    	     if(annualGrossRadioButton.getText().equals(inputTestData.get(31))) {
	 	             ps.print("Value Matching :"+"Actual Value="+annualGrossRadioButton.getText()+" And Expected Value="+inputTestData.get(30) + "\n");
		    	     }
		    	     else {
		 	             ps.print("Value Not Matching :"+"Actual Value="+annualGrossRadioButton.getText()+" And Expected Value="+inputTestData.get(30) + "\n");
		    	     }
	    	      
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }}
	
	
	
	
	@FindBy(xpath = "//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pAnnualRevenue_UI']")
	WebElement annualGrossRevenueTextBox;
	@FindBy(xpath = "//input[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pNumberOfEmployees_UI']")
	WebElement noOfEmployeeTextBox;
	public void annualGrossRevenueAndNoOfEmployeesTextBoxValidation() throws InterruptedException {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	Thread.sleep(4000);
	        	annualGrossRevenueTextBox.sendKeys("234.23");
	        	noOfEmployeeTextBox.sendKeys("123.23");
	        	Thread.sleep(4000);
	        	result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	        	
	    wait.until(ExpectedConditions.visibilityOf(errorValidationText.get(0)));
	 		if(errorValidationText.get(0).getText().equals(inputTestData.get(34))) {
	             ps.print("Value Matching :"+"Actual Value="+errorValidationText.get(0).getText()+" And Expected Value="+inputTestData.get(34) + "\n");
	 	     }
	 	     else {
	             ps.print("Value Not Matching :"+"Actual Value="+errorValidationText.get(0).getText()+" And Expected Value="+inputTestData.get(34) + "\n");
	 	     }
	 		
	 		   wait.until(ExpectedConditions.visibilityOf(errorValidationText.get(1)));
	 			if(errorValidationText.get(1).getText().equals(inputTestData.get(33))) {
	 	            ps.print("Value Matching :"+"Actual Value="+errorValidationText.get(1).getText()+" And Expected Value="+inputTestData.get(33) + "\n");
	 		     }
	 		     else {
	 	            ps.print("Value Not Matching :"+"Actual Value="+errorValidationText.get(1).getText()+" And Expected Value="+inputTestData.get(33) + "\n");
	 		     }	    
	        	Thread.sleep(4000);
	        	boolean result2 = false;
	    		int attempts2 = 0;
	    	    while(attempts2 < 2) {
	    	        try {
	        	annualGrossRevenueTextBox.clear();
	        	noOfEmployeeTextBox.clear();
	        	Thread.sleep(3000);
	        	annualGrossRevenueTextBox.sendKeys("234qa");
	        	noOfEmployeeTextBox.sendKeys("123wa");
	        	Thread.sleep(3000);
	        	result2 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts2++;
	    }
	        	
	        	
	    wait.until(ExpectedConditions.visibilityOf(errorValidationText.get(0)));
		if(errorValidationText.get(0).getText().equals(inputTestData.get(34))) {
            ps.print("Value Matching :"+"Actual Value="+errorValidationText.get(0).getText()+" And Expected Value="+inputTestData.get(34) + "\n");
	     }
	     else {
            ps.print("Value Not Matching :"+"Actual Value="+errorValidationText.get(0).getText()+" And Expected Value="+inputTestData.get(34) + "\n");
	     }
		
		   wait.until(ExpectedConditions.visibilityOf(errorValidationText.get(1)));
			if(errorValidationText.get(1).getText().equals(inputTestData.get(33))) {
	            ps.print("Value Matching :"+"Actual Value="+errorValidationText.get(1).getText()+" And Expected Value="+inputTestData.get(33) + "\n");
		     }
		     else {
	            ps.print("Value Not Matching :"+"Actual Value="+errorValidationText.get(1).getText()+" And Expected Value="+inputTestData.get(33) + "\n");
		     }

        	Thread.sleep(4000);

        	boolean result3 = false;
    		int attempts3= 0;
    	    while(attempts3 < 2) {
    	        try {
	        	annualGrossRevenueTextBox.clear();
	        	noOfEmployeeTextBox.clear();
	        	Thread.sleep(3000);
	        	annualGrossRevenueTextBox.sendKeys("10000001");
	        	Thread.sleep(5000);
	        	if(continueButton.isEnabled()) {
	        		ps.print("Continue Button is Enabled");
	        	}
	        	else {
	        		ps.print("Continue Button is Disabled");
	        	}
	        	annualGrossRevenueTextBox.clear();
	        	Thread.sleep(3000);
	        	annualGrossRevenueTextBox.sendKeys(Keys.TAB);
	        	Thread.sleep(3000);
	        	annualGrossRevenueTextBox.sendKeys(inputTestData.get(4));
	        	noOfEmployeeTextBox.sendKeys("123");
	        	Thread.sleep(3000);
	
	        	result3 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts3++;
	    }}
	

	@FindBy(xpath = "//button[@class='Primary_Button_540X54 pzhc pzbutton']")
	WebElement continueButton;
	public void continueButtonClick() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(continueButton));
	        	continueButton.click();
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	}
	}

