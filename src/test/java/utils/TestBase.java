package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	public WebDriver driver;

public WebDriver WebDriverManager() throws IOException{
	FileInputStream fis=new FileInputStream("D:\\eclipse-workspace1\\BDD_BGV\\src\\test\\resources\\global.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String value=prop.getProperty("QAUrl");
	if(driver==null) {
		if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
	System.setProperty("webdriver.edge.driver","D:\\eclipse-workspace1\\BDD_BGV\\Driver\\msedgedriver.exe");
	driver=new EdgeDriver();//driver get the life
	driver.manage().window().maximize();
	
	
	
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			//firefox
		}

   
	driver.get(value);
	
	}
	return driver;
   
}
}

