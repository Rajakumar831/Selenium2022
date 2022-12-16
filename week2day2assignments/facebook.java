package week2.week2day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rajakumar");
		driver.findElement(By.name("lastname")).sendKeys("Ponnurangam");
		driver.findElement(By.name("reg_email__")).sendKeys("8825630224");
		driver.findElement(By.name("reg_passwd__")).sendKeys("222222");
		
		  WebElement eleuserday = driver.findElement(By.id("day"));
	        Select date1 = new Select(eleuserday);
	        date1.selectByValue("29");
	      WebElement eleuserdmonth = driver.findElement(By.id("month"));
	        Select month1 = new Select(eleuserdmonth);
	        month1.selectByVisibleText("Jun");
	      WebElement eleuserdyear = driver.findElement(By.id("year"));
	        Select year1 = new Select(eleuserdyear);
	        year1.selectByIndex(40);
	      
	     // driver.findElement(By.className("_58mt")).click();
	      driver.findElement(By.xpath("//label[text()='Female']")).click();
	        
	     

		
		
	}

}