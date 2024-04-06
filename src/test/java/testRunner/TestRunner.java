package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	      features="src/test/java/feature/Compose_Functionality.feature",
	      glue= "stepDefination",
	      plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	      
		)



class TestRunner extends AbstractTestNGCucumberTests
{
	

	//parallel scenarioes using testng
	
	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios()
	
	{
		return super.scenarios();
	}
	
	
}


// for parallel sceario->testng cucumber use surefire plugin tag-> inside <parallel> true </parallel> ---> junit not possible with testng