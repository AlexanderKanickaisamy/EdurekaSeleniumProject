package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLead extends LeafTapsWrappers{

	public ViewLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not ViewLead Page", "FAIL");
		}
	}
	
	public EditLead clickEditLink(){
		clickByLink("Edit");
		return new EditLead(driver,test);
	}
	

	public ViewLead verifyUpdatedCompanyText(String text){
		verifyTextContainsById("viewLead_companyName_sp", text);
		return this;
	}
	
	public String getFirstName(){
		String textFName =getTextById("viewLead_firstName_sp");
		System.out.println(textFName);
		return textFName;
	}
	
	
	public ViewLead verifyFirstName(String data){
		verifyTextById("viewLead_firstName_sp", data);
		return this;
		
	}
	
	
	public MyLeads clickDeleteButton() {
		clickByLink("Delete");
		return new MyLeads(driver, test);
		
	}
	
	public DuplicateLead clickDuplicateButton() {
		clickByLink("Duplicate Lead");
		return new DuplicateLead(driver, test);
		
	}
	
	public MergeLead clickMergeLeads(){
		clickByLink("Merge Leads");
		return new MergeLead(driver, test);
	}
	
}













	





























