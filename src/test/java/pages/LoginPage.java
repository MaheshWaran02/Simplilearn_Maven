package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	// ========================Objects=========================//
	@FindBy(xpath = ("//a[text()=' Log in']"))
	WebElement loginlink;
	
	@FindBy(name = "user_login")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(className = "rememberMe")
	WebElement rememberme;
	
	@FindBy(name = "btn_login")
	WebElement login;

	// =======================Methods==========================//

	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;
		PageFactory.initElements(driver,this);	
	}

	public void LoginFunction(String usernameval, String passwordval) throws InterruptedException {

	loginlink.click();
	
	username.sendKeys(usernameval);
	
	password.sendKeys(passwordval);
	
	rememberme.click();
	
	login.click();

	}

}

