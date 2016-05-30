package SGW_NewPort.Version_1_0_pageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import SGW_NewPort.Version_1_0_pageUtility.SGW_TakeScreenShot;

public class NewPleasurePlay {

	@FindBy(linkText="NEWPORT PLEASURE PLAY")
	WebElement Lnk_Npp;
	
	@FindBy(xpath="//*[@id='navBar']/li[1]")
	WebElement SGW;
	
	String path1="C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png";
	public void click(WebDriver driver) throws IOException
	{
		SGW_TakeScreenShot.screenShotSGW(SGW, driver, path1);
		Lnk_Npp.click();
	}
}
