package Edureka.Feb12Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XPATHPaths {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		WebDriver chm=new ChromeDriver();
		chm.get("https://the-internet.herokuapp.com/");
		// Relative XPATH
		WebDriverWait w=new WebDriverWait(chm, Duration.ofSeconds(30));
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/ul/li[21]/a")));
		WebElement form_Link = chm.findElement(By.xpath("//*[@id=\"content\"]/ul/li[21]/a"));
		System.out.println("Link Label : "+ form_Link.getText());
		form_Link.click();
		//Absolute XPATH
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div/form/button/i")));
		WebElement btn= chm.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i"));
		
		System.out.println("Button Label : " + btn.getText());
		chm.close();
		
	}

}
