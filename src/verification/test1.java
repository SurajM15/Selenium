package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/join/login-popup/");
		driver.findElement(By.id("email--1")).sendKeys("admin");
		driver.findElement(By.id("id_password")).sendKeys("123456");
		driver.findElement(By.id("submit-id-submit"));
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.contains("Login  |  Udemy"))
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
			
		}
	
	driver.close();
	}
	

}
