package Demo_Web_Shop.test_scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC__2_Add_Product_Tocart {

	@Test
	public void addProductToTheCart() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//search category
		driver.findElement(By.linkText("Computers")).click();
		driver.findElement(By.linkText("Desktops")).click();
		Thread.sleep(1000);
		
		//scrolling the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		
		//add products
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.id("add-to-cart-button-72")).click();
		driver.findElement(By.linkText("computer")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}
}
