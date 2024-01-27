package TC_5_LogIn.CommonUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class properties_file1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//step1 craete a java representation object of external file 
		FileInputStream fis=new FileInputStream("./Data_driven_testing/common_data.properties");
		//step2 create a object of properties class
		Properties prop=new Properties();
		//step load all the key into the properties object
		prop.load(fis);
		//step 4 the propeerties class method to fetch the data
		String URL=prop.getProperty("url");
		String EMAIL=prop.getProperty("userName");
		String PASSWORD=prop.getProperty("password");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("Email")).sendKeys(EMAIL);
		driver.findElement(By.id("Password")).sendKeys(PASSWORD,Keys.ENTER);
		
		
		
		
		
		

	}

}
