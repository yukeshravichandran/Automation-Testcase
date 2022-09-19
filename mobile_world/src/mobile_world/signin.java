package mobile_world;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class signin {
    @Test
    public void Signin() throws InterruptedException





  {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yukesh.r\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        landing_pag landingpage = new landing_pag(driver);
        String name =  "abc123@gmail.com";
        String password = "abc123";
        
        
        landingpage.goTo();
        landingpage.character3(name, password);
        Thread.sleep(2000);
        driver.close();
        
    }
    
    @Test
    public void signin2() throws InterruptedException
    {
        String name =  "abc@123";
        String password = "";
        WebDriver driver = new ChromeDriver();
        landing_pag landingpage = new landing_pag(driver);
        landingpage.goTo();
        landingpage.character20(name, password);
        Thread.sleep(2000);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ExpectedURL, ActualURL);
        driver.close();
    }
    @Test
    public void signin3() throws InterruptedException
    {
        String name =  "Ravichandran";
        String password = "";
        WebDriver driver = new ChromeDriver();
        landing_pag landingpage = new landing_pag(driver);
        landingpage.goTo();
        landingpage.character2(name, password);
        Thread.sleep(2000);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ExpectedURL, ActualURL);
        driver.close();
        
    }
    @Test
    public void signin4() throws InterruptedException
    {
        String name =  "abcdefghijklmnopqrstu";
        String password = "";
        WebDriver driver = new ChromeDriver();
        landing_pag landingpage = new landing_pag(driver);
        landingpage.goTo();
        landingpage.character21(name, password);
        Thread.sleep(2000);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ExpectedURL, ActualURL);
        driver.close();
    }
    @Test
    public void signin5() throws InterruptedException
    {
        String name =  "abc123@gmail.com";
        String password = "";
        WebDriver driver = new ChromeDriver();
        landing_pag landingpage = new landing_pag(driver);
        landingpage.goTo();
        landingpage.validemail(name, password);
        Thread.sleep(2000);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ExpectedURL, ActualURL);
        driver.close();
    }
    @Test
    public void signin6() throws InterruptedException
    {
        String name =  "qwerty123gmail.com";
        String password = "";
        WebDriver driver = new ChromeDriver();
        landing_pag landingpage = new landing_pag(driver);
        landingpage.goTo();
        landingpage.unregisteremail(name, password);
        Thread.sleep(2000);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ExpectedURL, ActualURL);
        driver.close();
    }
    @Test
    public void signin7() throws InterruptedException
    {
        String name =  "abc123";
        String password = "abc@123";
        WebDriver driver = new ChromeDriver();
        landing_pag landingpage = new landing_pag(driver);
        landingpage.goTo();
        landingpage.validdetails(name, password);
        Thread.sleep(2000);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ExpectedURL, ActualURL);
        driver.close();
    }
    @Test
    public void signin8() throws InterruptedException
    {
        String name =  "Yukesh";
        String password = "yuk";
        WebDriver driver = new ChromeDriver();
        landing_pag landingpage = new landing_pag(driver);
        landingpage.goTo();
        landingpage.pass2(name, password);
        Thread.sleep(2000);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ExpectedURL, ActualURL);
        driver.close();
    }
}