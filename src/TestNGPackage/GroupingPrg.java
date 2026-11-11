package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupingPrg {
	@BeforeClass(alwaysRun = true)
	public void BFClass() {
		System.out.println("Before Class Method");
	}
	
	@Test(priority = 1 , groups = "Smoke")
	public void TSmthd() {
		System.out.println("TSmthd");
	}
	
	@Test(priority = 2 , groups = "Sanity")
	public void TSmthd_two() {
		System.out.println("TSmthd Two");
	}
	
	@Test(priority = 3 , groups = {"Regression" , "Smoke"})
	public void TSmthd_three() {
		System.out.println("TSmthd Three");
	}
	
	@AfterClass(alwaysRun = true)
	public void AFClass_mthd() {
		System.out.println("AFClass Method");
	}
	
	

}
