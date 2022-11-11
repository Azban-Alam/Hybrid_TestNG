package com.hybrid.testng.selenium.drivers;

import com.hybrid.testng.utils.ApplicationConstants;

public class WebBrowserFactory {
	
	public static Driver getDriver (String browserName) {
		
		if(ApplicationConstants.CHROME_BROWSER.equals(browserName)) {
			return new ChromeBrowserDriver();
			
		}
		
		return null;
		
	}

}
