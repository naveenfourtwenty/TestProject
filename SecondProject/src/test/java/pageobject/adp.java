package pageobject;

import Initializer.Initialize;

public class adp extends Initialize {

	public static void companyname(String Company_name) {
		getxpath("Companyname_xpath").sendKeys(Company_name);

	}

	public static void login_with_Employee_code(String Username) {

		getxpath("Employeecode_xpath").sendKeys(Username);

	}

	public static void provide_password(String Password) {
		getxpath("password_xpath").sendKeys(Password);

	}

	public static void click_login_button() {

		getxpath("loginbutton_xpath").click();
	}

	public static void click_Payslip_option() {

		getxpath("Payslipoption_xpath").click();
	}

	public static void click_send_email_option() {
		getxpath("email_xpath").click();

	}

	public static void provide_email_address_in_the_pop_up_option_and_send(String Email) {
		getxpath("provideemail_xpath").sendKeys(Email);

	}

}
