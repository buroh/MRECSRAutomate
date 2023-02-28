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

import com.mre.base.BaseSetup;

public class MPCyberProductsPage extends BaseSetup {
	public MPCyberProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	//Product Overview Tab
	@FindBy(xpath = "(//span[@class = 'menu-item-title'])[2]")
	public static WebElement productsTab;
	public static void productsTab()
	{
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(productsTab));
	        	productsTab.click();	        	
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	}
	//Get Product Details
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row mp_label_21px_dataLabelWrite dataLabelWrite mp_label_21px_dataLabelWrite'])")
	WebElement productOneNameText;
	
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 flex flex-row mp_label_21px_dataLabelWrite dataLabelWrite mp_label_21px_dataLabelWrite'])")
	WebElement productOnePremiumText;
	
	@FindBy(xpath = "(//div[@class='content-item content-label item-2 remove-all-spacing flex flex-row flex-align-end flex-dir-column right-aligned custom_rightalign dataLabelRead screen_labels_14_dataLabelRead'])[2]")
	WebElement productOneNextPaymentText;
	
	@FindBy(xpath = "(//div[@class='content-item content-label item-2 remove-bottom-spacing remove-right-spacing flex flex-row screen_labels_14_dataLabelRead dataLabelRead screen_labels_14_dataLabelRead'])")
	WebElement productOnePolicyNumberText;
	
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-left-spacing remove-bottom-spacing flex flex-row flex-wrap left-aligned dataLabelWrite cbmpdb_14px_bold_with_background_2_dataLabelWrite'])")
	WebElement productOneCarrierNameText;
	
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-left-spacing remove-right-spacing flex flex-row dataLabelRead _dataLabelRead'])")
	WebElement productOneAnniversaryDateText;
	
	
	public void getMemberProductOneDetailsText() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(productOneNameText));
	        	ps.print("Product Details " + "\n");
	        	ps.print("Product One Name : " + productOneNameText.getText() + "\n");
	        	ps.print("Product One Premium  : " + productOnePremiumText.getText() + "\n");
	        	ps.print("Product One NextPayment Date: " + productOneNextPaymentText.getText() + "\n");
	        	ps.print("Product One PolicyNumber : " + productOnePolicyNumberText.getText() + "\n");
	        	ps.print("Product One CarrierName : " + productOneCarrierNameText.getText() + "\n");
	        	ps.print("Product One Anniversary Date: " + productOneAnniversaryDateText.getText() + "\n");

	        	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	
	public void getTerminatedProductDetailsText() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(productOneNameText));
	        	ps.print("Product Details " + "\n");
	        	ps.print("Product One Name : " + productOneNameText.getText() + "\n");
	        	ps.print("Product One Premium  : " + productOnePremiumText.getText() + "\n");
	        	ps.print("Product One PolicyNumber : " + productOnePolicyNumberText.getText() + "\n");
	        	ps.print("Product One CarrierName : " + productOneCarrierNameText.getText() + "\n");
	        	ps.print("Product One Terminated Date: " + productOneAnniversaryDateText.getText() + "\n");

	        	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	
	
	
	@FindBy(xpath = "(//div[@class=' flex content layout-content-stacked_with_no_margin  content-stacked_with_no_margin '])[2]")
	WebElement coverageProductOneSection;
	
	public void coverageProductOneSectionClick() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(coverageProductOneSection));
	        	coverageProductOneSection.click();
	        	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	
	@FindBy(xpath = "(//div[@role='tab'])[1]")
	WebElement activeTab;
	public void activeTabClick()
	{		
		boolean result1 = false;
		int attempts1 = 0;
		while(attempts1 < 2) {
			try {
		wait.until(ExpectedConditions.elementToBeClickable(activeTab));
		activeTab.click();
		result1 = true;
        break;
    } catch(Exception e) {
    }
    attempts1++;
	}
}
	@FindBy(xpath = "(//div[@role='tab'])[2]")
	WebElement terminationTab;
	
	public void terminationTabClick()
	{		
		boolean result1 = false;
		int attempts1 = 0;
		while(attempts1 < 2) {
			try {
		wait.until(ExpectedConditions.elementToBeClickable(terminationTab));
		terminationTab.click();
		result1 = true;
        break;
    } catch(Exception e) {
    }
    attempts1++;
	}
}
	@FindBy(xpath = "//button[@class='Submit_Claim pzhc pzbutton']")
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
	
	//Product Details Tab
	//Risk
	@FindBy(xpath = "//div[@class='content-item content-label item-1 flex flex-row padding-t-2x padding-l-1x dataLabelRead screen_labels_16_dataLabelRead']")
	List<WebElement> riskName;
	@FindBy(xpath = "//div[@class='rteReadOnlyWithoutTB']")
	List<WebElement> riskDescription;
	
	public void getRiskDetails() {
		wait.until(ExpectedConditions.visibilityOfAllElements(riskName));
		for(int i = 0 ; i<9 ; i++ ) {
			ps.print(riskName.get(i).getText() + "\n");
		}
		for(int i = 0 ; i<9 ; i++ ) {
			ps.print(riskDescription.get(i).getText() + "\n");
		}
	}
	//Policy Holder Detials
	@FindBy(xpath = "(//div[@class='content-item content-field item-4 remove-all-spacing flex flex-row dataValueRead'])[1]")
	WebElement policyHolderNameText;
	@FindBy(xpath = "(//div[@class='content-item content-field item-4 remove-all-spacing flex flex-row text-word-break-all dataValueRead'])[1]")
	WebElement policyHolderEmailText;
	@FindBy(xpath = "(//div[@class='content-item content-field item-4 remove-all-spacing flex flex-row dataValueRead'])[2]")
	WebElement policyHolderPhoneText;
	@FindBy(xpath = "(//div[@class='content-item content-field item-4 remove-all-spacing flex flex-row dataValueRead'])[3]")
	WebElement policyHolderAddressText;
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 flex flex-row padding-t-2x flex-justify-end dataLabelRead mp_label_21px_dataLabelRead'])")
	WebElement policyholderCoverageAmountText;
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 flex flex-row padding-t-2x flex-justify-end dataLabelRead mp_label_21px_dataLabelRead'])[2]")
	WebElement policyholderDeductibleAmountText;
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row mp_label_21px_dataLabelRead flex-justify-end padding-t-1x dataLabelRead mp_label_21px_dataLabelRead'])[1]")
	WebElement policyholderPremiumAmountText;
	public void getMemberDetailsText() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(policyHolderNameText));
	        	ps.print("PolicyHoldertName : " + policyHolderNameText.getText() + "\n");
	        	ps.print("PolicyHolderEmail : " + policyHolderEmailText.getText()+ "\n");
	        	ps.print("PolicyHolderPhone  : " + policyHolderPhoneText.getText()+ "\n");
	        	ps.print("PolicyHolderAddress : " + policyHolderAddressText.getText()+ "\n");
	        	ps.print("PolicyholderCoverageAmount : " + policyholderCoverageAmountText.getText()+ "\n");
	        	ps.print("PolicyholderDeductibleAmount : " + policyholderCoverageAmountText.getText()+ "\n");
	        	ps.print("policyholderPremiumAmount : " + policyholderPremiumAmountText.getText()+ "\n");


	        	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	//Policy Details
	@FindBy(xpath = "//sub[@style='font-size:48px!important;line-height:1.25;']")
	WebElement productDetailsProductNameText;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-bottom-spacing remove-right-spacing flex flex-row mp_labels_16_dataLabelRead dataLabelRead mpcov_labels_32_dataLabelRead']")
	WebElement productDetailsPremiumText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 remove-bottom-spacing remove-right-spacing flex flex-row mpcov_labels_32_dataLabelRead dataLabelRead mpcov_labels_32_dataLabelRead']")
	WebElement productDetailsMonthlyYearlyText;
	@FindBy(xpath = "//div[@class='field-item dataLabelRead']")
	WebElement productDetailsNextPaymentText;
	@FindBy(xpath = "//div[@class='field-item dataLabelRead label_596e82_dataLabelRead']")
	WebElement productDetailsNextPaymentProcessedOnText;
	@FindBy(xpath = "(//span[@class='mpcov14px'])[1]")
	WebElement productDetailsPolicyNumberText;
	@FindBy(xpath = "(//span[@class='field-caption dataLabelForRead label_596e82_dataLabelForRead'])[1]")
	WebElement productDetailsPolicyNumberLabelText;
	@FindBy(xpath = "//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row mpdb_14px_bold_with_background_dataLabelRead left-aligned padding-t-1x padding-b-1x dataLabelRead mpdb_14px_bold_with_background_dataLabelRead']")
	WebElement productDetailsCarrierNameText;
	@FindBy(xpath = "//div[@class='content-item content-label item-2 remove-all-spacing flex flex-row dataLabelRead']")
	WebElement productDetailsAnniversaryText;
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-all-spacing flex flex-row label_596e82_dataLabelRead dataLabelRead label_596e82_dataLabelRead'])[1]")
	WebElement productDetailPolicyAnniversaryLabelText;
	@FindBy(xpath = "(//span[@class='mpcov14px'])[2]")
	WebElement productDetailsPolicyStatusText;
	@FindBy(xpath = "(//span[@class='field-caption dataLabelForRead label_596e82_dataLabelForRead'])[2]")
	WebElement productDetailsPolicyStatusLabelText;
	public void getMemberProductDetailsText() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(productDetailsProductNameText));
	        	ps.print("Product Details " + "\n");
	        	ps.print("Product Name : " + productDetailsProductNameText.getText() + "\n");
	        	ps.print("Product CarrierName : " + productDetailsCarrierNameText.getText() + "\n");
	        	ps.print("Product Premium  : " + productDetailsPremiumText.getText() + productDetailsMonthlyYearlyText.getText() + "\n");
	        	ps.print(productDetailsPolicyNumberLabelText.getText() + productDetailsPolicyNumberText.getText() + "\n");
	        	ps.print(productDetailsPolicyStatusLabelText.getText() + productDetailsPolicyStatusText.getText() + "\n");
	        	ps.print(productDetailPolicyAnniversaryLabelText.getText() + productDetailsAnniversaryText.getText() + "\n");	
	        	ps.print(productDetailsNextPaymentProcessedOnText.getText() + productDetailsNextPaymentText.getText() + "\n");	

	        	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	//Download
	@FindBy(xpath = "(//a[@class='MP_Link_16px_Bold'])[1]")
	WebElement policyPdfLink;
	@FindBy(xpath = "(//div[@class='content-item content-field item-2 remove-all-spacing flex flex-row custom_RadioColor dataValueRead'])[1]")
	WebElement downloadOneDate;;
	@FindBy(xpath = "(//a[@class='MP_Link_16px_Bold'])[2]")
	WebElement applicationPdfLink;
	@FindBy(xpath = "(//div[@class='content-item content-field item-2 remove-all-spacing flex flex-row custom_RadioColor dataValueRead'])[2]")
	WebElement downloadTwoDate;
	@FindBy(xpath = "(//a[@class='MP_Link_16px_Bold'])[3]")
	WebElement agreementDeclarationsPdfLink;
	@FindBy(xpath = "(//div[@class='content-item content-field item-2 remove-all-spacing flex flex-row custom_RadioColor dataValueRead'])[3]")
	WebElement downloadThreeDate;
	public void downloadSection() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(policyPdfLink));
	        	ps.print("Download " + "\n");
	        	policyPdfLink.click();
	        	Thread.sleep(4000);
	        	ps.print(policyPdfLink.getText() + "-" + downloadOneDate.getText() + "Downloaded" + "\n");
	        	applicationPdfLink.click();
	        	Thread.sleep(4000);
	        	ps.print(applicationPdfLink.getText() + "-" +downloadTwoDate.getText() + "Downloaded" + "\n");
	        	agreementDeclarationsPdfLink.click();
	        	Thread.sleep(4000);
	        	ps.print(agreementDeclarationsPdfLink.getText()+ "-" + downloadThreeDate.getText() + "Downloaded" + "\n");
	        	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	//History 
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-top-spacing flex flex-row standard_dataLabelRead dataLabelRead km_labels_16_b_dataLabelRead'])[1]")
	WebElement recentActivityOneAfterPurchase;
	@FindBy(xpath = "(//div[@class='content-item content-label item-2 flex flex-row dataLabelRead mpdb_14px_mobile_dataLabelRead'])[1]")
	WebElement recenetActivityProductNameOneAfterPurchase;
	@FindBy(xpath = "(//div[@class='content-item content-field item-1 remove-top-spacing remove-left-spacing remove-right-spacing flex flex-row dataValueRead'])[1]")
	WebElement recenetActivityDateOneAfterPurchase;
	@FindBy(xpath = "(//a[@class='MPDBLink'])[4]")
	WebElement viewYourNewCoverageLink;
	@FindBy(xpath = "(//div[@class='content-item content-field item-1 remove-top-spacing remove-left-spacing flex flex-row dataValueRead'])[2]")
	WebElement typeOfHistoryOne;
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-top-spacing flex flex-row standard_dataLabelRead dataLabelRead km_labels_16_b_dataLabelRead'])[2]")
	WebElement recentActivityTwoAfterPurchase;
	@FindBy(xpath = "(//div[@class='content-item content-label item-2 flex flex-row dataLabelRead mpdb_14px_mobile_dataLabelRead'])[2]")
	WebElement recenetActivityProductNameTwoAfterPurchase;
	@FindBy(xpath = "(//div[@class='content-item content-field item-1 remove-top-spacing remove-left-spacing remove-right-spacing flex flex-row dataValueRead'])[2]")
	WebElement recenetActivityDateTwoAfterPurchase;
	@FindBy(xpath = "(//a[@class='MPDBLink'])[5]")
	WebElement downloadYourApplicationLink;
	@FindBy(xpath = "(//div[@class='content-item content-field item-1 remove-top-spacing remove-left-spacing flex flex-row dataValueRead'])[4]")
	WebElement typeOfHistoryTwo;
	@FindBy(xpath = "(//div[@class='content-item content-label item-2 flex flex-row dataLabelRead mpdb_14px_mobile_dataLabelRead'])[3]")
	WebElement recentActivityThreAfterPurchase;
	@FindBy(xpath = "(//div[@class='content-item content-label item-2   dataLabelRead labels_14_grey_dataLabelRead flex flex-row '])[3]")
	WebElement recenetActivityProductNameThreeAfterPurchase;
	@FindBy(xpath = "(//div[@class='content-item content-field item-1 remove-top-spacing remove-left-spacing remove-right-spacing flex flex-row dataValueRead'])[3]")
	WebElement recenetActivityDateThreeAfterPurchase;
	@FindBy(xpath = "(//div[@class='content-item content-field item-1 remove-top-spacing remove-left-spacing flex flex-row dataValueRead'])[6]")
	WebElement typeOfHistoryThree;
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
	        	ps.print("Type : " + typeOfHistoryOne.getText() + "\n");
	        	viewYourNewCoverageLink.click();
	        	Thread.sleep(4000);

	        	

	        	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
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
	        	downloadYourApplicationLink.click();
	        	ps.print("Type : " + typeOfHistoryTwo.getText() + "\n");
	        	Thread.sleep(4000);
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
	        	ps.print("Type : " + typeOfHistoryThree.getText() + "\n");

	          	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	
	
	@FindBy(xpath = "//button[@class='CB_ACCOUNTTABFull pzhc pzbutton']")
	WebElement manageMyPolicyButton;
	public void manageMyPolicyButtonClick() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(manageMyPolicyButton));
	        	wait.until(ExpectedConditions.elementToBeClickable(manageMyPolicyButton));
	        	manageMyPolicyButton.click();
	        	Thread.sleep(4000);
	          	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	@FindBy(xpath = "(//span[@class='menu-item-title'])[8]")
	WebElement editPolicyHolderInformationButton;
	public void editPolicyHolderInformationButtonClick() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(editPolicyHolderInformationButton));
	        	wait.until(ExpectedConditions.elementToBeClickable(editPolicyHolderInformationButton));
	        	editPolicyHolderInformationButton.click();
	        	Thread.sleep(4000);
	          	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	@FindBy(xpath = "(//span[@class='menu-item-title'])[9]")
	WebElement editPaymentMethoButton;
	public void editPaymentMethoButtonClick() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(editPaymentMethoButton));
	        	wait.until(ExpectedConditions.elementToBeClickable(editPaymentMethoButton));
	        	editPaymentMethoButton.click();
	        	Thread.sleep(4000);
	          	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	@FindBy(xpath = "(//span[@class='menu-item-title'])[10]")
	WebElement cancelMyPolicyButton;
	public void cancelMyPolicyButtonClick() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(cancelMyPolicyButton));
	        	wait.until(ExpectedConditions.elementToBeClickable(cancelMyPolicyButton));
	        	cancelMyPolicyButton.click();
	        	Thread.sleep(4000);
	          	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	@FindBy(xpath = "//button[@class='CB_ACCOUNTTABCancelFull pzhc pzbutton']")
	WebElement newClaimButton;
	public void newClaimButtonClick() {
		boolean result31 = false;
		int attempts31 = 0;
	    while(attempts31 < 2) {
	    	
	        try {
	        	wait.until(ExpectedConditions.visibilityOf(newClaimButton));
	        	wait.until(ExpectedConditions.elementToBeClickable(newClaimButton));
	        	newClaimButton.click();
	        	Thread.sleep(4000);
	          	result31 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts31++;
	    }
	}
	
	
		
}
