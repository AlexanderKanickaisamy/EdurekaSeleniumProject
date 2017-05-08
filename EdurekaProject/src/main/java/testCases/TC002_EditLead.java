package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

import wrappers.LeafTapsWrappers;

public class TC002_EditLead extends LeafTapsWrappers {

	@BeforeClass
	public void setData() {
		browserName = "chrome";
		testCaseName = "Edit Lead";
		testDescription = "Edit an Existing Lead";
		category = "smoke";
		authors = "Alexander";
		dataSheetName = "TC007";

	}

	@Test(dataProvider = "fetchData")
	public void editLead(String uName, String pwd, String email, String cname, String expcname) throws InterruptedException {
		new LoginPage(driver, test).enterUsername(uName).enterPassword(pwd).clickLogin().clickCRMSFA().clickLeads()
				.clickFindLeads().clickEmailtab().enterEmailAddress(email).clickFindLeadsButton()
				.clickFirstResultingLead().clickEditLink().editCompanyName(cname).submitEditLeadButton()
				.verifyUpdatedCompanyText(expcname);

	}

}
