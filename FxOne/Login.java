package FxOne;

import java.time.Duration;

//import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;

//import Login.Loginpage;

import org.testng.annotations.*;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	

	WebDriver driver;
//	WebDriver driver1;
    LoginPage loginPage;
	Pos Pos;
	Outlet Outlet;
	SearchBar Search;
	
	 @BeforeMethod
		public void setup() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://fx1qa.idsnext.live/#/login");
//		 System.out.println("LoginPage TestCase");
		 loginPage= new LoginPage(driver);
    }
	  
    @Test
       public void loginTest() throws InterruptedException {
//    	System.out.println("LoginPage TestCase student");
    	
    	
    	 System.out.println("LoginPage pr ja rahe h abb hum");
    	
      loginPage.login("tsc20007@idsnext.com","Ids@9876");
//      System.out.println("LoginPage TestCase password");
      
      System.out.println("LoginPage se aagaye h test page pr");
//      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[alt='FX POS']")));
//      
//      Thread.sleep(5000);
//      login.enterpassword("Student@123");
//      System.out.println("Login sucess");
//     Thread.sleep(3000);
//      login.clicklogin();
    	
      
      System.out.println("Pos page pr jana h an hame");
       Pos = new Pos(driver);
       Pos.clickFxPos();
       
//       wait.until(ExpectedConditions.urlContains("pos"));
       
//       boolean redirected= Pos.isUser();
//       Assert.assertTrue(redirected,"User not redirected to pos page")
       
       Assert.assertTrue(Pos.isUser(),"User not redirected");
       
       System.out.println("Pos to Test ;;  Test to Outlet jana h ab");
       
       
       Outlet = new Outlet(driver);
       System.out.println("Ho gaya outlet pr click ");
       Outlet.clickOutlet();
//       System.out.println("iframe free ho jaa");
//       Outlet.backToMainPage();
       
    System.out.println("Outlet to Test ;;  Test to SearchBar jana h ab");
       
       /*
        * Passing the Driver: 
        * Search: This is a variable name. It's likely an instance variable that was declared
         elsewhere in your class (e.g., SearchBar Search; or a generic variable type).

    * new SearchBar(driver): This is where the action happens:
    * new: The Java keyword used to create a new object in memory.
    * SearchBar(...): This calls the constructor of the SearchBar class.(construnctor and class name is same)
    * (driver): This passes an existing variable named driver (which is likely your Selenium WebDriver instance) 
         to the SearchBar class's constructor
        */
    
//    
//    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//  wait.until(ExpectedConditions.urlContains("outlet"));
  
//       Search= new SearchBar(driver);
//       System.out.println("Selenium driver shift toSearchBar class Page  Now we Search our Text bar LetsGo ");

//     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//   wait.until(ExpectedConditions.visibilityOfElementLocated( By.cssSelector("ng-tns-c9-8.ng-star-inserted")));
//   System.out.println("THis one is working");
//       Search.Search();
//       
       System.out.println("Everything is okay ewe are on Test page again now stop");
//       
//       try {
//    	    Outlet = new Outlet(driver);
//    	    System.out.println("Successfully created Outlet object.");
//    	    Outlet.clickOutlet();
//    	} catch (Exception e) {
//    	    System.out.println("An error occurred trying to initialize or click the Outlet: " + e.getMessage());
//    	    e.printStackTrace(); // This is crucial for debugging
//    	}

    	
    }
        
    
    
    @AfterMethod
    public void teardown()throws InterruptedException {
// 	   System.out.println("=== Fx One  Login Page ===");
 	   Thread.sleep(3000);
//       driver.quit();
// 	   System.out.println("Fx One Login Complete");
    }

}
