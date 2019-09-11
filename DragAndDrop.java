package challenges;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public WebDriver driver = new FirefoxDriver();
	public static String baseurl = "http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/";

	public void open_url() {
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}


// absolute XPaths:
	public void action_1() {
		WebElement From = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div[1]/h1"));
		WebElement To = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/h1"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(From, To).perform();
	}

	public static void main(String[] args) {
		DragAndDrop dnd = new DragAndDrop();
		dnd.open_url();
		dnd.action_1();
	}

}
