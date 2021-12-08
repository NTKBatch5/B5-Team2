package tes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
	String url = "https://demoqa.com/text-box";;

	// Set system property for the web driver
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\winta\\Desktop\\Selenium//chromedriver.exe");

	// create the object of the web driver
	WebDriver driver = new ChromeDriver();

	// navigate to the url or to the browser
	driver.get(url);

	// maximize the browser
	driver.manage().window().maximize();
	
	// enter the value of the search field 
	driver.findElement(By.id("userName")).sendKeys("Tes  S araya");
	Thread.sleep(5000);
	driver.findElement(By.id("userEmail")).sendKeys("tes2014.ta@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.id("currentAddress")).sendKeys("2881 International dr Ann arbor MI   48108");
	Thread.sleep(5000);
	driver.findElement(By.id("permanentAddress")).sendKeys("2948 braenburn cr ann arbor MI 48108");
	Thread.sleep(5000);
	
	//click on submit button

	driver.findElement(By.id("submit")).click();
	
	
	
	Thread.sleep(7000);
	driver.close();
	driver.quit();

}

}
