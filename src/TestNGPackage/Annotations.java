package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeTest
	public void Beforetestmthd() {
		System.out.println("Before Test Method");
	}
	
	
	@BeforeClass
	public void Beforeclassmthd() {
		System.out.println("Before Class Method");
	}
	
	@BeforeMethod
	public void mthd() {
		System.out.println("Before Method");
	}
	
	@Test
	public void testmthd_A() {
		System.out.println("Test Method_A");
	}
	
	@Test
	public void testmthd_X() {
		System.out.println("Test Method_X");
	}
	
	@Test
	public void testmthd_C() {
		System.out.println("Test Method_C");
	}
	
	@AfterMethod
	public void af_method() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void ac_method() {
		System.out.println("After Class Method");
	}
	
	@AfterTest
	public void at_method() {
		System.out.println("After Test Method");
	}

}
