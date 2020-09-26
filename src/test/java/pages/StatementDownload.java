package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.BasePage;

public class StatementDownload extends BasePage {
	
	
	public StatementDownload(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(xpath="//a[contains(text(),'Online Statements')]")
	public WebElement lnkonlinestatement;
	
	@FindBy(xpath="//select[@id='os_accountId']")
	public WebElement drpdownaccount;
	
	@FindBy(xpath="//option[contains(text(),'Checking')]")
	public WebElement Accounttype;
	
	@FindBy(xpath="//a[contains(text(),'2011')]")
	public WebElement statementyear;
	
	
	@FindBy(xpath="//div[@id='os_2012']//a[contains(text(),'Statement 01')]")
	public WebElement download;
	
	//@FindBy(linkText="Statement 01/10/12(57K)")
	//public WebElement download;
	
	//@FindBy(xpath="//a[contains(text(),'Add New Payee')]")
	//public WebElement lnkAddPayee;
	
}

