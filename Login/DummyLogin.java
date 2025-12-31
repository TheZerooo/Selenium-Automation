package Login;

//import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummyLogin {
	

	WebDriver driver;
	@Parameters("browser")
	 @BeforeTest
		public void setup(String browser) {
			System.out.println("Browser name is: " + browser+ "===");
			if(browser.equalsIgnoreCase("chrome")){
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}

else if(browser.equalsIgnoreCase("firefox")){
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
    
}
else if(browser.equalsIgnoreCase("edge")){
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}	
			
            else {
            	System.out.println("Kya KR rahe ho Bhai tum Sahi se karo");
            }
	   
			driver.manage().window().maximize();
}
	  
    @Test
    public void launchApplication() throws InterruptedException {
    	driver.get("https://practicetestautomation.com/practice-test-login/");
    	
    	// Create Variable name for indicating particular webElement 
		WebElement name= driver.findElement(By.id("username"));
		name.sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.className("btn")).click();
    }
    
    @AfterTest
    public void teardown() {
 	   System.out.println("=== Dummy Login Page ===");
       driver.quit();
 	   System.out.println("Dummy Login Complete");
    }

}

