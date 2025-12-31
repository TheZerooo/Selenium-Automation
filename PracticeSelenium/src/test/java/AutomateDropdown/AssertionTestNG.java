package AutomateDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class AssertionTestNG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 WebDriver driver =new ChromeDriver();
		WebDriver driver= new EdgeDriver();

		  driver.manage().window().maximize();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		  
		  
//		  System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		  
		  
		  // Isko False Dena Chahiye Agr True dega tho error aaye ga
		  Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		  driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		  
		  
//		  System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		  
		  // Isko True dena chahiye
		  Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		  
		  
		  
		  // Count How Many Check Box Are Present
		   
		  System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); // returning 6
		  
		  List<WebElement> checkboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
		  
		  int Visiblecount=0;
		  for(WebElement checkbox: checkboxes) {
			  
			  // isDisplayed -> jo sa checkbox dekh raha h uske liye h ye
			  if(checkbox.isDisplayed()) {
				  Visiblecount++;
			  }
		  }
		  
		  System.out.println("Your Visible checboxes are: "+Visiblecount);

	}

}
