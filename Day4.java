package testng2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {

	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void afterTest() {
		System.out.println("after suite");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("after test");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	@AfterClass
	public void AfterClass() { 
		System.out.println("After class");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before method");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After method");
	}
	@Test
	public void testOne() {
		System.out.println("testcase one pass");
	}
	@Test
	public void TestTwo() {
		System.out.println("testcase two pass");
	}
	
}
