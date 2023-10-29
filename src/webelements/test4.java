package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.facebook.com/login/");
		 WebElement radiobt = (WebElement) driver.findElements(By.linkText("Create New Account"));
		if(radiobt.isSelected()) {
			System.out.println("Pass");
			radiobt.click();
		}
		else {
			System.out.println("Fail");
		}
		driver.close();
	}

}
