package week4.day2assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryuiDraggable {
	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		 
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("https://jqueryui.com/draggable");
		 
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	 
				
				Actions builder = new Actions(driver);
				WebElement drag = driver.findElement(By.id("draggable"));
				 
				builder.dragAndDropBy(drag, 120, 120).perform();

}}
