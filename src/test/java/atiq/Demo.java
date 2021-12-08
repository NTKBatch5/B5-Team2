package atiq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
String url = "https://demoqa.com/text-box";
		
		System.setProperty("webdriver.chrome.driver",
				
				"C:\\Users\\atiqs\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		driver.findElement(By.id("userName")).sendKeys("Atiq");
		
		driver.findElement(By.id("userEmail")).sendKeys("atiqsaleh@gmail.com");
		
		driver.findElement(By.id("permanentAddress")).sendKeys("Fredericksburg");
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	
 
}
