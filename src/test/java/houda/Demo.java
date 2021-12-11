package houda;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/text-box";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12022\\Desktop\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		Thread.sleep(500);
		driver.findElement(By.id("userName")).sendKeys("Houda El Gord");
		Thread.sleep(3000);
		driver.findElement(By.id("userEmail")).sendKeys("hdelgord@yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.id("currentAddress")).sendKeys("2021 International dr mclean va 22102");
		Thread.sleep(3000);
		driver.findElement(By.id("permanentAddress")).sendKeys("1554 Onyx dr mclean VA 22102");
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
		driver.quit();
	
	}
}
