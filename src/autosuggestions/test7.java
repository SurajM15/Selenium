package autosuggestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test7 {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.amzon.com");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
			driver.findElement(By.className("nav-input")).click();
			
			
	}

}
