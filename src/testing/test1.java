package testing;

import java.awt.Dimension;
import java.time.Duration;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		String current = driver.getCurrentUrl();
		System.out.println(current);
		String strurl = driver.getCurrentUrl();
		System.out.println(strurl);
	    driver.close();

	}

}
