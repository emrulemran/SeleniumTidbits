package selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		WebDriver driver = getDriver();
		driver.get("http://elitecareer.net/register.php");
		WebElement dropList = driver.findElement(By.name("Gender"));
		Select sl = new Select(dropList);
		sl.selectByValue("Male");
		System.out.println(sl.getFirstSelectedOption().getText());

	}

	private static WebDriver getDriver() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
