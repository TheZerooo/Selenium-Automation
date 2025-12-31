package Login;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

public class Loginpage {
	File file =new File("src/test/java/login.html");
	String filePath="file:///"+file.getAbsolutePath();	

	WebDriver driver;
	@Parameters("browser")
	 @BeforeTest
		public void setup(String browser) {
			System.out.println("Browser name is: " + browser+ "===");
			if(browser.equalsIgnoreCase("chrome")){
				
				//System.setProperty("webdriver.chrome.driver", projectpath+"")
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
    	driver.get(filePath);
    	driver.findElement(By.id("Id")).sendKeys("123");
    	Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("sub")).click();
    	 System.out.println("Page title on" + driver.getTitle());
    }
    
    @AfterTest
    public void teardown() {
 	   System.out.println("=== Login Page ===");
// 	   driver.close();
 	   System.out.println("Login Complete");
    }

}
