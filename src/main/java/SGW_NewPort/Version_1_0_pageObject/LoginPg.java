package SGW_NewPort.Version_1_0_pageObject;

import java.awt.image.BufferedImage;
import SGW_NewPort.Version_1_0_pageUtility.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPg {

	@FindBy(id="UserName")
	WebElement lopg_txtuser;
	
	@FindBy(name="Password")
	WebElement lopg_txtpwd;
	
	@FindBy(name="btnLogin")
	WebElement lopg_btnenter;
	
	@FindBy(xpath="//div[@id='contentLogin']/div[@class='security_SGW']")
	WebElement SGW;
	
	String path="C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\Login_SGW.png";
	
	public void logon(String user,String pwd,WebDriver driver) throws IOException
	{
		SGW_TakeScreenShot.screenShotSGW(SGW, driver,path);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		lopg_txtuser.sendKeys(user);
		lopg_txtpwd.sendKeys(pwd);
		lopg_btnenter.click();
		
	}
	
	
	
}
