package TestNGPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileuploadRobot {
	ChromeDriver driver;
	@BeforeClass
	public void bsetup() {
	driver = new ChromeDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.manage().window().maximize();
	}
	@Test
	public void fileuploadmthd() throws Exception {
		WebElement btnclk = driver.findElement(By.xpath("//*[@id=\"pickfiles\"]"));
		btnclk.click();
		fileupload("C:\\Users\\learn\\Downloads\\Untitled document.pdf");

	}
	private void fileupload(String p) throws Exception {
		
		StringSelection strobj = new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strobj, null);
		
		Robot r = new Robot();
		r.delay(3000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.delay(2000);
		System.out.println("file uploaded");
		
	}
	@AfterClass
	public void endprg() {
		driver.quit();
	}

}
