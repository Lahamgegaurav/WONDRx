package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AboutPage;
import testBase.BaseClass;

public class TC_About_09_VerifyWondRxvaluesSection extends BaseClass  {
	
	@Test(groups="sanity")
	public void verify_VerifyWondRxvaluesSection_displayed() throws InterruptedException
	{
		logger.info("****** Starting TC_About_09_VerifyWondRxvaluesSection *****");
		
		AboutPage abt=new AboutPage(driver);
        boolean wondRxvalueimg = abt.checkWondRxvaluesimage();
	    Assert.assertEquals(wondRxvalueimg, true, "WondRx values image section is not Displayed");
	    logger.info("****** Finished TC_About_09_VerifyWondRxvaluesSection *****");
	}
	
}

