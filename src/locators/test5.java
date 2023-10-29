package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.partialLinkText("account?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("9876543210");
		driver.findElement(By.id("did_submit")).click();
		
	}

}
