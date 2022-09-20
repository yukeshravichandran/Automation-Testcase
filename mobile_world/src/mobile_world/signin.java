package mobile_world;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class signin {
    @Test
    public void sign_in() throws InterruptedException





  {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yukesh.r\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Landing_pag landingpage = new Landing_pag(driver);
        String name =  "abc123@gmail.com";
        String password = "abc123";
        
        
        landingpage.goTo();
        landingpage.character3(name, password);
       
        Thread.sleep(2000);
        driver.close();
       
        
        
    }
    
    @Test
    public void sign_in2() throws InterruptedException
    {
        String name =  "abc@123";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landing_pag landingpage = new Landing_pag(driver);
        landingpage.goTo();
        landingpage.character20(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="Error message should be shown";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    
    @Test
    public void sign_in3() throws InterruptedException
    {
        String name =  "yr";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landing_pag landingpage = new Landing_pag(driver);
        landingpage.goTo();
        landingpage.character2(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
        
    }
    @Test
    public void sign_in4() throws InterruptedException
    {
        String name =  "abcdefghijklmnopqrstu";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landing_pag landingpage = new Landing_pag(driver);
        landingpage.goTo();
        landingpage.character21(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void sign_in5() throws InterruptedException
    {
        String name =  "";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landing_pag landingpage = new Landing_pag(driver);
        landingpage.goTo();
        landingpage.validemail(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void sign_in6() throws InterruptedException
    {
        String name =  "123@gmail.com";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landing_pag landingpage = new Landing_pag(driver);
        landingpage.goTo();
        landingpage.unregisteremail(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void sign_in7() throws InterruptedException
    {
        String name =  "quali";
        String password = "qwert@123";
        WebDriver driver = new ChromeDriver();
        Landing_pag landingpage = new Landing_pag(driver);
        landingpage.goTo();
        landingpage.validdetails(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    
    @Test
    public void sign_in8() throws InterruptedException
    {
        String name =  "yuke";
        String password = "yuki";
        WebDriver driver = new ChromeDriver();
        Landing_pag landingpage = new Landing_pag(driver);
        landingpage.goTo();
        landingpage.pass2(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
}