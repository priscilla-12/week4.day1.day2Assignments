package week4.day2assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryuiResizable {
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriverManager.chromedriver().setup();
		 
		ChromeDriver driver = new ChromeDriver();
	 
		driver.get("https://jqueryui.com/resizable");
		 
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions actions = new Actions(driver); 

		driver.switchTo().frame(0);
		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		
		actions.clickAndHold(resize).moveByOffset(120, 120).perform();
}}
