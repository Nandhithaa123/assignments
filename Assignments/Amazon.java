package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//1.Launch The Browser
		ChromeDriver driver =new ChromeDriver();
		
		//2. load the URL
		driver.get("https://www.amazon.in/");
		
		//3.maximize the window
		driver.manage().window().maximize();
		
		//4.add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//5.type bags in the search box
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		
		//6.print the total number of result
		System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
		
		//7.select the first 2 brands in the left menu
	    driver.findElement(By.xpath("//span[text()='Skybags'and @class='a-size-base a-color-base']")).click();
	    driver.findElement(By.xpath("//span[text()='Safari' and @class='a-size-base a-color-base']")).click();
	  
	    //8.choose the new arrivals
	    driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
	    driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	    
	    //9.print the first resulting bag info(name discount price)
	    System.out.println(driver.findElement(By.xpath("//span[text()='Safari']")).getText());
	    System.out.println(driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText());
	    
	    //9.get the page title and choose the browser(driver.close())
	    System.out.println(driver.getTitle());
	    Thread.sleep(10000);
	    driver.close();
	
	}

}
