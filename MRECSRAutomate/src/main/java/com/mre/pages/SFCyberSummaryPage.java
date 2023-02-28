package com.mre.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.mre.base.BaseSetup;

public class SFCyberSummaryPage extends BaseSetup {
	public SFCyberSummaryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row dataLabelWrite screen_main_header_dataLabelWrite']")
	WebElement quoteSummaryText ;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 remove-all-spacing flex flex-row screen_main_header_dataLabelRead dataLabelRead screen_main_header_dataLabelRead']")
	WebElement premiumAmountText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 flex flex-row centered dataLabelWrite screen_labels_b_18_dataLabelWrite']")
	WebElement productNameText;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row centered dataLabelWrite screen_description_12_dataLabelWrite']")
	WebElement nextMonthPremiumDateText;
	public void getSummaryDetails() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		wait.until(ExpectedConditions.visibilityOf(policyHolderNameText));
	    		ps.print(quoteSummaryText.getText());
	    		ps.print("Premium Amount" + premiumAmountText.getText());
	    		ps.print("Product Name" + productNameText.getText());
	    		ps.print("Next Month Premium Date" + nextMonthPremiumDateText.getText());
	    		Thread.sleep(4000);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	}
	@FindBy(xpath = "//div[@class='content-item content-label item-2 remove-bottom-spacing flex flex-row screen_labels_16_dataLabelWrite dataLabelWrite screen_labels_16_dataLabelWrite']")
	WebElement policyHolderNameText;
	@FindBy(xpath = "//div[@class='content-item content-label item-3 remove-bottom-spacing remove-right-spacing flex flex-row screen_labels_16_dataLabelWrite dataLabelWrite screen_labels_16_dataLabelWrite']")
	WebElement policyHolderPhoneNumberText;
	@FindBy(xpath = "(//div[@class='content-item content-label item-3 remove-bottom-spacing flex flex-row screen_labels_16_dataLabelWrite dataLabelWrite screen_labels_16_dataLabelWrite'])[1]")
	WebElement policyHolderPhoneNumberFrenchText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 remove-bottom-spacing remove-right-spacing flex flex-row screen_labels_16_dataLabelWrite dataLabelWrite screen_labels_16_dataLabelWrite']")
	WebElement policyHolderEmailAddressText;
	@FindBy(xpath = "//div[@class='content-item content-label item-3 remove-bottom-spacing flex flex-row screen_labels_16_dataLabelWrite dataLabelWrite screen_labels_16_dataLabelWrite']")
	WebElement policyHolderAddressText;
	@FindBy(xpath = "(//div[@class='content-item content-label item-3 remove-bottom-spacing flex flex-row screen_labels_16_dataLabelWrite dataLabelWrite screen_labels_16_dataLabelWrite'])[2]")
	WebElement policyHolderAddressFrenchText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 remove-right-spacing remove-bottom-spacing flex flex-row screen_labels_18_dataLabelRead flex-justify-end custom_top_19 dataLabelRead screen_labels_18_dataLabelRead']")
	WebElement policyHolderCoverageAmountText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 remove-right-spacing remove-bottom-spacing flex flex-row screen_labels_18_dataLabelWrite flex-justify-end dataLabelWrite screen_labels_18_dataLabelWrite']")
	WebElement policyHolderDeductibleAmountText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 flex flex-row screen_labels_18_dataLabelRead flex-justify-end margin-r-2x dataLabelRead screen_labels_18_dataLabelRead']")
	WebElement policyHolderPremiumAmountText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 remove-bottom-spacing remove-right-spacing flex flex-row screen_labels_18_dataLabelRead flex-justify-end margin-0_5x dataLabelRead screen_labels_18_dataLabelRead']")
	WebElement policyHolderPremiumAmountFrenchText;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row screen_labels_16_dataLabelWrite margin-t-0_5x margin-r-0_5x dataLabelWrite screen_labels_16_dataLabelWrite']")
	WebElement policyHolderSubTotalText;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row screen_labels_16_dataLabelWrite margin-t-0_5x dataLabelWrite screen_labels_16_dataLabelWrite']")
	WebElement policyHolderSubTotalFrenchText;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row screen_labels_16_dataLabelWrite margin-r-0_5x dataLabelWrite screen_labels_16_dataLabelWrite']")
	WebElement policyHolderTaxText;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row screen_labels_16_dataLabelWrite dataLabelWrite screen_labels_16_dataLabelWrite']")
	WebElement policyHolderTaxFrenchText;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row margin-r-0_5x dataLabelWrite screen_labels_b_18_dataLabelWrite']")
	WebElement policyHolderTotalText;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row dataLabelWrite screen_labels_b_18_dataLabelWrite']")
	WebElement policyHolderTotalFrenchText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 remove-bottom-spacing remove-right-spacing flex flex-row screen_labels_18_dataLabelRead flex-justify-end dataLabelRead screen_labels_18_dataLabelRead']")
	WebElement policyholderCoverageAmountConfirmationFrenchText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 flex flex-row screen_labels_18_dataLabelRead flex-justify-end custom_right_10 dataLabelRead screen_labels_18_dataLabelRead']")
	WebElement policyHolderPremiumAmountConfirmationFrenchText;
	public void getCoverageDetails() throws InterruptedException {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		wait.until(ExpectedConditions.visibilityOf(policyHolderNameText));
	    		ps.print("PolicyHolder Name" + policyHolderNameText.getText());
	    		ps.print("PolicyHolder EmailAddress" + policyHolderEmailAddressText.getText());
	    		ps.print("PolicyHolder Coverage Amount" + policyHolderCoverageAmountText.getText());
	    		ps.print("PolicyHolder Deductible Amount" + policyHolderDeductibleAmountText.getText());
	    		System.out.println("Method 1");
	    		if(inputTestData.get(35).contains("English")) {
	    		ps.print("PolicyHolder PhoneNumber" + policyHolderPhoneNumberText.getText());
	    		ps.print("PolicyHolder Address" + policyHolderAddressText.getText());
	    		ps.print("PolicyHolder Premium Amount" + policyHolderPremiumAmountText.getText());
	    		ps.print("PolicyHolder Sub Total" + policyHolderSubTotalText.getText());
	    		ps.print("PolicyHolder Total" + policyHolderTotalText.getText());
	    		//ps.print("PolicyHolder Tax" + policyHolderTaxText.getText());
	    		Thread.sleep(4000);
	    		}
	    		else {
	    			ps.print("PolicyHolder PhoneNumber" + policyHolderPhoneNumberFrenchText.getText());
		    		ps.print("PolicyHolder Address" + policyHolderAddressFrenchText.getText());
		    		ps.print("PolicyHolder Premium Amount" + policyHolderPremiumAmountFrenchText.getText());
		    		ps.print("PolicyHolder Sub Total" + policyHolderSubTotalFrenchText.getText());
		    		ps.print("PolicyHolder Total" + policyHolderTotalFrenchText.getText());
		    		ps.print("PolicyHolder Tax" + policyHolderTaxFrenchText.getText());
		    		Thread.sleep(4000);
	    		}
	    		
	    		
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	}
	public void getCoverageDetailsConfirmationPageFrench() throws InterruptedException {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		wait.until(ExpectedConditions.visibilityOf(policyHolderNameText));
	    		ps.print("PolicyHolder Name" + policyHolderNameText.getText());
	    		ps.print("PolicyHolder PhoneNumber" + policyHolderPhoneNumberText.getText());
	    		ps.print("PolicyHolder Address" + policyHolderPhoneNumberFrenchText.getText());
	    		ps.print("PolicyHolder EmailAddress" + policyHolderEmailAddressText.getText());
	    		
	    		ps.print("PolicyHolder Coverage Amount" + policyholderCoverageAmountConfirmationFrenchText.getText());
	    		ps.print("PolicyHolder Deductible Amount" + policyHolderDeductibleAmountText.getText());
	    		
	    		ps.print("PolicyHolder Premium Amount" + policyHolderPremiumAmountConfirmationFrenchText.getText());
	    		ps.print("PolicyHolder Sub Total" + policyHolderSubTotalFrenchText.getText());
	    		ps.print("PolicyHolder Total" + policyHolderTotalFrenchText.getText());
	    		ps.print("PolicyHolder Tax" + policyHolderTaxFrenchText.getText());
	    		Thread.sleep(4000);
	    		
	    		
	    		
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	}
	@FindBy(xpath = "(//div[@class=' flex content layout-content-inline_with_no_margin  content-inline_with_no_margin '])")
	List<WebElement> riskText;
	public void getriskText() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		for(int i = 2; i < riskText.size(); i++)
	    		{
	    			ps.print(riskText.get(i).getText());
	    		}	    		
	    		Thread.sleep(4000);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	}
	@FindBy(xpath = "//button[@class='Print_Button_cyber pzhc pzbutton']")
	WebElement printButton;
	public void printButtonClick() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(printButton));
	        	printButton.click();
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	}
	
	@FindBy(xpath = "(//button[@class='Checkout_Button pzhc pzbutton'])[1]")
	WebElement checkoutButton;
	public void checkoutButtonClick() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
	        	checkoutButton.click();
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	}
	
	@FindBy(xpath = "(//a[@class='Link_M'])[1]")
	WebElement editLink;
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
	@FindBy(xpath = "(//a[@class='Link_M'])[2]")
	WebElement coverageUpdateLink;
	public void coverageUpdateLinkClick() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(coverageUpdateLink));
	        	coverageUpdateLink.click();
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	}
	
	
	@FindBy(xpath = "(//input[@type = 'checkbox'])[1]")
	WebElement exclusionsCheckBox;
	@FindBy(xpath = "//button[@name = 'DisplayExclusionsAndLimitationsWrapper_pyWorkPage_16']")
	WebElement exclusionConfirmCheckBox;
	public void exclusionsCheckBoxClick()
	{
		wait.until(ExpectedConditions.elementToBeClickable(exclusionsCheckBox));
		exclusionsCheckBox.click();
	}
	public void exclusionConfirmCheckBoxClick()
	{
		wait.until(ExpectedConditions.elementToBeClickable(exclusionConfirmCheckBox));
		exclusionConfirmCheckBox.click();
	}
}
