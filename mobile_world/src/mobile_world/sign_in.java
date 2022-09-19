package mobile_world;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class sign_in {

	public void register() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/yukesh.r/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@type='submit']")).click();

	}

}
