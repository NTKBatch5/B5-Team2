package najib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://demo.guru99.com/test/newtours/";
		// Set System property for chromedrive
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Najib\\Desktop\\Selenium\\chromedriver.exe");

		// Create an object of Webdriver
		WebDriver driver = new ChromeDriver();
		
		//Maximzize the browser
		driver.manage().window().maximize();
		
		// Navigate to URL
		driver.get(url);
		
		// click sign on button
		driver.findElement(By.linkText("SIGN-ON")).click();
		Thread.sleep(2000);
		// Enter Username
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		Thread.sleep(2000);
		// Enter password
		driver.findElement(By.name("password")).sendKeys("tutorial");
		Thread.sleep(2000);
		// click submit
		driver.findElement(By.name("submit")).click();
		
		// holds the webbrowser for 5 seconds
		Thread.sleep(2000);
		
		System.out.println("Sending to getHub");
		// It will close the webbrowser
		driver.quit();

	}

}

