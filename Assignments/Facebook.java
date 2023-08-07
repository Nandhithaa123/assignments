package Assignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook 
{
	public static void main(String[] args)
	{
		//1.Launch The Browser
		ChromeDriver driver =new ChromeDriver();
		//2.load the URL
		driver.get(" https://en-gb.facebook.com/");
		//3.maximize the window
		driver.manage().window().maximize();
		//4.add implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//5.click on create new account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//6.enter the firstname
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nandhitha");
		//7. enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		//8.enter the mobile number
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9941666604");
		//9.enter the password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Nandhitha@2003");
		//dropdown
		WebElement state = driver.findElement(By.xpath("//select[@id='day']"));
		Select state1=new Select(state);  
		state1.selectByValue("10");
		WebElement state2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select state3=new Select(state2);
		state3.selectByValue("7");
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select yearDD=new Select(year);
		yearDD.selectByValue("2003");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	}

}
