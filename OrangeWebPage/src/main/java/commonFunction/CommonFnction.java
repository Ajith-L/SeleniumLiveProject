package commonFunction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testobject.LoginPageObject;

public class CommonFnction {
	public static Properties properties = null;
	public static WebDriver driver = null;

	public Properties propertiesFile() throws IOException {
		FileInputStream stream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(stream);

		return properties;
	}

	@BeforeTest
	public void browser() throws IOException {
		propertiesFile();
		String broswer = properties.getProperty("browser");
		String driverlocation = properties.getProperty("driverlocation");
		String url = properties.getProperty("url");

		if (broswer.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverlocation);
			driver = new ChromeDriver();
		} else if (broswer.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverlocation);
			driver = new FirefoxDriver();

		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, LoginPageObject.class);
		LoginPageObject.username.sendKeys(properties.getProperty("username"));
		LoginPageObject.password.sendKeys(properties.getProperty("password"));
		LoginPageObject.button.click();

	}

	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}
