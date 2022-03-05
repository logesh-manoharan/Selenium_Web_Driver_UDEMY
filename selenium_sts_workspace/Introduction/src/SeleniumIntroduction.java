import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		// Invoking Browser
		
		// 1. Chrome Browser
		WebDriver chromeWebDriver = new ChromeDriver();
		chromeWebDriver.close();
		
		// 2. Firefox Browser
		WebDriver fireFoxDriver = new FirefoxDriver();
		fireFoxDriver.close();

	}

}
