package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

import wrappers.LeafTapsWrappers;

public class TC001_CreateLead extends LeafTapsWrappers {

	@BeforeClass
	public void setData() {
		browserName = "chrome";
		testCaseName = "Create Lead";
		testDescription = "Create a New Lead";
		category = "smoke";
		authors = "Alexander";
		dataSheetName = "TC006";

	}

	@Test(dataProvider = "fetchData")
	public void createLead(String uName, String pwd, String CN, String FN, String LN) {
		new LoginPage(driver, test).enterUsername(uName).enterPassword(pwd).clickLogin().clickCRMSFA().clickLeads()
				.clickCreateLead()
				.enterCompanyName(CN).enterFirstName(FN).enterLastName(LN).clickCreateLeadButton();

	}

}
