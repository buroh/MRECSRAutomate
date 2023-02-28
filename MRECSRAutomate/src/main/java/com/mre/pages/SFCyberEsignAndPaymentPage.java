package com.mre.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.mre.base.BaseSetup;
import com.mre.utils.TestUtils;

public class SFCyberEsignAndPaymentPage extends BaseSetup {
	public SFCyberEsignAndPaymentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-wrap-xs-nowrap MuiGrid-align-items-xs-center MuiGrid-justify-xs-space-between']//div[2]")
	public
	WebElement eignNextButton;
	@FindBy(xpath = "//button[@aria-label='Sign']")
	public
	WebElement englishEsignSignButton;
	@FindBy(xpath = "//button[@aria-label='Signer']")
	WebElement frenchEsignSignButton;
	@FindBy (xpath = "//button[@data-test-id='ConfirmButton']")
	public
	WebElement esignConfirmbutton;
	public void eignNextButtonClick()
	{
		boolean result3 = false;
		int attempts3 = 0;
	    while(attempts3 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(eignNextButton));
	        	eignNextButton.click();
	    		result3 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts3++;
	    }
		
		
	}
	public void esignConfirmbuttonClick()
	{
		boolean result3 = false;
		int attempts3 = 0;
	    while(attempts3 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(esignConfirmbutton));
	        	esignConfirmbutton.click();
	    		result3 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts3++;
	    }
		
		
	}
	public void frenchEsignSignButtonClick()
	{
		boolean result3 = false;
		int attempts3 = 0;
	    while(attempts3 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(frenchEsignSignButton));
	        	frenchEsignSignButton.click();
	    		result3 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts3++;
	    }
		
		
	}
	public void englishEsignSignButtonClick()
	{
		boolean result3 = false;
		int attempts3 = 0;
	    while(attempts3 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(englishEsignSignButton));
	        	englishEsignSignButton.click();
	    		result3 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts3++;
	    }
		
		
	}
	
	public void esign() throws InterruptedException {
    	String title = driver.getTitle();
    	System.out.println("Before switching to iframe");
	    driver.switchTo().frame("myIframe");
	    eignNextButtonClick();
		if (title.contains("Parachute Insurance"))
		{
	    englishEsignSignButtonClick();
	    }
		else
		{
	   frenchEsignSignButtonClick();
		} 
		esignConfirmbuttonClick();
		System.out.println("After switching to iframe");
		driver.switchTo().defaultContent() ;
		Thread.sleep(3000);
		TestUtils.sfiframe();
	   
	}
	//Payment
	
	
	@FindBy (id  = "pas_expiry")
	WebElement expiry ; 
	
	@FindBy(id = "pas_cccvc")
	WebElement securitycod;

	@FindBy (id = "pas_ccname")
	WebElement cardholdername ; 
	
	@FindBy (xpath = "//button[@id='rxp-primary-btn']")
	WebElement activatecoverage ;
	

	@FindBy(id = "pas_ccnum")
	WebElement cardnumber;
	public void cardnumber() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(cardnumber));
		cardnumber.sendKeys("4111 1111 1111 1111 1111");
		expiry.click();
		cardnumber.clear();
		cardnumber.sendKeys("4263970000005262");
		Thread.sleep(1000);
	}
	public void expiry()
	{
		wait.until(ExpectedConditions.visibilityOf(expiry));
		
		expiry.sendKeys("02/23");
	}
	public void securitycod()
	{
		wait.until(ExpectedConditions.visibilityOf(securitycod));
		securitycod.sendKeys("1234");
		cardholdername.click();
		securitycod.click();
	    securitycod.clear();
		securitycod.sendKeys("123");
	}
	public void cardholdername()
	{
		wait.until(ExpectedConditions.visibilityOf(cardholdername));
		cardholdername.click();

		cardholdername.sendKeys("naga");
	}
	public void activatecoverage()
	{
	        ExpectedCondition<Boolean> pageLoadCondition = new
	                ExpectedCondition<Boolean>() {
	                    public Boolean apply(WebDriver driver) {
	                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
	                    }
	                };
	    wait.until(pageLoadCondition);
		wait.until(ExpectedConditions.elementToBeClickable(activatecoverage));
		activatecoverage.click();;
	}

	
}
