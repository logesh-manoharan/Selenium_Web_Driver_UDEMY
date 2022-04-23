package synchronisationUsage;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumWebDriver_Udemy\\chromedriver\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		try {
			/*
			 * 1. Implicit Wait To define the Waiting time globally. So, after defining this
			 * if any element is not present at a instant execution will wait for 'n'
			 * seconds.
			 * 
			 */
			chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			/*
			 * 2. Explicit Wait If we want to specify more waiting time for any specific
			 * elements.
			 * 
			 *   a. WebDriverWait
			 *   b. Fluent Wait
			 *   
			 *   Difference between WebDriverWait and FluentWait
			 *   
			 *      'WebDriverWait' is keep on polling into the Browser to identify the 
			 *      presence of Element.
			 *      
			 *      Whereas, in 'FluentWait' we can give the Polling period also. If we
			 *      give polling period as '2 seconds' polling to the browser will happen
			 *      only for every 2 seconds.
			 */
			
			// WebDriverWait
			WebDriverWait w = new WebDriverWait(chromeDriver, 5);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));

			// Fluent Wait
			Wait<WebDriver> wait = new FluentWait<WebDriver>(chromeDriver).withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

			WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.id("foo"));
				}
			});
			
			/*
			 * 3. Thread.sleep It is like a PAUSE in JAVA programming.
			 *
			 */
			Thread.sleep(3000); // 3 seocnds pause

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
		}
		
		chromeDriver.close();
		
	}

}
