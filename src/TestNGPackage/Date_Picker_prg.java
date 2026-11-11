package TestNGPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Date_Picker_prg {
	ChromeDriver driver;
	@BeforeClass
	public void bsetup() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html#google_vignette");
		driver.manage().window().maximize();
	}
	@Test
	public void datepicker(){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		while(true) {
			String month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
			System.out.println("Month = " +month);
			
			if(month.equalsIgnoreCase("May 2026")) {
				break;
			}else {
				WebElement nxtarrow = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]"));
				nxtarrow.click();
			}
		}
		//driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a")).click(); //mthd 1 - this line of code have manually select or copy the date's xpath
		
		List<WebElement> date = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		
		for (WebElement d : date) {
			String datetxt = d.getText();
			if (datetxt.equals("10")) {
				d.click();
				System.out.println("Date is selected");
				break;
			}
		}
		
	}

}
