package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	ChromeDriver driver;
	@BeforeEach
	public void bsetup() {
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/learn/OneDrive/Desktop/Alert.html");
		driver.manage().window().maximize();
	}
	@Test
	public void home() throws Exception{
		WebElement displayalert = driver.findElement(By.xpath("/html/body/input[1]"));
		displayalert.click();
		
		//handle alert box
		Alert alrt = driver.switchTo().alert();//switch to alert box
		String alert_text = alrt.getText(); //to retrieve the text from the alert box
		System.out.println("Alert text : "+alert_text);
		Thread.sleep(2000);
		
		 alrt.accept();//to click the ok buttom of the alert box
		
		
		
		WebElement fname = driver.findElement(By.xpath("/html/body/input[2]"));
		fname.sendKeys("abcd");
		
		WebElement lname = driver.findElement(By.xpath("/html/body/input[3]"));
		lname.sendKeys("1234");
		
		WebElement submit = driver.findElement(By.xpath("/html/body/input[4]"));
		submit.click();
	}

}
