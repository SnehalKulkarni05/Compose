

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Compose_Mail_StepDefination {
	/*
	WebDriver driver;
	
	Compose_Mail compose;
	@Given("User already logged into account")
	public void user_already_logged_into_account() {
		driver =new ChromeDriver();
		driver.get("https://www.gmail.com");
	
		compose = new Compose_Mail(driver);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("snehal.ajinkya05");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mihika25");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

	
		
	    
	}

	
	@When("user clicked on compose button")
	public void user_clicked_on_compose_button() throws AWTException, InterruptedException  {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		Actions act= new Actions(driver);
		compose.compose_Mail();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	WebElement sender=	driver.findElement(By.xpath("//input[contains(@class,'agP')]"));
	sender.sendKeys("katote.snehal@gmail.com"+Keys.ENTER);
		
	
		
		//***************************************************Add Cc *************************************
          driver.findElement(By.xpath("//span[@class='baT']//span[1]")).click();
      	try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
          driver.findElement(By.xpath("(//input[@class='agP aFw'])[2]")).sendKeys("ajinkya.kulkarni03@gmail.com"+Keys.ENTER);
          
          //************************************************************************************  BCC  ***********************************888
          
          driver.findElement(By.xpath("//span[@class='baT']")).click();
          driver.findElement(By.xpath("(//input[@class='agP aFw'])[3]")).sendKeys("BCC@gmail.com"+Keys.ENTER);
		  
		   
    //-------------------------------------**************************************subject
   WebElement e= driver.findElement(By.xpath("//input[@name='subjectbox']"));
    
    e.sendKeys("subject demo");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
   
    //-************************************************************************click on A option
driver.findElement(By.xpath("//div[@class='dv']")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}

//****************************************************************************font change
driver.findElement(By.xpath("//div[contains(text(),'Sans') and @role='option']")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
driver.findElement(By.xpath("//div[@command='+fontName']")).click();
driver.findElement(By.xpath("//div[@command='+bold']")).click();

//*********************************************************************************font color
driver.findElement(By.xpath("//div[@command='+foreColor']")).click();
driver.findElement(By.xpath("//td[@id='T-Kw-Jn8']")).click();

    
//*************************************************************************************message body


    driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("message body successfully added"+Keys.ENTER+"Regards"+Keys.ENTER+"Snehal");
 
  
   /* attachment
  WebElement attachment = driver.findElement(By.xpath("//div[@class='a1 aaA aMZ'] "));
  attachment.click();
 
  attachment.sendKeys("F:\\data.xlsx");
  /
    driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
    
    StringSelection s = new StringSelection("F:\\data.xlsx");
    Thread.sleep(4000);
    // Clipboard copy
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
    //identify element and click
    Thread.sleep(4000);
  
    // Robot object creation
    Robot r = new Robot();
    //pressing enter
    r.keyPress(KeyEvent.VK_ENTER);
    //releasing enter
    r.keyRelease(KeyEvent.VK_ENTER);
    //pressing ctrl+v
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    //releasing ctrl+v
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_V);
  //pressing enter
    r.keyPress(KeyEvent.VK_ENTER);
    //releasing enter
    r.keyRelease(KeyEvent.VK_ENTER);
    
    //***************************************************************insert image
// driver.findElement(By.xpath("//div[@class='a2X aaA aMZ']")).click();
// Thread.sleep(4000);
// driver.findElement(By.xpath("//div[text()='Web Address (URL)']")).click();
// Thread.sleep(4000);
// driver.findElement(By.xpath("//input[contains(@class,'picker-urlview-input')]")).sendKeys("https://picsum.photos/seed/picsum/200/300");
// Thread.sleep(4000);
// driver.findElement(By.xpath("(//div[text()='Insert'])[2]")).click();
//    
	}

	@Then("Compose window should open")
	public void compose_window_should_open() throws InterruptedException {
		
		Thread.sleep(4000);
	
	   driver.findElement(By.xpath("//td[contains(@class,'gU Up')]")).click();
	    
	    
	}
*/
}
