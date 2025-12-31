package PracticeAssignment;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKartExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		String[] pName = { "Beetroot", "Cucumber", "Brinjal", "Capsicum" };
//		Thread.sleep(3000);
		driver.get(" https://rahulshettyacademy.com/seleniumPractise/#/");

		addProduct(driver, pName);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
//			driver.findElement(By.xpath("//button[@type='button']")).click();

		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());

	}

	// Function To Add Product in GreenKart
	public static void addProduct(WebDriver driver, String[] pName) {

		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formatename = name[0].trim();
			List<String> pNameList = Arrays.asList(pName);
			if (pNameList.contains(formatename)) {
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				j++;
				if (j == pName.length) {
					break;
				}

			}
		}

	}

}
