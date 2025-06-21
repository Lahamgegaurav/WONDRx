package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AboutPage;
import testBase.BaseClass;

public class TC_About_05_VerifyAboutUsSection extends BaseClass  {
	
	@Test(groups="sanity")
	public void verify_AboutUsSectiondisplayed()
	{
		logger.info("****** Starting TC_About_05_VerifyAboutUsSection *****");
		
		AboutPage abt=new AboutPage(driver);
        boolean abtus = abt.checkAboutUssection();
	    Assert.assertEquals(abtus, true, "About Us section is not Displayed");
		logger.info("****** Finished TC_About_05_VerifyAboutUsSection *****");
	}
}

