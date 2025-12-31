package AjaxCallsMouseMove;

import java.time.Duration;

//import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseMove {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		
		Actions a=new Actions(driver); // Action Method k liye ek variable define kr diya h 
//		Thread.sleep(2000);
		
		/*
		 
1)a.moveToElement(...)	-> Cursor ko move kr k search k field mai lana h

2).click()	Left Click ->	Clicks the search bar, placing the text cursor inside it ready for input.

3).keyDown(Keys.SHIFT) ->	Press SHIFT	Presses and holds down the SHIFT key on the keyboard.

4).sendKeys("hello") ->  hello ko HELLO kr dega kyu ki shift button already press h 
	
5).doubleClick() -> esa krne se HELLO jo ki search bar pr likha h vo select ho jaye ga
	
6).build() -> Sare Action ko combine kr k ek kr do . This is required before execution.

7).perform() -> Executes the entire sequence of built actions in the browser in the specified order.


		 */
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
		element.sendKeys("Search Term");
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		WebElement moveCursor=driver.findElement(By.cssSelector("div[class='nav-line-1-container']"));
		
		// We Move to Specific Element (by Action Method Variable a)
		
		// .contextXlixk() -> iss se cursor voha move hoga or voha jate h click kr dega  voha pr
        a.moveToElement(moveCursor).contextClick().build().perform();
        
        System.out.println("Executed Successfully");
        
	}

}
