package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AboutPage;
import testBase.BaseClass;

public class TC_About_14_VerifyImageAlt extends BaseClass  {
	
	@Test(groups="sanity")
	public void verify_Image_Alt_Present()
	{
		logger.info("****** Starting TC_About_14_VerifyImageAlt *****");
		
		AboutPage abt=new AboutPage(driver);
        int image_alt = abt.VerifyImageAlt();
	    Assert.assertEquals(image_alt, 0);
	    
	    logger.info("****** Finished TC_About_14_VerifyImageAlt *****");
	}
	
}

