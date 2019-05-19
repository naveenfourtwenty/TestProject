package TestDefinition;

import java.io.IOException;

import Initializer.DriverFuntions;
import Initializer.Initialize;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobject.adp;

public class TestDefintion extends Initialize {
	@Given("open browser{String}")
	public void open_browser(String browser) throws IOException {
		ob(browser);

	}

	@Then("Enter URL")
	public void enter_URL() {
		DriverFuntions.url();
	}

	@Then("Enter Companyname{String}")
	public void enter_Companyname(String Company_name) {
		adp.companyname(Company_name);

	}

	@Then("login with Employee code{String}")
	public void login_with_Employee_code(String Username) {
		adp.login_with_Employee_code(Username);

	}

	@Then("provide password{String}")
	public void provide_password(String Password) {
		adp.provide_password(Password);
	}

	@Then("click login button")
	public void click_login_button() {
		adp.click_login_button();
	}

	@Then("click Payslip option")
	public void click_Payslip_option() {
		adp.click_Payslip_option();
	}

	@Then("click send email option")
	public void click_send_email_option() {
		adp.click_send_email_option();
	}

	@Then("provide email address in the pop up option and send{String}")
	public void provide_email_address_in_the_pop_up_option_and_send(String Email) {
		adp.provide_email_address_in_the_pop_up_option_and_send(Email);
	}

}
