package test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonAndCheckbox {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/radio.html");

		WebElement radioButton = driver.findElement(By.id("vfb-7-2"));
		radioButton.click();

		WebElement checkbox = driver.findElement(By.id("vfb-6-0"));
		checkbox.click();

		driver.quit();
	}
}
