package AjaxCallsMouseMove;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
/*
 
 * Elements inside an iframe are not directly clickable or identifiable
 * because the element resides within a separate, embedded HTML document (a separate DOM context).
 * Selenium's WebDriver by default only has focus on the main document. 
 * To interact with elements within an iframe, you must explicitly 
 * switch the WebDriver's focus to that specific iframe first
 
 ******* Okay tho bhai ye alg HTML document mai hota h iss liye click nahi ho pata h tumko iske liye driver *********
              ***************               ka focus change krna pade ga                   *****************
             
              *If your iframe HTML looks like: <iframe id="myIframe" ...>
              
    Way to drive focus of driver     -->>>  driver.switchTo().frame("myIframe")  
   
 */
		
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		
	   // ***********  Find Number Of Frame Present in WebPage  *************
	System.out.println("Number of iFrame Prsent "+ driver.findElements(By.tagName("iframe")).size());
		
		
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
//		driver.findElement(By.id("draggable")).click();
			
		
		Actions a=new Actions(driver);
		
		
	
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source,target).build().perform();
		
		
		// Switch to Original Window
		
		driver.switchTo().defaultContent();
		
		
	}

}
