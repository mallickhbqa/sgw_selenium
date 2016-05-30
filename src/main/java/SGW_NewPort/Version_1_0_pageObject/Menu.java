package SGW_NewPort.Version_1_0_pageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import SGW_NewPort.Version_1_0_pageUtility.SGW_TakeScreenShot;

public class Menu {
	
	@FindBy(xpath="//*[@id='topNav']/li[2]/a")
	WebElement faq;
	
	@FindBy(xpath="//*[@id='topNav']/li[3]/a")
	WebElement  ppc ;
	
	@FindBy(xpath="//*[@id='topNav']/li[5]/a")
	WebElement help;
	
	@FindBy(xpath="//*[@id='topNav']/li[6]/a")
	WebElement logOut;
	@FindBy(xpath="//*[@id='navBar']/li[1]")
	WebElement SGW;
	
	String path1="C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\faq.png";
	String path2="C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\ppc.png";
	String path3="C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\help.png";
	
	
	public void faq(WebDriver driver) throws IOException
	{
		SGW_TakeScreenShot.screenShotSGW(SGW, driver, path1);
		faq.click();
	}
	public void privacyPolicy(WebDriver driver) throws IOException
	{
		SGW_TakeScreenShot.screenShotSGW(SGW, driver, path2);
		ppc.click();
	}
	public void help(WebDriver driver) throws IOException
	{
		SGW_TakeScreenShot.screenShotSGW(SGW, driver, path3);
		help.click();
	}
	public void logout()
	{
		logOut.click();
	}
}
