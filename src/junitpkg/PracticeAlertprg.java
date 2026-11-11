package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAlertprg {
	ChromeDriver driver;
	@BeforeEach
	public void bsetup() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	}
	@Test
	public void home() throws Exception{
		WebElement displayalert = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		displayalert.click();
		
		Alert alrt = driver.switchTo().alert();
		String alert_text = alrt.getText(); 
		System.out.println("Alert text : "+alert_text);
		Thread.sleep(2000);
		alrt.accept();
		
		WebElement displayalert1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		displayalert1.click();
		
		Thread.sleep(3000);
		WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		confirmbox.click();
		
		//Thread.sleep(3000);
		Alert alrt1 = driver.switchTo().alert();
		String alert_text1 = alrt1.getText(); 
		System.out.println("Alert text : "+alert_text1);
		
		Thread.sleep(2000);
		alrt1.dismiss();
		
		WebElement displayalert2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		displayalert2.click();
		
		WebElement promptbox = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		promptbox.click();
		
		Thread.sleep(2000);
		Alert alrt2 = driver.switchTo().alert();
		
		alrt2.sendKeys("Siva");
		Thread.sleep(2000);
		alrt2.accept();
	}

}
