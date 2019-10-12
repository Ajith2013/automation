package test.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test1 {
public static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\workspace\\selenium\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	
	WebElement t1 = driver.findElement(By.xpath("(//span[@class='a-color-base'])[1]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollintoview();",t1);
	
	
	/*WebElement tr1 = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	String a1 = tr1.getAttribute("class");
	System.out.println(a1);*/
	/*WebElement t1 = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
	t1.click();
	boolean s1 = t1.isSelected();
	System.out.println(s1);*/
	/*WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
	fname.isEnabled()*/
	
	/*WebElement month = driver.findElement(By.id("month"));
	Select s=new Select(month);
	s.selectByIndex(3);
	String t1 = month.getText();
	System.out.println(t1);*/
	/*WebElement month1= driver.findElement(By.id("month"));
	month1.get*/
	
	/*for (WebElement mon : month) {
		String n = mon.getText();
		System.out.println(n);
	}*/
	
	
}
}
