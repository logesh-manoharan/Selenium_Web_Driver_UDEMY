import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		// Invoking Browser
		// Invoking the ChromDriver.exe
		/*
		 * By default, Selenium is looking for the driver at 'webdriver.chrome.driver' (for CHROME)
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lmanoh572\\Documents\\Selenium_Web_Driver_UDEMY\\chromedriver\\chromedriver.exe");
		
		// 1. Chrome Browser
		WebDriver chromeWebDriver = new ChromeDriver();
		chromeWebDriver.get("https://www.google.com");
		chromeWebDriver.close();
		
		// 2. Firefox Browser
//		WebDriver fireFoxDriver = new FirefoxDriver();
//		fireFoxDriver.close();

	}

}
