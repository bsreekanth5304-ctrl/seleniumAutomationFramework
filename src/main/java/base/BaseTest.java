package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.LOG;

public class BaseTest {
	protected WebDriver driver;

	@BeforeMethod
	public void setup() {
		LOG.info("setting up WebDriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		LOG.info("LOGIN TO URL");
		driver.get("https://admin-demo.nopcommerce.com/login");
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			LOG.info("CLOSING BROWSER");
			driver.quit();
		}
	}
}
