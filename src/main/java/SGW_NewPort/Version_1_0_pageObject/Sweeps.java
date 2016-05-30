package SGW_NewPort.Version_1_0_pageObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import SGW_NewPort.Version_1_0_pageUtility.*;

public class Sweeps {

	
@FindBy(xpath="//*[@id='sweepsNav']/a")
WebElement sweeps;

@FindBy(xpath="//*[@id='sweepsNav']/a")
WebElement payday;

@FindBy(xpath="//div[@id='header']/div[@class='header-sgw quarter2']")
WebElement SGW;

String path="C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\Payday_SGW.png";


public void mouseHoverPayday(WebDriver driver) throws IOException
{
	
	MouseHover.mouseHover(sweeps, payday, driver);
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	SGW_TakeScreenShot.screenShotSGW(SGW, driver,path);

	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.navigate().back();
}


}
