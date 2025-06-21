package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AboutPage;
import testBase.BaseClass;

public class TC_About_19_VerifyLogoInHeader extends BaseClass  {
	
	@Test(groups="sanity")
	public void verify_HeaderLogo()
	{
		logger.info("****** Starting TC_About_19_VerifyLogoInHeader *****");
		
		AboutPage abt=new AboutPage(driver);
        boolean HeadLogo = abt.VerifyLogoInHeader();
	    Assert.assertEquals(HeadLogo, true, "Logo is Displayed");
	    String LogoSRC = abt.VerifyLogoSRC();
	    String expectedSrc = "https://www.wondrx.com/assets/images/logo.png";
	    Assert.assertEquals(LogoSRC, expectedSrc);
		logger.info("****** Finished TC_About_19_VerifyLogoInHeader *****");
	}
}

