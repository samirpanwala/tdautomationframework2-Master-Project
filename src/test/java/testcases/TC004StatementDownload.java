package testcases;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import base.BaseClass;
import pages.AccountSummaryPage;
import pages.StatementDownload;

public class TC004StatementDownload extends BaseClass {
	
	
	@Test
	public void StatementDownload() {		
		test.log(LogStatus.INFO, "Download Statement Test started");
		app_logs.info("Download Statement test started");
		
		AccountSummaryPage asp=new AccountSummaryPage(driver);
		test.log(LogStatus.INFO, "Clicked Online Statement button");
		//asp.lnkOnlineStatements
		asp.doclickStatementDownload();

		StatementDownload sdw=new StatementDownload(driver);
		test.log(LogStatus.INFO, "Account Type selected");
		sdw.drpdownaccount.isSelected();
	
		//PayBillsPage pb=new PayBillsPage(driver);
		test.log(LogStatus.INFO, "Clicked on Statement Year button");
		sdw.statementyear.click();
		//pb.doClickPaySavedPayee();
		
		test.log(LogStatus.INFO, "Statement linked clicked");
		//sdw.download.click();
		
		
		test.log(LogStatus.INFO, "Statement being downloaded");
	
	}

}
