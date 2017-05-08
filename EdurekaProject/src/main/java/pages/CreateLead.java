package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLead extends LeafTapsWrappers {

	public CreateLead(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Create Lead | opentaps CRM")) {
			reportStep("This is not Create Lead Page", "FAIL");
		}
	}

	public CreateLead enterCompanyName(String data) {
		enterById("createLeadForm_companyName", data);
		return this;
	}

	public CreateLead enterFirstName(String data) {
		enterById("createLeadForm_firstName", data);
		return this;
	}

	public CreateLead enterLastName(String data) {
		enterById("createLeadForm_lastName", data);
		return this;
	}

	public ViewLead clickCreateLeadButton() {
		clickByClassName("smallSubmit");
		/*
		 * HomePage hm = new HomePage(); return hm;
		 */
		return new ViewLead(driver, test);
	}

}
