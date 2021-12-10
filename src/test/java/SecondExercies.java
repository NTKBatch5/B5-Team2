import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondExercies {

	public static void main(String[] args) {
String url = "https://demoqa.com/text-box";
		
		System.setProperty("webdriver.chrome.driver",
				
				"C:\\Users\\atiqs\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		driver.findElement(By.id("userName")).sendKeys("Atiq");

	}

}
