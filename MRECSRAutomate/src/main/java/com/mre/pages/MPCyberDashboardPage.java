package com.mre.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.mre.base.BaseSetup;

public class MPCyberDashboardPage extends BaseSetup {
	public MPCyberDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "(//span[@class = 'menu-item-title'])[1]")
	public static WebElement dashboardTab;
	public static void dashboardTab()
	{
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(dashboardTab));
	        	dashboardTab.click();	        	
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	}
	//Get Product Details
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-bottom-spacing remove-left-spacing remove-right-spacing flex flex-row mp_label_21px_dataLabelWrite custom_breakWord custom_alignstart dataLabelWrite mp_label_21px_dataLabelWrite'])")
	WebElement dashboardProductOneNameText;
	
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row mp_label_21px_dataLabelWrite flex-align-end flex-dir-column right-aligned dataLabelWrite mp_label_21px_dataLabelWrite'])[1]")
	WebElement dashboardProductOnePremiumText;
	
	@FindBy(xpath = "(//div[@class='content-item content-label item-2 remove-all-spacing flex flex-row flex-align-end flex-dir-column right-aligned custom_rightalign dataLabelRead screen_labels_14_dataLabelRead'])[1]")
	WebElement dashboardProductOneNextPaymentText;
	
	@FindBy(xpath = "(//div[@class='content-item content-field item-2 remove-bottom-spacing flex flex-row standard_dataLabelRead flex-nowrap dataValueRead'])")
	WebElement dashboardProductOnePolicyNumberText;
	
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-left-spacing remove-bottom-spacing flex flex-row mpdb_14px_bold_with_background_dataLabelWrite left-aligned !important dataLabelWrite mpdb_14px_bold_with_background_dataLabelWrite'])")
	WebElement dashboardProductOneCarrierNameText;
	
	
	public void getProductOneDetailsText() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	       try {
	        	wait.until(ExpectedConditions.visibilityOf(dashboardProductOneNameText));
	        	ps.print("Product Details " + "\n");
	        	ps.print("Product One Name : " + dashboardProductOneNameText.getText() + "\n");
	        	ps.print("Product One Premium  : " + dashboardProductOnePremiumText.getText() + "\n");
	        	ps.print("Product One NextPayment : " + dashboardProductOneNextPaymentText.getText() + "\n");
	        	ps.print("Product One PolicyNumber : " + dashboardProductOnePolicyNumberText.getText() + "\n");
	        	ps.print("Product One CarrierName : " + dashboardProductOneCarrierNameText.getText() + "\n");
	       	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	
	@FindBy(xpath = "(//h1[@style = 'font:inherit;margin:0!important;color:inherit;text-align:inherit;text-decoration:inherit;'])")
	WebElement helpCenterText;
	public void getHelpCenter() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(helpCenterText));
	        	ps.print("Help Center: " + helpCenterText.getText());
	        	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	
	//Gear Icon  - Claims Raise and Cancel policy 
	@FindBy(xpath = "(//div[@class=' flex content layout-content-stacked  content-stacked '])[5]")
	WebElement dashboardProductOneSection;
	@FindBy(xpath = "(//i[@class='icons'])[4]")
	WebElement productOneGearIcon;
	
	public void dashboardProductOneSectionClick()
	{		
		boolean result1 = false;
		int attempts1 = 0;
		while(attempts1 < 2) {
		try {
    	wait.until(ExpectedConditions.elementToBeClickable(productOneGearIcon));
		wait.until(ExpectedConditions.elementToBeClickable(dashboardProductOneSection));
		dashboardProductOneSection.click();

		result1 = true;
        break;
    } catch(Exception e) {
    }
    attempts1++;
		}


	}
	public void productOneGearIconClick()
	{		
		boolean result1 = false;
		int attempts1 = 0;
		while(attempts1 < 2) {
			try {
    	wait.until(ExpectedConditions.elementToBeClickable(productOneGearIcon));
		wait.until(ExpectedConditions.elementToBeClickable(productOneGearIcon));
		productOneGearIcon.click();
		result1 = true;
        break;
    } catch(Exception e) {
    }
    attempts1++;
	}
	}
	
	@FindBy(xpath = "(//a[@class='menu-item-anchor '])[6]")
	WebElement newClaimNoticeButton;
	public void newClaimNoticeButtonClick()
	{		
		boolean result1 = false;
		int attempts1 = 0;
		while(attempts1 < 2) {
			try {
		wait.until(ExpectedConditions.elementToBeClickable(newClaimNoticeButton));
		newClaimNoticeButton.click();
		result1 = true;
        break;
    } catch(Exception e) {
    }
    attempts1++;
	}
}
	@FindBy(xpath = "(//a[@class='menu-item-anchor '])[7]")
	WebElement cancelMyPolicyButton;
	public void cancelMyPolicyButtonClick()
	{		
		boolean result1 = false;
		int attempts1 = 0;
		while(attempts1 < 2) {
			try {
		wait.until(ExpectedConditions.elementToBeClickable(cancelMyPolicyButton));
		cancelMyPolicyButton.click();
		result1 = true;
        break;
    } catch(Exception e) {
    }
    attempts1++;
	}
	}

	//Recent Activity
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-top-spacing   dataLabelRead labels_16b_mp_dataLabelRead flex flex-row '])[1]")
	WebElement recentActivityOneAfterPurchase;
	@FindBy(xpath = "(//div[@class='content-item content-label item-2   dataLabelRead labels_14_grey_dataLabelRead flex flex-row '])[1]")
	WebElement recenetActivityProductNameOneAfterPurchase;
	@FindBy(xpath = "(//span[@class='mpbd_datetext_14px'])[2]")
	WebElement recenetActivityDateOneAfterPurchase;
	@FindBy(xpath = "(//a[@class='MPDBLink'])[1]")
	WebElement viewYourNewCoverageLink;
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-top-spacing   dataLabelRead labels_16b_mp_dataLabelRead flex flex-row '])[2]")
	WebElement recentActivityTwoAfterPurchase;
	@FindBy(xpath = "(//div[@class='content-item content-label item-2   dataLabelRead labels_14_grey_dataLabelRead flex flex-row '])[2]")
	WebElement recenetActivityProductNameTwoAfterPurchase;
	@FindBy(xpath = "(//span[@class='mpbd_datetext_14px'])[3]")
	WebElement recenetActivityDateTwoAfterPurchase;
	@FindBy(xpath = "(//a[@class='MPDBLink'])[2]")
	WebElement downloadYourApplicationLink;
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-top-spacing   dataLabelRead labels_16b_mp_dataLabelRead flex flex-row '])[3]")
	WebElement recentActivityThreAfterPurchase;
	@FindBy(xpath = "(//div[@class='content-item content-label item-2   dataLabelRead labels_14_grey_dataLabelRead flex flex-row '])[3]")
	WebElement recenetActivityProductNameThreeAfterPurchase;
	@FindBy(xpath = "(//span[@class='mpbd_datetext_14px'])[4]")
	WebElement recenetActivityDateThreeAfterPurchase;
	
	public void getFirstRecentActivityText() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(recentActivityOneAfterPurchase));
	        	ps.print("First Recent Activity Details " + "\n");
	        	ps.print("Activity Name : " + recentActivityOneAfterPurchase.getText() + "\n");
	        	ps.print("Product Name : " + recenetActivityProductNameOneAfterPurchase.getText() + "\n");
	        	ps.print("Purchased Date : " + recenetActivityDateOneAfterPurchase.getText() + "\n");
	        	ps.print("Download Link Name : " + viewYourNewCoverageLink.getText() + "\n");
	        	
	        	

	        	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	public void viewYourNewCoverageLinkClick()
	{		
		boolean result1 = false;
		int attempts1 = 0;
		while(attempts1 < 2) {
			try {
		wait.until(ExpectedConditions.elementToBeClickable(viewYourNewCoverageLink));
		viewYourNewCoverageLink.click();
    	//Runtime.getRuntime().exec(readConfig.getDocumentOne());
		result1 = true;
        break;
    } catch(Exception e) {
    }
    attempts1++;
	}
	}

	public void getSecondRecentActivityText() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(recentActivityTwoAfterPurchase));
	        	ps.print("Second Recent Activity Details " + "\n");
	        	ps.print("Activity Name : " + recentActivityTwoAfterPurchase.getText() + "\n");
	        	ps.print("Product Name : " + recenetActivityProductNameTwoAfterPurchase.getText() + "\n");
	        	ps.print("Purchased Date : " + recenetActivityDateTwoAfterPurchase.getText() + "\n");
	        	ps.print("Download Link Name : " + downloadYourApplicationLink.getText() + "\n");
	      //  	downloadYourApplicationLink.click();
	        	

	        	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	public void getThirdRecentActivityText() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(recentActivityThreAfterPurchase));
	        	ps.print("Third Recent Activity Details " + "\n");
	        	ps.print("Activity Name : " + recentActivityThreAfterPurchase.getText() + "\n");
	        	ps.print("Product Name : " + recenetActivityProductNameThreeAfterPurchase.getText() + "\n");
	        	ps.print("Purchased Date : " + recenetActivityDateThreeAfterPurchase.getText() + "\n");
	          	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	@FindBy(xpath = "(//a[@class='MPDBLink_16px_white'])[1]")
	WebElement viewAllActivateCoverageLink;
	public void viewAllActivateCoverageLinkClick() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(viewAllActivateCoverageLink));
	        	viewAllActivateCoverageLink.click();
	          	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	//Cancel Popup
	@FindBy(xpath = "//div[@class='content-item content-label item-2 flex flex-row heading_2_dataLabelWrite dataLabelWrite heading_2_dataLabelWrite']")
	WebElement cancelPolicyPopupHeaderText;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing flex flex-row dataLabelWrite']")
	WebElement cancelPolicyPopupSubheaderText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 flex flex-row km_labels_16_dataLabelWrite dataLabelWrite km_labels_16_dataLabelWrite']")
	WebElement refundAmountText;
	@FindBy(xpath = "//select[@name='$PTempReason$pCancelPolicyReason']")
	WebElement cancelPolicyReason;
	@FindBy(xpath = "//button[@class='Life_Event_ACCOUNTTABSAVE pzhc pzbutton']")
	WebElement cancelPolicyButton;
	public void cancelPolicyButtonClick() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(cancelPolicyButton));
	        	cancelPolicyButton.click();
	          	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	@FindBy(xpath = "//button[@class='ACCOUNTTABCancelFull_white_bg pzhc pzbutton']")
	WebElement iChangedMyMindButton;
	public void iChangedMyMindButtonClick() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(iChangedMyMindButton));
	        	wait.until(ExpectedConditions.elementToBeClickable(iChangedMyMindButton));

	        	iChangedMyMindButton.click();
	          	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	public void cancelPolicy() {
		 if(inputTestData.get(3).contains("English")) {
	    	 expectedDropDownValues.add("Purchased a replacement insurance policy");
	    	 expectedDropDownValues.add("Too expensive"); 
	    	 expectedDropDownValues.add("No longer need this policy"); 
	    	 expectedDropDownValues.add("Other"); 
	      } 
	
    else {
	
	      
		expectedDropDownValues.add("S�lectionner");
		expectedDropDownValues.add("Tous les autres secteurs des divertissements et des loisirs"); 
		expectedDropDownValues.add("Casinos (sauf les h�tels-casinos)"); 
		expectedDropDownValues.add("Autres industries du jeu"); 
	      } 
	
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	
	        	
	        	ps.print("Cancel Policy PopUp Text : "  + cancelPolicyPopupHeaderText.getText() + cancelPolicyPopupSubheaderText.getText());
	        	ps.print("Refund Amount : " + refundAmountText.getText());
	        	Select cancelPolicyReasonSelect = new Select(cancelPolicyReason);
	    		List<WebElement> cancelPolicyReasonSelectOption  = cancelPolicyReasonSelect.getOptions();
	    	      int size = cancelPolicyReasonSelectOption.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(cancelPolicyReasonSelectOption.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+cancelPolicyReasonSelectOption.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    	            	ps.print("Value Not Matching :"+"Actual List Value="+cancelPolicyReasonSelectOption.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i));
	    	            }
	    	         }	    
	    	      cancelPolicyReasonSelect.selectByIndex(1);
	    	      
	    	      result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	    cancelPolicyButtonClick();
		
	}
	//ResetPassword
	@FindBy(xpath  = "//a[@class = 'account']")
	WebElement forgotPasswordLink;
	
	@FindBy(id = "emailAddress")
	WebElement emailAddressTextBox;
	
	@FindBy(xpath = "//button[@form = 'forgotPasswordForm']")
	WebElement submitButton;
	public void resetPassword()
	{		
		boolean result1 = false;
		int attempts1 = 0;
		while(attempts1 < 2) {
			try {
		wait.until(ExpectedConditions.elementToBeClickable(forgotPasswordLink));
		forgotPasswordLink.click();
		Thread.sleep(3000);
		emailAddressTextBox.sendKeys("test");
		submitButton.click();
		Thread.sleep(3000);
		emailAddressTextBox.clear();
		emailAddressTextBox.sendKeys(inputTestData.get(4));
		Thread.sleep(3000);
		submitButton.click();

		
		result1 = true;
        break;
    } catch(Exception e) {
    }
    attempts1++;
	}
	}
	@FindBy(xpath = "//a[@class='MP_SignOut_Link']")
	WebElement signOutLink;
	public void signOutLinkClick()
	{		
		boolean result1 = false;
		int attempts1 = 0;
		while(attempts1 < 2) {
			try {
		wait.until(ExpectedConditions.elementToBeClickable(signOutLink));
		signOutLink.click();
		result1 = true;
        break;
    } catch(Exception e) {
    }
    attempts1++;
	}
	}
}
