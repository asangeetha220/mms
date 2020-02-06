package dataprovider;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class styleoptions {
	
	WebDriver d1;
	
	By generalstandards=By.xpath("//div[@id='heading-General']/h4/a/label/input[3]");
	By Paragraph = By.xpath("//div[@id='heading-Paragraph']/h4/a/label/input[3]");
	By Abbreviations_Acronyms = By.xpath("//div[@id='heading-AbbreviationsAcronymns']/h4/a/label/input[3]");
	By Table_Section = By.xpath("//div[@id='heading-Tables']/h4/a/label/input[3]");
	
	By submit = By.xpath("//button[@type='submit']"); //save button in style guide page
	By submit_document=By.linkText("Submit Document"); // submit document page 
	By upload_file = By.id("file"); // upload file
	By Submit_file = By.xpath("//button[@id='create_queue']"); // file upload submit
	
	public styleoptions(WebDriver d1){
		this.d1=d1;
	}
	
	public void general(){
		d1.findElement(generalstandards).click();
	}
	public boolean general_isselected(){
		return d1.findElement(generalstandards).isSelected();
	}	
	public void Paragraph(){
		d1.findElement(Paragraph);
	}	
	public void Abbreviations_Acronyms(){
		d1.findElement(Abbreviations_Acronyms);
	}
	public void Table_Section(){
		d1.findElement(Table_Section);
	}
	public void submit(){
		d1.findElement(submit).click();;
	}
	public void submit_document(){
		d1.findElement(submit_document).click();
	}
	public void upload_file(){
		Actions action = new Actions (d1);
		
		WebElement upload=d1.findElement(upload_file);
		action.click(upload).perform();		
	}
	
	public void Submit_file(){
		d1.findElement(Submit_file).click();
		
		
}}

