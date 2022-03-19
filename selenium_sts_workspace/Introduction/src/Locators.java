import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void login(WebDriver driver, String username, String password) {
		/*
		 *  ID Locator
		 */
		WebElement usernameElement = driver.findElement(By.id("inputUsername"));
		
		/*
		 *  NAME Locator
		 */
		WebElement passwordElement = driver.findElement(By.name("inputPassword"));
		
		usernameElement.sendKeys(username);
		passwordElement.sendKeys(password);
		
		
		WebElement rememberUsrChkbox = driver.findElement(By.id("chkboxOne"));
		WebElement agreeChkbox = driver.findElement(By.id("chkboxTwo"));
		
		/*
		 *  CLASSNAME Locator
		 */
		WebElement signinBtnElement = driver.findElement(By.className("signInBtn"));
		
		rememberUsrChkbox.click();
		agreeChkbox.click();
		signinBtnElement.click();
		
		/*
		 *  CSS Selector Locator
		 */
		WebElement errorMsgElement = driver.findElement(By.cssSelector("p.error"));
		
		if (errorMsgElement.isDisplayed()) {
			// print the error message displayed in a browser
			System.out.println(errorMsgElement.getText());
			
			// FORGOT PASSWORD
			/* 
			 * Link Text Locator (Locate the link elements using its text)
			 */
			WebElement forgotPasswdLinkElmt = driver.findElement(By.linkText("Forgot your password?"));
			forgotPasswdLinkElmt.click();
			
			/* 
			 * Xpath Locator
			 */
//			WebElement nameElement = driver.findElement(By.xpath("//input[@placeholder=\"Name\"]"));
//			nameElement.sendKeys("Logesh");
			
			forgotPassword(driver, "Mano", "mano190@gmail.com", "9090909090");
			
			return;
		}
		WebElement logoutElement = driver.findElement(By.className("logout-btn"));
		if (logoutElement.isDisplayed()) {
			System.out.println("Logged in Successfully !!");
			driver.close();
			return;
		}
	}
	
	public static void forgotPassword(WebDriver driver, String newName, String newMail, String newPhoneNo) {
		driver.findElement(By.xpath("//div[@class=\"forgot-pwd-container\"]/a[1]")).click();
		driver.findElement(By.cssSelector("input[placeholder=\"Name\"]")).sendKeys(newName);
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys(newMail);
		driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys(newPhoneNo);
		
		/*
		 * Sibling Traversal
		 */
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']/following-sibling::button[1]")).click();
		
		/*
		 * Child to Parent Traversal
		 */
		// driver.findElement(By.xpath("//button[@class='go-to-login-btn']/parent::div/button[2]")).click();
		
//		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click();
	}
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lmanoh572\\Documents\\Selenium_Web_Driver_UDEMY\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Waiting for 5 seconds when we encountered a NoSuchElement exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		login(driver, "rahul", "rahulshettyacademy!!");
	}
}
