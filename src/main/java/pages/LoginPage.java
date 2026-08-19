package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import jdk.internal.org.jline.utils.Log;

public class LoginPage {
	private WebDriver driver;
	
	private By usernametextbox = By.id("Email");
	private By passwordbox = By.id("Password");
	private By submit = By.xpath("//button[@class='button-1 login-button']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public void enterUsername(String username)
	{
		Log.info("username added");
		driver.findElement(usernametextbox).clear();
		driver.findElement(usernametextbox).sendKeys(username);
	}
	public void enterPasswordBox(String password)
	{
		Log.info("ADDING PASSWORD");
		driver.findElement(passwordbox).clear();
		driver.findElement(passwordbox).sendKeys(password);
	}
	public void clicksubmit()
	{
		Log.info("SUBMITED...");
		
		driver.findElement(submit).click();
	}
	
}
