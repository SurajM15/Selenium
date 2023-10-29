package autosuggestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele =driver.findElement(By.id("course"));
	//	Thread.sleep(3000);
		
		Actions a = new Actions(driver);
		driver.findElement(By.xpath("(//a(text()='Selenium Training'))[2]")).click();
		a.moveToElement(ele).perform();
		WebElement addbt = driver.findElement(By.id("add"));

		a.doubleClick(addbt).perform();
		
		
		
	}

}
