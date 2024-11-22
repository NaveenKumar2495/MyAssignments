package week2.Assignments;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;


public class Leafground {

	public static void main(String[] args) {
		// Step 1 : Instantiate the Chrome browser	
		ChromeDriver driver=new ChromeDriver();
		
		// Step 2 : Maximizing the window and loading the URL
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		
		// Step 3 : verifying if the button with the text ‘Confirm if the button is disabled’ is disabled or not
		boolean button = driver.findElement(By.xpath("(//div[@class='card'])[2]/button")).isEnabled() ;
		assertEquals(button,false) ;
		
		//Step 4 :  Printing the position of the button with the text ‘Submit.
		Rectangle posi = driver.findElement(By.xpath("(//div[@class='card'])[3]/button")).getRect();
		System.out.println("X-axis position from the top-left corner of the element is "+posi.getX()) ;
		System.out.println("Y-axis position from the top-left corner of the element is "+posi.getY()) ;
		
		// Step 5 :  Printing the height and width of the button with the text ‘Find the height and width of this button
		Rectangle siz = driver.findElement(By.xpath("(//div[@class='card'])[5]/button")).getRect();
		System.out.println("Height of the element is "+siz.getHeight()) ;
		System.out.println("Widhth of the element is "+siz.getWidth()) ;
		
		// Step 6 :  Printing the background color of the button with the text ‘Find the Save button color.’
		String col = driver.findElement(By.xpath("(//div[@class='card'])[4]/button")).getCssValue("background-color") ;
		System.out.println(col);
		String hex = Color.fromString(col).asHex() ;
		System.out.println(hex);
		
		// Step 7 : Clicking on the button and verifying the page Title
		driver.findElement(By.xpath("(//div[@class='card'])[1]/button")).click()  ;
		String tittle = driver.getTitle() ;
		System.out.println(tittle);	
		if(tittle.equals("Dashboard")) {
			System.out.println("Title of page is "+tittle);
		}
		else {
			System.out.println("Title of page is not "+tittle);
		}
		
		driver.close() ;
		

	}

}
