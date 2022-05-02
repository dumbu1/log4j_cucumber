package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	private String propertyFileName;
	
	public PropertyReader(String propertyFileName) {
		this.propertyFileName=propertyFileName;
	}
	
	public Properties propertyReader() {
		FileInputStream obj_FileiFileInputStream=null;
		try {
		obj_FileiFileInputStream=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties/"+propertyFileName);
		}
		catch (FileNotFoundException e) {
			System.out.println("please check the path of the property file"+e);
		}
		Properties obj_Properties=new Properties();
		try {
		obj_Properties.load(obj_FileiFileInputStream);
		}
		catch(IOException e) {
			System.out.println("please check the file path"+e);
		}
		return obj_Properties;
	}

}
