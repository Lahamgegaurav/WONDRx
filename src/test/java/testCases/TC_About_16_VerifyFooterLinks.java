package testCases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AboutPage;
import testBase.BaseClass;

public class TC_About_16_VerifyFooterLinks extends BaseClass {

	   @Test(groups="sanity")
	   public void testFooterLinksStatus() {
		   
		   logger.info("****** Starting TC_About_16_VerifyFooterLinks *****");
			AboutPage abt=new AboutPage(driver);
			List<String> checkbrokelink = abt.VerifyFooterLinks(); 
			logger.info("****** Checking Broken links not present in footer *****");
			System.out.println("Broken links found: " + checkbrokelink.size());
			 Assert.assertEquals(checkbrokelink.size(), 0); 
			 
			logger.info("****** Finished TC_About_16_VerifyFooterLinks *****");
	        }
	    }
