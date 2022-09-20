package mobile_world;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class home_page {
@Test
	public void register() {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:/Users/yukesh.r/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mobileworld.banyanpro.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		driver.findElement(By.xpath("//nav[@id='navbar']//li[1]//a[1]")).click();
		driver.findElement(By.xpath("//body/nav[@id='navbar']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mx-auto']/li[2]/a[1]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Samsung']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//footer[@class='footer']")).click();
		
		
		
	}

}
