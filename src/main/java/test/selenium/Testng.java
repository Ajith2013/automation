package test.selenium;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Testng {
@BeforeSuite
public void beforesuite()
{
	System.out.println("beforesuite");
}
@BeforeTest
public void  beforetest(){
	System.out.println("beforetest");
	}

@BeforeClass
public void beforeclass()
{
	System.out.println("beforeclass");
	}

@BeforeMethod
public void beforemethod(){
	System.out.println("beforemethod");
	}

@org.testng.annotations.Test
public void test1(){
	System.out.println("test1");
	}

@org.testng.annotations.Test
public void test2(){
	System.out.println("test2");
	}

@AfterMethod
public void aftermethod(){
	System.out.println("aftermethod");
	}
@org.testng.annotations.AfterClass
public void afterclass(){
	System.out.println("afterclass");

}
@AfterTest

public void aftertest(){
	System.out.println("aftertest");
	}

@AfterSuite

	public void aftersuite()
	{
		System.out.println("aftersuite");
	}
	
	
}
