package com.hy.tstng.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.hy.tstng.helper.TestHelper;

public class TestUtils extends TestHelper {
	
	
	public static void loadConfig() {
		
		FileInputStream configStream= null;
		
		try {
			configStream = new FileInputStream(System.getProperty("user.dir") + File.separator + "properties"+ File.separator + "config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			config.load(configStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
	}

}
