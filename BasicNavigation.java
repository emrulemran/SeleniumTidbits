package test.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicNavigation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("");
		driver.navigate().to("https://amazon.com/");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getClass());
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		driver.close();
		driver.quit();
	}
}
