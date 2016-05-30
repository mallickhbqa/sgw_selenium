package SGW_NewPort.Version_1_0;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoTableselection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.newport-pleasure.com/Account/Login?ReturnUrl=%2f");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("UserName")).sendKeys("400196579");
		driver.findElement(By.id("Password")).sendKeys("first001");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		/*driver.findElement(By.id("GetStartedButton")).click();
		
		Actions action=new Actions(driver);
		WebElement Img_Profile=driver.findElement(By.id("header-profile-menu"));
		action.moveToElement(Img_Profile).perform();
		
		WebElement profile=driver.findElement(By.linkText("Profile"));
		action.click(profile).build().perform();
		Thread.sleep(1000);
		
		
		WebElement abt_u=driver.findElement(By.className("aboutNavBtn"));
		action.moveToElement(Img_Profile).perform();
		
		WebElement abt_u_profile=driver.findElement(By.className("profileBtn"));
		action.click(profile).build().perform();*/
		driver.get("https://www.newport-pleasure.com/Profile");
		Thread.sleep(500);
		System.out.println(driver.findElement(By.xpath("//*[@id='infoupdate']/table[2]/tbody/tr[1]/td[1]/label")).getText()+"      "+ driver.findElement(By.xpath("//*[@id='infoupdate']/table[2]/tbody/tr[1]/td[2]/span[1]")).getText());
		

	}

}
