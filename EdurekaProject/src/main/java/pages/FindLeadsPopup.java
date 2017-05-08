package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadsPopup extends LeafTapsWrappers {

	public FindLeadsPopup(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Find Leads")) {
			reportStep("This is not Find Leads Pop Up Page", "FAIL");
		}
	}

	public FindLeadsPopup verifyFirstRecordPopup(String data) {
		verifyTextByXpath("//div[text()='No records to display']", data);
		return this;
		}
		

		public FindLeadsPopup enterLeadIDPopup(String data) {
			enterByName("id", data);
			return this;
		}
		
		public FindLeadsPopup clickFindLeadsPopupButton() throws InterruptedException {
			clickByXpath("//button[contains(text(),'Find Leads')]");
			Thread.sleep(7000);
			return this;
		}
		
		public MergeLead clickFirstRecordPopup(){
			clickByXpathNoSnap("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a");
			switchToParentWindow();
			return new MergeLead(driver, test);
		}

	}





