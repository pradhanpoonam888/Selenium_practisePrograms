package Edureka.Feb12Automation;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.Color;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebookLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir")+ "\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("test");
		email.clear();
		email.sendKeys("TESting@mailinator.com");
		driver.findElement(By.name("pass")).sendKeys("Password");
		driver.findElement(By.name("login")).click();
		
		// Verification of error message 
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(1000));
		//WebElement er=driver.findElement(By.className("_9ay7"));
		w.until(ExpectedConditions.presenceOfElementLocated(By.className("_9ay7")));
	//	w.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.className("_9ay7")), "The email address you entered isn't connected to an account. "));
		System.out.println("Error Text MEssage :" + driver.findElement(By.className("_9ay7")).getText());
		
		//facebook logo verification
		driver.navigate().back();
		
		WebElement fb_icon= driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		if(fb_icon.isDisplayed()) {
			System.out.println("Facebook Icon is getting displayed on the Page.");
		}
		
		//gender default selection verification
		driver.findElement(By.xpath("//a[@role='button' and text()='Create new account']")).click();
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='radio' and @value='2']")));
		WebElement male_rd=driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		if(male_rd.isSelected()) {
			System.out.println("the Male radio button is selected by default !!");
		}else {
			System.out.println("No it is not selected by default.We will select it now.");
			male_rd.click();
			System.out.println("Clicking .............");
			if(male_rd.isSelected()){
				System.out.println("It is selected now");
			}else {
				System.out.println("Still not selected !!");
			}
		}
		
		// Sign up Button color verification - to get CSS value
		WebElement sign=driver.findElement(By.name("websubmit"));
		String rgb= sign.getCssValue("background-color");
		//String color = Color.RGBtoHSB(0, 0, 0, null)
		System.out.println(rgb);
		
		// to get attribute value
		String type= sign.getAttribute("type");
		System.out.println(type);
		
		
		driver.close();
		//driver.quit();
	}

}
