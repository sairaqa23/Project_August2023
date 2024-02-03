package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    
	static WebDriver driver;
	  
	public static  void main(String[] args) {
		
     init();
     PositiveLoginTest();
     CloseBrowser();

	}
 public static  void init() {
	     
	 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://codefios.com/ebilling/");
     driver.manage().window().maximize();
 }
	 
	 public static void PositiveLoginTest() {
		 driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		 driver.findElement(By.id("password")).sendKeys("abc123");
		 driver.findElement(By.id("login_submit")).click();
		 
		 
	 } 
	 
 
   
    public static void CloseBrowser() {
    	
    	driver.close();
    	
    }
    	 
    
   }







