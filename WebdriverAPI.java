package Edureka.Feb12Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebdriverAPI {

	public static void main(String[] args) {
			String dir = System.getProperty("user.dir");
			System.out.println(dir);
			//System.setProperty("webdriver.chrome.driver",
			//		"D:\\EdurekaClasses\\selenium\\eclipse-workspace-edureka\\Feb12Automation\\Driver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", dir + "\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			String title=driver.getTitle();
			
			System.out.println("Title : "+title +" "+ driver.getCurrentUrl());
			driver.navigate().to("https://www.amazon.in");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleContains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
			String title2=driver.getTitle();
			System.out.println("Title : "+title2+" "+ driver.getCurrentUrl());
			driver.navigate().back();
			String title3=driver.getTitle();
			System.out.println("Title : "+title3+" "+ driver.getCurrentUrl());
			driver.navigate().forward();
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait2.until(ExpectedConditions.titleContains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
			
			String title4=driver.getTitle();
			System.out.println("Title : "+title4+" "+ driver.getCurrentUrl());
			
			// To delete all Cookies
			driver.manage().deleteAllCookies();
			
			// To refresh the PAge
			driver.navigate().refresh();
			System.out.println("Browser has refreshed.");
			
			driver.close(); // to close one tab
			driver.quit(); // to close mulitple tabs
	}

}
