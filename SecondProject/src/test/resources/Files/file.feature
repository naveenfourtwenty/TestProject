@Test1 
Feature: Testing an payslip site 
Scenario Outline: Login and download payslip 

	Given open browser<browser> 
	Then Enter URL 
	Then Enter Companyname<Company_name> 
	Then login with Employee code<Username> 
	Then provide password<Password> 
	Then click login button 
	Then click Payslip option 
	Then click send email option 
	Then provide email address in the pop up option and send<Email> 
	
	Examples: 
		|browser|Company_name|Username|Password|Email|
		|Chrome|SQSBFSI|tg2271|Asdf@123456|naveenfourtwenty|
		|Chrome|SQSBFSI|tg2183|Sairam@|rdivya07@gmail.com|