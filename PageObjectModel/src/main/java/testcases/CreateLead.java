package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setFileName() {
		fileName = "CreateLead";

	}
	
	@Test(dataProvider = "sendData")
	public void runCreateLead(String username,String password,String fName, String lName, String company) throws InterruptedException {
		
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmSFA()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterCompanyName(company)
		.clickCreateLeadButton()
		.verifyFirstName();
		

	}

}