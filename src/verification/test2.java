package verification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.id("w3loginbtn")).click();
		driver.findElement(By.id("modalusername")).sendKeys("admin");
		driver.findElement(By.id("current-password")).sendKeys("12346");
		driver.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")).click();
		driver.getCurrentUrl();
		String name = driver.getTitle();
		System.out.println(name);
		if(name.contains("Log in - W3Schools"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
