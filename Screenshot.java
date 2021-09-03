package week4.day1assignments;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot  {
	public static void main(String[] args) throws IOException   {
	  
			WebDriverManager.chromedriver().setup();
			 
			
			ChromeOptions options = new ChromeOptions();
			 
			
			ChromeDriver driver = new ChromeDriver(options);
			driver.get("http://leafground.com/pages/frame.html");
			WebElement goToClickMe = driver.findElement(By.id("ClickMe"));
			File src1 = goToClickMe.getScreenshotAs(OutputType.FILE);
			File dst = new File("./snaps/frame.png");
			FileUtils.copyFile(src1, dst);
			

}}
