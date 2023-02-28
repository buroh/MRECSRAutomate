package com.mre.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.mre.base.BaseSetup;


public class SFCyberEligibilityPage extends BaseSetup {
	public SFCyberEligibilityPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath = "(//label[@class='rb_radio_segment rb_standard radioLabel'])[2]")
	WebElement questionOneNoRadioButton;
	public void questionOneNoRadioButtonClick() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(questionOneNoRadioButton));
	        	questionOneNoRadioButton.click();
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }

	}
	@FindBy(xpath = "(//label[@class='rb_radio_segment rb_standard radioLabel'])[1]")
	WebElement questionOneYesRadioButton;
	public void questionOneYesRadioButtonClick() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(questionOneYesRadioButton));
	        	questionOneYesRadioButton.click();
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }

	}
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-left-spacing remove-right-spacing remove-top-spacing remove-bottom-spacing flex flex-row padding-t-2x dataLabelRead alert_message_dataLabelRead'])[2]")
	WebElement validationOneMessageText;
	//Dropdown value check
	@FindBy(xpath = "//select[@class='grey_dropdown']")
	WebElement questionTwoDropdown;
	public void questionTwoDropdownCheck() {
		if(inputTestData.get(35).contains("English")) {
			
			expectedDropDownValues.add("Select");
			expectedDropDownValues.add("1");  
			expectedDropDownValues.add("2"); ; 
			expectedDropDownValues.add("3");		
   	      } 
		else {
			expectedDropDownValues.add("S�lectionner");
			expectedDropDownValues.add("1");  
			expectedDropDownValues.add("2"); ; 
			expectedDropDownValues.add("3"); 
			
		}
		
    	boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		wait.until(ExpectedConditions.elementToBeClickable(questionTwoDropdown));
	    		Select questionTwoDropdownSelect = new Select(questionTwoDropdown);	
	    		List<WebElement> questionTwoDropdownOption  = questionTwoDropdownSelect.getOptions();
	    	      int size = questionTwoDropdownOption.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(questionTwoDropdownOption.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+questionTwoDropdownOption.get(i).getText()+
	    	            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    		             ps.print("Value Not Matching :"+"Actual List Value="+questionTwoDropdownOption.get(i).getText()+
	    		            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }
	    	         }
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }

		
	}
	@FindBy(xpath = "//select[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pQuestions$pQuestionGroup$l1$pQuestionList$l3$pFieldAnswer']")
	WebElement questionThreeDropdown;
	public void questionThreeDropdownCheck() {
			if(inputTestData.get(35).contains("English"))
    	     { 
				 expectedDropDownValues.add("Select");
    	    	 expectedDropDownValues.add("$10,000 or less"); 
    	    	 expectedDropDownValues.add("$10,001 - $15,000"); 
    	    	 expectedDropDownValues.add("$15,001 - $30,000"); 
    	    	 expectedDropDownValues.add("$30,001 - $50,000"); 
    	    	 expectedDropDownValues.add("$50,001 - $75,000");
    	    	 expectedDropDownValues.add("$75,001 - $100,000"); 
    	    	 expectedDropDownValues.add("$100,001 or more");
    	      } 
    	
			else
    	     { 
    	    	 
    	    	 expectedDropDownValues.add("S�lectionner");
    	    	 expectedDropDownValues.add("10 000 $ ou moins"); 
    	    	 expectedDropDownValues.add("De 10 001 $ � 15 000 $"); 
    	    	 expectedDropDownValues.add("De 15 001 $ � 30 000 $"); 
    	    	 expectedDropDownValues.add("De 30 001 $ � 50 000 $"); 
    	    	 expectedDropDownValues.add("De 50 001 $ � 75 000 $");
    	    	 expectedDropDownValues.add("De 75 001 $ � 100 000 $"); 
    	    	 expectedDropDownValues.add("100 001 $ ou plus"); 
    	      } 
    	
    	boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	Select questionThreeDropdownSelect = new Select(questionThreeDropdown);	
	    		List<WebElement> questionThreeDropdownOption  = questionThreeDropdownSelect.getOptions();
	    	      int size = questionThreeDropdownOption.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(questionThreeDropdownOption.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+questionThreeDropdownOption.get(i).getText()+
	    	            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    		             ps.print("Value Not Matching :"+"Actual List Value="+questionThreeDropdownOption.get(i).getText()+
	    		            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }
	    	         }

	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
			}
	@FindBy(xpath = "//select[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pQuestions$pQuestionGroup$l1$pQuestionList$l4$pFieldAnswer']")
	WebElement questionThreeDropdownIncidentTwo;
	public void questionThreeDropdownIncidentTwoCheck() {
		if(inputTestData.get(35).contains("English"))
	     { 
	    	 expectedDropDownValues.add("Select");
	    	 expectedDropDownValues.add("$10,000 or less"); 
	    	 expectedDropDownValues.add("$10,001 - $15,000"); 
	    	 expectedDropDownValues.add("$15,001 - $30,000"); 
	    	 expectedDropDownValues.add("$30,001 - $50,000"); 
	    	 expectedDropDownValues.add("$50,001 - $75,000");
	    	 expectedDropDownValues.add("$75,001 - $100,000"); 
	    	 expectedDropDownValues.add("$100,001 or more"); 
	      } 
	
		else
	     { 
			expectedDropDownValues.add("S�lectionner");
	    	 expectedDropDownValues.add("10 000 $ ou moins"); 
	    	 expectedDropDownValues.add("De 10 001 $ � 15 000 $"); 
	    	 expectedDropDownValues.add("De 15 001 $ � 30 000 $"); 
	    	 expectedDropDownValues.add("De 30 001 $ � 50 000 $"); 
	    	 expectedDropDownValues.add("De 50 001 $ � 75 000 $");
	    	 expectedDropDownValues.add("De 75 001 $ � 100 000 $"); 
	    	 expectedDropDownValues.add("100 001 $ ou plus"); 
	      
	      } 
	
    	boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	Select questionThreeDropdownSelect = new Select(questionThreeDropdownIncidentTwo);	
	    		List<WebElement> questionThreeDropdownOption  = questionThreeDropdownSelect.getOptions();
	    	      int size = questionThreeDropdownOption.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(questionThreeDropdownOption.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+questionThreeDropdownOption.get(i).getText()+
	    	            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    		             ps.print("Value Not Matching :"+"Actual List Value="+questionThreeDropdownOption.get(i).getText()+
	    		            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }
	    	         }

	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
			}
	
	@FindBy(xpath = "//select[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pQuestions$pQuestionGroup$l1$pQuestionList$l5$pGridQuestion$l1$pFieldAnswer']")
	WebElement questionFourDropdown;
	public void questionFourDropdownCheck() {
		if(inputTestData.get(35).contains("English"))
	     { 
	    	 expectedDropDownValues.add("Select");
	    	 expectedDropDownValues.add("Breach of personal information"); 
	    	 expectedDropDownValues.add("Cyber extortion"); 
	    	 expectedDropDownValues.add("Cyber fraud"); 
	    	 expectedDropDownValues.add("Hacking"); 
	    	 expectedDropDownValues.add("Identity theft"); 
	    	 expectedDropDownValues.add("Malware infection"); 
	    	 expectedDropDownValues.add("Media incident"); 
	    	 expectedDropDownValues.add("Network incident"); 
	    	 expectedDropDownValues.add("Other"); 
	      } 
		else
	 
	     { 
	    	 expectedDropDownValues.add("S�lectionner");
	    	 expectedDropDownValues.add("Atteinte � la s�curit� des renseignements personnels"); 
	    	 expectedDropDownValues.add("Cyberextorsion"); 
	    	 expectedDropDownValues.add("Cyberfraude"); 
	    	 expectedDropDownValues.add("Piratage"); 
	    	 expectedDropDownValues.add("Usurpation d�identit�"); 
	    	 expectedDropDownValues.add("Infection par des logiciels malveillants"); 
	    	 expectedDropDownValues.add("Incident m�diatique"); 
	    	 expectedDropDownValues.add("Incident r�seau"); 
	    	 expectedDropDownValues.add("Autre"); 
	      } 
	    	
    	boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionThreeDropdownSelect = new Select(questionThreeDropdown);	
	    		List<WebElement> questionThreeDropdownOption  = questionThreeDropdownSelect.getOptions();
	    	      int size = questionThreeDropdownOption.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(questionThreeDropdownOption.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+questionThreeDropdownOption.get(i).getText()+
	    	            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    		             ps.print("Value Not Matching :"+"Actual List Value="+questionThreeDropdownOption.get(i).getText()+
	    		            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }
	    	         }


	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	}
	@FindBy(xpath = "//select[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pQuestions$pQuestionGroup$l1$pQuestionList$l5$pGridQuestion$l3$pFieldAnswer']")
	WebElement questionFiveDropdown;
	public void questionFiveDropdownCheck() {
		if(inputTestData.get(35).contains("English"))
	     { 
	    	 expectedDropDownValues.add("Select");
	    	 expectedDropDownValues.add("$10,000 or less"); 
	    	 expectedDropDownValues.add("$10,001 - $15,000"); 
	    	 expectedDropDownValues.add("$15,001 - $30,000"); 
	    	 expectedDropDownValues.add("$30,001 - $50,000"); 
	    	 expectedDropDownValues.add("$50,001 - $75,000");
	    	 expectedDropDownValues.add("$75,001 - $100,000"); 
	    	 expectedDropDownValues.add("$100,001 or more"); 
	      } 
	
		else
	     { 
			expectedDropDownValues.add("S�lectionner");
	    	 expectedDropDownValues.add("10 000 $ ou moins"); 
	    	 expectedDropDownValues.add("De 10 001 $ � 15 000 $"); 
	    	 expectedDropDownValues.add("De 15 001 $ � 30 000 $"); 
	    	 expectedDropDownValues.add("De 30 001 $ � 50 000 $"); 
	    	 expectedDropDownValues.add("De 50 001 $ � 75 000 $");
	    	 expectedDropDownValues.add("De 75 001 $ � 100 000 $"); 
	    	 expectedDropDownValues.add("100 001 $ ou plus"); 
	      
	      } 
	
    	boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionFiveDropdownSelect = new Select(questionFiveDropdown);	
	    		List<WebElement> questionFiveDropdownOption  = questionFiveDropdownSelect.getOptions();
	    	      int size = questionFiveDropdownOption.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(questionFiveDropdownOption.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+questionFiveDropdownOption.get(i).getText()+
	    	            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    		             ps.print("Value Not Matching :"+"Actual List Value="+questionFiveDropdownOption.get(i).getText()+
	    		            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }
	    	         }

	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }

	}
	@FindBy(xpath = "//select[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pQuestions$pQuestionGroup$l1$pQuestionList$l5$pGridQuestion$l2$pFieldAnswer']")
	WebElement questionSixDropdown;
	public void questionSixDropdownCheck() {
		if(inputTestData.get(35).contains("English")) {
			
			expectedDropDownValues.add("Select");
			expectedDropDownValues.add("2018"); 
			expectedDropDownValues.add("2019"); 
			expectedDropDownValues.add("2020"); 
			expectedDropDownValues.add("2021"); 
			expectedDropDownValues.add("2022"); 
   	      } 
		else {
			expectedDropDownValues.add("S�lectionner");
			expectedDropDownValues.add("2018"); 
			expectedDropDownValues.add("2019"); 
			expectedDropDownValues.add("2020"); 
			expectedDropDownValues.add("2021"); 
			expectedDropDownValues.add("2022"); 
		}
    	boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	Select questionSixDropdownSelect = new Select(questionSixDropdown);	
	    		List<WebElement> questionSixDropdownOption  = questionSixDropdownSelect.getOptions();
	    	      int size = questionSixDropdownOption.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(questionSixDropdownOption.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+questionSixDropdownOption.get(i).getText()+
	    	            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    		             ps.print("Value Not Matching :"+"Actual List Value="+questionSixDropdownOption.get(i).getText()+
	    		            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }
	    	         }

	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	
	}
	@FindBy(xpath = "//select[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pQuestions$pQuestionGroup$l1$pQuestionList$l6$pGridQuestion$l1$pFieldAnswer']")
	WebElement questionSevenDropdown;
	public void questionSevenDropdownCheck() {
		
    		if(inputTestData.get(35).contains("English"))
    	     { 
    	    	 expectedDropDownValues.add("Select");
    	    	 expectedDropDownValues.add("Breach of personal information"); 
    	    	 expectedDropDownValues.add("Cyber extortion"); 
    	    	 expectedDropDownValues.add("Cyber fraud"); 
    	    	 expectedDropDownValues.add("Hacking"); 
    	    	 expectedDropDownValues.add("Identity theft"); 
    	    	 expectedDropDownValues.add("Malware infection"); 
    	    	 expectedDropDownValues.add("Media incident"); 
    	    	 expectedDropDownValues.add("Network incident"); 
    	    	 expectedDropDownValues.add("Other"); 
    	      } 
    		else
    	 
    	     { 
    			 expectedDropDownValues.add("S�lectionner");
    	    	 expectedDropDownValues.add("Atteinte � la s�curit� des renseignements personnels"); 
    	    	 expectedDropDownValues.add("Cyberextorsion"); 
    	    	 expectedDropDownValues.add("Cyberfraude"); 
    	    	 expectedDropDownValues.add("Piratage"); 
    	    	 expectedDropDownValues.add("Usurpation d�identit�"); 
    	    	 expectedDropDownValues.add("Infection par des logiciels malveillants"); 
    	    	 expectedDropDownValues.add("Incident m�diatique"); 
    	    	 expectedDropDownValues.add("Incident r�seau"); 
    	    	 expectedDropDownValues.add("Autre"); 
    	      } 
    	
    	boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionSevenDropdownSelect = new Select(questionSevenDropdown);	
	    		List<WebElement> questionSevenDropdownOption  = questionSevenDropdownSelect.getOptions();
	    	      int size = questionSevenDropdownOption.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(questionSevenDropdownOption.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+questionSevenDropdownOption.get(i).getText()+
	    	            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    		             ps.print("Value Not Matching :"+"Actual List Value="+questionSevenDropdownOption.get(i).getText()+
	    		            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }
	    	         }
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }


	}
	@FindBy(xpath = "//select[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pQuestions$pQuestionGroup$l1$pQuestionList$l6$pGridQuestion$l2$pFieldAnswer']")
	WebElement questionEightDropdown;
	public void questionEightDropdownCheck() {
		if(inputTestData.get(35).contains("English"))
	     { 
	    	 expectedDropDownValues.add("Select");
	    	 expectedDropDownValues.add("$10,000 or less"); 
	    	 expectedDropDownValues.add("$10,001 - $15,000"); 
	    	 expectedDropDownValues.add("$15,001 - $30,000"); 
	    	 expectedDropDownValues.add("$30,001 - $50,000"); 
	    	 expectedDropDownValues.add("$50,001 - $75,000");
	    	 expectedDropDownValues.add("$75,001 - $100,000"); 
	    	 expectedDropDownValues.add("$100,001 or more"); 
	      } 
	
		else
	     { 
			expectedDropDownValues.add("S�lectionner");
	    	 expectedDropDownValues.add("10 000 $ ou moins"); 
	    	 expectedDropDownValues.add("De 10 001 $ � 15 000 $"); 
	    	 expectedDropDownValues.add("De 15 001 $ � 30 000 $"); 
	    	 expectedDropDownValues.add("De 30 001 $ � 50 000 $"); 
	    	 expectedDropDownValues.add("De 50 001 $ � 75 000 $");
	    	 expectedDropDownValues.add("De 75 001 $ � 100 000 $"); 
	    	 expectedDropDownValues.add("100 001 $ ou plus"); 
	      
	      } 
	
    	boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	Select questionEightDropdownSelect = new Select(questionEightDropdown);	
	    		List<WebElement> questionEightDropdownOption  = questionEightDropdownSelect.getOptions();
	    	      int size = questionEightDropdownOption.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(questionEightDropdownOption.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+questionEightDropdownOption.get(i).getText()+
	    	            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    		             ps.print("Value Not Matching :"+"Actual List Value="+questionEightDropdownOption.get(i).getText()+
	    		            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }
	    	         }


	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	}
	@FindBy(xpath = "//select[@name='$PpyWorkPage$pQuoteList$l1$pApplicationPage$pBusinessDetails$pQuestions$pQuestionGroup$l1$pQuestionList$l6$pGridQuestion$l3$pFieldAnswer']")
	WebElement questionNineDropdown;
	public void questionNineDropdownCheck() {
		if(inputTestData.get(35).contains("English")) {
		
			expectedDropDownValues.add("Select");
			expectedDropDownValues.add("2018"); 
			expectedDropDownValues.add("2019"); 
			expectedDropDownValues.add("2020"); 
			expectedDropDownValues.add("2021"); 
			expectedDropDownValues.add("2022"); 
   	      } 
		else {
			expectedDropDownValues.add("S�lectionner");
			expectedDropDownValues.add("2018"); 
			expectedDropDownValues.add("2019"); 
			expectedDropDownValues.add("2020"); 
			expectedDropDownValues.add("2021"); 
			expectedDropDownValues.add("2022"); 
		}
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionNineDropdownSelect = new Select(questionNineDropdown);	
	    		List<WebElement> questionNineDropdownOption  = questionNineDropdownSelect.getOptions();
	    	      int size = questionNineDropdownOption.size();
	    	      for(int i =0; i<size ; i++){
	    	         if(questionNineDropdownOption.get(i).getText().equals(expectedDropDownValues.get(i).toString())) {
	    	             ps.print("Value Matching :"+"Actual List Value="+questionNineDropdownOption.get(i).getText()+
	    	            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }else {
	    		             ps.print("Value Not Matching :"+"Actual List Value="+questionNineDropdownOption.get(i).getText()+
	    		            		 " And Expected Value="+expectedDropDownValues.get(i) + "\n");
	    	            }
	    	         }


	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
	}
	public void questionTwoDropdownSelectIneligible() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	Select questionTwoDropdownSelect = new Select(questionTwoDropdown);	
	    		questionTwoDropdownSelect.selectByIndex(3);
	    	     if(validationOneMessageText.getText().equals(inputTestData.get(32))) {
	    	             ps.print("Value Matching :"+"Actual Value="+validationOneMessageText.getText()+" And Expected Value="+inputTestData.get(32) + "\n");
	    	            }
	        	     else {
	        	    	 ps.print("Value Not Matching :"+"Actual Value="+validationOneMessageText.getText()+" And Expected Value="+inputTestData.get(32) + "\n");
	        	     }
	        	     if(eligibilityPageContinueButton.isEnabled()) {
	        	    	 ps.print("Continue button is enabled" + "\n");
	        	     }
	    	    	     else {
	    	    	    	 ps.print("Continue is disabled" + "\n");
	    	    	     }

	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }
		
	}
	
	public void questionTwoDropdownIncidentOne(){
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionTwoDropdownSelect = new Select(questionTwoDropdown);	
	    		questionTwoDropdownSelect.selectByIndex(1);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }


	}
	public void questionTwoDropdownIncidentTwo(){
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionTwoDropdownSelect = new Select(questionTwoDropdown);	
	    		questionTwoDropdownSelect.selectByIndex(2);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }

		
	}
	public void questionThreeDropdownMinimumValue(){
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionThreeDropdownSelect = new Select(questionThreeDropdown);	
	    		questionThreeDropdownSelect.selectByIndex(1);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }


	}
	public void questionThreeDropdownIncidentTwoMinimumValue(){
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionThreeDropdownSelect = new Select(questionThreeDropdownIncidentTwo);	
	    		questionThreeDropdownSelect.selectByIndex(1);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }


	}
	public void questionThreeDropdownAveragealue(){
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionThreeDropdownSelect = new Select(questionThreeDropdown);	
	    		questionThreeDropdownSelect.selectByIndex(4);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }


	}
	public void questionThreeDropdownAveragealueIncidentTwo(){
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionThreeDropdownSelect = new Select(questionThreeDropdownIncidentTwo);	
	    		questionThreeDropdownSelect.selectByIndex(4);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }


	}
	@FindBy(xpath = "(//div[@class='content-item content-label item-1 remove-left-spacing remove-right-spacing remove-top-spacing remove-bottom-spacing flex flex-row padding-t-2x dataLabelRead alert_message_dataLabelRead'])[3]")
	WebElement validationTwoMessageText;

	public void questionThreeDropdownSelectIneligible() {
		Select questionThreeDropdownSelect = new Select(questionThreeDropdown);	
		questionThreeDropdownSelect.selectByIndex(6);
	     if(validationTwoMessageText.getText().equals(inputTestData.get(32))) {
	             ps.print("Value Matching :"+"Actual Value="+validationTwoMessageText.getText()+" And Expected Value="+inputTestData.get(32) + "\n");
	            }
    	     else {
    	    	 ps.print("Value Not Matching :"+"Actual Value="+validationTwoMessageText.getText()+" And Expected Value="+inputTestData.get(32) + "\n");
    	     }
    	     if(eligibilityPageContinueButton.isEnabled()) {
    	    	 ps.print("Continue button is enabled" + "\n");
    	     }
	    	     else {
	    	    	 ps.print("Continue is disabled" + "\n");
	    	     }

	}
	
	public void questionThreeDropdownIncidentTwoSelectIneligible() {
		Select questionThreeDropdownSelect = new Select(questionThreeDropdownIncidentTwo);	
		questionThreeDropdownSelect.selectByIndex(6);
	     if(validationTwoMessageText.getText().equals(inputTestData.get(32))) {
	             ps.print("Value Matching :"+"Actual Value="+validationTwoMessageText.getText()+" And Expected Value="+inputTestData.get(32) + "\n");
	            }
    	     else {
    	    	 ps.print("Value Not Matching :"+"Actual Value="+validationTwoMessageText.getText()+" And Expected Value="+inputTestData.get(32) + "\n");
    	     }
    	     if(eligibilityPageContinueButton.isEnabled()) {
    	    	 ps.print("Continue button is enabled" + "\n");
    	     }
	    	     else {
	    	    	 ps.print("Continue is disabled" + "\n");
	    	     }

	}
	
	public void questionFourDropdownSelect(){
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionFourDropdownSelect = new Select(questionFourDropdown);	
	    		questionFourDropdownSelect.selectByIndex(4);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }

	}
	public void questionFiveDropdownSelect(){
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionFiveDropdownSelect = new Select(questionFiveDropdown);	
	    		questionFiveDropdownSelect.selectByIndex(4);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }

	}
	public void questionSixDropdownSelect(){
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionSixDropdownSelect = new Select(questionSixDropdown);	
	    		questionSixDropdownSelect.selectByIndex(4);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }

	}
	public void questionSevenDropdownSelect(){
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionSevenDropdownSelect = new Select(questionSevenDropdown);	
	    		questionSevenDropdownSelect.selectByIndex(4);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }

	}
	public void questionEightDropdownSelect(){
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionEightDropdownSelect = new Select(questionEightDropdown);	
	    		questionEightDropdownSelect.selectByIndex(4);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }

	}
	public void questionNineDropdownSelect(){
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	    		Select questionNineDropdownSelect = new Select(questionNineDropdown);	
	    		questionNineDropdownSelect.selectByIndex(4);
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }

	}
	@FindBy(xpath = "//button[@class='Primary_Button_540X54 pzhc pzbutton']")
	WebElement eligibilityPageContinueButton;
	public void eligibilityPageContinueButtonClick() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(eligibilityPageContinueButton));
	        	eligibilityPageContinueButton.click();
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }

	}
	 @FindBy(xpath = "//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing flex flex-row screen_labels_48_b_dataLabelWrite dataLabelWrite screen_main_header_dataLabelWrite']")
	    WebElement bussinessDetailsText;
		public void getBussinessDetailsText() {
			boolean result1 = false;
			int attempts1 = 0;
		    while(attempts1 < 2) {
		        try {
		        	wait.until(ExpectedConditions.visibilityOf(bussinessDetailsText));
		        	if(bussinessDetailsText.getText().contains("Business details")) {
		        		ps.print("Business Details Page");
		        	}
		        	else {
		        		ps.print("Eligibilty Page");
		        		}
		        	result1 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts1++;
		    }   
		    }
		@FindBy(xpath = "(//a[@class='Link_S'])[1]")
		WebElement  backLink;
		public void backLinkClick() {
			boolean result1 = false;
			int attempts1 = 0;
		    while(attempts1 < 2) {
		        try {
		        	wait.until(ExpectedConditions.elementToBeClickable(backLink));
		        	backLink.click();
		        	Thread.sleep(8000);
		    		result1 = true;
		            break;
		        } catch(Exception e) {
		        }
		        attempts1++;
		    }

		}
		@FindBy(xpath = "//label[@class='rb_radio_segment rb_standard radioLabel']")
		List<WebElement> questionRadioButton;
		public void questionNoRadioButton() {boolean result4 = false;
		int attempts4 = 0;
	    
		int countOfQuestions = questionRadioButton.size();
    		for(int i=0;i<countOfQuestions;i++)
    		{
    			while(attempts4 < 3) {
    		        try {
    			if(i%2 != 0)
    			{
    				wait.until(ExpectedConditions.visibilityOfAllElements(questionRadioButton));
    				wait.until(ExpectedConditions.elementToBeClickable(questionRadioButton.get(i)));
    				questionRadioButton.get(i).click();				
    			}
    			break;
    		} 
        	
         catch(Exception e) {
        	
        }}}
	 
	}
		
		public void questionYesRadioButton() {
		boolean result4 = false;
		int attempts4 = 0;
	    
		int countOfQuestions = questionRadioButton.size();
    		for(int i=2;i<countOfQuestions;i++)
    		{
    			while(attempts4 < 3) {
    		        try {
    			if(i%2 == 0)
    			{
    				wait.until(ExpectedConditions.visibilityOfAllElements(questionRadioButton));
    				wait.until(ExpectedConditions.elementToBeClickable(questionRadioButton.get(i)));
    				questionRadioButton.get(i).click();				
    			}
    			break;
    		} 
        	
         catch(Exception e) {
        	
        }}}
	 
	}
		
		
}
