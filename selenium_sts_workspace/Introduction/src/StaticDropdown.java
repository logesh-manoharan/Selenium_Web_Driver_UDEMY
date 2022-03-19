import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	/*
	 * If the TAG NAME is 'select' then it is StaticDropdown
	 */
	
	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lmanoh572\\Documents\\Selenium_Web_Driver_UDEMY\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// waiting for 5 seconds whenever we are into a situation 'No Such Element'
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticDropdownElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select staticDropdown = new Select(staticDropdownElement);
		
		System.out.println("Going to select by Index");
		/*
		 * Select the value in the by INDEX value
		 */
		staticDropdown.selectByIndex(3);
		System.out.println("Selected value - 1 : " + staticDropdown.getFirstSelectedOption().getText());
		/*
		 * Select the value by Visible Text
		 */
		staticDropdown.selectByVisibleText("AED");
		System.out.println("Selected value - 2 : " + staticDropdown.getFirstSelectedOption().getText());
		/*
		 * Select by value [i.e. checking the value of 'value attribute']
		 */
		staticDropdown.selectByValue("INR");
		System.out.println("Selected Value - 3 : " + staticDropdown.getFirstSelectedOption().getText());
		
	}

}
