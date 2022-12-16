package week2.week2day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Case2DeleteLead {

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
		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8825630224"); 
		 driver.findElement(By.xpath("//td[@id='ext-gen333']")).click();
		 driver.findElement(By.xpath("//div[@unselectable='on'][1]")).click();	 
		 //driver.close();
	}

}