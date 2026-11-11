package POMPagePKG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	WebDriver driver;
	
	//Locating webelement using page factory
	@FindBy(xpath = "//*[@id=\"ulogin\"]")WebElement username;
	@FindBy(xpath = "//*[@id=\"upass\"]")WebElement password;
	@FindBy(xpath = "//*[@id=\"sub_logbtn\"]")WebElement logingtn;
	
	//Constructor
	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void setvalues() {
		username.sendKeys("qwer@gmail.com");
		password.sendKeys("123456");
	}
	
	public void loginMthd() {
		logingtn.click();
	}
	
	public String titleMthd() {
		String title = driver.getTitle();
		return title;
	}

}
