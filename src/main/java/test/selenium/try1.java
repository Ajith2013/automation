package test.selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Suite.SuiteClasses;

public class try1 {

	@BeforeClass
	public static void setup() {
		System.out.println("browser lanuch");
	}

	@Before
	public void login() {
		System.out.println("name,password");

	}

	@Test
	public void test1() {
		System.out.println("search and dress");
	}

	@Test
	public void test2()

	{
		System.out.println("addcard");
	}

	@After
	public void loginout() {
		System.out.println("logiout");
	}

	@AfterClass
	public static void quit() {
		System.out.println("quit.browser");

	}

}
