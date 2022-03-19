import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lmanoh572\\Documents\\Selenium_Web_Driver_UDEMY\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		
		List<WebElement> resultantItems = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for (WebElement item : resultantItems) {
			if (item.getText().equalsIgnoreCase("india")) {
				item.click();
				break;
			}
		}
		
		System.out.println("Selected Item : " + driver.findElement(By.id("autosuggest")).getAttribute("value"));
	}

}
