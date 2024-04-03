package cameras;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Canon_Test {
	@Test
	public void cannon() {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().minimize();
		driver.get("https://in.canon/");
	}
}
