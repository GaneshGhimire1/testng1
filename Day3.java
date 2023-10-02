package testng2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I will run before every method");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("I will run after every method");
	}
	@Test(priority=2)
	public void Testcase1() {
		System.out.println("Test case one");
		
	}
	@Test(priority =1)
	public void Testcase2() {
		System.out.println("test case two");
	}
	@Test(priority =0)
	public void Testcase3() {
		System.out.println("test case three");
	
}
	@Test(priority =-1)
	public void Testcase4() {
		System.out.println("test case four");
	}
	@Test(priority = -2)
	public void Testcase5() {
		System.out.println("Test case five");
	}
	
}
