package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class Compose_Mail {
	
	 WebDriver driver ;


	@FindBy(xpath="//div[@class='TN bzz aHS-bnt']")
	private WebElement title_Verification;
	
	@FindBy(xpath="//div[@class='T-I T-I-KE L3']")
	private WebElement compose_Btn;
	
	@FindBy(xpath="//input[contains(@class,'agP')]")
	private WebElement to_Field;
	
	@FindBy(xpath="//span[@class='baT']//span[1]")
	private WebElement cc_Link;
	
	@FindBy(xpath = "(//input[@class='agP aFw'])[2]")
	private WebElement cc_Field;
	
	@FindBy(xpath="//span[@class='baT']")
	private WebElement bcc_Link;
	
	@FindBy(xpath="//input[@class='agP aFw'])[3]")
	private WebElement bcc_Field;
	
	@FindBy(xpath="//input[@name='subjectbox']")
	private WebElement subject_Field;
	
	@FindBy(xpath ="//div[@class='dv']")
	private WebElement formatting_Option;
	
	@FindBy(xpath ="//div[contains(text(),'Sans') and @role='option']")
	private  WebElement font_Option;
	
	@FindBy(xpath="//div[@command='+fontName']")
	private WebElement font_Selection;
	
	@FindBy(xpath="//div[@command='+bold']")
	private WebElement bold_Option;
	
	@FindBy(xpath = "//div[@command='+foreColor']")
	private WebElement text_Color;
	
	@FindBy(xpath="//td[@id='T-Kw-Jn8']")
	private WebElement color_Selection;
	
	@FindBy(xpath="//div[@role='textbox']")
	private WebElement message_body;
	
	@FindBy(xpath="//div[@class='a1 aaA aMZ']")
	private WebElement attachment;

	
	 public Compose_Mail(WebDriver driver){
	       this.driver = driver;
	        PageFactory.initElements(driver,this);

	    }
	
	
	public WebElement title() {
	 return title_Verification;
	
		
	}
	
	public void compose_Mail()
	{
	 compose_Btn.click();
	}
	
	public void add_Email_Address(String to)
	{
		to_Field.sendKeys();
	}
	
	public void add_Cc(String cc)
	{
		cc_Link.click();
		cc_Field.sendKeys(cc);
	}
	
	public void add_Bcc(String bcc)
	{
		bcc_Link.click();
		bcc_Field.sendKeys(bcc);
	}
	
	public void select_Formatting_Option()
	{
		formatting_Option.click();
		font_Option.click();
		font_Selection.click();
	}
	
	public void message_Body(String text)
	{
		message_body.sendKeys(text);
	}
	
	public void attach_File() {
		attachment.click();
	}

}
