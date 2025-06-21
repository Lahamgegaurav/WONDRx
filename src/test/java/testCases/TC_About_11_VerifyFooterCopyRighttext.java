package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AboutPage;
import testBase.BaseClass;

public class TC_About_11_VerifyFooterCopyRighttext extends BaseClass  {
	
	@Test(groups="sanity")
	public void verify_pageTitle()
	{
		logger.info("****** Starting TC_About_11_VerifyFooterCopyRighttext *****");
		
		AboutPage abt=new AboutPage(driver);
        String copyrighttext = abt.copyright();
	    Assert.assertEquals(copyrighttext, "© 2025, WONDRx", "Copyright text mismatched");

		logger.info("****** Finished TC_About_11_VerifyFooterCopyRighttext *****");
	}
}

