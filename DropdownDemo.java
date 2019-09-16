package test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) {

		WebDriver driver1 = new FirefoxDriver();
		driver1.get("http://demo.guru99.com/test/newtours/register.php");

		// Select class object:
		Select drpCountry = new Select(driver1.findElement(By.name("country")));
		drpCountry.selectByVisibleText("UNITED STATES");

		WebDriver driver2 = new FirefoxDriver();
		// Selecting Items in a Multiple SELECT elements
		driver2.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver2.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
	}

}
