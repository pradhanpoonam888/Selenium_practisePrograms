package Edureka.Feb12Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPATHAxes {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+ "\\Driver\\geckodriver.exe");
		WebDriver ff=new FirefoxDriver();
		
		ff.get("https://the-internet.herokuapp.com/");
		WebElement e= ff.findElement(By.xpath("//a[contains(text(),'A/B Testing')]/following::li[1]"));
		String s = e.getText();
		System.out.println("Link text is : \""+ s + "\"");
		ff.close();
		
	}

}
