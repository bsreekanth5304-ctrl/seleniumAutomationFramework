package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import jdk.internal.org.jline.utils.Log;
import pages.LoginPage;

public class LoginTest extends BaseTest {
@Test
	public void testlongin()
	{
	Log log=new LOG();
		Log.info("starting test");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername("admin@yourstore.com");
		loginpage.enterPasswordBox("admin");
		loginpage.clicksubmit();
		System.out.println("Title Page is="+driver.getTitle());
		Log.info("VERIFYING PAGE TITLE...");
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
	}
}
