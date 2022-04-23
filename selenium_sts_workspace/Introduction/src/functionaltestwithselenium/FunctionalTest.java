package functionaltestwithselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumWebDriver_Udemy\\chromedriver\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		chromeDriver.close();
	}
}
