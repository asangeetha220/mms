package sangeetha.MMS;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class stylegroup extends Styleguide{
	String styleguide1 ;
	int sub;
	
	@Test(priority=2)
	public void case1() throws InterruptedException, IOException {
	System.out.println("driver" + d1);
	dataprovider.styleoptions sp=new dataprovider.styleoptions(d1);	
	
	Thread.sleep(3000);
	sp.general();
	Thread.sleep(3000);
	
	if(sp.general_isselected()==false) {
		System.out.println("yes unchecked");
		}
	else {sp.general();}
	
	System.out.println(sp.general_isselected());
	//Thread.sleep(3000);
	sp.submit();	
	
	}
	@Test(priority=3)
	public void submitmenu() throws InterruptedException, IOException, AWTException {
		//d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dataprovider.styleoptions sp=new dataprovider.styleoptions(d1);
		sp.submit_document();
		Styleguide sg=new Styleguide();
		sg.json();
		sp.upload_file();
		dataprovider.uploadfile up=new dataprovider.uploadfile(d1);
		up.upload();
		sp.Submit_file();	
	 String actualurl=	"https://cyborgdev.sageit.us/mms/processqueue.php";
	 
	assertEquals(d1.getCurrentUrl(),actualurl );
	 
	}
	@Test(priority=4)
	public void myqueue() {
		
		
		
	
	
	}}


