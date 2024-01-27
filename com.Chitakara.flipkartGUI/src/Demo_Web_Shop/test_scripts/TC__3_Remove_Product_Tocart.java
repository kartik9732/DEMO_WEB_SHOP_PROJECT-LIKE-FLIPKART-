package Demo_Web_Shop.test_scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC__3_Remove_Product_Tocart {
	@Test
	public void removeProductFromTheCart() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(1000);
		
		//scrolling the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		
		//remove product
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.xpath("//input[@value='Update shopping cart']"));
		
	}
}
