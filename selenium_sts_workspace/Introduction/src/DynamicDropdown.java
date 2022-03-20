import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static WebDriver main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lmanoh572\\Documents\\Selenium_Web_Driver_UDEMY\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		System.out.println("FROM : " + driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value"));
		
		/*
		 * (XPATH)[index]
		 */
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		/*
		 * The above INDEX based mechanism was not recommended
		 */
		
		/*
		 * Instead, we can use PARENT CHILD relationship to identify the element uniquely.
		 * PARENT XPATH and CHILD XPATH got separated by using a WHITESPACE.
		 */
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		System.out.println("TO : " + driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getAttribute("value"));
		
		
		return driver;
	}

}
