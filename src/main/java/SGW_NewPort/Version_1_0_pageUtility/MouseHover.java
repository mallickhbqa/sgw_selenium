package SGW_NewPort.Version_1_0_pageUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	
	public static  void mouseHover(WebElement e1,WebElement e2,WebDriver driver)
	{
		 Actions action=new Actions(driver);
	     action.moveToElement(e1).perform();
	     action.click(e2).build().perform();
	}

}
