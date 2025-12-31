package PracticeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AngularPracticeFORM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	 WebDriver driver=new EdgeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://rahulshettyacademy.com/angularpractice/");
	 
	 driver.findElement(By.name("name")).sendKeys("Parul Sharma");
//	 driver.findElement(By.cssSelector("form[class*='form-control']:nth-child(2)")).sendKeys("Parul123@gmail.com");
	 driver.findElement(By.name("email")).sendKeys("Parul123@gmail.com");
	 driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("1234");
	 
	 Thread.sleep(1000);
	 driver.findElement(By.className("form-check-input")).click();
	 Thread.sleep(1000);
	 WebElement dropdown=driver.findElement(By.id("exampleFormControlSelect1"));
	 Select drop=new Select(dropdown);
	 drop.selectByIndex(1);
	 
	 driver.findElement(By.cssSelector("input[value='option2']"));
	 driver.findElement(By.name("bday")).sendKeys("22/02/2006");
	 driver.findElement(By.cssSelector(".btn.btn-success")).click();
	 
	 
	 
	 Thread.sleep(3000);
	System.out.println(driver.findElement(By.className("alert-dismissible")).getText());
	  int a =10;
	  System.out.println("Your variable is "+a);
//	 driver.close();

	}

}
