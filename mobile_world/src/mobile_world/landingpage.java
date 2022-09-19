package mobile_world;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class landingpage {
	 WebDriver driver;
	    public  landingpage(WebDriver driver)
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        
	    }
	    
	    //Page factory
	    
	    //sign_up
	    
	    @FindBy(xpath="//button[@type='submit']")
	    WebElement signin;
	    @FindBy(xpath="//a[normalize-space()='Sign up']")
	    WebElement signup;
	    
	    @FindBy(xpath="//input[@id='myName']")
	    WebElement fname;
	    
	    @FindBy(xpath="//input[@placeholder='Last Name']")
	    WebElement lname;
	    
	    @FindBy(xpath="//input[@placeholder='Enter Email']")
	    WebElement email;
	    
	    @FindBy(xpath="//input[@placeholder='Password']")
	    WebElement pass;
	    
	    @FindBy(xpath="//input[@type='date']")
	    WebElement cal;
	    @FindBy(xpath="//div[@class='col-md-2']//input[@name='gender']")
	    WebElement radio;
	    
	    @FindBy(xpath="//input[@placeholder='91XXXXXXXXXX']")
	    WebElement mobile;
	    
	    @FindBy(xpath="//textarea[@placeholder='Short Bio']")
	    WebElement bio;
	    
	    @FindBy(xpath="//button[@type='submit']")
	    WebElement register;
	    
	    @FindBy(xpath="//button[@type='Submit']")
	    WebElement rlogin;
	    //sign_in
	    
	    @FindBy(xpath="//input[@id='username']")
	    WebElement name;
	    
	    @FindBy(xpath="//input[@id='password']")
	    WebElement pwd;
	    
	    @FindBy(xpath="//a[@type='submit']")
	    WebElement login;
	    
	    //mobile_page
	    
	    @FindBy(xpath="//a[normalize-space()='Home']")
	    WebElement m_home;
	    
	    @FindBy(xpath="//a[normalize-space()='All Mobiles']")
	    WebElement allmobile;
	    
	    @FindBy(xpath="//input[@id='myInput']")
	    WebElement search;
	    
	    @FindBy(xpath="//a[normalize-space()='All Mobiles']")
	    WebElement order;
	    
	    @FindBy(xpath="//input[@id='myInput']")
	    WebElement scroll;
	    
	    @FindBy(xpath="//a[@id='navbarDropdown']")
	    WebElement support;



	   @FindBy(xpath="//a[@class='dropdown-item waves-effect waves-light'][normalize-space()='Order']")
	    WebElement order_page;
	    
	    
	    @FindBy(xpath="//a[@class='dropdown-item waves-effect waves-light'][normalize-space()='Contact Us']")
	    WebElement contact;
	    
	    



	   @FindBy(xpath="//a[normalize-space()='Home']")
	    WebElement f_home;
	    
	    
	    
	    
	    
	    public void goTo()
	    {
	        driver.get("https://mobileworld.banyanpro.com/");
	    }
	    
	    
	    public void signupApplication(String finame,String liname,String mail,String passw,String cala,String mob,String info)
	    {
	        signin.click();
	        signup.click();
	        fname.sendKeys(finame);
	        lname.sendKeys(liname);
	        email.sendKeys(mail);
	        pass.sendKeys(passw);
	        cal.sendKeys(cala);
	        radio.click();
	        mobile.sendKeys(mob);
	        bio.sendKeys(info);
	        register.click();
	        driver.switchTo().alert().accept();
	        rlogin.click();
	        
	        
	        
	    }
	    
	    public void loginApplication(String username,String password)
	    {
	        signin.click();
	        name.sendKeys(username);
	        pwd.sendKeys(password);
	        login.click();
	        
	    }
	    
	    public void mobilepage(String searchbox)
	    {
	        allmobile.click();
	        m_home.click();
	        allmobile.click();
	        support.click();
	        order_page.click();
	        f_home.click();
	        allmobile.click();
	        contact.click();
	        f_home.click();
	        allmobile.click();
	        
	        

}
