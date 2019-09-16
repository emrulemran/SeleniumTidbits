package test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tooltip {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		String tooltip = driver
				.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input"))
				.getAttribute("title");

		System.out.println("Tool Tip message : " + tooltip);
    
    // we can achieve this by using Assert.AssertEquals
   
		if (tooltip.equals("Search")) {
			System.out.println("Test Case Passed!");
		}
	}
}
