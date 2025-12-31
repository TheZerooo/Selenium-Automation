package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;


public class DifferentLocators2 {
	
	public static void main(String[] args) throws InterruptedException {
//	   WebDriver driver=new ChromeDriver();
		WebDriver driver=new EdgeDriver();
	   
	     
	     
	   driver.get("https://rahulshettyacademy.com/locatorspractice/");
	     // Now Again Login Page
	     String name="Annu Giri";
	    String password= getpassword( driver);
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	     driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
	    // driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
	     driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password); // half word ka use kr k selector bananan
	     Thread.sleep(1000);
	     System.out.println("Wait is over");
	     driver.findElement(By.xpath("//div/span[1]")).click();
	     Thread.sleep(2000);
	    // driver.findElement(By.id("chkboxOne")).click();
	     driver.findElement(By.cssSelector(".submit.signInBtn")).click();
	     
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
 driver.close();
}
	
	public static String getpassword (WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("Forgot your password?")).click();
	     Thread.sleep(2000);
		 driver.findElement(By.className("reset-pwd-btn")).click();   
		 
		 String pass= driver.findElement(By.cssSelector("form p")).getText();
		 System.out.println("your pass string->> "+pass);
	
		 // pass = Please use temporary password 'rahulshettyacademy' to Login.
		 
		 String [] passArray=pass.split("'");
// passArray = 0th ->  Please use temporary password  and 1st -> rahulshettyacademy' to Login.
		 
		 String [] passArray2=passArray[1].split("'");
		 
		 // passArray2 = 0th -> rahulshettyacademy    and  1st -> to Login.
		 
		 String password=passArray2[0];
		 
		 
		 return password;

	}
}
