package diana;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoGuruTwo {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://demo.guru99.com/test/newtours/";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\diana\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);

		// <a href="register.php" style="color: #0000ee;text-decoration:
		// underline;">REGISTER</a>
		driver.findElement(By.linkText("REGISTER")).click();

		// <img src="images/logo.gif" width="100" height="110" alt="Mercury Tours">
		// driver.getTitle();

		// <input maxlength="60" name="firstName" size="20">
		driver.findElement(By.name("firstName")).sendKeys("Diana");

		// <input maxlength="60" name="lastName" size="20">
		driver.findElement(By.name("lastName")).sendKeys("Petrusca");

		// <input maxlength="20" name="phone" size="15">
	//	String bodyText = driver.findElement(By.tagName("body")).getText();
		//Assert.assertTrue("Text not found!", bodyText.contains(text));
		driver.findElement(By.name("phone")).sendKeys("(571)338-0455");

		// <input name="userName" id="userName" size="35" maxlength="64">
		driver.findElement(By.name("userName")).sendKeys("dp@gmail.com");

		// <input maxlength="60" <input maxlength="60" name="address1"
		// size="40">="address1" size="40">
		driver.findElement(By.name("address1")).sendKeys("111 s Uhle st");

		// <input maxlength="60" name="city" size="15">
		driver.findElement(By.name("city")).sendKeys("Arlington");

		// <input maxlength="40" name="state">
		driver.findElement(By.name("state")).sendKeys("Virginia");

		// <input maxlength="20" name="postalCode" size="15">
		driver.findElement(By.name("postalCode")).sendKeys("22206");

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("UNITED STATES");

		// <input name="email" id="email" size="20" maxlength="60">
		driver.findElement(By.id("email")).sendKeys("dp@gmail.com");

		// <input maxlength="60" name="password" size="20" type="password">
		driver.findElement(By.name("password")).sendKeys("YouWantTooMuch");

		// <input maxlength="60" name="confirmPassword" size="20" type="password">
		driver.findElement(By.name("confirmPassword")).sendKeys("YouWantTooMuch");

		// <input name="submit" type="submit" src="images/submit.gif" width="60"
		// height="23" border="0">
		driver.findElement(By.name("submit")).click();

		// <a href="login.php" style="color: #0000ee;text-decoration:
		// underline;">sign-in </a>
		driver.findElement(By.linkText("sign-in")).click();

		// <input maxlength="60" name="userName" size="20">
		driver.findElement(By.name("userName")).sendKeys("dp@gmail.com");

		// <input maxlength="60" name="password" size="20" type="password">
		driver.findElement(By.name("password")).sendKeys("YouWantTooMuch");
		
		//<input type="submit" name="submit" value="Submit">
		driver.findElement(By.name("submit")).click();

		Thread.sleep(5000);
		driver.quit();

	}

}
