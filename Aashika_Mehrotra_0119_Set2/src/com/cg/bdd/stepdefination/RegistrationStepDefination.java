package com.cg.bdd.stepdefination;
import com.cg.bdd.pagebeans.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.bdd.stepdefination.RegistrationStepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefination {

	private WebDriver driver;
	private RegistrationPageBean pageBean;

	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\3000119_Aashika_Mehrotra\\BDDCucumberSelenium\\chromedriver.exe");
		driver=new ChromeDriver();	
	}
	@Given("^User is accessing RegistrationPage on Browser$")
	public void user_is_accessing_RegistrationPage_on_Browser() throws Throwable {
		driver.get("file:///D:/3000119_Aashika_Mehrotra/BDDCucumberSelenium/Aashika_Mehrotra_0119_Set2/WebPages/RegistrationForm.html");
		pageBean = PageFactory.initElements(driver, RegistrationPageBean.class);
	}
	
	@When("^User has filled correct url of registration page$")
	public void user_has_filled_correct_url_of_registration_page() throws Throwable {
		// Do nothing just checking... 
	}

	@Then("^Page Title Should be \"(.*?)\"$") 
	public void page_Title_Should_be(String arg1) throws Throwable { 
		String expectedTittle ="Welcome to JobsWorld"; 
		String actualTittle = driver.getTitle();
		Assert.assertEquals(expectedTittle, actualTittle); 
	}


	@When("^user is trying to submit data without entring 'User Id'$")
	public void user_is_trying_to_submit_data_without_entring_User_Id() throws Throwable {
		pageBean.clickSignUp();
		
	}

	@Then("^'User Id should not be empty / length be between (\\d+) to (\\d+)' alert message should display$")
	public void user_Id_should_not_be_empty_length_be_between_to_alert_message_should_display(int arg1, int arg2) throws Throwable {
		String expectedAlertMessage ="User Id should not be empty / length be between 5 to 12";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	
	}

	@When("^User is trying to enter wrong 'User Id'$")
	public void user_is_trying_to_enter_wrong_User_Id() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setUserId("abcd");
		pageBean.clickSignUp();
	}

	@Then("^'User Id should not be empty / length be between (\\d+) to (\\d+)' alert message should display on invalid 'user Id'$")
	public void user_Id_should_not_be_empty_length_be_between_to_alert_message_should_display_on_invalid_user_Id(int arg1, int arg2) throws Throwable {
		String expectedAlertMessage ="User Id should not be empty / length be between 5 to 12";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}
	
	@When("^User is trying to submit request without entring 'Password'$")
	public void user_is_trying_to_submit_request_without_entring_Password() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setUserId("AashikaM");
		pageBean.clickSignUp();

	}

	@Then("^'Password should not be empty / length be between (\\d+) to (\\d+)' alert message should display$")
	public void password_should_not_be_empty_length_be_between_to_alert_message_should_display(int arg1, int arg2) throws Throwable {
		String expectedAlertMessage ="Password should not be empty / length be between 7 to 12";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);

	}

	@When("^User is trying to submit request by entring wrong 'Password'$")
	public void user_is_trying_to_submit_request_by_entring_wrong_Password() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setPassword("1234A");
		pageBean.clickSignUp();
		
	}

	@Then("^'Password should not be empty / length be between (\\d+) to (\\d+)' alert message should display on invalid 'Password'$")
	public void password_should_not_be_empty_length_be_between_to_alert_message_should_display_on_invalid_Password(int arg1, int arg2) throws Throwable {
		String expectedAlertMessage ="Password should not be empty / length be between 7 to 12";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);

	}

	@When("^User is trying to submit request without entering 'Name'$")
	public void user_is_trying_to_submit_request_without_entering_Name() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setUserId("AashikaM");
		pageBean.setPassword("1435652af");
		pageBean.clickSignUp();
	}

	@Then("^'Username should not be empty and must have alphabet characters only' alert message should display$")
	public void username_should_not_be_empty_and_must_have_alphabet_characters_only_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="Name should not be empty and must have alphabet characters only";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request by entering non alphabet characters in 'Name'$")
	public void user_is_trying_to_submit_request_by_entering_non_alphabet_characters_in_Name() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setUsername("aksd@2134");
		pageBean.clickSignUp();
	}

	@Then("^'Username should not be empty and must have alphabet characters only' alert message should display on invalid 'Name'$")
	public void username_should_not_be_empty_and_must_have_alphabet_characters_only_alert_message_should_display_on_invalid_Name() throws Throwable {
		String expectedAlertMessage ="Name should not be empty and must have alphabet characters only";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without entring  'address'$")
	public void user_is_trying_to_submit_request_without_entring_address() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setUsername("AashikaM");
		pageBean.clickSignUp();
	}

	@Then("^'User address must have alphanumeric characters only' alert message should display$")
	public void user_address_must_have_alphanumeric_characters_only_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="User address must have alphanumeric characters only";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);

	}

	@When("^User is trying to submit request by entering invalid 'address'$")
	public void user_is_trying_to_submit_request_by_entering_invalid_address() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setAddress("asgag@zf#fhg");
		pageBean.clickSignUp();

	}

	@Then("^'User address must have alphanumeric characters only' alert message should display on invalid address$")
	public void user_address_must_have_alphanumeric_characters_only_alert_message_should_display_on_invalid_address() throws Throwable {
		String expectedAlertMessage ="User address must have alphanumeric characters only";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);

	}

	@When("^User is trying to submit request without selecting  valid 'country'$")
	public void user_is_trying_to_submit_request_without_selecting_valid_country() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setAddress("ashgasjjhgfakshg");
		pageBean.clickSignUp();

	}

	@Then("^'Select your country from the list' alert message should display$")
	public void select_your_country_from_the_list_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="Select your country from the list";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);

	}

	@When("^User is trying to submit request without entring valid 'zipCode'$")
	public void user_is_trying_to_submit_request_without_entring_valid_zipCode() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setCountry("India");
		pageBean.setZip("azfs124");
		pageBean.clickSignUp();

	}

	@Then("^'ZIP code must have numeric characters only' alert message should display$")
	public void zip_code_must_have_numeric_characters_only_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="ZIP code must have numeric characters only";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);

	}

	@When("^User is trying to submit request without entring valid 'email'$")
	public void user_is_trying_to_submit_request_without_entring_valid_email() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setZip("12345");
		pageBean.setEmail("Aashika@");
		pageBean.clickSignUp();

	}

	@Then("^'You have entered an invalid email address!' alert message should display$")
	public void you_have_entered_an_invalid_email_address_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="You have entered an invalid email address!";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);

	}

	@When("^User is trying to submit request without entring valid 'gender'$")
	public void user_is_trying_to_submit_request_without_entring_valid_gender() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setEmail("aashikamehrotra@gmail.com");
		pageBean.clickSignUp();

	}

	@Then("^'Please Select gender' alert message should display$")
	public void please_Select_gender_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="Please Select gender";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);

	}

	@When("^User is trying to submit request after entring valid set of information$")
	public void user_is_trying_to_submit_request_after_entring_valid_set_of_information() throws Throwable {
		pageBean.setUserId("AashikaM");
		pageBean.setUsername("Mehrotra");
		pageBean.setPassword("abcd1234");
		pageBean.setAddress("Pune");
		pageBean.setCountry("India");
		pageBean.setZip("423011");
		pageBean.setEmail("aashikamehrotra05@gmail.com");
		pageBean.setGender("Female");
		pageBean.clickSignUp();

	}

	@Then("^'Your Registration with JobsWorld\\.com has successfully done plz check your registred email addres to activate your profile' alert message should display$")
	public void your_Registration_with_JobsWorld_com_has_successfully_done_plz_check_your_registred_email_addres_to_activate_your_profile_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Your Registration with JobsWorld.com has successfully done plz check your registred email addres to activate your profile";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@After
	public void tearDownStepEnv() {
		driver.switchTo().alert().dismiss();
//		driver.close();
	}
}