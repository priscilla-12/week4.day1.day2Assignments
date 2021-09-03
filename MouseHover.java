package week4.day2assignments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// waits for 10 secs to see if the element is in the DOM
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 

		WebElement webTestLeafCourses = driver.findElement(By.xpath("//a[text()='TestLeaf Courses']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(webTestLeafCourses).perform();
		WebElement webSelenium = driver.findElement(By.xpath("//a[text()='Selenium']"));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(webSelenium).perform();
		WebElement webRPA = driver.findElement(By.xpath("//a[text()='RPA']"));
		Actions builder2 = new Actions(driver);
		builder1.moveToElement(webRPA).perform();
		WebElement webWebServices = driver.findElement(By.xpath("//a[text()='WebServices']"));
		Actions builder3 = new Actions(driver);
		builder1.moveToElement(webWebServices).perform();
		
		driver.findElement(By.xpath("//a[text()='RPA']")).click();
		 
		
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = alert.getText();
		System.out.println(" alert text:" + text); 
		 
	    
		alert.accept();  

}}
