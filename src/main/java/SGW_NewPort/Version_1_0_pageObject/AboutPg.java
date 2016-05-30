package SGW_NewPort.Version_1_0_pageObject;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import SGW_NewPort.Version_1_0_pageUtility.*;

public class AboutPg {

	@FindBy(xpath="//*[@id='aboutYou profileList']/a[2]")
			WebElement ph_lnk_Aboutu;
	
	@FindBy(xpath="//*[@id='aboutYou profileList']/ul/li[1]/a")
	WebElement ph_lnk_Profile;
	
	@FindBy(xpath="//*[@id='aboutYou profileList']/ul/li[2]/a")
	WebElement ph_lnk_changePwd;
	
	
	@FindBy(xpath="//*[@id='aboutYou profileList']/ul/li[3]/a")
	WebElement ph_lnk_Email;
	
	@FindBy(xpath="//*[@id='navBar']/li[1]")
	WebElement SGW;
	
	String path1="C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\abtUprofile_SGW.png";
	 String path2="C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\abtchangedPwd_SGW.png";
	   String path3="C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\abtUemail_SGW.png";
			
			
	public void mousehoverProfile(WebDriver driver ) throws IOException 
	{
		SGW_TakeScreenShot.screenShotSGW(SGW, driver, path1);
		MouseHover.mouseHover(ph_lnk_Aboutu, ph_lnk_Profile, driver);
	}
	
	public void mousehoverChangePwd(WebDriver driver) throws IOException
	{
		SGW_TakeScreenShot.screenShotSGW(SGW, driver, path2);
		MouseHover.mouseHover(ph_lnk_Aboutu, ph_lnk_changePwd, driver);
	}
	
	public void mousehoverEmail(WebDriver driver) throws IOException
	
	{
		SGW_TakeScreenShot.screenShotSGW(SGW, driver, path3);
		MouseHover.mouseHover(ph_lnk_Aboutu, ph_lnk_Email, driver);
	}
	
	
}
