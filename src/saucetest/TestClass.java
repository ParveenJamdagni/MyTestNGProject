package saucetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestClass {
	
	public WebDriver driver;
	@Test
	public void SampleTest()
	{
		System.out.println("This is first TestNG Sauce integration project");
		String driverPath = "D:\\Drivers\\IEDriverServer_Win32_3.3.0\\";
		
		System.setProperty("webdriver.ie.driver", driverPath
				+ "IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://10.13.111.195/svc/oneclick/index.jsp");
		 String strPageTitle = driver.getTitle();
		 System.out.println("Page title: - "+strPageTitle);
		 // Providing username & password.
		 driver.findElement(By.name("userName")).sendKeys("Manual_NRT");
		 driver.findElement(By.name("password")).clear();
		 driver.findElement(By.name("password")).sendKeys("123");
		 driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[1]/input")).submit();
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
  
		driver.quit();
		
	}
	

}
