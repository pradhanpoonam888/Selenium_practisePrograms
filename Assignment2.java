package co.edurekatraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver ch=new ChromeDriver();
		ch.get("https://www.rediff.com/");
		/*
		 * 1.Inspect the “Money” element with the below-mentioned locators.
		 * A)Inspect with class locator
		 * B)Inspect with XPath locator
		 * C)Inspect with CSS locator
		 */
		WebElement money_class= ch.findElement(By.className("moneyicon"));
		WebElement money_xpath= ch.findElement(By.xpath("//a[@class='moneyicon relative']"));
		WebElement money_css= ch.findElement(By.cssSelector("a.moneyicon.relative"));
		/*
		 * 2.Inspect all the textboxes with the below-mentioned locators.
		 * A)Inspect with name locator
		 * B)Inspect with id locator
		 */
		List<WebElement> txts_name= ch.findElements(By.name("srchquery_tbox"));
		List<WebElement> txts_id= ch.findElements(By.id("srchquery_tbox"));

		/*
		 * 3.Inspect the below-mentioned elements.
		 * A)Rediffmail.com, enterprise email, videos, business email, shopping, sign in,and create an account
		 * B)Inspect all the links present on Rediff.com
		 */
		WebElement Rediffmail = ch.findElement(By.className("mailicon"));
		WebElement enterprise_email = ch.findElement(By.className("eproicon"));
		WebElement shopping = ch.findElement(By.linkText("Shopping"));
		WebElement business_email = ch.findElement(By.partialLinkText("Business Email"));
		WebElement sign_in = ch.findElement(By.className("signin"));
		WebElement create_acct = ch.findElement(By.xpath("//a[contains(text(),'Create Account')]"));
		List<WebElement> links = ch.findElements(By.xpath("//a"));
		System.out.println("Completed");
		ch.quit();		
	}
	

}
