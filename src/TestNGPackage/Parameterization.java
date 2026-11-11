package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	ChromeDriver driver;
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();		
	}
	
	@Parameters({"un" , "pw"})
	
	@Test
	public void log(String un , String pw)
	{
		WebElement uname = driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		uname.sendKeys(un);
		
		WebElement pword = driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		pword.sendKeys(pw);
		
	}

}
