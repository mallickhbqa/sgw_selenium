import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class aboutYou {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.newport-pleasure.com/Account/Login?ReturnUrl=%2f");
		Thread.sleep(1000);
		
		driver.findElement(By.id("UserName")).sendKeys("400196579");
		driver.findElement(By.id("Password")).sendKeys("first001");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("GetStartedButton")).click();
		Actions action=new Actions(driver);
		WebElement Img_Profile=driver.findElement(By.id("header-profile-menu"));
		action.moveToElement(Img_Profile).perform();
		
		WebElement profile=driver.findElement(By.linkText("Profile"));
		action.click(profile).build().perform();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	     WebElement ph_lnk_Aboutu=driver.findElement(By.xpath("//*[@id='aboutYou profileList']/a[2]"));
	     action.moveToElement(ph_lnk_Aboutu).perform();
	     
	     WebElement ph_lnk_Profile=driver.findElement(By.xpath("//*[@id='aboutYou profileList']/ul/li[1]/a"));
	     action.click(ph_lnk_Profile).build().perform();

	}

}
