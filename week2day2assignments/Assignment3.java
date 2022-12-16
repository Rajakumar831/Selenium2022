package week2.week2day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		WebElement acmeemail = driver.findElement(By.id("email"));
		acmeemail.sendKeys("kumar.testleaf@gmail.com");
		WebElement acmepassword = driver.findElement(By.id("password"));
		acmepassword.sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		System.out.println("THe title of the page is :" + driver.getTitle());
		driver.findElement(By.linkText("Log Out")).click();
		//driver.close();
	}

}