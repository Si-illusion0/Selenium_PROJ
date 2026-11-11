package TestNGPackage;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowPrcPrg {
	
	ChromeDriver driver;

	    @BeforeTest
	    public void setup()
	    {
	        driver=new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Windows.html ");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	    
	    @Test
	    public void testwindow() throws Exception
	    {
	        String parentwindow=driver.getWindowHandle();
	        System.out.println("Title of tabbed window: "+driver.getTitle());

	        WebElement tabclick=driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
	        tabclick.click();
	        
	        ArrayList<String> windetails = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(windetails.get(1));
			
	        System.out.println("Title of Selenium window: "+driver.getTitle());

	        driver.switchTo().window(parentwindow);
	        driver.navigate().refresh();

	        WebElement seprtewindow=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
	        seprtewindow.click();
	        WebElement seprteclick=driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button"));
	        seprteclick.click();
	        
	        
	        System.out.println("Title of selenium window: "+driver.getTitle());
	        //Thread.sleep(2000);

	        driver.switchTo().window(parentwindow);

	        WebElement multiplewindow=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
	        multiplewindow.click();
	        WebElement multipleclick=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button"));
	        multipleclick.click();
	        
	        ArrayList<String> windetails1 = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(windetails1.get(2));
	        System.out.println("Title of multiple window: "+driver.getTitle());
	    }

}
