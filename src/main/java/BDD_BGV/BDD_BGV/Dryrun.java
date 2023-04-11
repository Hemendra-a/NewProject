package BDD_BGV.BDD_BGV;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dryrun {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","D:\\eclipse-workspace1\\BDD_BGV\\Driver\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://flucenttechnologies.com/bgv/login.php");
	

	driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div/input[1]")).sendKeys("hemendra.rajput88263@gmail.com");
	driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div/input[2]")).sendKeys("Pass@12345");
	driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
	driver.findElement(By.xpath("//*[@id='fname']")).sendKeys("xyz");
	driver.findElement(By.xpath("//*[@id='dob']")).sendKeys("13-05-1997");
	
}
}
