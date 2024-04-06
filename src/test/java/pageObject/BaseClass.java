package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	 public static WebDriver driver;
	
	//public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	  public  static void browserSelect(String Browsername)
	  {
		  if(Browsername.equals("Chrome"))
		  {
			  
			  //tdriver.set(new ChromeDriver());
			  driver = new ChromeDriver();
		  }
		  driver.manage().window().maximize();
		  
		  
	  }
}

	  

