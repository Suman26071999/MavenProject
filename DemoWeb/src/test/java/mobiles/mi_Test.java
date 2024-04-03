package mobiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mi_Test {
	
	@Test
	public void sam() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.mi.com/");
	}
}
