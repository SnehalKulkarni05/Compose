package utilities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {
	private Properties properties;
	private final String propertyFilePath= "C:\\Users\\Dell\\eclipse-workspace\\Gmail\\src\\test\\resource\\Property_File.properties";

	
	public Config_Reader()
	{
		FileInputStream reader;
		properties = new Properties();
		try {
			reader = new FileInputStream(propertyFilePath);
			properties.load(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	

	
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	public String getUserName() {
		String username = properties.getProperty("username");
		if(username != null) return username;
		else throw new RuntimeException("username not specified in the Configuration.properties file.");
	}
	public String getPassword() {
		String password = properties.getProperty("password");
		if(password != null) return password;
		else throw new RuntimeException("password not specified in the Configuration.properties file.");
	}
	public long getImplicitlyWait() {		
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
	


}
}