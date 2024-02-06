package Wait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver chm=new ChromeDriver();
		chm.get("https://www.google.co.in");
		chm.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		chm.manage().window().maximize();
		chm.findElement(By.cssSelector("textarea.gLFyf#APjFqb"));
		//chm.findElements(By.cssSelector(""));
		List<WebElement> lists= chm.findElements(By.cssSelector("a[href]"));
		Iterator<WebElement> itr= lists.iterator();
		while(itr.hasNext()) {
			System.out.println( itr.next().getText());
		}
		System.out.println("====================================");
		for(WebElement e : lists) {
			System.out.println(e.getText()+" = "+e.getAttribute("href"));
		}
		
		chm.close();
	}

}
