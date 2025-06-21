package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AboutPage;
import testBase.BaseClass;

public class TC_About_18_VerifyFooterLogoAndCenterText extends BaseClass  {
	
	@Test(groups="sanity")
	public void verify_VerifyWondRxvaluesSection_displayed() throws InterruptedException
	{
		logger.info("****** Starting TC_About_18_VerifyFooterLogoAndCenterText *****");
		
		AboutPage abt=new AboutPage(driver);
        boolean FooterLogo = abt.VerifyLogoInFooter();
	    Assert.assertEquals(FooterLogo, true, "WondRx Logo in Footer is not Displayed");
	    String footerTagline = abt.FootercenteralignText();
	    Assert.assertEquals(footerTagline, "Enabling Healthcare access to every nook and corner of India Digitally");
	    logger.info("****** Finished TC_About_18_VerifyFooterLogoAndCenterText *****");
	}
	
}

