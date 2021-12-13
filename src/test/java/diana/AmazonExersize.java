package diana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExersize {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\diana\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://www.amazon.com/";

		driver.get(url);

		driver.manage().window().maximize();

		// String actualTitle(By.linkText(actualTitle))

		// getTitle() to obtain page title

		System.out.println("Page title is : " + driver.getTitle());

		String Actual = driver.getTitle();
		String Expected = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

		if (Actual.equals(Expected)) {
			System.out.println("Title Passed");
		} else {
			System.out.println("Title Failed");
		}
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("Head First Java, 2nd Edition");
		driver.findElement(By.xpath("//input[(@id='nav-search-submit-button')]")).click();

		driver.findElement(By.xpath("//span[text()='Head First Java, 2nd Edition']")).click();
		driver.findElement(By.xpath("//input[(@id='add-to-cart-button\')]")).click();
		
	    String actualTitle = driver.getTitle();
	    String expectedTitle = "Amazon.com Shopping Cart";
	    
	    if(actualTitle.equals(expectedTitle)) {
	    	System.out.println("Test title Amazon.com Shopping Cart passed");
	    }else {
	    	System.out.println("Test title Amazon.com Shopping Cart failed");
	    }
	    Thread.sleep(2000);
		
	   // driver.findElement(By.xpath("//input[contains(@name,'proceedToRetailCheckout')]")).click(); // THERE IS NO PROCEED TO CHECKOUT OPTION
	    
	    driver.findElement(By.xpath("//a[contains(@id,'a-autoid-0-announce')]")).click();
	    
	    driver.findElement(By.name("email")).sendKeys("dpBlah@gmail.xom");
	    driver.findElement(By.id("continue")).click();
	    
	    //driver.findElement(By.xpath("//h4[text()='There was a problem')]")).click();
	    
	    String error = driver.findElement(By.xpath("//h4[text()='There was a problem']")).getText();
		String errorText = "There was a problem";
		
		if(error.contentEquals(errorText)) {
			System.out.println("The tesCase passed");	
		}else {
			System.out.println("The testCase failed");
		}
		
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}

/**OUTPUT:
 * 
 * Starting ChromeDriver 96.0.4664.45 (76e4c1bb2ab4671b8beba3444e61c0f17584b2fc-refs/branch-heads/4664@{#947}) on port 1888
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Dec 12, 2021 5:29:05 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Page title is : Amazon.com. Spend less. Smile more.
Title Failed
Test title Amazon.com Shopping Cart passed
The tesCcase passed

 * 
 */

