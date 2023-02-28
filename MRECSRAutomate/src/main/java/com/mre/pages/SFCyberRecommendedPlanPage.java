package com.mre.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.mre.base.BaseSetup;

public class SFCyberRecommendedPlanPage extends BaseSetup {
	public SFCyberRecommendedPlanPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//div[@class='content-item content-label item-1 flex flex-row padding-t-2x padding-l-1x dataLabelWrite screen_labels_16_dataLabelWrite']")
	List<WebElement> riskName;
	@FindBy(xpath = "//div[@class='rteReadOnlyWithoutTB']")
	List<WebElement> riskDescription;
	
	public void getRiskDetails() {
		wait.until(ExpectedConditions.visibilityOfAllElements(riskName));
		for(int i = 0 ; i<riskName.size() ; i++ ) {
			ps.print(riskName.get(i).getText() + "\n");
		}
		for(int i = 0 ; i<riskDescription.size() ; i++ ) {
			ps.print(riskDescription.get(i).getText() + "\n");
		}
	}
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row screen_labels_18_bold_dataLabelWrite padding-t-1x dataLabelWrite screen_labels_18_bold_dataLabelWrite']")
	WebElement  productNameText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 remove-all-spacing flex flex-row screen_labels_16_dataLabelWrite padding-t-2x padding-b-2x dataLabelWrite screen_labels_16_dataLabelWrite']")
	WebElement  eligibilityText;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row padding-l-x padding-b-0 margin-l-0_5x dataLabelWrite screen_lables_24_b_dataLabelWrite']")
	WebElement cyberCoverageText ;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing flex flex-row standard_dataLabelWrite padding-l-x margin-l-0_5x dataLabelWrite']")
	WebElement  deductibleText;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row padding-b-0 dataLabelWrite screen_lables_24_b_dataLabelWrite']")
	WebElement cyberCoverageFrenchText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 remove-bottom-spacing remove-right-spacing flex flex-row standard_dataLabelWrite padding-l-x margin-l-0_5x dataLabelWrite']")
	WebElement  deductibleFrenchText;
	
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing flex flex-row screen_labels_b_16_dataLabelWrite padding-l-x margin-l-0_5x dataLabelWrite screen_labels_b_16_dataLabelWrite']")
	WebElement  monthlyPremiumText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 remove-bottom-spacing remove-right-spacing flex flex-row padding-l-x margin-l-0_5x dataLabelWrite screen_labels_b_16_dataLabelWrite']")
	WebElement  yearlyPremiumText;
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row screen_labels_b_16_dataLabelWrite dataLabelWrite screen_labels_b_16_dataLabelWrite'])[1]")
	WebElement  cartProductNameText;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 flex flex-row screen_labels_12_dataLabelWrite dataLabelWrite screen_labels_12_dataLabelWrite']")
	WebElement  cartCyberCoverageText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 flex flex-row screen_labels_12_dataLabelWrite dataLabelWrite screen_labels_12_dataLabelWrite']")
	WebElement  cartDeductiblesText;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-left-spacing remove-right-spacing remove-top-spacing remove-bottom-spacing flex flex-row dataLabelRead screen_labels_b_16_dataLabelRead']")
	WebElement  cartMonthlyPremiumText;
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-left-spacing remove-right-spacing remove-top-spacing remove-bottom-spacing flex flex-row dataLabelRead screen_labels_b_16_dataLabelRead'])[2]")
	WebElement  cartYearlyPremiumText;
	@FindBy(xpath = "(//div[@class='content-item content-field item-1 remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row padding-r-1x dataValueRead'])[1]")
	WebElement  cartTaxText;
	@FindBy(xpath = "(//div[@class='content-item content-field item-1 remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row padding-r-1x dataValueRead'])[2]")
	WebElement  cartTotalPremiumText;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 flex flex-row right-aligned padding-r-1x dataLabelWrite screen_labels_10_dataLabelWrite']")
	WebElement  cartLogoText;
	public void getRecommendedCoverageMonthlyDetails() {
		ps.print("Product Name : " + productNameText.getText() + "\n");
		ps.print("Eligibility : " + eligibilityText.getText() + "\n");
		if(inputTestData.get(35).contains("English")) {
			ps.print("Cyber Coverage Amount : " + cyberCoverageText.getText() + "\n");
			ps.print("Deductible Amount : " + deductibleText.getText() + "\n");

		}
		else {
			ps.print("Cyber Coverage Amount : " + cyberCoverageFrenchText.getText() + "\n");
			ps.print("Deductible Amount : " + deductibleFrenchText.getText() + "\n");

		}
		ps.print("Montly Premium Amount: " + monthlyPremiumText.getText() + "\n");
		ps.print("Yearly Premium Amount : " + yearlyPremiumText.getText() + "\n");
		ps.print("Cart Product Name : " + cartProductNameText.getText() + "\n");
		ps.print("Cart Cyber Coverage Amount : " + cartCyberCoverageText.getText() + "\n");
		ps.print("Cart Deductible Amount : " + cartDeductiblesText.getText() + "\n");
		ps.print("Cart Premium Amount: " + cartMonthlyPremiumText.getText() + "\n");
		ps.print("Cart Tax Amount : " + cartTaxText.getText() + "\n");
		ps.print("Cart Total Premium Amount : " + cartTotalPremiumText.getText() + "\n");
		ps.print("Cart Logo  : " + cartLogoText.getText() + "\n");
	
	}
	@FindBy(xpath = "//a[@class='Link_S_12']")
	WebElement showYearlyLink;
	public void showYearlyLinkClick() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(showYearlyLink));
	        	showYearlyLink.click();
	        	Thread.sleep(3000);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }

	}
	public void getRecommendednCoverageYearlyDetails() {
		ps.print("Cart Yearly Tax Amount : " + cartTaxText.getText() + "\n");
		ps.print("Cart Yearly Total Premium Amount : " + cartTotalPremiumText.getText() + "\n");
		ps.print("Cart Yearly Premium Amount: " + cartYearlyPremiumText.getText() + "\n");
	}

	@FindBy(xpath = "(//a[@class='Link_S'])[4]")
	WebElement  exclusionsAndLimitationLink;
	public void exclusionsAndLimitationLink() throws InterruptedException {
		
	        	wait.until(ExpectedConditions.elementToBeClickable(exclusionsAndLimitationLink));
	        	exclusionsAndLimitationLink.click();
	        	Thread.sleep(5000);
	        	Set<String> wh =  driver.getWindowHandles();
	    		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    		Iterator<String> it = wh.iterator();
	    		String parentId;
	    		parentId  = it.next();
	    		for (int j = 0 ; j <  wh.size() ; j++)
	    		{
	    		if(it.hasNext())
	    		{
	    		String childId = it.next();
	    		driver.switchTo().window(childId);
	    		
	    		}
	    		}
	    		driver.switchTo().window(parentId);
	    		

	}
	@FindBy(xpath = "(//a[@class='Link_S'])[2]")
	WebElement  editLink;
	public void editLinkClick() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(editLink));
	        	editLink.click();
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }

	}
	@FindBy(xpath = "(//button[@class='Primary_Button_260X44 pzhc pzbutton'])[1]")
	WebElement buyButton;
	public void buyButtonClick() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(buyButton));
	        	buyButton.click();
	        	result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }   
	    }
	   
		@FindBy(xpath = "(//button[@class='Cyber_Primary_Button_260X_44_EMPTY_BACKGROUND pzhc pzbutton'])[1]")
		WebElement  customizeYourPlanLimitButton;
		public void customizeYouPlanLimitButtonClick() {
			boolean result1 = false;
			int attempts1 = 0;
		    while(attempts1 < 2) {
		        try {
		        	wait.until(ExpectedConditions.elementToBeClickable(customizeYourPlanLimitButton));
		        	customizeYourPlanLimitButton.click();
		        	Thread.sleep(8000);
		    		result1 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts1++;
		    }

		}
		@FindBy(xpath = "//select[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pAnnualAggregateLimit']")
		WebElement coverageDropdown;
		public void defaultCoverageCheclk() {
			boolean result1 = false;
			int attempts1 = 0;
		    while(attempts1 < 2) {
		        try {
		        	List<String> expectedDropDownValues = new ArrayList<String>()
		        	{ 
		        	     { 
		        	    	 add("Select");
		        	          add(inputTestData.get(8)); 
		        	          add(inputTestData.get(9)); 
		        	          add(inputTestData.get(10)); 
		        	          add(inputTestData.get(11)); 
		        	          add(inputTestData.get(12)); 
		        	      } 
		        	};
		        	wait.until(ExpectedConditions.elementToBeClickable(coverageDropdown));
		        	Select coverageDropdownSelect = new Select(coverageDropdown);
		        	//Default COverage CHeck
		        	if(coverageDropdownSelect.getFirstSelectedOption().getAttribute("value").equals(inputTestData.get(6))){
			             ps.print("Value Matching :"+"Actual Value="+coverageDropdownSelect.getFirstSelectedOption().getAttribute("value")+" And Expected Value="+inputTestData.get(6) + "\n");
		        		
		        	}
		        	else {
			             ps.print("Value Matching :"+"Actual Value="+coverageDropdownSelect.getFirstSelectedOption().getAttribute("value")+" And Expected Value="+inputTestData.get(6) + "\n");
		        	}
		        	//Covergae Dropdown Check 
		    		List<WebElement> coverageDropdownOptions  = coverageDropdownSelect.getOptions();
		    	      int size = coverageDropdownOptions.size();
		    	      for(int i =0; i<size ; i++){
		    	         if(coverageDropdownOptions.get(i).getAttribute("value").equals(expectedDropDownValues.get(i).toString())) {
		    	             ps.print("Value Matching :"+"Actual List Value="+coverageDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i) + "\n");
		    	            }else {
		    	            	ps.print("Value Not Matching :"+"Actual List Value="+coverageDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i));
		    	            }
		    	         }
		    	    
		        	result1 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts1++;
		    }
			
		}
		
		@FindBy(xpath = "//select[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pDeductible']")
		WebElement deductibleDropdown;
		public void defaultDeductiblesCheck() {
			boolean result1 = false;
			int attempts1 = 0;
		    while(attempts1 < 2) {
		        try {
		        	List<String> expectedDropDownValues = new ArrayList<String>()
		        	{ 
		        	     { 
		        	    	 add("Select");
		        	          add(inputTestData.get(13)); 
		        	          add(inputTestData.get(14)); 
		        	          add(inputTestData.get(15)); 
		        	          add(inputTestData.get(16)); 
		        	          add(inputTestData.get(22)); 
		        	          add(inputTestData.get(23)); 

		        	      } 
		        	};
		        	wait.until(ExpectedConditions.elementToBeClickable(deductibleDropdown));
		        	Select deductibleDropdownSelect = new Select(deductibleDropdown);
		        	if(deductibleDropdownSelect.getFirstSelectedOption().getAttribute("value").equals(inputTestData.get(7))){
			             ps.print("Value Matching :"+"Actual Value="+deductibleDropdownSelect.getFirstSelectedOption().getAttribute("value")+" And Expected Value="+inputTestData.get(7) + "\n");
		        		
		        	}
		        	else {
			             ps.print("Value Matching :"+"Actual Value="+deductibleDropdownSelect.getFirstSelectedOption().getAttribute("value")+" And Expected Value="+inputTestData.get(7) + "\n");
		        	}
		    		List<WebElement> deductibleDropdownOptions  = deductibleDropdownSelect.getOptions();
		    	      int size = deductibleDropdownOptions.size();
		    	      for(int i =0; i<size ; i++){
		    	         if(deductibleDropdownOptions.get(i).getAttribute("value").equals(expectedDropDownValues.get(i).toString())) {
		    	             ps.print("Value Matching :"+"Actual List Value="+deductibleDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i) + "\n");
		    	            }else {
		    	            	ps.print("Value Not Matching :"+"Actual List Value="+deductibleDropdownOptions.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i));
		    	            }
		    	         }
		        	
		        	result1 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts1++;
		    }
			
			
		}
		@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing flex flex-row dataLabelWrite screen_labels_b_16_dataLabelWrite'])[2]")
		WebElement monthlyPremiumValue;
		@FindBy(xpath = "(//div[@class='content-item content-label item-2 remove-bottom-spacing remove-right-spacing flex flex-row dataLabelWrite screen_labels_b_16_dataLabelWrite'])[1]")
		WebElement yearlyPremiumValue;
		@FindBy(xpath = "(//div[@class='content-item content-label item-2 remove-bottom-spacing remove-right-spacing flex flex-row dataLabelWrite screen_labels_30_b_dataLabelWrite'])[1]")
		WebElement premiumValue;
		public void updateCoverageAndDeductibleDropdownValue() {
			boolean result1 = false;
			int attempts1 = 0;
		    while(attempts1 < 2) {
		        try {
		        	wait.until(ExpectedConditions.elementToBeClickable(coverageDropdown));
		        	Select coverageDropdownSelect = new Select(coverageDropdown);
		        	coverageDropdownSelect.selectByValue(inputTestData.get(17));
		        	Thread.sleep(5000);
		        	Select deductibleDropdownSelect = new Select(deductibleDropdown);
		        	deductibleDropdownSelect.selectByValue(inputTestData.get(18));
		        	Thread.sleep(5000);
		        	ps.print(monthlyPremiumValue.getText());
		        	ps.print(yearlyPremiumValue.getText());
		        	ps.print(premiumValue.getText());

		        	result1 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts1++;
		    }

		}
		public void updateCoverageAfterSummary() {
			boolean result1 = false;
			int attempts1 = 0;
		    while(attempts1 < 2) {
		        try {
		        	wait.until(ExpectedConditions.elementToBeClickable(coverageDropdown));
		        	Select coverageDropdownSelect = new Select(coverageDropdown);
		        	coverageDropdownSelect.selectByValue(inputTestData.get(19));
		        	Thread.sleep(5000);
		        	ps.print(monthlyPremiumValue.getText());
		        	ps.print(yearlyPremiumValue.getText());
		        	ps.print(premiumValue.getText());

		        	result1 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts1++;
		    }

		}
		@FindBy(xpath = "(//button[@class='Primary_Button_260X44 pzhc pzbutton'])[2]")
		WebElement buyButtonAfterCustomizeYourPlan;
		public void buyButtonAfterCustomizeYourPlan() {
			boolean result1 = false;
			int attempts1 = 0;
		    while(attempts1 < 2) {
		        try {
		        	wait.until(ExpectedConditions.elementToBeClickable(buyButtonAfterCustomizeYourPlan));
		        	buyButtonAfterCustomizeYourPlan.click();
		        	result1 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts1++;
		    }   
		    }
		//Save Quote
		  @FindBy(xpath = "//div[@class='content-item content-label item-2 remove-all-spacing flex flex-row centered padding-r-1x dataLabelWrite can_save_this_quote_dataLabelWrite']")
			WebElement saveQuoteButton;
			@FindBy(xpath = "//button[@class='Primary_Button_M pzhc pzbutton']")
			WebElement saveQuoteSubmitButton;
			@FindBy(name = "$PTempApplication$pBusinessDetails$pEmailAddress")
			WebElement saveQuoteEmailAddress;
			@FindBy(name = "$PTempApplication$pBusinessDetails$pConfirmEmailAddress")
			WebElement saveQuoteConfirmEmailAddress;

			
			public void saveQuoteWithoutValidation() {
				 boolean result = false;
					int attempts = 0;
				    while(attempts < 2) {
				        try {
				        	Thread.sleep(2000);
				        	wait.until(ExpectedConditions.elementToBeClickable(saveQuoteButton));
				        	saveQuoteButton.click();	
				        	String confirmemailaddress= saveQuoteEmailAddress.getAttribute("value");
				        	saveQuoteSubmitButton.click();
				        	Thread.sleep(2000);
				    		result = true;
				            break;
				        } catch(Exception e) {
				        }
				        attempts++;
				    }
			}
		
}
