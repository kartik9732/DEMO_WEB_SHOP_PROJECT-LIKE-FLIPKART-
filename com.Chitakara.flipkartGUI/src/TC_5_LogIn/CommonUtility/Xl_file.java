package TC_5_LogIn.CommonUtility;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xl_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String FIRSTNAME=Utility_class.getExcelData("st_practice", 1, 0);
		//here the excel file also start from 0 so first name is on 0 but kartik is on 1 row
		String LASTNAME=Utility_class.getExcelData("st_practice", 1, 1);
		String EMAIL=Utility_class.getExcelData("st_practice", 1, 2);
		String PASSWORD=Utility_class.getExcelData("st_practice", 1, 3);
		String CONFIRM_PASSWORD=Utility_class.getExcelData("st_practice", 1, 4);
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//for link we use the property file
		driver.get(Utility_class.getPropertyValue("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FIRSTNAME);
		driver.findElement(By.id("LastName")).sendKeys(LASTNAME);
		driver.findElement(By.id("Email")).sendKeys(EMAIL);
		driver.findElement(By.id("Password")).sendKeys(PASSWORD);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(CONFIRM_PASSWORD);
		driver.findElement(By.id("register-button")).click();

	}

}
