package Edureka.Feb12Automation;

import java.util.Iterator;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		browser.get("https://the-internet.herokuapp.com/dropdown");
		
		Random r=new Random();
		int i= r.nextInt(1, 2);

		 browser.findElement(By.id("dropdown")).click();
		 
		Select dd=new Select(browser.findElement(By.id("dropdown")));
		System.out.println("All Options : ");
		///List ll= dd.getOptions();
		Iterator it=dd.getOptions().iterator();
		if(it.hasNext()) {
			System.out.println(it.next());
		}
		
		dd.selectByIndex(i);
		System.out.println("Selected Option  +" + dd.getFirstSelectedOption().getAccessibleName());
		browser.close();
		
	}

}
