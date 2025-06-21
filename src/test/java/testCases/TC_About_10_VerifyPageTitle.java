package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AboutPage;
import testBase.BaseClass;

public class TC_About_10_VerifyPageTitle extends BaseClass  {
	
	@Test(groups="sanity")
	public void verify_pageTitle()
	{
		logger.info("****** Starting TC_About_10_VerifyPageTitle *****");
		
		AboutPage abt=new AboutPage(driver);
        String PageTitle = abt.getPageTitle();
	    Assert.assertEquals(PageTitle, "WONDRx | Smart Rx Kit that digitizes your Rx in No Time!");

		logger.info("****** Finished TC_About_10_VerifyPageTitle *****");
	}
}

