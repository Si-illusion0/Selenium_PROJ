package TestNGPackage;

import org.testng.annotations.Test;

public class DepentsOnMthd_prg {
	
	@Test
	public void reg() {
		System.out.println("Registration Method");
	}
	@Test(dependsOnMethods = "reg") //login mthd is depends on the reg() mthd so it will only after execute the prg
	public void login() {
		System.out.println("Login Method");
	}
	@Test(dependsOnMethods = {"reg" , "login"})
	public void home() {
		System.out.println("Home Method");
	}

}
