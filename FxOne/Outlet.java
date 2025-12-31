package FxOne;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Outlet {
   

	WebDriver driver; // class veriable
	
	
	
	/*
	
Use a space when you are looking for a child element inside a parent element. (You are moving down the structure.)
Example: div span means "find a span inside a div".
Use a dot (.) without a space when you are describing a single element that has multiple class names applied to it at the same time. (You are staying on the same element.)
Example: .alert.alert-danger means "find the one single item that is both an alert and a danger".

*/
	
	
//  By outlet = By.cssSelector("fa fa-glass-martini menu-span");
	
	By outlet = By.cssSelector(".fa.fa-glass-martini.menu-span");
	

   
	// Constructor - constructor name is same is class name
	
	   public Outlet(WebDriver driver){
			 System.out.println("Outlet is running");
		  // to make different between local variable  and class variable
		  this.driver=driver;	   
	  }
	

	 
	// Action Methods
	
	 
	 public void clickOutlet() throws InterruptedException {
		 System.out.println("Ab tho click ho jana chahiye Outlet 0");
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(outlet));
		    System.out.println("url on outlet page "+driver.getCurrentUrl());
		 driver.findElement(outlet).click();
		 driver.switchTo().defaultContent();
		 driver.findElement(By.tagName("body")).click();
		 System.out.println("Ab tho click ho gaya hoga outlet 1");
		   By Search=By.id("mat-input-0");
//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		 By Search=By.cssSelector("mat-input-15.mat-input-element.mat-form-field-autofill-control.cdk-text-field-autofill-monitored.ng-pristine.ng-valid.ng-touched");
//		 By Search= By.cssSelector(".mat-checkbox-inner-container.mat-checkbox-inner-container-no-side-margin");
//		 By Search=By.cssSelector("ful-wdh.mat-form-field.ng-tns-c8-6.mat-primary.mat-form-field-type-mat-input.mat-form-field-appearance-legacy.mat-form-field-can-float.mat-form-field-has-label.mat-form-field-hide-placeholder.ng-pristine.ng-valid.ng-touched");

//	        wait.until(ExpectedConditions.elementToBeClickable(Search));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Search));
		 System.out.println("url on outlet page "+driver.getCurrentUrl());
		 
//		 By Search= By.cssSelector("icon-search.search-btn.ng-star-inserted.table-searchfa-after");
		 Thread.sleep(9000);
		 driver.findElement(Search).click();
		 
		 driver.findElement(Search).sendKeys("bar");
		 By searchIcon = By.cssSelector("i.fas.fa-search");
		 
	     driver.findElement(searchIcon).click();
	     
	     List<WebElement> results=driver.findElements(By.cssSelector("mat-cell.cdk-column-Select.mat-column-Select.ng-star-inserted"));
	     
	     if(results.size()>0) {
	    	 System.out.println("Search successful, "+results.size());
	     }
	     else {
	    	 System.out.println("Result not get print");
	     }
	     
	     
	     
	     
	        // Optionally, you can click on the icon (if it's used as a button)
	      

		 
//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		 Thread.sleep(3000);
//			By Search = By.cssSelector("plus-btn.ng-star-inserted");
//		 wait.until(ExpectedConditions.elementToBeClickable(Search));

	
//System.out.println("Kya problem h bhai tumko chal kyu nahi rahe ho tum");
		 // Perform search
//		 driver.findElement(Search).click();

//System.out.println("Kya problem h bhai tumko chal kyu nahi rahe ho tum 2");
		 
		  
//		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//		    wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("iframe")));
//		    System.out.println("abb iframe se driver ko hatana hoga yrrr");
//		    driver.switchTo().frame(0);
		    
//		 driver.findElement(outlet).click();
	 }
	
	 
//	 public void backToMainPage() {
//		 driver.switchTo().defaultContent();
//		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//		 wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("mat-input-element.mat-form-field-autofill-control.cdk-text-field-autofill-monitored.ng-pristine.ng-valid.ng-touched")));
//		 System.out.println("Switchd to main Page content");
//	 }

	 
}
