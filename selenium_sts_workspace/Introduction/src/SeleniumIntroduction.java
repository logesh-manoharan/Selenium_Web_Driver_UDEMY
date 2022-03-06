import java.util.Scanner;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumIntroduction {

	public static final Logger LOGGER = Logger.getGlobal();
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the BROWSER NAME : ");
		String browserName = sc.nextLine();
		
		WebDriver driver = null;
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lmanoh572\\Documents\\Selenium_Web_Driver_UDEMY\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\lmanoh572\\Documents\\Selenium_Web_Driver_UDEMY\\firefoxdriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\lmanoh572\\Documents\\Selenium_Web_Driver_UDEMY\\edgedriver\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			// Most of the developers can't want to run in Internet Explorer because of its inconsistency and slowness
			driver = new InternetExplorerDriver();
		}
		// Invoking Browser
		// Invoking the ChromDriver.exe
		/*
		 * By default, Selenium is looking for the driver at 'webdriver.chrome.driver' (for CHROME)
		 */
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		LOGGER.info("Title : " + title + "\nCurrent URL : " + currentUrl);
		driver.close();

	}

}
