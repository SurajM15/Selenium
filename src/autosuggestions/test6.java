package autosuggestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.amazon.in/");
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(dropdown);
		s.selectByIndex(5);
		s.selectByValue("search-alias=amazon-devices");
		s.selectByVisibleText("Amazon Fashion");
		
		System.out.println(s.isMultiple());
		if(s.isMultiple()) {
			s.deselectAll();
		}
		else {
			System.out.println("It is not multiple select dropdown");
			
		}
	}

}
