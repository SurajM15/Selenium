package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.id("course"));
		Actions a  = new Actions(driver);
		a.moveToElement(ele);
		driver.findElement(By.linkText("Selenium Training")).click();
		driver.findElement(By.className("btn btn-primary btn-lg btn-flat")).click();
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
				
	}

}
