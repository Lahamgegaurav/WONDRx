package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AboutPage;
import testBase.BaseClass;

public class TC_About_01_VerifyPageLoad extends BaseClass {
	
	@Test(groups="sanity")
	public void verify_pageloaded()
	{
		logger.info("****** Starting TC_About_01_VerifyPageLoad *****");
		
		AboutPage abt=new AboutPage(driver);
        String PageURL = abt.verifyPageLoadURL();
	    Assert.assertEquals(PageURL, "https://www.wondrx.com/about");
	    Assert.assertEquals(abt.getPageResource(), true);
	    		
		logger.info("****** Finished TC_About_01_VerifyPageLoad *****");
	}
}

