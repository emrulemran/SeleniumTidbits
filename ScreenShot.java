package selenium.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bdjobs.com/");


		// Take screenshot and store as a FILE
		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			// now copy the  screenshot to desired location using copyFile method
			FileUtils.copyFile(src, new File("/Users/mymbp/Desktop/ScreenShot.png"));
		}

		catch (IOException e) {
			System.out.println(e.getMessage());

		}
		System.out.println("ScreenShot has been taken!");
	}
}
