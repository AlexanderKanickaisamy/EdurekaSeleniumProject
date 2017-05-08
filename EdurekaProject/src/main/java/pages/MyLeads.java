package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyLeads extends LeafTapsWrappers {

	public MyLeads(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("My Leads | opentaps CRM")) {
			reportStep("This is not MergeLead Page", "FAIL");
		}
	}

	public CreateLead clickCreateLead() {
		clickByLink("Create Lead");
		return new CreateLead(driver,test);
	}

	public FindLeads clickFindLeads() {
		clickByLink("Find Leads");
		return new FindLeads(driver,test);
	}
	public MergeLead clickMergeLeads(){
		clickByLink("Merge Leads");
		return new MergeLead(driver, test);
	}

}
