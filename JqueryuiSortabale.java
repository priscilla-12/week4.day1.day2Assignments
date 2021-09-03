package week4.day2assignments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class JqueryuiSortabale {
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriverManager.chromedriver().setup();
		 
		ChromeDriver driver = new ChromeDriver();
	 
		driver.get("https://jqueryui.com/sortable/");
		 
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 

		driver.switchTo().frame(0);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		Actions builder = new Actions(driver);
		Point location = item5.getLocation(); 
		int x = location.getX();
		int y = location.getY();
		Thread.sleep(2000);
	 
		builder.dragAndDropBy(item1, x, y).perform();

		
		 
	}

}


