package week2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)  {
		// Step 1 : Instantiate the Chrome browser and adding implicit wait
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS)	;	
		
		// Step 2 : Maximizing the window and loading the URL
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		// Step 3 : Accepting the cookies
		driver.findElement(By.xpath("(//span[text() ='Allow all cookies'])[2]")).click();
		//System.out.println("cookies accepted");
		
		// Step 4 : Clicking on create account button
		driver.findElement(By.linkText("Create new account")).click() ;
		//driver.findElement(By.xpath("(//span[text() ='Allow all cookies'])[2]")).click();
		
		//Step 5 : Entering all required details
		driver.findElement(By.name("firstname")).sendKeys("John") ;
		driver.findElement(By.name("lastname")).sendKeys("Mathew") ;
		driver.findElement(By.name("reg_email__")).sendKeys("testoftest@gmail.com") ;
		driver.findElement(By.id("password_step_input")).sendKeys("12Test@38");
		
		Select day = new Select(driver.findElement(By.name("birthday_day"))) ;
		day.selectByValue("5") ;
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByIndex(7) ;
		
		Select year = new Select(driver.findElement(By.id("year"))) ;
		year.selectByVisibleText("1995") ;
		
		driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
		
	}

}
