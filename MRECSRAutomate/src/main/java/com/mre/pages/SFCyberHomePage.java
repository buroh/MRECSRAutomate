package com.mre.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.mre.base.BaseSetup;

public class SFCyberHomePage extends BaseSetup {
	public SFCyberHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(id = "login")
	WebElement emailAddress;
	
	@FindBy(xpath = "//button[@class='md']")
	public
	WebElement checkYourInbox;
	
	//@FindBy(xpath = "//span[text() = ' Buy Now ']")
	@FindBy(xpath = "//span[@style='color: rgba(255, 165, 0, 1)']")
	WebElement buyNow;
	
	
	@FindBy(xpath = "//a[@class='btn btn-primary pull-right']")
	WebElement getCovered;
	@FindBy(xpath = "(//a[@class='btn btn-primary'])[3]")
	WebElement getProtectedButton;
	public void getProtectedButtonClick() {
		boolean result1 = false;
		int attempts1 = 0;
	    while(attempts1 < 2) {
	        try {
	        	wait.until(ExpectedConditions.elementToBeClickable(getProtectedButton));
	    		getProtectedButton.click();
	    		result1 = true;
	            break;
	        } catch(Exception e) {
	        }
	        attempts1++;
	    }

	}
	@FindBy(xpath = "//span[text() = 'Print']")
	WebElement print;
		public void savequotelaunchingPage(){
			driver.get("https://yopmail.com/en/wm");
			driver.manage().window().maximize();
			emailAddress.sendKeys(inputTestData.get(2));
			checkYourInbox.click();
			driver.switchTo().frame("ifmail");
			//buyNow.click();
			driver.findElement(By.xpath("//td[@style='background-color: rgba(46, 135, 19, 1); min-width: 700px; line-height: 21px; padding: 15px 110px']")).click();
			Set<String> wh =  driver.getWindowHandles();
			wait.until(ExpectedConditions.numberOfWindowsToBe(2));
			Iterator<String> it = wh.iterator();
			String parentId;
			parentId  = it.next();
			for (
					int j = 0 ; j <  wh.size() ; j++)
			{
			if(it.hasNext())
			{
			String childId = it.next();
			driver.switchTo().window(childId);
			}
			}
	}
		@FindBy(xpath = "//input[@id='username']" )
		public static 
		WebElement loginUsernameTextBox;

		@FindBy(xpath = "//input[@id='password']" )
		public static 
		WebElement loginPasswordTextBox;


		@FindBy( xpath = "//button[@type='submit']")
		public static 
		WebElement submitButton;
		
		
		public static void login()  {
			submitButton.click();
			loginUsernameTextBox.clear();
			loginUsernameTextBox.sendKeys(inputTestData.get(2));
			loginPasswordTextBox.sendKeys("Rules@123");
			submitButton.click();
		}
		@FindBy(xpath = "(//button[@class='close text-right'])[5]/i")
		WebElement saveQuotePopUpCloseButton;
		public void saveQuotePopUpCloseButtonClick() {
			 boolean result = false;
				int attempts = 0;
			    while(attempts < 2) {
			        try {
			        	Thread.sleep(2000);
			        	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='existingQuote-modal-open-model']/div/div//div[3]/div/button")));
			        	
			        	saveQuotePopUpCloseButton.click();
			        	Thread.sleep(2000);
			    		result = true;
			            break;
			        } catch(Exception e) {
			        }
			        attempts++;
			    }
		}
		@FindBy(xpath = "(//span[text()='en'])[1]")
		WebElement englishLink;
		@FindBy(xpath = "//span[text()='Fran�ais']")
		WebElement frenchLink;
		@FindBy(xpath = "(//input[@class='btn btn-secondary pull-right'])[1]")
		WebElement closeButton;
		public void frenchSwitchUpdate() throws InterruptedException{
			
			        	
			        	englishLink.click();
			        	Thread.sleep(5000);
			        	frenchLink.click();
			        	closeButton.click();
			    		
		}
		
}
