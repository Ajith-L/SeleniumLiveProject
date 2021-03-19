package loginpage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import loginpageobject.LoginPageObject;

public class LoginPage {

	WebDriver driver;
  @Test
	public void page() throws IOException {
		FileReader reader = new FileReader("config.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String browser = properties.getProperty("browser");
		String driverloc = properties.getProperty("driverlocation");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverloc);
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverloc);
			driver = new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		PageFactory.initElements(driver, LoginPageObject.class);
		LoginPageObject.username.sendKeys("Admin");
		LoginPageObject.password.sendKeys("admin123");
		LoginPageObject.button.click();
	}
}
