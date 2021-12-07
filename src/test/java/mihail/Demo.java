package mihail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {

		String url = "https://demoqa.com/text-box/";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mihail\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);

		driver.findElement(By.id("userName")).sendKeys("Mihail Stegariov");

		driver.findElement(By.id("userEmail")).sendKeys("mihail.aquasafe@gmail.com");

		driver.findElement(By.id("currentAddress")).sendKeys("14801 Hammersmith Circle Silver Spring, MD");

		driver.findElement(By.id("permanentAddress")).sendKeys("1820 Michael Faraday Dr Suite 20, Reston, VA ");

		driver.findElement(By.id("submit")).click();

		Thread.sleep(5000);

		driver.close();
	}
 
}
