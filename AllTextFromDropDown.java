package eTech;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
public class AllTextFromDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\SelenumMavenProj\\utils\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.findElement(By.linkText("REGISTER")).click();
        Select sel = new Select(driver.findElement(By.name("country")));
        List<WebElement> countries = new ArrayList<WebElement>(sel.getOptions());
        System.out.println("Total number of countries: " + countries.size());

        for(int i =0; i<countries.size(); i++){
            System.out.println((i + 1) + " " + countries.get(i).getText());
        }
    }
}
