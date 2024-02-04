package Edureka.Feb12Automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathlistLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+ "\\Driver\\msedgedriver.exe");
		
		WebDriver edge = new EdgeDriver();
		
		edge.get("https://the-internet.herokuapp.com/");
		List<WebElement> ll=edge.findElements(By.xpath("//a[contains(text(),'Frames')]"));
		System.out.println(ll.size());
		
		Iterator itr =ll.iterator();
		
		
		if(itr.hasNext()) {
			System.out.println( itr.next().toString());
			System.out.println("===================" );
		}
		for(WebElement  e : ll) {
			System.out.println(e.getText());
		}
		
		edge.close();
		}

}
