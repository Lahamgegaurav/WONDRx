package pageObjects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class AboutPage extends BasePage {

	public AboutPage(WebDriver driver)
	{
		super(driver);

    }
	
	@FindBy(css ="header a, nav a")
	List<WebElement> headerlinks;
	
	@FindBy(css ="div#foomar a")
	List<WebElement> footerlinks;
	
	@FindBy(id ="#foomar")
	WebElement footersection;
	
//	@FindBy(id ="img#marh")
	@FindBy(xpath ="//a[@class='navbar-brand']/img")
	WebElement WONDRxLogo;
	
	
	@FindBy(xpath ="//main//img[@src='assets/images/about.webp']")
	WebElement AboutUs;
	
	@FindBy(xpath ="//div[@id='about1']/div[1]/p[@id='who']")
	WebElement whoareweheader;
	
	@FindBy(xpath ="//div[@id='about1']/div[1]/p[@id='whoP']")
	WebElement whoarewePara;
	
	@FindBy(xpath ="//div[@id='about1']/div[2]/p[@id='whov']")
	WebElement visionwehaveheader;
	
	@FindBy(xpath ="//div[@id='about1']/div[2]/p[@id='whoP']")
	WebElement visionwehavePara;
	
	@FindBy(xpath ="//img[@src='assets/images/blue.webp']")
	WebElement missionWeAreOnimg;
	
	@FindBy(xpath ="//img[@src='assets/images/values.webp']")
	WebElement WondRxvalues;
	
	@FindBy(xpath ="//*[ contains (text(), '© 2025, WONDRx')]")
	WebElement copyrightText;
	
	@FindBy(xpath ="//footer/div/div[1]/img")
	WebElement FooterWONDRxLogo;
	
	@FindBy(xpath ="//footer/div/div[1]/p")
	WebElement Footercentertext;
	
	@FindBy(xpath ="//*[@id='foo']/li[position()>1]/a")
	List<WebElement> faIcons;
	
	@FindBy(linkText = "Doctors")
	WebElement doctorslink;
	
	@FindBy(linkText = "Consumers")
	WebElement Consumerslink;
	
	@FindBy(tagName = "img")
	List<WebElement> imagecheckalt;
	
	
	
	
	public String verifyPageLoadURL()
	{
		return driver.getCurrentUrl();
	}


	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public boolean getPageResource()
	{
		return driver.getPageSource().contains("Who Are We");
	}
	
	public List<String> VerifyHeaderLinks() {
		List<String> brokenLinks = new ArrayList<>();

        System.out.println("Total Found " + headerlinks.size() + " header links.");

        for (WebElement link : headerlinks) {
            String linkText = link.getText();
            String href = link.getAttribute("href");
            
            // Total 16 links getting, so excluding hidden links and only checking available!

            if (linkText != null && !linkText.trim().isEmpty() && href != null && !href.trim().isEmpty()) {
                System.out.println("Link Text: " + linkText);
                System.out.println("HREF: " + href);

                try {
                    @SuppressWarnings("deprecation")
					HttpURLConnection connection = (HttpURLConnection) new URL(href).openConnection();
                    connection.setRequestMethod("HEAD");
                    connection.setConnectTimeout(5000);
                    connection.setReadTimeout(5000);
                    connection.connect();
                    int responseCode = connection.getResponseCode();

                    System.out.println("Response Code: " + responseCode);
                    if (responseCode >= 400) {
                        brokenLinks.add(href + " returned " + responseCode);
                    }
                } catch (IOException e) {
                    brokenLinks.add(href + " threw exception: " + e.getMessage());
                }
            }
        }
        return brokenLinks;
	}
	
	public List<String> VerifyFooterLinks() {
		((JavascriptExecutor) driver).executeScript(
			    "window.scrollTo({ top: document.body.scrollHeight, behavior: 'smooth' });"
			);
		List<String> brokenLinks = new ArrayList<>();

        System.out.println("Total Found " + footerlinks.size() + " footer links.");

        for (WebElement link : footerlinks) {
            String linkText = link.getText();
            String href = link.getAttribute("href");
            

            if (linkText != null && !linkText.trim().isEmpty() && href != null && !href.trim().isEmpty()) {
                System.out.println("Link Text: " + linkText);
                System.out.println("HREF: " + href);

                try {
                    @SuppressWarnings("deprecation")
					HttpURLConnection connection = (HttpURLConnection) new URL(href).openConnection();
                    connection.setRequestMethod("HEAD");
                    connection.setConnectTimeout(5000);
                    connection.setReadTimeout(5000);
                    connection.connect();
                    int responseCode = connection.getResponseCode();

                    System.out.println("Response Code: " + responseCode);
                    if (responseCode >= 400) {
                        brokenLinks.add(href + " returned " + responseCode);
                    }
                } catch (IOException e) {
                    brokenLinks.add(href + " threw exception: " + e.getMessage());
                }
            }
        }
        return brokenLinks;
	}
	
	public boolean VerifyLogoInHeader() 
	  {
		boolean logo = WONDRxLogo.isDisplayed();
		return logo;
      }
	
	public String VerifyLogoSRC() 
	  {
		String src = WONDRxLogo.getAttribute("src");
		System.out.println("Image src: " + src);
		return src;
    }
	
	public boolean checkAboutUssection()
	{
		return AboutUs.isDisplayed();
	
	}
	
	public boolean checkWhoAreWeheader()
	{
		System.out.println(whoareweheader.getText());

		return whoareweheader.isDisplayed();
	
	}
	
	public String checkWhoAreWeparagraph()
	{
		
		return whoarewePara.getText();
	
	}
	
	public boolean checkVisionWeHaveheader()
	{
//		((JavascriptExecutor) driver).executeScript( "arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", visionwehaveheader);

	     Actions actions = new Actions(driver);
         actions.moveToElement(visionwehaveheader).perform();
		System.out.println(visionwehaveheader.getText());

		return visionwehaveheader.isDisplayed();
	
	}
	
	public String checkVisionWeHaveparagraph()
	{
	     Actions actions = new Actions(driver);
         actions.moveToElement(visionwehavePara).perform();
		return visionwehavePara.getText();
	
	}
	
	public boolean checkMissionWeAreOnimage()
	{
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", missionWeAreOnimg);
	

	     Actions actions = new Actions(driver);
         actions.moveToElement(missionWeAreOnimg).perform();

		return missionWeAreOnimg.isDisplayed();
	
	}
	
	public boolean checkWondRxvaluesimage() throws InterruptedException
	{
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", WondRxvalues);
		

	    Actions actions = new Actions(driver);
        actions.moveToElement(WondRxvalues).perform();
     	Thread.sleep(5000);
		return missionWeAreOnimg.isDisplayed();
	
	}
	
	public String copyright()
	{
	     Actions actions = new Actions(driver);
         actions.moveToElement(copyrightText).perform();
		 return copyrightText.getText();
	
	}
	
	public boolean VerifyLogoInFooter() 
	  {
	    Actions actions = new Actions(driver);
        actions.moveToElement(FooterWONDRxLogo).perform();
		boolean flogo = FooterWONDRxLogo.isDisplayed();
		return flogo;
    }
	
	public String FootercenteralignText()
	{
	     Actions actions = new Actions(driver);
         actions.moveToElement(Footercentertext).perform();
         System.out.println(Footercentertext.getText());
		 return Footercentertext.getText();
	
	}
	
	public int VerifyFaicons() {
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo({ top: document.body.scrollHeight, behavior: 'smooth' });");
         List<String> brokenfaicon = new ArrayList<>();
         System.out.println("Total Found " + faIcons.size() + " Fa icons.");

        for (WebElement icon : faIcons) {
                  String href = icon.getAttribute("href");
                  if (href != null && !href.trim().isEmpty()) // If href is not empty or null, it's a valid link
                   {
                   System.out.println("HREF: " + href);
                   } 
                  else
                  {
                   brokenfaicon.add("Broken Icon: " + icon.getAttribute("outerHTML")); // Add to the brokenfaicon list if href is missing
                  }
               }
        
        System.out.println("Total Broken Icons: " + brokenfaicon.size());
		return brokenfaicon.size();
	

              }
	
	public void navigateotherpages()
	{
	     doctorslink.click();
	     Consumerslink.click();
	     driver.navigate().back();
	     driver.navigate().forward();
	     driver.navigate().back();
	     driver.navigate().back();
	
	}
	
	public int VerifyImageAlt() {
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo({ top: document.body.scrollHeight, behavior: 'smooth' });");
         List<String> brokenalt = new ArrayList<>();
         System.out.println("Total Found " + imagecheckalt.size() + " images.");

        for (WebElement imgalt : imagecheckalt) {
                  String imgALT = imgalt.getAttribute("alt");
                  if (imgALT != null && !imgALT.trim().isEmpty()) 
                   {
                   System.out.println("imageALT: " + imgALT);
                   } 
                  else
                  {
                	  brokenalt.add("Broken imagealt: " + imgalt.getAttribute("outerHTML")); 
                  }
               }
        
        System.out.println("Total Broken imagealt: " + brokenalt.size());
		return brokenalt.size();
	

              }
}


