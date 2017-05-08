package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeads;
import pages.LoginPage;

import wrappers.LeafTapsWrappers;

public class TC005_DeleteLead extends LeafTapsWrappers {

	@BeforeClass
	public void setData() {
		browserName = "chrome";
		testCaseName = "Delete Lead";
		testDescription = "Delete an Existing Lead";
		category = "smoke";
		authors = "Alexander";
		dataSheetName = "TC010";

	}

	@Test(dataProvider = "fetchData")
	public void deleteLead(String uName, String pwd,String pNumber,String tMessage) throws InterruptedException {
		
				String firstLeadID=new LoginPage(driver, test)
				.enterUsername(uName)
				.enterPassword(pwd)
				.clickLogin()
				.clickCRMSFA()
				.clickLeads()
				.clickFindLeads()
			    .clickPhonetab()
			    .enterPhoneNumber(pNumber)
			    .clickFindLeadsButton()
			    .getFirstRecord();
				
				new FindLeads(driver, test)
				.clickFirstResultingLead()
				.clickDeleteButton()
				.clickFindLeads()
				.enterLeadID(firstLeadID)
				.clickFindLeadsButton()
				.verifyFirstRecord(tMessage);
	}

}
