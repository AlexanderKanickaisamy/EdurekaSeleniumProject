package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ViewLead;
import wrappers.LeafTapsWrappers;

public class TC003_DuplicateLead extends LeafTapsWrappers {

	@BeforeClass
	public void setData() {
		browserName = "chrome";
		testCaseName = "Duplicate Lead";
		testDescription = "Duplicate an Existing Lead";
		category = "smoke";
		authors = "Alexander";
		dataSheetName = "TC008";

	}

	@Test(dataProvider = "fetchData")
	public void duplicateLead(String uName, String pwd, String eid) throws InterruptedException {

		String firstName = new LoginPage(driver, test).enterUsername(uName).enterPassword(pwd).clickLogin()
				.clickCRMSFA().clickLeads().clickFindLeads().clickEmailtab().enterEmailAddress(eid)

				.clickFindLeadsButton().clickFirstResultingLead().getFirstName();

		new ViewLead(driver, test).clickDuplicateButton().clickCreateLeadButton().verifyFirstName(firstName);

	}

}
