package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
		driver.findElement(usernametextbox).clear();
		driver.findElement(usernametextbox).sendKeys(username);
	}
	public void enterPasswordBox(String password)
	{
		driver.findElement(passwordbox).clear();
		driver.findElement(passwordbox).sendKeys(password);
	}
	public void clicksubmit()
	{
		
		driver.findElement(submit).click();
	}
	
}
