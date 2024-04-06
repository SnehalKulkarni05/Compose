package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common_Action {
	
	  public static WebElement waitForElement(WebDriver driver, WebElement webElement) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	        return wait.until(ExpectedConditions.visibilityOf(webElement));
	    }
	

}
