package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods {
	
	@Test
	public void login() throws InterruptedException {
		
		new LoginPage(driver)
		.enterUsername("Demosalesmanager")
		.enterPassword("crmsfa")
		.clickLoginButton()
		.verifyHomePage();
		

	}

}