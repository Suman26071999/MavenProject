package cameras;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pentax_Test {
	@Test
	public void pentax() {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().minimize();
		driver.get("https://pentax.eu/");
	}

}
