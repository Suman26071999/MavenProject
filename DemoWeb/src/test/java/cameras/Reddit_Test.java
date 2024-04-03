package cameras;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Reddit_Test {
	@Test
	public void reddit() {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().minimize();
		driver.get("https://www.reddit.com/");
	}

}
