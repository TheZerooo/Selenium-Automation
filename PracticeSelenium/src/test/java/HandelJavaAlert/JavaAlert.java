package HandelJavaAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaAlert {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("name")).sendKeys("Tanu Giri");
	Thread.sleep(1000);
	driver.findElement(By.id("alertbtn")).click();
	Thread.sleep(1000);
	System.out.println(driver.switchTo().alert().getText());
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	
	driver.findElement(By.id("confirmbtn")).click();
	Thread.sleep(1000);
	System.out.println(driver.switchTo().alert().getText());
	Thread.sleep(1000);
	driver.switchTo().alert().dismiss();
}
}
