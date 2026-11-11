package junitpkg;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Count {
	ChromeDriver driver;
	@BeforeEach
	public void bsetup() {
		driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void linkcountmthd() {
		List<WebElement> link = driver.findElements(By.tagName("a"));//tag name-a
		System.out.println("Link count = "+link.size());
		
		for(WebElement li : link ) {
			System.out.println("Link -------"+li.getAttribute("href"));
			System.out.println(li.getText()+"--------"+li.getAttribute("href"));//li.getText() print the text the link
		}
	}

}
