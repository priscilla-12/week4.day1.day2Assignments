package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;

	}

	public ViewLeadPage verifyFirstName() {
		System.out.println("FirstName displayed");
		return this;

	}

}
