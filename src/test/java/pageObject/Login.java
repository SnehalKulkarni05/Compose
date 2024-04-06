package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Common_Action;

public class Login {
	 WebDriver driver ;

	
	@FindBy(xpath="//input[@type='email']")
     private WebElement username;
	 
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement next;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	
	 public Login(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);

	    }
	
	public  void enter_Id(String uname )
	{
		username.sendKeys(uname);
		next.click();
		
	}


   public void enter_Pass(String pass)
   {
	   Common_Action.waitForElement(driver,password);
	   password.sendKeys(pass);
		next.click();
		

   }

  
}
