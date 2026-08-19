package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
@Test
	public void testlongin()
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername("admin@yourstore.com");
		loginpage.enterPasswordBox("admin");
		loginpage.clicksubmit();
		System.out.println("Title Page is="+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
	}
}
