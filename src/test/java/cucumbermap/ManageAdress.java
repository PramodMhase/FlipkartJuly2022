package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ManageAdress 
{
	@When("^User click on Manage Addresses tab$")
	public void user_click_on_Manage_Addresses_tab() throws Throwable 
	{
		Object[] input9 = new Object[1];
		input9[0]="(//*[@class='NS64GK'])[1]";
		Hashtable<String, Object> output9 =SeleniumOperations.ClickOnElement(input9);
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "^User click on Manage Addresses tab$", output9.get("MESSAGE").toString());
		Thread.sleep(4000);
	}

	@When("^User Click on ADD A NEW ADDRESS$")
	public void user_Click_on_ADD_A_NEW_ADDRESS() throws Throwable 
	{
		Object[] input10 = new Object[1];
		input10[0]="//*[@class='_1QhEVk']";
		Hashtable<String, Object> output10 =SeleniumOperations.ClickOnElement(input10);
		HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "^User Click on ADD A NEW ADDRESS$", output10.get("MESSAGE").toString());
		Thread.sleep(4000);
	}

	@When("^User enter name as \"([^\"]*)\"$")
	public void user_enter_name_as(String Name) throws Throwable 
	{
		Object[] input11 = new Object[2];
		input11[0]="(//*[@class='_1w3ZZo _2mFmU7'])[1]";
		input11[1]=Name;
		Hashtable<String, Object> output11 =SeleniumOperations.SendTextOnUI(input11);
		HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(), "^User enter name as \"([^\"]*)\"$", output11.get("MESSAGE").toString());
	}

	@When("^User enter ten digit mobile number as \"([^\"]*)\"$")
	public void user_enter_digit_mobile_number_as(String MobileNumber) throws Throwable 
	{
		Object[] input12 = new Object[2];
		input12[0]="(//*[@class='_1w3ZZo _2mFmU7'])[2]";
		input12[1]=MobileNumber;
		Hashtable<String, Object> output12 =SeleniumOperations.SendTextOnUI(input12);
		HTMLReportGenerator.StepDetails(output12.get("STATUS").toString(), "^User enter ten digit mobile number as \"([^\"]*)\"$", output12.get("MESSAGE").toString());
	}

	@When("^User enter pin code as \"([^\"]*)\"$")
	public void user_enter_pin_code_as(String PinCode) throws Throwable 
	{
		Object[] input13 = new Object[2];
		input13[0]="(//*[@class='_1w3ZZo _2mFmU7'])[3]";
		input13[1]=PinCode;
		Hashtable<String, Object> output13 =SeleniumOperations.SendTextOnUI(input13);
		HTMLReportGenerator.StepDetails(output13.get("STATUS").toString(), "^User enter pin code as \"([^\"]*)\"$", output13.get("MESSAGE").toString());
	}
	
	@When("^User enter Locality as \"([^\"]*)\"$")
	public void user_enter_Locality_as(String Locality) throws Throwable 
	{
		Object[] input14 = new Object[2];
		input14[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
		input14[1]=Locality;
		Hashtable<String, Object> output14 =SeleniumOperations.SendTextOnUI(input14);
		HTMLReportGenerator.StepDetails(output14.get("STATUS").toString(), "^User enter Locality as \"([^\"]*)\"$", output14.get("MESSAGE").toString());
	}

	@When("^User enter address as \"([^\"]*)\"$")
	public void user_enter_address_as(String AddLine1) throws Throwable 
	{
		Object[] input15 = new Object[2];
		input15[0]="//*[@name='addressLine1']";
		input15[1]=AddLine1;
		Hashtable<String, Object> output15 =SeleniumOperations.SendTextOnUI(input15);
		HTMLReportGenerator.StepDetails(output15.get("STATUS").toString(), "^User enter address as \"([^\"]*)\"$", output15.get("MESSAGE").toString());
		Thread.sleep(4000);
	}

	@When("^User enter Landmark as \"([^\"]*)\"$")
	public void user_enter_Landmark_as(String LandMark) throws Throwable 
	{
		Object[] input16 = new Object[2];
		input16[0]="(//*[@class='_1w3ZZo _2mFmU7'])[6]";
		input16[1]=LandMark;
		Hashtable<String, Object> output16 =SeleniumOperations.SendTextOnUI(input16);
		HTMLReportGenerator.StepDetails(output16.get("STATUS").toString(),"^User enter Landmark as \"([^\"]*)\"$", output16.get("MESSAGE").toString());
		Thread.sleep(4000);
	}

	@When("^User enter Alternate phone as \"([^\"]*)\"$")
	public void user_enter_Alternate_phone_as(String AltrnateMob) throws Throwable 
	{
		Object[] input17 = new Object[2];
		input17[0]="(//*[@class='_1w3ZZo _2mFmU7'])[7]";
		input17[1]=AltrnateMob;
		Hashtable<String, Object> output17 =SeleniumOperations.SendTextOnUI(input17);
		HTMLReportGenerator.StepDetails(output17.get("STATUS").toString(), "^User enter Alternate phone as \"([^\"]*)\"$", output17.get("MESSAGE").toString());
		Thread.sleep(4000);
	}

	@When("^User Click on Adress type radio button Home$")
	public void user_Click_on_Adress_type_radio_button_Home() throws Throwable 
	{
		Object[] input18 = new Object[1];
		input18[0]="//*[text()='Home']";
		Hashtable<String, Object> output18 =SeleniumOperations.ClickOnElement(input18);
		HTMLReportGenerator.StepDetails(output18.get("STATUS").toString(), "^User Click on Adress type radio button Home$", output18.get("MESSAGE").toString());
		Thread.sleep(4000);
	}

	@When("^User Click on save button$")
	public void user_Click_on_save_button() throws Throwable 
	{
		Object[] input19 = new Object[1];
		input19[0]="//*[@tabindex='10']";
		Hashtable<String, Object> output19 =SeleniumOperations.ClickOnElement(input19);
		HTMLReportGenerator.StepDetails(output19.get("STATUS").toString(), "^User Click on save button$", output19.get("MESSAGE").toString());
		Thread.sleep(4000);
	}
	
	@Then("^application shows user address updated successfully$")
	public void application_shows_user_login_successfully() throws Throwable 
	{
		Object[] input20 = new Object[2];
		input20[0]="7722087357";
		input20[1]="//*[text()='7722087357']";	
		Hashtable<String, Object> output20 =SeleniumOperations.ValidationByGetText(input20);
		HTMLReportGenerator.StepDetails(output20.get("STATUS").toString(), "^application shows user address updated successfully$", output20.get("MESSAGE").toString());
		Thread.sleep(3000);	
	}
	
}