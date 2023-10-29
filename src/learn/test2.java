package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.id("inputValEnter")).sendKeys("phone");
		driver.findElement(By.className("searchformButton col-xs-4 rippleGrey")).click();
		driver.close();
	}

}
