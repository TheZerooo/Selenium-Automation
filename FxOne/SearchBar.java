package FxOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchBar {
   

	WebDriver driver; // class veriable
	
	
	
	/*
	
Use a space when you are looking for a child element inside a parent element. (You are moving down the structure.)
Example: div span means "find a span inside a div".
Use a dot (.) without a space when you are describing a single element that has multiple class names applied to it at the same time. (You are staying on the same element.)
Example: .alert.alert-danger means "find the one single item that is both an alert and a danger".

*/
	
	
	//These CSS Selectors look for elements with multiple class names combined.
	//The HTML snippet you provided is for an <input> element:

	
//  By outlet = By.cssSelector("fa fa-glass-martini menu-span");
	
//	By Search = By.cssSelector("mat-input-element.mat-form-field-autofill-control.cdk-text-field-autofill-monitored.ng-pristine.ng-valid.ng-touched");
//	By Search= By.cssSelector("fas.fa-times.table-searchfa.fa-close.ng-star-inserted");
	
			By Search= By.cssSelector("icon-search.search-btn.ng-star-inserted.table-searchfa-after");

	By bar=By.cssSelector("fas.fa-search");
	By outlet = By.cssSelector(".fa.fa-glass-martini.menu-span");
	


	// 'Enter your username' placeholder वाले इनपुट एलिमेंट का पता लगाता है
//	WebElement usernameInput = driver.findElement(By.cssSelector("input[placeholder='Enter your username']"));

   
	// Constructor - constructor name is same is class name
	
	   public SearchBar(WebDriver driver){
			 System.out.println("SearchBar is running");
	
		  this.driver=driver;	   
	  }
	

	 
	// Action Methods
	
	 
	 public void Search() {
		 driver.switchTo().defaultContent();

		 System.out.println("Ab tho search ho jana chahiye  bar 0");
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(Search));
		 System.out.println("url on Search page "+driver.getCurrentUrl());
		 driver.findElement(By.tagName("body")).click();
		 
//		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("POCO F1");
		 driver.findElement(Search).click();
		 System.out.println("ab tho bar write ho gaya hoga ");
//		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//		    wait.until(ExpectedConditions.visibilityOfElementLocated(Search));
//		 driver.findElement(fxPos).click();
//		 driver.findElement(Search).click();
		 System.out.println("ab tho bar write ho gaya hoga ");
//		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//		    wait.until(ExpectedConditions.visibilityOfElementLocated(bar));
//		 driver.findElement(bar).click();
  
			 System.out.println("Ab tho ho gaya ho ga bar search 1");

	 }
	
	 
	 

	 
}
