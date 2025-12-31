package PracticeAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
//		System.out.println("is it working");
//		driver.findElement(By.cssSelector("img[src='./images/cucumber.jpg']")).click();
//		System.out.println("YAA");
		
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4[class='product-name']"));
		Thread.sleep(2000);
		
		/*
		for(WebElement product:products) {
//			System.out.println("Your Product is:-> "+product.getText());
			String pName=product.getText();
			
			if(pName.contains("Cucumber")) {
				product.findElement(By.cssSelector("div[class='product-action']")).click();
			}
		}
		*/
		
		
		
		for(int i=0;i<products.size();i++) {
			
			String pName= products.get(i).getText();
			if(pName.contains("Cucumber")) {
				
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				Thread.sleep(1000);
				break;
			}
		}
//		driver.close();
		

	}

}
