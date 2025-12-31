package Demo;

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

public class Firefox {
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
//			else if(browser.equalsIgnoreCase("firefox")){
//				
//				//System.setProperty("webdriver.chrome.driver", projectpath+"")
//				WebDriverManager.firefoxdriver().setup();
//				driver=new FirefoxDriver();
//			}	
			

else if(browser.equalsIgnoreCase("firefox")){
    WebDriverManager.firefoxdriver().setup();

    // Create a profile object to set specific preferences
    FirefoxProfile profile = new FirefoxProfile();
    
    // Set 'Use recommended performance settings' to off (false)
    profile.setPreference("browser.preferences.useHomeCtrlForHomepage", false); 
    
    // Set 'Use hardware acceleration when available' to off (false)
    profile.setPreference("gfx.webrender.all", false);
    profile.setPreference("layers.acceleration.disabled", true);
    profile.setPreference("media.hardware-video-decoding.enabled", false);


    // Apply the profile and run headless
    FirefoxOptions options = new FirefoxOptions();
    options.setProfile(profile);
//    options.addArguments("-headless"); 

    driver = new FirefoxDriver(options);
    
    // The browser is running with your forced settings.
    System.out.println("Firefox launched with performance settings disabled.");
}

	    
            else if(browser.equalsIgnoreCase("edge")){
				
				//System.setProperty("webdriver.chrome.driver", projectpath+"")
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}	
			
			
            else {
            	System.out.println("Kya KR rahe ho Bhai tum Sahi se karo");
            }
	   
			// TO fully open Web Browser
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
