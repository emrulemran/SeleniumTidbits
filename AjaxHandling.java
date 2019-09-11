package day.one;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxHandling {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); // Create new Driver

		// Apply implicit wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// got to URL
		driver.get("http://www.w3schools.com/ajax/tryit.asp?filename=tryajax_get");

		// maximize the page
		driver.manage().window().maximize();

		// Capture WebElement of iFrame
		WebElement iFrame = driver.findElement(By.id("iframeResult"));

		// Switch Driver to iFrame
		driver.switchTo().frame(iFrame);

		// Capture Request Button WebElement
		driver.findElement(By.cssSelector("button[type='button']")).click();

		// Capture Ajax WebElement
		WebElement ajax = driver.findElement(By.id("demo"));

		// Instance of WebDriverWait and apply default wait time in seconds
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
    // Recapture Ajax WebElement after Ajax Handling using WebDriverWait and ExpectedConditions
		WebElement ajaxNew = wait.until(ExpectedConditions.elementToBeClickable(ajax));

		// Get the test from Ajax WebElement
		String text = ajaxNew.getText();
		System.out.println(text);

		// Switch Driver out of iFrame
		driver.switchTo().defaultContent();

		// quit the Driver instance
		driver.quit();
	}
}
