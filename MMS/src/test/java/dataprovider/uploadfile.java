package dataprovider;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class uploadfile {
	
		WebDriver d1;
		
		
	public uploadfile(WebDriver d1){
			this.d1=d1;
		}

	
public void upload() throws AWTException {	
	Robot upfile=new Robot();
	
	
StringSelection up = new StringSelection("C:\\Users\\Sangeetha.A\\Desktop\\mms\\Protocol for QC_with settings_ziYPGs.docx");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(up, null);

upfile.setAutoDelay(1000);

upfile.keyPress(KeyEvent.VK_CONTROL);
upfile.keyPress(KeyEvent.VK_V);

upfile.keyRelease(KeyEvent.VK_CONTROL);
upfile.keyRelease(KeyEvent.VK_V);

upfile.setAutoDelay(3000);

upfile.keyPress(KeyEvent.VK_ENTER);
upfile.keyRelease(KeyEvent.VK_ENTER);



}}
