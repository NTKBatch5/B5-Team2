package najib;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseOne {

	public static void main(String[] args) throws InterruptedException {
		// Navigate to this url
		String url = "http://demoqa.com/text-box";
		// Set System property for chromedrive
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Najib\\Desktop\\Selenium\\chromedriver.exe");

		// Create an object of Webdriver
		WebDriver driver = new ChromeDriver();

		// Maximzize the browser
		driver.manage().window().maximize();
		// get url
		driver.get(url);
		// Enter name in the name field
		driver.findElement(By.id("userName")).sendKeys("Najib Nazari");
		Thread.sleep(1000);
		// Enter email in the email field
		driver.findElement(By.id("userEmail")).sendKeys("Najib2022@gmail.com");
		Thread.sleep(1000);
		// Enter address in the current address field
		driver.findElement(By.id("currentAddress")).sendKeys("New St, New York");
		Thread.sleep(1000);
		// Enter different address in the current address field
		driver.findElement(By.id("permanentAddress")).sendKeys("H land");
		Thread.sleep(1000);

		driver.findElement(By.id("submit")).sendKeys(Keys.ENTER);
		
		// wiat for 4s
		Thread.sleep(2000);
		
	
		// close the browser
		driver.quit();

	}
}