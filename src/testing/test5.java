package testing;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class test5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String parent = driver.getWindowHandle();
		driver.get("https:www.ebay.com/");
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select s = new Select(dropdown);
		s.selectByIndex(5);
		s.selectByValue("12576");
		driver.findElement(By.id("gh-btn")).click();
		driver.findElement(By.partialLinkText("Restaurant & Food Service")).click();
		driver.findElement(By.className("s-item__title")).click();
		Set<String> child = driver.getWindowHandles();
		for (String b:child) {
			driver.switchTo().window(b);
		}
		driver.findElement(By.linkText("Add to cart")).click();
		driver.findElement(By.linkText("sign in")).click();
		driver.findElement(By.id("create-account-link")).click();
		driver.quit();
		
		
	}

}
