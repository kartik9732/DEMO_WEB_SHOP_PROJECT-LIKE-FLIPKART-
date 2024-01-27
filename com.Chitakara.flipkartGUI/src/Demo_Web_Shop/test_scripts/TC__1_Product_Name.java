package Demo_Web_Shop.test_scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC__1_Product_Name {
	

	@Test
	public void getAllProductNames() throws InterruptedException {
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
		driver.findElement(By.xpath("//img[@title='Show details for Build your own cheap computer']")).click();
		
		//find product name
		String productName = driver.findElement(By.xpath("//h1[contains(text(),'Build your own cheap computer')]")).getText();
		System.out.println(("The Product name is: "+productName));
		Thread.sleep(1000);
		driver.quit();
	}
}
