package diana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.menswearhouse.com/";
		
		System.setProperty("webdriver.chrome.driver",
				
				"C:\\Users\\atiqs\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(url);
         Thread.sleep(7000);
		
		driver.quit();
	
	
 
}
}