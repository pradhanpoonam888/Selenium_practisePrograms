package Wait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver ch=new ChromeDriver();
		ch.get("https://www.google.co.in");
		ch.findElement(By.xpath("//textarea[@name='q']")).sendKeys("cheese"+Keys.ENTER);
		WebElement ee=new WebDriverWait(ch,Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		System.out.println(ee.getText());
		ch.close();
	}

}
