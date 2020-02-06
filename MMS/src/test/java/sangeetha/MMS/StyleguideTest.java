package sangeetha.MMS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StyleguideTest {
	 WebDriver d1;
  @Test(priority = 1)
  public void styleTest() throws InterruptedException {
	  	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");	
			
			System.setProperty("java.protocol.handler.pkgs",
					"com.sun.net.ssl.internal.www.protocol");
			
			WebDriver d1=new ChromeDriver ();
			 
			
			d1.get("https://cyborgdev.sageit.us/mms/users.php");
			d1.manage().window().maximize();
			d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			WebDriverWait wait = new WebDriverWait(d1, 3000); 
			
			WebElement enterusername = d1.findElement(By.id("email"));
			enterusername.sendKeys("salla@sageitinc.com");
			
			WebElement enterpassword = d1.findElement(By.id("password"));
			enterpassword.sendKeys("vc@HYD1234");
			
			WebElement submit = d1.findElement(By.id("submit"));
			submit.click();	
			Thread.sleep(3000);
			List<WebElement> tableheader = d1.findElements(By.xpath("//div[@id='example3_wrapper']/div[3]/div/div/table/thead"));
			
    System.out.println(tableheader.size());
    
    for(int i=0;i<tableheader.size();i++) {
    String header=	tableheader.get(i).getText();
    System.out.println(header);	    
    }
    
    //String keyid1="ojH1DY";
    String keyid1=null;
   keyid1= d1.findElement(By.xpath("//table[@id='example3']/tbody/tr/td[2]")).getText();  
   
   System.out.println("keyid1 is " + keyid1 );	
   
 
   
  List <WebElement> rows = d1.findElements(By.xpath("//table[@id='example3']/tbody/tr"));
	   
	int rowssize = rows.size();
	 //System.out.println("rowcount" +  rowssize );
	 
	 for(int i=0; i<rows.size(); i++) {
	        List<WebElement> col = rows.get(i).findElements(By.xpath("//table[@id='example3']/tbody/tr["+ i +"]/td"));
	        int columnCount = col.size();
	        //System.out.println( "columnCount" + columnCount );
	 
  if(columnCount > 0) {
	  String getkey=col.get(1).getText();
	 // System.out.println( "get key " + getkey );
	  if(getkey.equals(keyid1)) {
		 // String status = col.get(9).getText();
		  System.out.println("both are equal");
          //String outputfile = col.get(8).getText();
		  WebElement sta=d1.findElement(By.xpath("//*[@id=\"example3\"]/tbody/tr[\"+ i +\"]/td[9]"));
		  d1.navigate().refresh();
          //System.out.println(outputfile);
		  wait.until(ExpectedConditions.textToBePresentInElement(sta, "Completed"));
		  d1.navigate().refresh();
          //if(outputfile.contentEquals("Completed")) {
        	  System.out.println("Completed and we will click" );
        	 // Thread.sleep(3000);
        	WebElement down=d1.findElement(By.xpath("//*[@id=\"example3\"]/tbody/tr[\"+ i +\"]/td[7]/a"));
       down.click();
        	
          }
         
        	  else{
        		  System.out.println("come out" );
        	  }
          
         break;
	  }     	  
      }  }  	  
	  
  @Test(priority = 2)
  public void styleTest1() throws InterruptedException{
   }

  }


