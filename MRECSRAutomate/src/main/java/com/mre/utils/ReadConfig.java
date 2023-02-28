package com.mre.utils;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	public ReadConfig() {
		
		File src = new File("./src/main/java/com/mre/qa/config/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public String getChromePath() {
		return prop.getProperty("chromepath");		
	}		
	public String getXlsxInputPath() {
		return prop.getProperty("xlsxinput");
	}
	public String getXlsxOutputPath() {
		return prop.getProperty("xlsxoutput");
	}
	public String getDocumentOne() {
		return prop.getProperty("documentOne");
	}
	

}
