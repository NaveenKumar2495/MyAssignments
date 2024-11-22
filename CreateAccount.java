package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// Step 1 : Instantiate the Chrome browser	
		ChromeDriver driver=new ChromeDriver();
		
		// Step 2 : Maximizing the window and loading the URL
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		//Step 3 : Entering the Username, Password and clicking on Login button
		driver.findElement(By.id("username")).sendKeys("demosalesmanager")	;	
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa")	;
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Step 4 : Clicking on CRM/SFA link followed by clicking on accounts tab
		driver.findElement(By.linkText("CRM/SFA")).click() ;
		driver.findElement(By.linkText("Accounts")).click() ;
		
		//Step 5 : Clicking on create account button and entering the necessary details
		driver.findElement(By.partialLinkText("Create") ).click() ;
		driver.findElement(By.id("accountName")).sendKeys("TestAccount005")	;
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.")	;
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps")	;
		driver.findElement(By.name("numberEmployees")).sendKeys("101")	;
		
		//Step 6 : Clicking on create account button and verifying next page title
		driver.findElement(By.className("smallSubmit")).click();
		String Title = driver.getTitle() ;
		System.out.println(Title);
		
		if(Title.contains("Account Details")) {
			System.out.println("Account got created successfully");
		}
		else {
			System.out.println("Account not created");
		}
		String AccName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println("Created Account Name is "+ AccName);
		
		driver.close() ;


	}

}
