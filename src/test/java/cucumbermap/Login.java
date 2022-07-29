package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login 
{
	@Given ("^user open browser with \"(.*)\" exe$")
	public void bLaunch(String browser) throws Throwable
	{
		Object[] input = new Object[1];
		input[0]=browser;
		SeleniumOperations.BrowserLaunch(input);
		Thread.sleep(3000);
	}
	
	@Given ("^user enter url as$")
	public void OpenApplication()
	{
		SeleniumOperations.OpenApplication();
	}
	
	@When("^user click on initial login page$")
	public void user_click_on_initial_login_page() throws Throwable 
	{
		Object[] input2 = new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		Hashtable<String, Object> output2 =SeleniumOperations.ClickOnElement(input2);
		HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "^user click on initial login page$", output2.get("MESSAGE").toString());
	}

	@When("^user navigate on login button$")
	public void user_navigate_on_login_button() throws Throwable
	{
		Object[] input3 = new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		Hashtable<String, Object> output3 =SeleniumOperations.MoveToElement(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user navigate on login button$", output3.get("MESSAGE").toString());
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable 
	{
		Object[] input4 = new Object[1];
		input4[0]="//*[text()='My Profile']";
		Hashtable<String, Object> output4 =SeleniumOperations.ClickOnElement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on Login button$", output4.get("MESSAGE").toString());
		Thread.sleep(3000);
	}

	@When("^user enter valid Username as (.+)$")
	public void user_enter_valid_Username_as(String username) throws Throwable 
	{
		Object[] input5 = new Object[2];
		input5[0]="(//*[@type='text'])[2]";
		input5[1]=username;
		Hashtable<String, Object> output5 =SeleniumOperations.SendTextOnUI(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter valid Username as (.+)$", output5.get("MESSAGE").toString());
	}

	@When("^user enter valid Password as (.+)$")
	public void user_enter_valid_Password_as(String password) throws Throwable 
	{
		Object[] input6 = new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]=password;
		Hashtable<String, Object> output6 =SeleniumOperations.SendTextOnUI(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter valid Password as (.+)$", output6.get("MESSAGE").toString());
		Thread.sleep(3000);
	}

	@When("^user click on final Login button$")
	public void user_click_on_final_Login_button() throws Throwable 
	{
		Object[] input7 = new Object[1];
		input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		Hashtable<String, Object> output7 =SeleniumOperations.ClickOnElement(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on final Login button$", output7.get("MESSAGE").toString());
		Thread.sleep(4000);
	}

	@Then("^application shows user login successfully$")
	public void application_shows_user_login_successfully() throws Throwable 
	{
		Object[] input8 = new Object[2];
		input8[0]="PRAMOD MHASE";
		input8[1]="//*[text()='PRAMOD MHASE']";	
		Hashtable<String, Object> output8 =SeleniumOperations.ValidationByGetText(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^application shows user login successfully$", output8.get("MESSAGE").toString());
		Thread.sleep(3000);	
	}
}