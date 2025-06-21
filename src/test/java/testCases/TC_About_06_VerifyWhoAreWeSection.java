package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AboutPage;
import testBase.BaseClass;

public class TC_About_06_VerifyWhoAreWeSection extends BaseClass  {
	
	@Test(groups="sanity")
	public void verify_WhoAreWESectionheaderdisplayed()
	{
		logger.info("****** Starting TC_About_06_VerifyWhoAreWeSection *****");
		
		AboutPage abt=new AboutPage(driver);
        boolean whoAreWeheader = abt.checkWhoAreWeheader();
	    Assert.assertEquals(whoAreWeheader, true, "Who Are We section is not Displayed");
	    System.out.println(abt.checkWhoAreWeparagraph());
		logger.info("****** Finished TC_About_06_VerifyWhoAreWeSection *****");
	}
	
}

