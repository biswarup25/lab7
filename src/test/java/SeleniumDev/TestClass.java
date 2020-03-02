package SeleniumDev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public static void testMethod1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BISWARUPCHAKRAVARTY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());		

	}

}
