package SGW_NewPort.Version_1_0_pageUtility;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;

import javax.imageio.ImageIO;

import org.testng.Assert;
import org.testng.annotations.Test;

//import com.asprise.ocr.Ocr;

//import com.asprise.ocr.Ocr;

public class CompareImg {
/*
	public static  boolean compareImageTxt(String path1,String path2) {
		// TODO Auto-generated method stub

		
		Ocr.setUp(); // one time setup
		Ocr ocr = new Ocr(); // create a new OCR engine
		ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
		String s = ocr.recognize(new File[] {new File(path1)}, Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		//System.out.println("Result: " + s);
		// ocr more images here ...
		String s2=ocr.recognize(new File[] {new File(path2)}, Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		//System.out.println("Result: " + s2);
		if(s.equals(s2))
		{
			return true;
		}
		else
		{
			
			return false;
		}
	}*/
	/*@Test
	public void validText()
	{
		boolean b=CompareImg.compareImageTxt("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png","C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\SGW_ScreenShot\\newplesureplay_SGW.png");
		Assert.assertEquals(b, true);
	}*/
	public static boolean compareImage(File fileA, File fileB) {        
	    try {
	        // take buffer data from botm image files //
	        BufferedImage biA = ImageIO.read(fileA);
	        DataBuffer dbA = biA.getData().getDataBuffer();
	        int sizeA = dbA.getSize();                      
	        BufferedImage biB = ImageIO.read(fileB);
	        DataBuffer dbB = biB.getData().getDataBuffer();
	        int sizeB = dbB.getSize();
	        // compare data-buffer objects //
	        if(sizeA == sizeB) {
	            for(int i=0; i<sizeA; i++) { 
	                if(dbA.getElem(i) != dbB.getElem(i)) {
	                	System.out.println("element="+dbA.getElem(i+1));
	                    return false;
	                }
	            }
	            return true;
	        }
	        else {
	            return false;
	        }
	    } 
	    catch (Exception e) { 
	        System.out.println("Failed to compare image files ...");
	        return  false;
	    }
	}
}
