package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priorityprg {
	@BeforeClass
	public void bfclass_mthd() {
		System.out.println("Before Class Method");
	}
	
	@Test(priority = 1 , invocationCount = 3)
	public void mthd_X() {
		System.out.println("Mthd_X");
	}
	
	@Test(priority = 2 , enabled = false)
	public void mthd_A() {
		System.out.println("Mthd_A");
	}
	
	@Test(priority = 3)
	public void mthd_C() {
		System.out.println("Mthd_C");
	}
	
	@AfterClass
	public void AFClass_mthd() {
		System.out.println("After Class Mthd");
	}

}
