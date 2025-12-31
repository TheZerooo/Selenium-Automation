package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DifferentLoctors {
 
	
	// We need to add implicit wait of 5 second -> wait for 5 secfor all Element
  
  public static void main(String[] args) throws InterruptedException {
//	  WebDriver driver= new ChromeDriver();
	  WebDriver driver=new EdgeDriver();
     driver.get("https://rahulshettyacademy.com/locatorspractice/");
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Wait for Object to become visible on webBrowser
     
     // sendKeys() only accepts a String (text) as an argument.
     
     /* 
      * Then How Send Float and Numbers
      * ********   sendKeys(String.valueOf(quantity))  **********
      * *****    sendKeys("" + quantity)   **** -> using Concatination
      * For Integer  ->>>>   sendKeys(Integer.toString(quantity))
      * For Double  ->>>>   sendKeys(Double.toString(total))
      */

     
     driver.findElement(By.id("inputUsername")).sendKeys("Tanu Giri");
     driver.findElement(By.name("inputPassword")).sendKeys("Tanu@123");
     driver.findElement(By.className("submit")).click();
     

     
     
     /*
      *              ***********          CSS SELECTOR            *********************
                    
      * For ID -> tagname#idName
      * For CLASS -> tagname.className
      * for Attribute -> tagname[attriute='value']
      * for indexed -> tagname[attribute='value']:nth-child(index)
      
      
      *******************             XPATH SELECTOR              *****************************
       
       * For simple attribute ->>>   //Tagname[@attribute='value'] 
       * For indexed attribute ->>>  //Tagname[@attribute='value'][index]
       * when no attribute  ->>>  //parentTagName/childTagName
       
      */
     
     
     System.out.println(driver.findElement(By.cssSelector("p.error")).getText());  // getText() is use to extract text from WebBrowser
     
     // We are using linkText() -> only if (a) tag of link is present 
     driver.findElement(By.linkText("Forgot your password?")).click();
     
     
     driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Tanu");
     
     driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Tanu@123");
     driver.findElement(By.cssSelector("[placeholder='Email']")).clear();
     driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Tanu123@gmail.com");
     
    
//     driver.findElement(By.cssSelector("input[placeholder='Phone Number'")).sendKeys("1234512345");
     
//     driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("1234512345");
     
     // If We Have No Attribute Then How We Do We Make Locators
     driver.findElement(By.xpath("//form/input[3]")).sendKeys("987654567");
     
 driver.findElement(By.className("reset-pwd-btn")).click();   
 
 System.out.println(driver.findElement(By.cssSelector("form p")).getText()); // Parent TO Child Loctor 
 Thread.sleep(1000); // Wait for making things in Stable Condition
 
 // Go TO Login
// driver.findElement(By.cssSelector(".go-to-login-btn")).click();
 driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
 
 
 
 
 
 // Now Again Login Page
 String name="Tanu Giri";
 
 driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
// driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); // half word ka use kr k selector bananan
 Thread.sleep(3000);
 System.out.println("Wait is over");
 driver.findElement(By.xpath("//div/span[1]")).click();
 Thread.sleep(2000);
// driver.findElement(By.id("chkboxOne")).click();
 driver.findElement(By.cssSelector(".submit.signInBtn")).click();
 
 
 Thread.sleep(2000);
// DifferentLocators2 loc=new DifferentLocators2();
// loc.verify();
 
 // Assert ->>>  verify that a specific piece of text on a web page matches the expected text
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	
//	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
	 System.out.println("Verification Also Get COmpleted");
     
}
  
}
