package com.hy.tstng.selenium.drivers;

import com.hy.tstng.utils.ApplicationConstants;

public class WebBrowserFactory {
	
	public static Driver getDriver (String browserName) {
		
		if(ApplicationConstants.CHROME_BROWSER.equals(browserName)) {
			return new ChromeBrowserDriver();
			
		}
		
		return null;
		
	}

}
