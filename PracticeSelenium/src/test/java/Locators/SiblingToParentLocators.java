package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SiblingToParentLocators {

	public static void main(String[] args) {
		
//		WebDriver driver=new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Sibling Parent-traverse
		
		// Absolute Xpath -> we move from begning parent so we start from "/"
		//Relative Xpath  ->  we move from the mid of the code so we start from "//"
		
		String log =driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
	
		// **************We are doing by ->> By.cssSelector("") ****************;
//		String log = driver.findElement(By.cssSelector("header div button:nth-of-type(2)")).getText();

    System.out.println("You are "+log+" Sucessfully");
    
    String log2 =driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
    System.out.println("You are "+log2+" Sucessfully");
    
   //  ************************  Child To Parent  ******************  ->> this only in xpath not in CSS
    
    // *** //header/div/button[1]/parent::div/parent::header  <<<- GrandParent to Parent TO Child 
    //                       then From Child to Parent(div) to GrandParent(header) 
    
    
    // **** //header/div/button[1]/parent::div/parent::header/a  <<- Again from GrandParent to Sidling Parent 
    
    
    
    
    
    
    driver.close();
	}

}
