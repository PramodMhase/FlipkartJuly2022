package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class AddToCart 
{
	@When("^User Navigate to Electronics tab$")
	public void user_Navigate_to_Electronics_tab() throws Throwable 
	{
		Object[] input21 = new Object[1];
		input21[0]="//*[text()='Electronics']";
		Hashtable<String, Object> output21 =SeleniumOperations.MoveToElement(input21);
		HTMLReportGenerator.StepDetails(output21.get("STATUS").toString(), "^User Navigate to Electronics tab$", output21.get("MESSAGE").toString());
	}

	@When("^User click on OPPO link under mobile$")
	public void user_click_on_OPPO_link_under_mobile() throws Throwable 
	{
		Object[] input22 = new Object[1];
		input22[0]="//*[text()='OPPO']";
		Hashtable<String, Object> output22 =SeleniumOperations.ClickOnElement(input22);
		HTMLReportGenerator.StepDetails(output22.get("STATUS").toString(), "^User click on OPPO link under mobile$", output22.get("MESSAGE").toString());
	}

	@When("^User click on Required OPPO mobile link$")
	public void user_click_on_Required_OPPO_mobile_link() throws Throwable
	{
		Object[] input23 = new Object[1];
		input23[0]="(//*[@class='s1Q9rs'])[3]";
		Hashtable<String, Object> output23 =SeleniumOperations.ClickOnElement(input23);
		HTMLReportGenerator.StepDetails(output23.get("STATUS").toString(), "^User click on Required OPPO mobile link$", output23.get("MESSAGE").toString());
	}

	@When("^user Switch to new open tab for OPPO$")
	public void user_Switch_to_new_open_tab_for_OPPO() throws Throwable 
	{
		Hashtable<String, Object> output24 =SeleniumOperations.SwitchToWindow();
		HTMLReportGenerator.StepDetails(output24.get("STATUS").toString(), "^user Switch to new open tab for OPPO$", output24.get("MESSAGE").toString());	
	}

	@When("^User Click on Add To Cart$")
	public void user_Click_on_Add_To_Cart() throws Throwable 
	{
		Object[] input25 = new Object[1];
		input25[0]="//*[@class='_2KpZ6l _2U9uOA _3v1-ww']";
		Hashtable<String, Object> output25 =SeleniumOperations.ClickOnElement(input25);
		HTMLReportGenerator.StepDetails(output25.get("STATUS").toString(), "^User Click on Add To Cart$", output25.get("MESSAGE").toString());	
	}
	@When ("^User click on Cart link$")
	public void User_click_on_Cart_link() throws Throwable
	{
		Object[] input26 = new Object[1];
		input26[0]="//*[text()='Cart']";
		Hashtable<String, Object> output26 =SeleniumOperations.ClickOnElement(input26);
		HTMLReportGenerator.StepDetails(output26.get("STATUS").toString(), "^User click on Cart link$", output26.get("MESSAGE").toString());	
	}
	@Then ("^User Validate item added in Cart$")
	public void User_Validate_item_added_in_Cart() throws Throwable
	{
		Object[] input27 = new Object[2];
		input27[0]="OPPO A12 (Blue, 32 GB)";
		input27[1]="//*[text()='OPPO A12 (Blue, 32 GB)']";	
		Hashtable<String, Object> output27 =SeleniumOperations.ValidationByGetText(input27);
		HTMLReportGenerator.StepDetails(output27.get("STATUS").toString(), "^User Validate item added in Cart$", output27.get("MESSAGE").toString());	
	}	
}