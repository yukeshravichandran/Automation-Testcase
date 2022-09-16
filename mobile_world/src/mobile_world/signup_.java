package mobile_world;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class signup_ {
	 WebDriver driver;


	   @Parameters({"Firstname < 3","valid last name","valid email","valid password","valid DOB","valid Gender","valid phone number","Short Bio"})
	    @Test(description = "User is able to login with with more than 3 characters and less than 20 characters",priority=2)
	    public void InValidLogin() throws InterruptedException
	    {
		   driver = Browser.startapplication(driver, "Chrome",  " https://mobileworld.banyanpro.com/");
	        signup_ lgnpage = PageFactory.initElements(driver, signup_.class);
	        lgnpage.signup_app("re", "pri","priyanka@gmail.com","re13","2/12/2000","9497752084","hi hello");
	        String expectedURL = "https://mobileworld.banyanpro.com/signup.html";
	        String actualURL = driver.getCurrentUrl();
	        Assert.assertEquals(actualURL, expectedURL);



	       
//	        BrowserFactory.QuitBrowser(driver);
	        
	    }
	    }


