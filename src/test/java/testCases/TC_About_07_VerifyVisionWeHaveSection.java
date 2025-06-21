package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AboutPage;
import testBase.BaseClass;

public class TC_About_07_VerifyVisionWeHaveSection extends BaseClass  {
	
	@Test(groups="sanity")
	public void verify_WhoAreWESectionheaderdisplayed()
	{
		logger.info("****** Starting TC_About_07_VerifyVisionWeHaveSection *****");
		
		AboutPage abt=new AboutPage(driver);
        boolean visioWeHaveheader = abt.checkVisionWeHaveheader();
	    Assert.assertEquals(visioWeHaveheader, true, "Vision We Have section is not Displayed");
	    System.out.println(abt.checkVisionWeHaveparagraph());
	    Assert.assertEquals(abt.checkVisionWeHaveparagraph(), "Establish credible and positive change in the Health Ecosystem through technology and innovation integrated into the Smart Rx Kit; thereby improving the lives of patients while positively impacting caregivers, healthcare providers, and payers.");
		logger.info("****** Finished TC_About_07_VerifyVisionWeHaveSection *****");
	}
	
}

