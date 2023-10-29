package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.snapdeal.com/");
		WebElement ele = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("123");
		driver.findElement(By.className("sd-icon sd-icon-delete-sign fnt-22")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("inputValEnter")).sendKeys("phone");
			
	}

}
