package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLead extends LeafTapsWrappers {

	public MergeLead(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Merge Leads | opentaps CRM")) {
			reportStep("This is not Merge Lead Page", "FAIL");
		}
	}

	public FindLeadsPopup clickFromLeadIcon() {
		clickByXpath("//img[@alt='Lookup'][1]");
		switchToLastWindow();
		return new FindLeadsPopup(driver, test);
	}
	
	public FindLeadsPopup clickToLeadIcon() {
		clickByXpath("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		return new FindLeadsPopup(driver, test);
	}
	
	public ViewLead clickMergeButton() throws InterruptedException{
		clickByLinkNoSnap("Merge");

		Thread.sleep(2000);
		acceptAlert();
		return new ViewLead(driver, test);
	}
	
	
}
