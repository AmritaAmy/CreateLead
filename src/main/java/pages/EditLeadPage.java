package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLeadPage extends LeafTapsWrappers  {

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver  =driver;
		this.test  =test;
		if (verifyTitle(" opentaps CRM") == false) {
			reportStep("This is not Edit Leads Page", "Fail");
		}
	}
	public EditLeadPage updateFirstName() {
		enterById("updateLeadForm_firstName", "LATA");
		return this;
	}
	public ViewLeadPage clickUpdate() {
		clickByClassName("smallSubmit");
		return new ViewLeadPage(driver,test);
	}
	
}
