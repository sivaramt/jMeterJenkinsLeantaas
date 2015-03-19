package loginToLeanTaas;




/*import org.junit.Test;*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
/*import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
*/
public class LogIn {
	
	private By email = By.xpath(".//*[@id='_58_login']");
	private By password = By.xpath(".//*[@id='_58_password']");
	private By submitButton = By.xpath(".//input[@value='Sign In']");
	private String p_auth;
	private String jSessionId;
	private String companyId;
	private String Id;
	private String userUUID;
	private String comma=",";
	private String fileLoc="G://LeanTaaS//Testing//jMeterTests//TestData//userDetails.csv";
	
	@Test  
	   public void loginIntoLeantTaas() {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://localhost:8443/web/impact-site/home");
			driver.findElement(email).sendKeys("admin@LeanTaas.com");
			driver.findElement(password).sendKeys("Lean1234");
			driver.findElement(submitButton).click();
			System.out.println(driver.getCurrentUrl());
			p_auth=driver.getCurrentUrl().split("p_auth=")[1].split("&p_p_id")[0];
			jSessionId=driver.manage().getCookieNamed("JSESSIONID").getValue();
			companyId=driver.manage().getCookieNamed("COMPANY_ID").getValue();
			Id=driver.manage().getCookieNamed("ID").getValue();
			userUUID=driver.manage().getCookieNamed("USER_UUID").getValue();
			
			//Updating the above values in csv values
			/*CsvUtil csvUtil = new CsvUtil();
			csvUtil.updateFile(fileLoc, p_auth+comma+jSessionId+comma+companyId+comma+Id+comma+userUUID);*/
			
	}
	
	
	
	
}
