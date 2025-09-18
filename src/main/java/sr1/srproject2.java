package sr1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class srproject2 {
	
	
	@Test
	public void ValidateSrproject2() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.srnawalespapad.co.in/contact-sr-nawales-papad/");
		
	}

}
