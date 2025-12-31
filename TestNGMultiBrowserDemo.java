package Demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



// This Method Cosume a lot of time because->All Browser in queue and wait for their turn 
public class TestNGMultiBrowserDemo {


	
	WebDriver driver;
	WebDriver driver1;
	WebDriver driver2;
       @BeforeTest
	public void setup() {
		
			WebDriverManager.chromedriver().setup();
			
			
			 driver=new ChromeDriver();
			 driver1=new FirefoxDriver();
			 driver2=new EdgeDriver();
		}
		
		
// All WebBrowser will get open but application will only 
       
       @Test
    public void openGoogle() throws InterruptedException {
    	   // This will get execute in the last
    	   driver.get("https://www.tpointtech.com");
    	System.out.println("Chrome: "+driver.getTitle());
    	Thread.sleep(7000);
    }
       
       @Test
       public void openFirefox() throws InterruptedException {
    
    	   /*
    ***  this will not get execute becauese of time out *****
    
    	    The output shows that your tests for Chrome and Edge Passed successfully,
    	    but the test for Firefox Failed with a TimeoutException. 
    	    The Firefox browser was launched,but it couldn't fully navigate to the
    	    website within the maximum allotted time(This part of the log shows the 
    	    capabilities that were used. Notice pageLoad:300000 (which is 300 seconds or 5 minutes). 
    	    Firefox was trying to load the page for a very long time before failing.)
    	    */
    	   
    	   driver1.get("https://www.tpointtech.com");
    	System.out.println("Firefox: "+driver1.getTitle());
    	Thread.sleep(7000);
    }
       @Test
       public void openEdge() throws InterruptedException {
    	   
    	   // First this will get execute
    	   
    	   driver2.get("https://www.tpointtech.com");
    	System.out.println("Edge: "+driver2.getTitle());
    	Thread.sleep(7000);
    }
       @AfterTest
       public void teardown() {
//    	   driver.close();
//    	   driver1.close();
//    	   driver2.close();
    	   System.out.println("Test Completed Successfully");
       }
       
       
//   	public static void main(String[] args) {
//		
//		String browser ="edge";
//		
//		WebDriver driver = null;
//		
//		if(browser.equalsIgnoreCase("chrome")){
//			WebDriverManager.chromedriver().browserVersion("142.0.7444.60").setup();
//			 driver=new ChromeDriver();
//		}
//		else if(browser.equalsIgnoreCase("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			 driver=new FirefoxDriver();
//		}
//		else if(browser.equalsIgnoreCase("edge")) {
//			WebDriverManager.edgedriver().setup();
//			 driver=new EdgeDriver();
//		}
//		
//		
//		driver.get("https://www.tpointtech.com");
//	}
}
