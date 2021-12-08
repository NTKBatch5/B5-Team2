package diana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demoqa.com/text-box";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\diana\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		//<input autocomplete="off" placeholder="Full Name" type="text" id="userName" class=" mr-sm-2 form-control">
		driver.findElement(By.id("userName")).sendKeys("Diana Petrusca");
		
		//<input autocomplete="off" placeholder="name@example.com" type="email" id="userEmail" class="mr-sm-2 form-control">
		driver.findElement(By.id("userEmail")).sendKeys("dianastrezhesku@gmail.com");
		
		//<textarea placeholder="Current Address" rows="5" cols="20" id="currentAddress" class="form-control"></textarea>
		driver.findElement(By.id("currentAddress")).sendKeys("2716 S Uhle St, Arlington, VA 22206");
		
		//<textarea rows="5" cols="20" id="permanentAddress" class="form-control"></textarea>
		driver.findElement(By.id("permanentAddress")).sendKeys("2716 S Uhle St, Arlington, VA 22206");
		
		//<button id="submit" type="button" class="btn btn-primary">Submit</button>
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(70000);
		driver.quit();
		
		// I don't like GitHub =))
		// Just kidding
		
		
	}

}
