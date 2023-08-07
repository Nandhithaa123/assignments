package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVR 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		//1.Launch The Browser
		ChromeDriver driver =new ChromeDriver();
		
		//2. load the URL
		driver.get(" https://www.pvrcinemas.com/");
		
		//3.maximize the window
		driver.manage().window().maximize();
		
		//4.add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//5.click on navigation icon
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		
		//6.click on movie library
		driver.findElement(By.xpath("//a[@class='ng-star-inserted']")).click();
		
		//6.select the city as chennai
		WebElement state=driver.findElement(By.xpath("//select[@name='city']"));
		Select state1=new Select(state);
		state1.selectByVisibleText("Chennai");
		
		//7.select the genre animation
		WebElement state2=driver.findElement(By.xpath("//select[@name='genre']"));
		Select state3=new Select(state2);
		state3.selectByVisibleText("ANIMATION");
		
		//8. select the language as english
		WebElement stateDD=driver.findElement(By.xpath("//select[@name='lang']"));
		Select state4=new Select(stateDD);
		state4.selectByVisibleText("ENGLISH");
		
		//9.click on apply
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		Thread.sleep(5000);
		//10.click on first resulting animation movie
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();		
		
		//11.click proceed to book
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		//12.enter  the fields cinema 
		WebElement state5=driver.findElement(By.id("cinemaName"));
		Select state6=new Select(state5);
		state6.selectByVisibleText("PVR Heritage RSL ECR Chennai");
		
		//13. enter the name field
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Nandhitha");
		
		//14.enter the prefered show time
		WebElement state7=driver.findElement(By.xpath("//select[@name='timings']"));
		Select state8 =new Select(state7);
		state6.selectByVisibleText("09:00 AM - 12:00 PM");
		
		//15. enter the no of seats
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
		
		//16.enter the mobile no
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9941666604");
		
		//17.enter the email id
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("20g113nandhitha@gmail.com");
		
		//18. enter the f&b requirements
		
		WebElement state9=driver.findElement(By.xpath("//select[@name='food']"));
		Select state10=new Select(state9);
		state6.selectByVisibleText("Yes");
		
		
		//18.click on copy to self
		driver.findElement(By.xpath("//label[contains(@class,'custom-control custom-radio')]")).click();
		
		//19. click on send request
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		
		//20.click on cancel
		driver.findElement(By.xpath("//button[text()='CANCEL']")).click();
		
		//21.verify the title of the page
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}

}
