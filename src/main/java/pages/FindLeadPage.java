package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadPage extends LeafTapsWrappers {

	public FindLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver  =driver;
		this.test  =test;
		if (verifyTitle("Find Leads | opentaps CRM") == false) {
			reportStep("This is not Find Leads Page", "Fail");
		}
	}
	public FindLeadPage enterFirstName() {
		enterByName("firstName", "Lata");
		return this;
	}
	public FindLeadPage clickFindLeads() {
		clickByClassName("x-btn-text");
		return this;
	}
	
	public ViewLeadPage clickFirstLink() {
		clickByLink("11098");
		return new ViewLeadPage(driver,test);
	}
}
