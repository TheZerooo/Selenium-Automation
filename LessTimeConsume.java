package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.*;

public class LessTimeConsume {
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
				
				//System.setProperty("webdriver.chrome.driver", projectpath+"")
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}	
	    
            else if(browser.equalsIgnoreCase("edge")){
				
				//System.setProperty("webdriver.chrome.driver", projectpath+"")
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
    driver.get("https://www.tpointtech.com");
	Thread.sleep(7000);
//    System.out.println("Page title on" +driver.getClass().getSimpleName()+ "is: "+ driver.getTitle());
	 System.out.println("Page title on" + driver.getTitle());
    }
    
    @AfterTest
    public void teardown() {
 	   System.out.println("=== Closing browser ===");
// 	   if(driver !=null) {
// 		   driver.quit();
// 	   }
 	   System.out.println("Test Completed Successfully");
    }
}
