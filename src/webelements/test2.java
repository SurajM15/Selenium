package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.facebook.com/login/");
		
		WebElement ele = driver.findElement(By.id("email"));
		Dimension s = ele.getSize();
		int h = s.getHeight();
        System.out.println(h+ "heigth of element");

            int w = s.getWidth();
            System.out.println(w+ "Width of element");
           driver.close(); 
	}

}
