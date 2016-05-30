package SGW_NewPort.Version_1_0_pageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import SGW_NewPort.Version_1_0_pageUtility.*;

public class ourProduct {
	
	@FindBy(xpath="//*[@id='ourWorld']/a")
	WebElement ph_lnk_ourPrd;
	
	@FindBy(xpath="//*[@id='ourWorld']/ul/li[1]/a")
	WebElement ph_lnk_NonMthlGld;
	
	@FindBy(xpath="//*[@id='ourWorld']/ul/li[2]/a")
	WebElement ph_lnk_NonMnthlRd;
	
	@FindBy(xpath="//*[@id='ourWorld']/ul/li[3]/a")
	WebElement ph_lnk_SmoothSelect;
	@FindBy(xpath="//*[@id='navBar']/li[1]")
	WebElement SGW;
	
	String path1="C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\nonMenthol_SGW.png";
	 String path2="C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\mnthlrd_SGW.png";
	   String path3="C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\smoothselect_SGW.png";
	
	public void mHNonMntlGld(WebDriver driver) throws IOException
	{
		SGW_TakeScreenShot.screenShotSGW(SGW, driver, path1);
		MouseHover.mouseHover(ph_lnk_ourPrd, ph_lnk_NonMthlGld, driver);
	}
	public void mHNonMntlrd(WebDriver driver) throws IOException
	{
		SGW_TakeScreenShot.screenShotSGW(SGW, driver, path2);
		MouseHover.mouseHover(ph_lnk_ourPrd, ph_lnk_NonMnthlRd, driver);
	}
	public void mHNonMntlsmoothselect(WebDriver driver) throws IOException
	{
		SGW_TakeScreenShot.screenShotSGW(SGW, driver, path3);
		MouseHover.mouseHover(ph_lnk_ourPrd, ph_lnk_SmoothSelect, driver);
	}
}
