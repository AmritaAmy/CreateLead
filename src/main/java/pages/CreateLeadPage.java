package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers {
	
	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver  =driver;
		this.test  =test;
		if (verifyTitle("Create Lead | opentaps CRM") == false) {
			reportStep("This is not Create Leads Page", "Fail");
		}
	}
	
	public CreateLeadPage enterCompanyName() {
		enterById("createLeadForm_companyName", "Moolya");
		return this;
	}
	public CreateLeadPage enterFirstName() {
		enterById("createLeadForm_firstName", "Lata");
		return this;
	}
	public CreateLeadPage enterLastName() {
		enterById("createLeadForm_lastName", "Naik");
		return this;
	}
	public ViewLeadPage clickCreateLead() {
		clickByName("submitButton");
		return new ViewLeadPage(driver,test);
	}
	
}
