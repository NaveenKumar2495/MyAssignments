package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		
		//Step 4 : Clicking on CRM/SFA link followed by clicking on leads tab
		driver.findElement(By.linkText("CRM/SFA")).click() ;
		driver.findElement(By.linkText("Leads")).click() ;
		
		//Step 5 : Clicking on create lead button and entering the necessary details
		driver.findElement(By.partialLinkText("Create") ).click() ;
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLead008")	;
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("John")	;
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mathew")	;
		driver.findElement(By.name("generalProfTitle")).sendKeys("MyLead")	;
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1122334455")  ;
		
		//Step 6 : Clicking on create account button and verifying next page title
		driver.findElement(By.className("smallSubmit")).click();
		String Title = driver.getTitle() ;
		System.out.println(Title);
		
		if(Title.contains("View Lead")) {
			System.out.println("Lead got created successfully");
		}
		else {
			System.out.println("Lead not created");
		}
		String LeadName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Created Lead Name is "+ LeadName);
		
		driver.close();
	}

}
