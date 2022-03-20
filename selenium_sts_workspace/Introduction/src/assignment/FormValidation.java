package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lmanoh572\\Documents\\Selenium_Web_Driver_UDEMY\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Sundar");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sindar34@gmail.com");
		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("Sundar");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		
		WebElement genderDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select select = new Select(genderDropdown);
		select.selectByIndex(0);
		
		System.out.println("Selected Gender : " + select.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("inlineRadio1")).click();
		System.out.println("Employment Status : " + driver.findElement(By.id("inlineRadio1")).getAttribute("value"));
		
		driver.findElement(By.name("bday")).sendKeys("02/02/1992");
		
		// submitting the form
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		if (driver.findElement(By.cssSelector(".alert-success")).isDisplayed()) {
			System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		} else {
			System.out.println("Success message doesn't displayed !!");
		}
	}

}
