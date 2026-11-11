package POMTestPKG;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMBasePKg.Base_Class;
import POMPagePKG.Login_Page;

public class Login_Test extends Base_Class{ //to inherit the driver info from Base_Class
	Login_Page obj;
	
	@BeforeMethod
	public void ObjMthd() {
		obj = new Login_Page(driver);
	}
	@Test
	public void loginTest_Mthd() {
		
		obj.setvalues();
		obj.loginMthd();
		System.out.println(obj.titleMthd());
		
	}
	
	@Test
	public void titleverification() {
		System.out.println(obj.titleMthd());
		
	}
	

}
