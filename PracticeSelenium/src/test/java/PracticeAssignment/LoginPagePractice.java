package PracticeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePractice {
private static final WebElement StaticDropdown = null;

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	driver.findElement(By.id("password")).sendKeys("learning");

	driver.findElement(By.xpath("//input[@value='user']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("okayBtn")).click();
//	driver.findElement(By.cssSelector("select.form-control")).click();
	WebElement staticDropdown=driver.findElement(By.cssSelector("select.form-control"));

	Select dropdown= new Select(staticDropdown);
	
	dropdown.selectByIndex(2);
	driver.findElement(By.id("terms")).click();
	driver.findElement(By.id("signInBtn")).click();
Thread.sleep(3000);
	// Explict Wait 


WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("shop")));

	
	
//	driver.findElement(By.xpath("//option[@value='consult']")).click();
	
	driver.switchTo().alert().accept();
//	driver.switchTo().alert().accept();

//	Thread.sleep(3000);
//	driver.close();
}
}
