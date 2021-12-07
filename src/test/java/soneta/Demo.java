package soneta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demoqa.com/text-box";
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/sonetakohy/Desktop/Seleinum/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.findElement(By.id("userName")).sendKeys("Soneta Kohy");

		
		
		driver.findElement(By.id("userEmail")).sendKeys("kohy.soneta@gmail.com");

		driver.findElement(By.id("currentAddress")).sendKeys("1234 NoorTeck Dr Reston, VA");

		
		driver.findElement(By.id("permanentAddress")).sendKeys("42567 Prescott Green Sq Ashburn, VA");

		driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	
 
}
