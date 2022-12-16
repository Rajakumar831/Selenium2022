package week2.day1.week2day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforcelogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://login.salesforce.com/");
		 WebElement salesforceuser = driver.findElement(By.id("username"));
		 salesforceuser.sendKeys("hari.radhakrishnan@qeagle.com");
		 WebElement salesforcepassword = driver.findElement(By.id("password"));
		 salesforcepassword.sendKeys("Testleaf$321");
		 WebElement salesforcelogin = driver.findElement(By.id("Login"));
		 salesforcelogin.click();


	}

}
