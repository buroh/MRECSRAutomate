package com.mre.utils;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mre.base.BaseSetup;

public class TestUtils extends BaseSetup {

	public static long PAGE_LOAD_TIMEOUT = 120;
	public static long IMPLICIT_WAIT = 60;

	public TestUtils(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void sfiframe() {
		driver.switchTo().frame(1); // Switching the Outer Frame
		driver.switchTo().frame(0);

	}

	public static void mpiframe() {

		driver.switchTo().frame(0); // Switching the Outer Frame
		driver.switchTo().frame(0);
	}

	@FindBy(id = "PegaRULESErrorFlag")
	public static List<WebElement> errorValidationText;

	public static void errorValidation() {
		int count = 0;
		boolean result4 = false;
		int attempts4 = 0;
		while (attempts4 < 3) {
			try {
				int countOfValidation = errorValidationText.size();
				for (int i = 4; i < countOfValidation; i++) {
					ps.print("Error Validation Message : " + errorValidationText.get(i).getText() + "\n");
					count = i + 1;

				}
				ps.print(count + "\n");
				break;
			} catch (Exception e) {

			}
			attempts4++;
		}
	}

	@FindBy(xpath = "//input[@id='username']")
	public static WebElement loginUsernameTextBox;

	@FindBy(xpath = "//input[@id='password']")
	public static WebElement loginPasswordTextBox;

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement submitButton;

	public static void login() throws IOException {
		submitButton.click();
		loginUsernameTextBox.sendKeys(inputTestData.get(4));
		loginPasswordTextBox.sendKeys("Rules@123");
		submitButton.click();
	}

	public static String getCurrentDatetime() {
		return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	}

	public static void takeScreenshotAtEndOfTest(String methodName) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		try {
			FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + methodName + ".jpg"));
		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void comparefile(String file1, String file2) throws IOException {
		BufferedReader reader1 = new BufferedReader(new FileReader("./src/main/java/com/mre/qa/testdata/" + file1));

		BufferedReader reader2 = new BufferedReader(new FileReader("./src/main/java/com/mre/qa/testdata/" + file2));

		String line1 = reader1.readLine();

		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null) {

			if (line1 == null || line2 == null) {
				areEqual = false;

				break;
			} else if (!line1.equalsIgnoreCase(line2)) {
				areEqual = false;

				if (areEqual) {
					System.out.println("Two files have same content.");

				} else {
					System.out.println("Two files have different content. They differ at line " + lineNum);

					System.out.println("File1 has " + line1 + " and File2 has " + line2 + " at line " + lineNum);
				}
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;

		}

		reader1.close();

		reader2.close();
	}

}
