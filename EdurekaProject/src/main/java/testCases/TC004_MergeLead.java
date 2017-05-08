package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

import wrappers.LeafTapsWrappers;

public class TC004_MergeLead extends LeafTapsWrappers {

	@BeforeClass
	public void setData() {
		browserName = "chrome";
		testCaseName = "Merge Lead";
		testDescription = "Merge two Existig Leads";
		category = "smoke";
		authors = "Alexander";
		dataSheetName = "TC009";

	}

	@Test(dataProvider = "fetchData")
	public void mergeLead(String uName, String pwd,String fLead,String tLead,String txtMessage) throws InterruptedException {
		new LoginPage(driver, test).enterUsername(uName).enterPassword(pwd).clickLogin().clickCRMSFA().clickLeads()
				.clickMergeLeads()
				.clickFromLeadIcon()
				.enterLeadIDPopup(fLead)
				.clickFindLeadsPopupButton()
				.clickFirstRecordPopup()
				
				.clickToLeadIcon()
				.enterLeadIDPopup(tLead)
				.clickFindLeadsPopupButton()
				.clickFirstRecordPopup()
				.clickMergeButton()
				.clickMergeLeads()
				.clickFromLeadIcon()
				.enterLeadIDPopup(fLead)
				.clickFindLeadsPopupButton()
				.verifyFirstRecordPopup(txtMessage);

	}

}
