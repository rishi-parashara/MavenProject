package qsp;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public static void mavenExperiment() {
		Reporter.log("RS............",true);
		WebDriver driver = new ChromeDriver();
		String v = "";
		try{
			Workbook w = WorkbookFactory.create(new FileInputStream("./input/data.xlsx"));
			v = w.getSheet("TestLogin").getRow(1).getCell(0).toString();
		}
		catch(Exception e){
			
		}
		Reporter.log(v, true);
		
		driver.get(v);
		Reporter.log("Opened the browser. Entered URL as google.com",true);
		driver.close();
		Reporter.log("Closeed the browser. Bye...",true);
	}
}
