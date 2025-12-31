package RealTimeExercise;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClickLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// ****** How To Find Number Of Link Available in WebPage  ******
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// ***** Find Number of Link Present in Foother Section *****
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG")); // LimitingWebDriver Scope
	    System.out.println(footerdriver.findElements(By.tagName("a")).size());
	    
	    
	    // Limit inside footer Side Driver
	    
	    WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    System.out.println(columndriver.findElements(By.tagName("a")).size());
	    
	    
	    // ****** Click and Open All Link ******
	    for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) {
	    	
	    	
	/*
	 * Agr hum niche wala line nahi likhe ge tho hamara driver dusre WebPage pr chala jaye ga 
	 * driver original webpage k link ko dekh hi nahi payega    	
	 * Jb hum control pr click kr k link pr jate h tho hamara link tho open hota h pr hum original se nahi hat te h
	 */
	    	
	    	
	   String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER); // Key k through hum click kr rahe h link pr
	   
	    columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab); // get is not for single Element it is for Array
	   Thread.sleep(5000);
	    }
	    
	    
	    
	    // ***** Ab link Open h Humko uspr Jana h *****
	    
	    Set<String> abc=driver.getWindowHandles(); // jitne window hoge unko 1 unique id mill jaye gi stored in SET
	    Iterator<String> it=abc.iterator(); // it -> Take unique id from abc SET
	    
	    while(it.hasNext()) {
	    	driver.switchTo().window(it.next());
	    	System.out.println(" Driver Name is "+ driver.getTitle());
	    }
	    

	}

}
