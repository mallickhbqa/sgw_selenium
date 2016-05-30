package SGW_NewPort.Version_1_0_pageObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import SGW_NewPort.Version_1_0_pageUtility.SGW_TakeScreenShot;

public class ProfilePg {
	@FindBy(id="GetStartedButton")
    WebElement pf_pg_btnGetStarted;
	
	@FindBy(id="header-profile-menu")
	WebElement pf_pg_we_profile;
	
	@FindBy(linkText="Profile")
	WebElement pf_pg_lnk_profile;
	
	@FindBy(xpath="//div[@id='header']/div[@class='header-sgw quarter2']")
	WebElement SGW;
	
	String path="C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\profile_SGW.png";
	
	public void mousehover(WebDriver driver) throws IOException
	{
		pf_pg_btnGetStarted.click();
		SGW_TakeScreenShot.screenShotSGW(SGW, driver,path);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//pf_pg_btnGetStarted.click();
	    Actions action=new Actions(driver);
	    action.moveToElement(pf_pg_we_profile).perform();
	    action.click(pf_pg_lnk_profile).build().perform();
		
	}

}
