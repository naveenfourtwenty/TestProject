package Initializer;

public class DriverFuntions extends Initialize {

	public static void url() {
		wd.get("https://www.ess.adp.in/ESS4/default.aspx");
		wd.manage().window().maximize();
	}

}
