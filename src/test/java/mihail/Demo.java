
package mihail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {

		String url = "http://demo.guru99.com/test/newtours/";

		String url = "https://demoqa.com/text-box/";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mihail\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);

		driver.findElement(By.linkText("REGISTER")).click();

		driver.findElement(By.name("firstName")).sendKeys("John");

		driver.findElement(By.name("lastName")).sendKeys("Cena");

		driver.findElement(By.name("phone")).sendKeys("555-555-5555");

		driver.findElement(By.name("userName")).sendKeys("mihail.aquasafe@gmail.com");

		driver.findElement(By.id("userName")).sendKeys("John Cena");

		driver.findElement(By.id("userEmail")).sendKeys("john_cena@gmail.com");

		driver.findElement(By.id("currentAddress")).sendKeys("7466 New Ridge Road");

		driver.findElement(By.id("permanentAddress")).sendKeys("1820 Michael Faraday Dr Suite 20, Reston, VA ");

		driver.findElement(By.id("submit")).click();

		Thread.sleep(5000);

		url = "http://demo.guru99.com/test/newtours/";

		driver.get(url);

		driver.findElement(By.linkText("REGISTER")).click();

		driver.findElement(By.name("firstName")).sendKeys("Mihail");

		driver.findElement(By.name("lastName")).sendKeys("Stegariov");

		driver.findElement(By.name("phone")).sendKeys("555-555-5555");

		driver.findElement(By.name("userName")).sendKeys("john_cena@gmail.com");

		driver.findElement(By.name("address1")).sendKeys("7466 New Ridge Road");

		driver.findElement(By.name("city")).sendKeys("Silver Spring");

		driver.findElement(By.name("state")).sendKeys("Maryland");

		driver.findElement(By.name("postalCode")).sendKeys("20906");


		WebElement countryDropdown = driver.findElement(By.name("country"));

		Select countrySelect = new Select(countryDropdown);

		countrySelect.selectByVisibleText("MOLDOVA");

		driver.findElement(By.name("email")).sendKeys("mihail.aquasafe@gmail.com");

		driver.findElement(By.name("email")).sendKeys("john_cena@gmail.com");

		driver.findElement(By.name("password")).sendKeys("Sasha09092018");

		driver.findElement(By.name("confirmPassword")).sendKeys("Sasha09092018");

		driver.findElement(By.name("submit")).click();

		Thread.sleep(5000);

		driver.close();

		
	}
 


	}




