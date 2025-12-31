package AjaxCallsMouseMove;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new EdgeDriver();
      driver.get("https://rahulshettyacademy.com/loginpagePractise/");
      driver.findElement(By.cssSelector(".blinkingText")).click();
      Set<String> windows =driver.getWindowHandles();
      Iterator<String>it=windows.iterator();
      String parentID= it.next();
      String childID=it.next();
      driver.switchTo().window(childID);
      System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
      Thread.sleep(2000);
      
      String emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
      
      // split to split from at text then trim to remove front space then our this data is stored at index 1 
      // so take this (mentor@rahulshettyacademy.com with below template to receive response)
      // Again split from space  at take index[0] value that is mentor@rahulshettyacademy.com
      // By this you will get your Email
      
      System.out.println("Your Email ID is "+emailId);
      
      driver.switchTo().window(parentID);
      driver.findElement(By.id("username")).sendKeys(emailId);
      
	}

}
