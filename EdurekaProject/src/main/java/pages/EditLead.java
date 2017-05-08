package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLead extends LeafTapsWrappers {

	public EditLead(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("opentaps CRM")) {
			reportStep("This is not Edit Lead Page", "FAIL");
		}
	}

	public EditLead editCompanyName(String data) {
		enterById("updateLeadForm_companyName", data);
		return this;
	}

	public ViewLead submitEditLeadButton() throws InterruptedException {
		clickByName("submitButton");
		Thread.sleep(5000);
		return new ViewLead(driver,test);
	}

	
}
