package steps;


import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.selenium.jidhraj.DriverUtils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

WebDriver driver=DriverUtils.getDriver("chrome");
@Given("^I want to write a step with precondition$")
public void i_want_to_write_a_step_with_precondition() throws Throwable {
    
	driver.get("http://automationpractice.com");
  
}

@Given("^some other precondition$")
public void some_other_precondition() throws Throwable {
    
  Assert.fail();
}

@When("^I complete action$")
public void i_complete_action() throws Throwable {
    
  
}

@When("^some other action$")
public void some_other_action() throws Throwable {
    
  
}

@When("^yet another action$")
public void yet_another_action() throws Throwable {
    
  
}

@Then("^I validate the outcomes$")
public void i_validate_the_outcomes() throws Throwable {
    
  
}

@Then("^check more outcomes$")
public void check_more_outcomes() throws Throwable {
    
  
}

@Given("^I want to write a step with name(\\d+)$")
public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
    
  
}

@When("^I check for the (\\d+) in step$")
public void i_check_for_the_in_step(int arg1) throws Throwable {

  
}

@Then("^I verify the success in step$")
public void i_verify_the_success_in_step() throws Throwable {
    
  
}

@Then("^I verify the Fail in step$")
public void i_verify_the_Fail_in_step() throws Throwable {
    
  
}


@After
 public void tearDown(Scenario scenario) {
   try {
     if (scenario.isFailed()) {
       final byte[] screenshot = ((TakesScreenshot) driver)
           .getScreenshotAs(OutputType.BYTES);
       scenario.embed(screenshot, "image/png");
     }
   } finally {
     driver.quit();
   }
 }


	
}
