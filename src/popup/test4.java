package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.skillrary.com/");
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("//a[text()='' SkillRary Essay]")).click();
		Set<String> child = driver.getWindowHandles();
		
		for (String b:child) {
			driver.switchTo().window(b);
		}
			driver.findElement(By.xpath("(//a[text()='Slenium Training'])[2])")).click();
	}

}
