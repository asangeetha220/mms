package dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class configfilereader {
	public static WebDriver d1;
	
	
	@BeforeSuite
	public void config()throws IOException, InterruptedException {
		Properties prop;
		FileInputStream fs;
			
		prop=new Properties();
		fs = new FileInputStream ("C:\\Users\\Sangeetha.A\\eclipse-workspace\\MMS\\configs\\configuration.properties");
		prop.load(fs);		
	
		String link=prop.getProperty("url");
		System.out.println(link);
		
		String name=prop.getProperty("Username");
		System.out.println(name);
		
		String password=prop.getProperty("password");
		System.out.println(password);
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");	
		
		System.setProperty("java.protocol.handler.pkgs",
				"com.sun.net.ssl.internal.www.protocol");
		
		 d1=new ChromeDriver ();
		 
		
		d1.get(link);
		d1.manage().window().maximize();
		//d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement enterusername = d1.findElement(By.id("email"));
		enterusername.sendKeys(name);
		
		WebElement enterpassword = d1.findElement(By.id("password"));
		enterpassword.sendKeys(password);
		
		WebElement submit = d1.findElement(By.id("submit"));
		submit.click();		

		Thread.sleep(3000);
		
		
			
		
		
		
		}}
		


