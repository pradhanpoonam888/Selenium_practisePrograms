package Edureka.Feb12Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Automation {

	public static void main(String[] args) throws InterruptedException {

	//	System.setProperty("webdriver.chrome.driver",
	//			"D:\\EdurekaClasses\\selenium\\eclipse-workspace-edureka\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in");
		WebElement el= driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		//*[@id="APjFqb"]
		el.sendKeys("Edureka");
		//el.wait(1000);
		el.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		//el.wait(1000);
		System.out.println("Complete");
		driver.close();
		driver.quit();
	}

}
