package sangeetha.MMS;
		
import java.io.IOException;
		import java.net.HttpURLConnection;
		import java.net.MalformedURLException;
		import java.net.URL;
		import java.security.Security;
import java.util.ArrayList;
import java.util.List;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import dataprovider.configfilereader;

import javax.net.ssl.HttpsURLConnection;


public class Styleguide extends configfilereader {			
	
	
	
	
	public Object styleguide;
	public String disp;
	@Test (priority = 0)	
	public void headmenu() throws IOException, InterruptedException {
		
		System.out.println("driver" + d1);
		List <WebElement> styleguide = d1.findElements(By.xpath("//li['i']/a/p"));
		System.out.println(styleguide.size());
		
		for(int i=0;i<styleguide.size();i++ ) {
			String values1 = styleguide.get(i).getText();	
			System.out.println(values1);
								}
		
		//		try {

//		catch(Exception e) {
//		for (WebElement option : styleguide) {
//			System.out.println(option.getText());
//		}}
		
		styleguide.get(3).click();	
	}
		@Test (priority = 1)	
		public void json() throws IOException, InterruptedException {		
	
      WebElement jsons = d1.findElement(By.id("style_guide_name"));
		
		Select styleguidejson = new Select(jsons);
		//styleguidejson.selectByVisibleText("MMS_Release_v1");
		//System.out.println (styleguidejson.getOptions());
		
		List<WebElement> jsonvalues = styleguidejson.getOptions();
		System.out.println(jsonvalues.size());
		
		for (int j=0;j<jsonvalues.size();j++) {
			String values = jsonvalues.get(j).getText();
			System.out.println(values);
			if(values.equals("MMS_Release_v1")){
				jsonvalues.get(j).click();
				//break;
				 
			}}}
				
		
	
		@Test (priority = 1)
		public void styleoptions() throws InterruptedException 
		{
			d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List  style = d1.findElements(By.cssSelector("input.checkbox_data_changes.parent_checkbox"));
			//List  style = d1.findElements(By.cssSelector("div#show_hide_nav.panel-group"));
	//List  style = d1.findElements(By.xpath("//*[contains(text(),'heading-')]/h4/a/label/input[3]"));
			
	//List  style = d1.findElements(By.className("show_hide_nav_title"));		
			System.out.println(style.size());
			
			
	
//	Thread.sleep(3000); 	
//	
//		for(int i=0;i<style.size();i++ ) {
//			String values = ((WebElement) style.get(i)).getText();
//			System.out.println(values);
			//Thread.sleep(3000); 
			//d1.findElement(By.xpath("//div[@id='heading-General']/h4/a/label/input[3]")).click();;
	}
	
}
		
		

	
	
		
		
		
	
	
	
	

		
	


	




	
			
			
	

	


