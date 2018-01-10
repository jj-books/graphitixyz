package com.graphiti;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.graphiti.controller.AssetController;

public class Constants {
	public static Properties properties = new Properties();
	private static Constants constant;
	
	private Constants(){// TODO - Handle Exceptions properly
		try{
			// Read the properties file
			ClassLoader classLoader = getClass().getClassLoader();
			File file = null;
			if(System.getProperty("external-container")==null){
				file = new File(classLoader.getResource("application.properties").getFile());
			}
			else{
				file = new File(System.getProperty("application-properties-path"));
			}
			properties.load(new InputStreamReader(new FileInputStream(file)));
		}
		catch(FileNotFoundException e){
			// TODO - Good Handling
			e.printStackTrace();
		}
		catch(IOException e){
			// TODO - Good Handling
			e.printStackTrace();
		}
	}
	
	public static Constants getInstance(){
		if(constant==null){
			constant = new Constants();
			return constant;
		}
		else{
			return constant;
		}
	}
}