package com.hybrid.testng.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.hybrid.testng.helper.TestHelper;

public class TestUtils extends TestHelper {

	public static void loadConfig() {

		FileInputStream configStream = null;

		try {
			configStream = new FileInputStream(System.getProperty("user.dir") + File.separator + "properties"
					+ File.separator + "config.properties");
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
	
	public static void loadORFiles() {

		File propertyDir = new File(System.getProperty("user.dir") + File.separator + "properties");
		if (propertyDir.isDirectory()) {

			File[] files = propertyDir.listFiles();
			for (File file : files) {

				try (FileInputStream fis = new FileInputStream(file)) {

					Properties prop = new Properties();
					prop.load(fis);
					OR.putAll(prop);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

}
