package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.edge.EdgeDriver;

public class TutorialsPoints {
 
	
	// We need to add implicit wait of 5 second -> wait for 5 secfor all Element
  
  public static void main(String[] args) {
	  WebDriver driver= new ChromeDriver();
//	  WebDriver driver=new EdgeDriver();
     driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     
     // sendKeys() only accepts a String (text) as an argument.
     
     /* 
      * Then How Send Float and Numbers
      * ********   sendKeys(String.valueOf(quantity))  **********
      * *****    sendKeys("" + quantity)   **** -> using Concatination
      * For Integer  ->>>>   sendKeys(Integer.toString(quantity))
      * For Double  ->>>>   sendKeys(Double.toString(total))
      */

     
//     driver.findElement(By.id("inputUsername")).sendKeys("Tanu Giri");
     driver.findElement(By.id("email")).sendKeys("Tanu@123");
//     driver.findElement(By.className("form-control")).sendKeys("Tanu123");
//     driver.findElement(By.xpath("#input.password.form-control")).sendKeys("Tanu1234");
     driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Tanu123");
     driver.findElement(By.xpath("//input[@value='Login']")).click();
     driver.findElement(By.linkText("New User"))
     .click();
     // getText() is use to extract text from WebBrowser
     
     
     /*
      * For ID -> tagname#idName
      * For CLASS -> tagname.className
      * for Attribute -> tagname[attriute='value']
      */
     
     
     System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
     
     // We are using linkText() -> only if (a) tag of link is present 
     driver.findElement(By.linkText("Forgot your password?")).click();
     
     
     driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Tanu");
     
     driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Tanu@123");
//     driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
     
     driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
}
}
