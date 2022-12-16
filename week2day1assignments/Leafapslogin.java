package week2.day1.week2day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafapslogin {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 WebElement leafuser = driver.findElement(By.id("username"));
		 leafuser.sendKeys("Demosalesmanager");
		 WebElement leafpassword = driver.findElement(By.id("password"));
		 leafpassword.sendKeys("crmsfa");
		 WebElement leaflogin = driver.findElement(By.className("decorativeSubmit"));
		 leaflogin.click();

	}

}
