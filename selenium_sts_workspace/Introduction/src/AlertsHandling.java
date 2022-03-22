import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lmanoh572\\Documents\\Selenium_Web_Driver_UDEMY\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Alert
		driver.findElement(By.id("alertbtn")).click();
		// TO get the TEXT present in the Alert box
		System.out.println(driver.switchTo().alert().getText());
		// to click OK
		driver.switchTo().alert().accept();
		
		
		// Confirm
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		// to click 'OK'
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		// to click 'Cancel'
		driver.switchTo().alert().dismiss();
	}

}
