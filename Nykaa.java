package week4.day2assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
	 
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("https://www.nykaa.com/");
		 
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement webbrands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
	    builder.moveToElement(webbrands).perform();
	     
	 
	 		driver.findElement(By.xpath("//ul[@class='l-vertical-list']//li[5]/a")).click();

	 	 
	 		Set<String> windowHandles = driver.getWindowHandles();
	 		List<String> tabs = new ArrayList<String>(windowHandles);
	 		driver.switchTo().window(tabs.get(1));

	 	 
	 		String title = driver.getTitle();
	 		if (title.contains("L'Oreal Paris")) {
	 			System.out.println("Matching");
	 		} else
	 			System.out.println("Not Matching");

	 		 
	 		Thread.sleep(1000);
	 		driver.findElement(By.xpath("//span[@class='value']")).click();
 
	 		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();

	 	 
	 		Thread.sleep(1000);
	 		driver.findElement(By.xpath("//div[text()='Category']")).click();
	 		driver.findElement(By.xpath("//span[text()='Hair']")).click();
	 		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
	 		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();

	 		 
	 		Thread.sleep(1000);
	 		WebElement filter = driver.findElement(By.xpath("(//label[@class='control control--checkbox'])[1]/div"));
	 		boolean check = filter.isEnabled();
	 		if (check == true) {
	 			System.out.println("Filter is applied with Shampoo");

	 		} else
	 			System.out.println("Filter is not applied with Shampoo");

	 		 
	 		Thread.sleep(1000);
	 		driver.findElement(By.xpath("(//div[@class='m-content__product-list__title'])[12]")).click();

	 	 
	 		Set<String> S = driver.getWindowHandles();
	 		List<String> List = new ArrayList<String>(S);
	 		driver.switchTo().window(List.get(2));
	 	 
	 		Thread.sleep(1000);

	 		 
	 		driver.findElement(By.xpath("//span[text()='360ml']")).click();

	 	 
	 		String text = driver.findElement(By.xpath("//span[text()='282']")).getText();

	 		System.out.println("MRP of the product :" + text);

	 	 
	 		driver.findElement(By.xpath("//div[@class='pull-left']//button")).click();

	  
	 		driver.switchTo().window(tabs.get(0));

	 		driver.findElement(By.xpath("//button[@class='css-5s18zx eoh7kvv0']")).click();
	 		WebElement Frame = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
	 		driver.switchTo().frame(Frame);

	 	 
	 		String text2 = driver.findElement(By.xpath("(//div[@class='value'])[4]")).getText();
	 		String Total1 = text2.replaceAll("[^0-9]", "");
	 		int X = Integer.parseInt(Total1);
	 		System.out.println(X);

	 	 
	 		driver.findElement(By.xpath("//div[@class='second-col']")).click();

	 		 
	 		driver.findElement(By.xpath("//button[@class='btn full big']")).click();
 
	 		String text3 = driver.findElement(By.xpath("(//div[@class='value'])[2]/span")).getText();
	 		String Total2 = text3.replaceAll("[^0-9]", "");
	 		int Y = Integer.parseInt(Total2);
	 		System.out.println(Y);
	 		if (X == Y) {
	 			System.out.println("matching");

	 		}

	 		else
	 			System.out.println("not matching");

	 		driver.quit();
	 	}                                                                                                                                                                                                                                                                                                                           
	 

}
