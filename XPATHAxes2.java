package Edureka.Feb12Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XPATHAxes2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver ed=new ChromeDriver();
		ed.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		ed.findElement(By.xpath("//a[contains(text(),\"Coal India\")]")).click();
		WebDriverWait w=new WebDriverWait(ed, Duration.ofSeconds(60));
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='f16 price_n']/child::span[1]")));
		WebElement price= ed.findElement(By.xpath("//div[@class='f16 price_n']/child::span[1]"));
		String pri= price.getText();
		System.out.println("Current Price of the stock Coal India is : "+ pri);
		//ed.close();
	}

}
