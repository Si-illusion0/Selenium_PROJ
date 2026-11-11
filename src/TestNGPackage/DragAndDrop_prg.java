package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDrop_prg {
	ChromeDriver driver;
	@BeforeClass
	public void bsetup() {
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
	}
	@Test
	public void drganddrp_mthd() throws Exception {
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p/b"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(2000);
		WebElement hoverbtn = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
		a.moveToElement(hoverbtn).perform();
		Thread.sleep(2000);
		
		WebElement linkclk = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
		linkclk.click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		WebElement clkhold = driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
		a.clickAndHold(clkhold).perform();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		WebElement doublebtn = driver.findElement(By.xpath("//*[@id=\"double-click\"]"));
		a.doubleClick(doublebtn).perform();
		
		

	}

}
