package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(how = How.ID, using="username") WebElement eleUsername;
	
	
	// action+elementName
	public LoginPage enterUsername(String username) throws InterruptedException {
		eleUsername.sendKeys(username);
		
		/*
		 * for (WebElement eachEle : eleUsername) {
		 * System.out.println(eachEle.getAttribute("name"));
		 * 
		 * }
		 */
	//	eleUsername.get(0).sendKeys(username);
		

		return this;
	}

	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME, using="decorativeSubmit") WebElement eleLoginButton;

	public HomePage clickLoginButton() {
		eleLoginButton.click();
		return new HomePage(driver);

	}
	
	
	public LoginPage clickLoginButtonForNegative() {
		eleLoginButton.click();
		return this;

	}
	
	//@FindBy(how = How.CLASS_NAME, using="inputLogin") List<WebElement> eleUsername;
	
		//AND condition - @FindBys
		//OR condition - @FindAll
		/*
		 * @FindAll( {
		 * 
		 * @FindBy(how=How.ID, using="username123"),
		 * 
		 * @FindBy(how = How.XPATH, using ="//input[@name='USERNAME']") }
		 * 
		 * ) WebElement eleUsername;
		 */
	
	
	
	
	
	
	

}