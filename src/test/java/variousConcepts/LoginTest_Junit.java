package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {

	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		System.out.println("Before method");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	 }
//         use attribute ID
	@Test
	public void PositiveLoginTest() {
		System.out.println("Positive test");
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");

		driver.findElement(By.id("login_submit")).click();
			 
	}

	@Test
	public void NegLoginTest() {
		System.out.println("Negative test");
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc12345");

		driver.findElement(By.id("login_submit")).click();
	}

	@After
	public void CloseBrowser() {
		System.out.println("After method");
		driver.close();

	}
	    	 
	    
	   }




