package stepDefination;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.BaseClass;
import pageObject.Compose_Mail;
import pageObject.Login;
import utilities.Common_Action;
import utilities.Config_Reader;

public class Gmail_Stepdef extends BaseClass {

	Config_Reader config;
	Common_Action utils; 
   Login log;
   Compose_Mail compose;
	
	

@Given("User navigates to the website gmail.com")
public void user_navigates_to_the_website_gmail_com() {
	
	
	BaseClass.browserSelect("Chrome");
	config = new  Config_Reader();
	driver.get(config.getApplicationUrl());
	driver.manage().window().maximize();
}





	@When("Enter valid credientials")
	public void enter_valid_credientials() {
		 log= new Login(driver);
	    log.enter_Id(config.getUserName());
	}

	@Then("Log in successfully")
	public void log_in_successfully() throws InterruptedException {
		 log.enter_Pass(config.getPassword());
	     Thread.sleep(5000);
	}	
	
    


@Given("User click on compose mail and compose window openedt")
public void user_click_on_compose_mail_and_compose_window_openedt() {
	 compose = new Compose_Mail(driver);
		Assert.assertEquals(false, false);
	
	compose.compose_Mail();

	
	
}


@When("Add recipient's  address ie. To , CC \\(carbon copy) , BCC \\(blind carbon copy) fields")
public void add_recipient_s_address_ie_to_cc_carbon_copy_bcc_blind_carbon_copy_fields() {
  Assert.assertEquals(false, false);
}

@When("Select Formatting  Option to change font, make bold  & change text color")
public void select_formatting_option_to_change_font_make_bold_change_text_color() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Add Subject and Message body")
public void add_subject_and_message_body() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Attach the file")
public void attach_the_file() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("click on send option")
public void click_on_send_option() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("email is successfully sent")
public void email_is_successfully_sent() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



}
