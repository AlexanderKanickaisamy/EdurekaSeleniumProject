package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class DuplicateLead extends LeafTapsWrappers {

	public DuplicateLead(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Create Lead | opentaps CRM")) {
			reportStep("This is not Create Lead Page", "FAIL");
		}
	}



	public ViewLead clickCreateLeadButton() {
		clickByClassName("smallSubmit");
		/*
		 * HomePage hm = new HomePage(); return hm;
		 */
		return new ViewLead(driver, test);
	}

}
