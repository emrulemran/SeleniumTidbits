package test.practice;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AjaxDemo {
	public static WebDriver driver = new FirefoxDriver();

	@BeforeClass
	public void setUp() {
		driver.manage().window().maximize();
	}

	@Test
	public static void checkWebPageTitle() {
		driver.get("http://demo.guru99.com/test/ajax.html");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Ajax Test");

	}

	@Test
	public void test_AjaxExample() {
		By container = By.cssSelector(".container");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(container));

		WebElement noTextElement = driver.findElement(By.className("radiobutton"));
		String textBefore = noTextElement.getText().trim();

		driver.findElement(By.id("yes")).click();
		driver.findElement(By.id("buttoncheck")).click();

		WebElement TextElement = driver.findElement(By.className("radiobutton"));
		wait.until(ExpectedConditions.visibilityOf(TextElement));
		String textAfter = TextElement.getText().trim();

		Assert.assertNotEquals(textBefore, textAfter);
		System.out.println("Ajax Call Performed");

		String expectedText = "Radio button is checked and it's value is Yes";

		Assert.assertEquals(textAfter, expectedText);
		driver.close();
	}

}
