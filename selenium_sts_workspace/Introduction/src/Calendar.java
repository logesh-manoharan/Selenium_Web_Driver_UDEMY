import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		
		// to select the values in drop down
		WebDriver driver = DynamicDropdown.main(null);
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".ui-state-highlight")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date1")).getAttribute("value"));
		
		// when we click the disabled element in this case element got enabled
		driver.findElement(By.cssSelector("input[name='ctl00$mainContent$view_date2']")).click();
		
		// check the disabled element
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Element is Enabled");
		} else {
			System.out.println("Element is Disabled");
		}
	}

}
