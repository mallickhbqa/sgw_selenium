package SGW_NewPort.Version_1_0_pageOperation;

import java.io.File;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import SGW_NewPort.Version_1_0_pageObject.AboutPg;
import SGW_NewPort.Version_1_0_pageObject.LoginPg;
import SGW_NewPort.Version_1_0_pageObject.Menu;
import SGW_NewPort.Version_1_0_pageObject.NewPleasurePlay;
import SGW_NewPort.Version_1_0_pageObject.ProfilePg;
import SGW_NewPort.Version_1_0_pageObject.Sweeps;
import SGW_NewPort.Version_1_0_pageObject.ourProduct;
import SGW_NewPort.Version_1_0_pageUtility.CompareImg;
//import SGW_NewPort.Version_1_0_pageUtility.CompareImg;
import ExtentReportUtilty.*;

public class PageTestOperation extends Base {

	
	
	
	@Test
	public  void LogOnValid() throws IOException, InterruptedException
	{
		test = extent.startTest("LogOnValid");
		LoginPg lpg=PageFactory.initElements(driver,LoginPg.class);
		lpg.logon("400196579","first001",driver);
		Thread.sleep(3000);
		boolean b=CompareImg.compareImage(new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"),new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"));
		Assert.assertEquals(b, true);
		Thread.sleep(3000);
		test.getRunStatus();
	}
	@Test(dependsOnMethods={"LogOnValid"},alwaysRun=true)
	public void profileMouseHoverValid() throws InterruptedException, IOException
	{
		test = extent.startTest("profileMouseHoverValid");
		ProfilePg ppg=PageFactory.initElements(driver,ProfilePg.class);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		ppg.mousehover(driver);
		boolean b=CompareImg.compareImage(new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"),new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"));
		Assert.assertEquals(b, true);
		
		Thread.sleep(3000);
		test.getRunStatus();
	}
	@Test(dependsOnMethods={"profileMouseHoverValid"})
	public void aboutUProfileMh() throws InterruptedException, IOException
	{
		test = extent.startTest("aboutUProfileMhd");
		AboutPg apg=PageFactory.initElements(driver,AboutPg.class);
		Thread.sleep(1000);
		apg.mousehoverProfile(driver);
		boolean b=CompareImg.compareImage(new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"),new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"));
		Assert.assertEquals(b, true);
		Thread.sleep(3000);
		test.getRunStatus();
		
	}
	@Test(dependsOnMethods={"aboutUProfileMh"},alwaysRun=true)
	public void aboutUChanePwdMh() throws InterruptedException, IOException
	{
		test = extent.startTest("aboutUChanePwdMh()");
		AboutPg apg=PageFactory.initElements(driver,AboutPg.class);
		Thread.sleep(1000);
		apg.mousehoverChangePwd(driver);
		Thread.sleep(3000);
		boolean b=CompareImg.compareImage(new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"),new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"));
		Assert.assertEquals(b, true);
		Thread.sleep(3000);
		test.getRunStatus();
	}
	@Test(dependsOnMethods={"aboutUChanePwdMh"},alwaysRun=true)
	public void aboutUemailh() throws InterruptedException, IOException
	{
		test = extent.startTest("aboutUemailh");
		AboutPg apg=PageFactory.initElements(driver,AboutPg.class);
		Thread.sleep(1000);
		apg.mousehoverEmail(driver);
		Thread.sleep(3000);
		boolean b=CompareImg.compareImage(new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"),new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"));
		Assert.assertEquals(b, true);
		Thread.sleep(3000);
		test.getRunStatus();
	}
	
	@Test(dependsOnMethods={"aboutUemailh"},alwaysRun=true)
	public void ourPrdMnthlGold() throws IOException, InterruptedException
	{
		test = extent.startTest("ourPrdMnthlGold");
		ourProduct opg=PageFactory.initElements(driver,ourProduct.class);
		opg.mHNonMntlGld(driver);
		Thread.sleep(3000);
		boolean b=CompareImg.compareImage(new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"),new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"));
		Assert.assertEquals(b, true);
		Thread.sleep(3000);
		test.getRunStatus();
	}
	@Test(dependsOnMethods={"ourPrdMnthlGold"},alwaysRun=true)
	public void ourPrdMnthlRed() throws IOException, InterruptedException
	{
		test = extent.startTest("ourPrdMnthlRed");
		ourProduct opg=PageFactory.initElements(driver,ourProduct.class);
		opg.mHNonMntlrd(driver);
		Thread.sleep(3000);
		boolean b=CompareImg.compareImage(new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"),new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"));
		Assert.assertEquals(b, true);
		Thread.sleep(3000);
		test.getRunStatus();
	}
	@Test(dependsOnMethods={"ourPrdMnthlRed"},alwaysRun=true)
	public void ourPrdSmthSlct() throws IOException, InterruptedException
	{
		test = extent.startTest("ourPrdSmthSlct");
		ourProduct opg=PageFactory.initElements(driver,ourProduct.class);
		opg.mHNonMntlsmoothselect(driver);
		Thread.sleep(3000);
		boolean b=CompareImg.compareImage(new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"),new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"));
		Assert.assertEquals(b, true);
		Thread.sleep(3000);
		test.getRunStatus();
	}
	@Test(dependsOnMethods={"ourPrdSmthSlct"},alwaysRun=true)
	public void NewpleasureLnk() throws IOException, InterruptedException
	{
		test = extent.startTest("NewpleasureLnk");
		NewPleasurePlay nwp=PageFactory.initElements(driver, NewPleasurePlay.class);
		nwp.click(driver);
		Thread.sleep(3000);
		boolean b=CompareImg.compareImage(new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"),new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"));
		Assert.assertEquals(b, true);
		Thread.sleep(3000);
		test.getRunStatus();
	}
	@Test(dependsOnMethods={"NewpleasureLnk"},alwaysRun=true)
	public void SweepsMouseHover() throws IOException, InterruptedException
	{
		test = extent.startTest("SweepMouseHover");
		Sweeps sweep=PageFactory.initElements(driver, Sweeps.class);
		sweep.mouseHoverPayday(driver);
		Thread.sleep(3000);
		boolean b=CompareImg.compareImage(new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"),new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"));
		Assert.assertEquals(b, true);
		Thread.sleep(3000);
		test.getRunStatus();
	}
	@Test(dependsOnMethods={"SweepsMouseHover"},alwaysRun=true)
	public void faq() throws IOException, InterruptedException
	{
		test = extent.startTest("faq");
		SGW_NewPort.Version_1_0_pageObject.Menu m=PageFactory.initElements(driver,Menu.class);
		m.faq(driver);
		Thread.sleep(3000);
		boolean b=CompareImg.compareImage(new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"),new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png"));
		Assert.assertEquals(b, true);
		Thread.sleep(3000);
		test.getRunStatus();
		
	}
	@Test(dependsOnMethods={"faq"},alwaysRun=true)
	public void privacypolicy() throws IOException, InterruptedException
	{
		test = extent.startTest("PrivacyPolicy");
		SGW_NewPort.Version_1_0_pageObject.Menu m=PageFactory.initElements(driver,Menu.class);
		m.privacyPolicy(driver);
		Thread.sleep(3000);
		boolean b=CompareImg.compareImage(new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\ppc.png"),new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\help.png"));
		Assert.assertEquals(b, true);
		Thread.sleep(3000);
		test.getRunStatus();
		
	}
	@Test(dependsOnMethods={"privacypolicy"},alwaysRun=true)
	public void help() throws IOException, InterruptedException
	{
		test = extent.startTest("help");
		SGW_NewPort.Version_1_0_pageObject.Menu m=PageFactory.initElements(driver,Menu.class);
		m.help(driver);
		Thread.sleep(3000);
		boolean b=CompareImg.compareImage(new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\help.png"),new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\help.png"));
		Assert.assertEquals(b, true);
		Thread.sleep(3000);
		test.getRunStatus();
	}
	@Test(dependsOnMethods={"help"},alwaysRun=true)
	public void logout()
	{
		test = extent.startTest("logOut");
		SGW_NewPort.Version_1_0_pageObject.Menu m=PageFactory.initElements(driver,Menu.class);
		m.logout();
		test.getRunStatus();
		
	}
	@AfterTest
	public void truncate()
	{
		driver.close();
	}
}
