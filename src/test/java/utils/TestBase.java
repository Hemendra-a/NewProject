package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;

public WebDriver WebDriverManager() throws IOException{
	FileInputStream fis=new FileInputStream("D:\\eclipse-workspace1\\BDD_BGV\\src\\test\\resources\\global.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String value=prop.getProperty("QAUrl");
	if(driver==null) {
		if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();//driver get the life
	driver.manage().window().maximize();
	
	
	
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();//driver get the life
			driver.manage().window().maximize();
		}

   
	driver.get(value);
	
	}
	return driver;
   
}
}

