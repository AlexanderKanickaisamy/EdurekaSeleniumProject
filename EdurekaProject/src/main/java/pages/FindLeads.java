package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeads extends LeafTapsWrappers {

	public FindLeads(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Find Leads | opentaps CRM")) {
			reportStep("This is not Find Leads Page", "FAIL");
		}
	}
	
	public FindLeads enterFirstname(String data){
		enterByXpath("(//input[@name='firstName'])[3]", data);
		return this;
	}
	
	public FindLeads enterLeadID(String data) {
		System.out.println(data);
		enterByName("id", data);
		return this;
	}
	
	

	public FindLeads clickEmailtab() {
		clickByXpath("//span[contains(text(),'Email')]");
		return this;
	}

	public FindLeads clickPhonetab() {
		clickByXpath("//span[contains(text(),'Phone')]");
		return this;
	}

	public FindLeads enterEmailAddress(String data) {
		enterByName("emailAddress", data);
		return this;
	}

	public FindLeads enterPhoneNumber(String data) {
		enterByName("phoneNumber", data);
		return this;
	}
	public FindLeads clickFindLeadsButton() throws InterruptedException {
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(5000);
		/*
		 * HomePage hm = new HomePage(); return hm;
		 */
		return this;
	}

	public FindLeads verifyFirstRecord(String data) {
	verifyTextByXpath("//div[text()='No records to display']", data);
	return this;
	}
	
	public String getFirstRecord(){
		 String text=getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		return text;
	}
	

	
	public ViewLead clickFirstResultingLead() {
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		/*
		 * HomePage hm = new HomePage(); return hm;
		 */
		return new ViewLead(driver, test);
	}
	}

