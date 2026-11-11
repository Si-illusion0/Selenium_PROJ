package selenium_pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class First_prg {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/"); 
		
//		for opening edge 
//		EdgeDriver driver = new EdgeDriver();
//		for opening firefox 
//		FireFoxDriver driver = new FireFoxDriver();
		
		String actualtitle = driver.getTitle();//to retrieve the title of the web application
		System.out.println("The title of web application is "+actualtitle);
		
		String exepectedtitle = "Google";
		if(actualtitle.equals(exepectedtitle)) {
			System.out.println("The title is match");
		}else {
			System.out.println("The title is not match");
		}

	}

}
