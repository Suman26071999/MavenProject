package cameras;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nikon_Test {
	@Test
	public void nikon() {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().minimize();
		driver.get("https://www.nikon.co.in/");
	}

}
