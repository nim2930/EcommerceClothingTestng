package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.MainPageObjects;
import pagefactory.WomenButton;

public class TC1_WomenShopping {
  @Test
  public void test() throws Exception {
	   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nimisha\\eclipse-workspace\\EcommerceClothingTestng\\BrowserDrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	    ExtentHtmlReporter htmlrep = new ExtentHtmlReporter("ECommerceTestng-Nimisha.html");
		ExtentReports exTent = new ExtentReports();
		exTent.attachReporter(htmlrep);
		ExtentTest test1 = exTent.createTest("ECommerceTestng", "testing of ecomm app by Nimisha");
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		MainPageObjects mpObj = new MainPageObjects(driver);
		mpObj.clickWomenButtonLink();
		test1.pass("Clicked on Women button in Home page, Women shopping page opened successfully");
		
		test1.addScreenCaptureFromPath("cle.png");
		test1.pass("Clevaland", MediaEntityBuilder.createScreenCaptureFromPath("cle.png").build());
		WomenButton wbObj=new WomenButton(driver, test1);
		wbObj.selectTops(); 
		driver.close();
		exTent.flush();
		
  
}
}