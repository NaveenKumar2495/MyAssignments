package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("//input[@id ='createLeadForm_companyName']")).sendKeys("TestLeadE002")	;
		driver.findElement(By.xpath("//input[@id ='createLeadForm_firstName']")).sendKeys("John")	;
		driver.findElement(By.xpath("//input[@id ='createLeadForm_lastName']")).sendKeys("Mathew")	;
		driver.findElement(By.xpath("//input[@id ='createLeadForm_firstNameLocal']")).sendKeys("Jo")	;
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Space")	;
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Test Account created")	;
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("Testoftest@gmail.com") ;
		Select state = new Select(driver.findElement(By.name("generalStateProvinceGeoId"))) ;
		state.selectByVisibleText("New York") ;
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//Step 6 : Clicking on Edit button and performing necessary actions
		driver.findElement(By.xpath("//a[text()='Edit']")).click() ;
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear() ;
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Test of Test Account") ;
		
		//Step 7 : Updating the results and verifying the title 
		driver.findElement(By.className("smallSubmit")).click();
		String Title = driver.getTitle() ;
		System.out.println(Title);
				
		if(Title.contains("View Lead")) {
				System.out.println("Lead got created successfully");
			}
		else {
				System.out.println("Lead not created");
				}
		String AccName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println("Created Lead Name is "+ AccName);
				
		driver.close() ;		

	}

}
