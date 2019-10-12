 package test.selenium;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;
import javax.swing.ListCellRenderer;

import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.beust.jcommander.internal.Lists;

public class Webtable {

	public static WebDriver driver;

	public static void main(String[] args) throws ExecuteException, Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajith\\workspace\\selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		WebElement gmail = driver.findElement(By.xpath("(//a[@class='gb_e'])[1]"));

		Actions ac = new Actions(driver);
		ac.contextClick(gmail).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		       r.keyPress(KeyEvent.VK_ENTER);
		       r.keyRelease(KeyEvent.VK_ENTER);
	//	r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		       WebElement image=driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[2]/a"));
		       Actions ac1=new Actions(driver);
		       ac1.contextClick(image).build().perform();
		       r.keyPress(KeyEvent.VK_DOWN);
		       r.keyRelease(KeyEvent.VK_DOWN);
		       r.keyPress(KeyEvent.VK_ENTER);
		       r.keyRelease(KeyEvent.VK_ENTER);
	                   String s1 = driver.getWindowHandle();		       
	                   		System.out.println(s1);
	                   		Set<String> s2 = driver.getWindowHandles();
	                   		for (String allid : s2) {
	                   			String title = driver.switchTo().window(allid).getTitle();
	                   			System.out.println(title);
	                   			String id= "Google Images";
	                   			if(driver.switchTo().window(id).equals(title)){
	                   				break;
								
	                   			
							}
	                   		
		//WebElement images = driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[2]/a"));

		//ac.contextClick(images).build().perform();

		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);

		//r.keyPress(KeyEvent.VK_ENTER);
	/*	//r.keyRelease(KeyEvent.VK_ENTER);

		String firstId = driver.getWindowHandle();
		System.out.println(firstId);
		Thread.sleep(3000);
		
		Set<String> allId = driver.getWindowHandles();

		for (String id : allId) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println("Title:" + title);
			
			String actualTitle = "Google Images";
			if (driver.switchTo().window(id).getTitle().equals(actualTitle)) {
				break;	
				}
		}

		String actualTitle = " Google Images";
		for (String id : allId) {
			
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(gmail));

		Wait w = new FluentWait(driver)
				.withTimeout(60, TimeUnit.SECONDS)
				.pollingEvery(10, TimeUnit.SECONDS)
				.ignoring(Exception.class);

		
		
		
		
		
		
		
		 * WebElement pdata = driver.findElement(By.
		 * xpath("//table[@summary='Sample Table']/tbody/tr[3]/td[2]")); String
		 * text = pdata.getText(); System.out.println(text);
		 * java.util.List<WebElement> cdata = driver .findElements(By.
		 * xpath("//table[@summary='Sample Table']/tbody/tr/td[4]"));
		 * 
		 * for (WebElement webdata : cdata) { String txt = webdata.getText();
		 * System.out.println(txt); }
		 * 
		 * java.util.List<WebElement> alldata = driver .findElements(By.
		 * xpath("//table[@summary='Sample Table']/tbody/tr/td[4]")); for
		 * (WebElement data1 : alldata) {
		 * 
		 * String text2 = data1.getText(); System.out.println(text2); }
		  }
}
*/}
}
}