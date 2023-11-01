package testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.ebay.com/");
	WebElement dropdown = driver.findElement(By.id("gh-cat"));
	Select s = new Select(dropdown);
	List<WebElement> alloptions = s.getOptions();
    System.out.println(alloptions.size());
    for (int j = 0; j < alloptions.size(); j++) {
        System.out.println(alloptions.get(j).getText());
    }

}
}
