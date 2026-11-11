package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion_prg {
	ChromeDriver driver;
	@BeforeClass
	public void bsetup() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void logo_verification() {
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		boolean res = logo.isDisplayed();
		System.out.println(res);
		
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(res); //verify the value of res is true
		
		soft.assertAll();
		System.out.println("Logo Is Displayed");
		
	}
	@Test
	public void title_verification() {
		String actualtitle = driver.getTitle();
		//System.out.println(actualtitle);
		
		String expectedtitle = "Rediffmail Free Unlimited";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(expectedtitle, actualtitle);
		soft.assertAll();
		System.out.println("Success");
		
		
	}

}
