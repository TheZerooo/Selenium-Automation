package FxOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pos {
   

	WebDriver driver; // class veriable
	

       By fxPos = By.cssSelector("img[alt='FX POS']");
//	   By fxPos= By.className("default-image");
   
	// Constructor - constructor name is same is class name
	
	   public Pos(WebDriver driver){
		
		    
			    

			// locator 
		 
		   
			 System.out.println("Pos is running");
		  // to make different between local variable  and class variable
		  this.driver=driver;	   
	  }
	

	 
	// Action Methods
	
	 
	 public void clickFxPos() {
		 System.out.println("Ab tho click ho jana chahiye fxPos 0");
		   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("default-image")));
			 System.out.println("Ab tho click ho jana chahiye fxPos 1");
		 driver.findElement(fxPos).click();
		 System.out.println("Pos to Outlet");
//		 return
		 
	 }
	
	 
	 
	 // sare Action ko yehi se call kr liya h
	 public boolean isUser(){
		String currentUrl=driver.getCurrentUrl();
		System.out.println("User is redirected to fx Pos page validate karo");
		
		return currentUrl.contains("pos");
	 }
	 
	 
}
