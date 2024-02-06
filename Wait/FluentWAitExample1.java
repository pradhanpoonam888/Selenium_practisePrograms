package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWAitExample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		WebDriver ff=new FirefoxDriver();
		
		ff.get("https://www.facebook.com");
		Wait<WebDriver> wa=new FluentWait<WebDriver>(ff)
				.pollingEvery(Duration.ofSeconds(5))
				.withTimeout(Duration.ofSeconds(40))
				.withMessage("FluentWait was invoked!!!")
				.ignoring(NoSuchElementException.class);
		ff.manage().window().maximize();
		ff.findElement(By.xpath("//a[@role='button' and text()='Create new account']")).click();
		WebElement e=wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='radio' and @value='2']/preceding::label[1]")));
		System.out.println(e.getText());
		System.out.println("Completed");
		ff.quit();
	}

}
