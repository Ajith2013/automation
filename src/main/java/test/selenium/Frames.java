package test.selenium;

import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static class Webtable {

	
	public static WebDriver driver;

	public static void main(String[] args)throws ExecuteException, Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajith\\workspace\\selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		WebElement f1 = driver.findElement(By.xpath("//*[@id='singleframe']"));
		driver.switchTo().frame(f1);
		Thread.sleep(2000);
	//	WebElement f2 = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		//f2.sendKeys("hgfdfdhgdfhd");
		WebElement nxtpage = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
           nxtpage.click();
	}
	}
}
	
