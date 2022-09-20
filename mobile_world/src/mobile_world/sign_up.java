package mobile_world;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sign_up {
@Test
	public void register()  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/yukesh.r/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mobileworld.banyanpro.com/");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.cssSelector("a[href='signup.html']")).click();
		driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("Yukesh");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(".R");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("05/19/2000");
		driver.findElement(By.xpath("//div[@class='col-md-2']//input[@name='gender']")).sendKeys("Male");
		driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("8072331146");
		driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("ahvbdkhfbih");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
