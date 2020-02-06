package dataprovider;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class test {
	
	public static void main(String[]args)
    {
        File curDir = new File("C:\\Users\\Sangeetha.A\\Desktop\\mms\\24-jan");
        getAllFiles(curDir);
    }
    private static void getAllFiles(File curDir) {

        File[] filesList = curDir.listFiles();
        for(File f : filesList){
            if(f.isDirectory())
                System.out.println(f.getName());
            if(f.isFile()){
                System.out.println(f.getName());
            }
        }

    }
	
	

}
