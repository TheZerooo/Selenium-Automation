package PracticeAssignment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GreenKartArrayList {
public static void main(String[] args) {
	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	String [] pName= {"Beetroot","Cucumber","Brinjal","Capsicum"};

	List<WebElement> products=driver.findElements(By.cssSelector("h4[class='product-name']"));
	
	for(int i=0;i<products.size();i++) {
//		String name=products.get(i).getText();
		String[] name=products.get(i).getText().split("-");
		String formatename=name[0].trim();
		System.out.println("Your name of Product is "+name);
		
		
		/*
		 ********* This Will Not Work **********
		 
		      if (itemsNeededList.contains(pName)) 
		      
		 // Checks if the full name ("Beetroot - 1 Kg") 
        // is inside the list {"Beetroot", "Cucumber"}

		 */
		List<String> pNameList=Arrays.asList(pName);
		if(pNameList.contains(formatename)) {
//			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
		}
	}
}
}