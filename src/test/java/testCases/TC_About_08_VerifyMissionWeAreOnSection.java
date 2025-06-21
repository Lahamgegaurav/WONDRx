package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AboutPage;
import testBase.BaseClass;

public class TC_About_08_VerifyMissionWeAreOnSection extends BaseClass  {
	
	@Test(groups="sanity")
	public void verify_MissionWeAreOnSectiondisplayed() throws InterruptedException
	{
		logger.info("****** Starting TC_About_08_VerifyMissionWeAreOnSection *****");
		
		AboutPage abt=new AboutPage(driver);
        boolean missionimage = abt.checkMissionWeAreOnimage();
	    Assert.assertEquals(missionimage, true, "Mission We are on section is not Displayed");
	    logger.info("****** Finished TC_About_08_VerifyMissionWeAreOnSection *****");
	}
	
}

