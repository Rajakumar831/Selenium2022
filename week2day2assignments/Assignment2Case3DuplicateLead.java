package week2.week2day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Case3DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement findElement = driver.findElement(By.name("USERNAME"));
		 findElement.sendKeys("democsr");
		 WebElement findElement2 = driver.findElement(By.id("password"));
		 findElement2.sendKeys("crmsfa");
		 WebElement findElement3 = driver.findElement(By.className("decorativeSubmit"));
		 findElement3.click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("//span[text()='Email']")).click();
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("Rajakumar831@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("id=\"ext-gen902\"")).click();
		
	}



	}


