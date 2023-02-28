package com.mre.base;

import java.io.IOException;
import java.io.PrintStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.mre.utils.MyScreenRecorder;
import com.mre.utils.ReadConfig;

public class BaseSetup {

	
		public static WebDriver driver;
		public static WebDriverWait wait;
		public String downloadPath;
		public ReadConfig readConfig = new ReadConfig();
		public static ArrayList<String> inputTestData;
		public static ArrayList<String> outputTestData;
		public static ArrayList<String> arrayListStringOutput = new ArrayList<String>();
		public static PrintStream ps;
		public static PrintStream riskPrint;

		public SoftAssert softAssert = new SoftAssert();
		public List<String> expectedDropDownValues = new ArrayList<String>();

		@BeforeClass
		public void startBrowser() throws IOException {
			downloadPath = System.getProperty("user.dir") + "\\pdfdocuments\\";
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", downloadPath);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromePrefs);
			options.addArguments("--incognito");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);
			System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date(0));// time stamp
			String repName = "MRE Automation Report-" + timeStamp + ".html";

		}

		@BeforeTest
		public void recordingSetUp() throws Exception {
			MyScreenRecorder.startRecording("TestFlow");

		}

		@AfterTest
		public void endTest() throws Exception {
			MyScreenRecorder.stopRecording();

		}

		@AfterClass
		public void quit() {
			// driver.quit();
		}
	}

