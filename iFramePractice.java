package selenium.day1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iFramePractice {
	public static void main(String[] args) {
		WebDriver driver = getDriver();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");

		// Find iFrame WebElement
		WebElement iframeWebElement = driver.findElement(By.id("iframeResult"));
		// Move current driver inside iFrame
		driver.switchTo().frame(iframeWebElement);
		// Click on alert button
		driver.findElement(By.xpath("html/body/button")).click();
		// Handle current alert
		Alert alt = driver.switchTo().alert();
		alt.accept();
		// alt.dismiss();
		// Move current driver outside of iFrame
		driver.switchTo().defaultContent();
		String text = driver.findElements(By.className("headerText")).get(1).getText();
		System.out.println(text);
	}

	public static WebDriver getDriver() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void alertHandle(WebDriver driver, String decision) {
		Alert alt = driver.switchTo().alert();

		if (decision.equalsIgnoreCase("accept")) {
			alt.accept();
		} else if (decision.equalsIgnoreCase("dismis")) {
			alt.dismiss();
		}

	}
}
