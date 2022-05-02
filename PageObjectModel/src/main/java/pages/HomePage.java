package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage(ChromeDriver driver) {
		this.driver = driver;

	}

	public LoginPage clickLogoutButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

		return new LoginPage(driver);
	}

	public HomePage verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}

	public MyHomePage clickCrmSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();

		return new MyHomePage(driver);

	}

}

