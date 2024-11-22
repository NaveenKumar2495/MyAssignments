package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	
	public static void main(String[] args) throws InterruptedException {
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
		
		//Step 5 : Entering the phone number to find the lead
		driver.findElement(By.linkText("Find Leads")).click() ;
		driver.findElement(By.xpath("//span[text()='Phone']")).click() ;
		driver.findElement(By.name("phoneNumber")).sendKeys("1122334455") ;
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click() ;
		Thread.sleep(6000) ;
		
		//Step 6 : Deleting the Lead
		String lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText(); 
		System.out.println(lead);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click() ;
		driver.findElement(By.xpath("//a[text()='Delete']")).click() ;
		
		//Step 7 : Validating the delete operation
		driver.findElement(By.linkText("Find Leads")).click() ;
		driver.findElement(By.xpath("//input[@name ='id']")).sendKeys(lead) ;
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click() ;
		Thread.sleep(6000) ;
		String errmsg = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText() ;
		System.out.println(errmsg);
		if(errmsg.equals("No records to display")) {
			System.out.println("Lead number "+lead+ " got deleted successfully");
		}
		else {
			System.out.println("Lead number "+lead+ " not deleted");
		}
		
		driver.close() ;

	}

}
