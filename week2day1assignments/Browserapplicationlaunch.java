package week2.day1.week2day1assignments;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Browserapplicationlaunch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver1 = new EdgeDriver();
		driver1.get("https://www.facebook.com/");

	}

}
