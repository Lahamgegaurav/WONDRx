package testCases;


import org.testng.annotations.Test;

import pageObjects.AboutPage;
import testBase.BaseClass;

public class TC_About_25_NavigationBackNext extends BaseClass  {
	
	@Test(groups="sanity")
	public void verify_HeaderLogo()
	{
		logger.info("****** Starting TC_About_25_NavigationBackNext *****");
		
		AboutPage abt=new AboutPage(driver);
        abt.navigateotherpages();
		logger.info("****** Finished TC_About_25_NavigationBackNext *****");
	}
}

