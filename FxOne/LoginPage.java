package FxOne;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver; // class veriable
	//Locators
	
	// Constructor - constructor name is same is class name
	
	   public LoginPage(WebDriver driver){
		  // to make different between local variable  and class variable
		  this.driver=driver;	   
	  }

		 By username= By.id("md-input-0-input");
		 By password= By.id("md-input-1-input");
		 By sbt= By.className("login-text");
//		 By pos=By.className("default-image");
   
	
	
	
	 
	// Action Methods
	
	 public void enterusername(String user) {
		 System.out.println("LoginPage Pr aa gaye h hum");
		 driver.findElement(username).sendKeys(user);
	 }
	
	 public void enterpassword(String pass) {
//		 System.out.println("LoginPage POM pass");
		 driver.findElement(password).sendKeys(pass);
	 }
	 public void clicklogin() {
		
		 driver.findElement(sbt).click();
		 System.out.println("LoginPage se jana h ab hame");
	 }
//	 public void clickpos() {
//		 System.out.println("LoginPage POM click Close Button");
//		 driver.findElement(pos).click();
//	 }
	 
	 
	 // sare Action ko yehi se call kr liya h
	 public Pos login (String user,String pass ) throws InterruptedException{
		 enterusername(user);
//	      Thread.sleep(3000);
		 enterpassword(pass);
//          Thread.sleep(3000);
		 clicklogin();
//		 Thread.sleep(15000);
//		 clickpos();
		 System.out.println("LoginPage to Pos Page");
	
		 return new Pos(driver);
	 }
	 
	 
}
