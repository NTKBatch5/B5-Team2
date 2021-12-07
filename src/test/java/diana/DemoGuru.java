package diana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuru {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "http://demo.guru99.com/test/newtours/";
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\diana\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
	//   <input type="text" name="userName" size="10">
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
	//	<input type="password" name="password" size="10">
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
	//  <input type="submit" name="submit" value="Submit" style="background-color etc...
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(7000);
		driver.quit();
		
	}

}
