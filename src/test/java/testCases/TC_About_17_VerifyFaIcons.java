package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AboutPage;
import testBase.BaseClass;

public class TC_About_17_VerifyFaIcons extends BaseClass  {
	
	@Test(groups="sanity")
	public void verify_Verify_fa_icons_displayed()
	{
		logger.info("****** Starting TC_About_17_VerifyFaIcons *****");
		
		AboutPage abt=new AboutPage(driver);
        int FooterLogo = abt.VerifyFaicons();
	    Assert.assertEquals(FooterLogo, 0);
	    
	    logger.info("****** Finished TC_About_17_VerifyFaIcons *****");
	}
	
}

