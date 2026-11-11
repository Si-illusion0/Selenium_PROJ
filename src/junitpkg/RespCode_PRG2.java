package junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RespCode_PRG2 {
	ChromeDriver driver;
	@BeforeEach
	public void bsetup() {
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void linkcount() throws Exception {
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Number of links =" +link.size());
		
		for(WebElement li : link) {
			String url = li.getAttribute("href");
			verify(url);
		}

		
	}

	private void verify(String url) throws Exception {
		
		try {
			
		
		URI obj = new URI(url);
		URL value = obj.toURL();
		HttpURLConnection con = (HttpURLConnection)value.openConnection();
		 int res = con.getResponseCode();
		
		if(res==200) {
			System.out.println("Valid Link"+url);
		}else if(res==404) {
			System.out.println("Broken Link"+url);
		}else {
			System.out.println("Other Response code"+url);
		}
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}


}
