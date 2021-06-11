package pagefactory;
import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class WomenButton {
	
    public WebDriver driver;
    public ExtentTest xTest;
    

    public WomenButton(WebDriver driver, ExtentTest xTest) {
    		this.driver=driver;
    		this.xTest= xTest;
    		PageFactory.initElements(driver, this);
    	}

	@FindBy(xpath="//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img")
	WebElement Topstab;

	@FindBy(xpath="//*[@id=\"subcategories\"]/ul/li[1]/h5/a")
	WebElement TShirtstab;
	
	//@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	@FindBy(css=".product_img_link > .replace-2x")
	WebElement Item1ImageLink;
	
	@FindBy(id="quantity_wanted")
	WebElement TextBox;
	
	@FindBy(xpath="//*[@id=\"group_1\"]")
	WebElement SizeDropdown;
	
	@FindBy(xpath="//*[@id=\"color_14\"]")
	WebElement Color;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	WebElement AddtoCart;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement ProceedtoCheckout1;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
	WebElement ProceedtoCheckout2;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement Email;
	@FindBy(xpath="//*[@id=\"email_create\"]")
	WebElement EmailAddress;
	
	@FindBy(xpath="//*[@id=\"SubmitCreate\"]/span")
	WebElement CreateAnAccount;
	
	@FindBy(xpath="//*[@id=\"id_gender2\"]")
	WebElement MrsButton;
	
	@FindBy(xpath="//*[@id=\"customer_firstname\"]")
	WebElement FirstName;
	
	@FindBy(xpath="//*[@id=\"customer_lastname\"]")
	WebElement LastName;
	
	@FindBy(id="passwd")
	WebElement PassWord;
	
	@FindBy(xpath="//*[@id=\"days\"]")
	WebElement DateDropDown;
	
	@FindBy(xpath="//*[@id=\"months\"]")
	WebElement MonthDropDown;
	
	@FindBy(xpath="//*[@id=\"years\"]")
	WebElement YearDropDown;
	
	@FindBy(id="company")
	WebElement CompanyName;
	
	@FindBy(id="address1")
	WebElement Address;
	
	@FindBy(id="address2")
	WebElement Address2;
	
	@FindBy(id="city")
	WebElement City;
	
	@FindBy(id="id_state")
	WebElement State;
	
	@FindBy(id="postcode")
	WebElement ZipCode;
	
	@FindBy(id="id_country")
	WebElement Country;
	
	@FindBy(id="other")
	WebElement AdditionalInformation;
	
	@FindBy(id="phone_mobile")
	WebElement MobilePhone;
	
	@FindBy(id="alias")
	WebElement AliasAddress;
	
	@FindBy(xpath="//*[@id=\"submitAccount\"]/span")
	WebElement RegisterButton;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
	WebElement ProceedtoCheckout3;
	
	@FindBy(xpath="//*[@id=\"cgv\"]")
	WebElement CheckBox;
	
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
	WebElement ProceedtoCheckout4;
	
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span")
	WebElement PaybyBankWire;
	
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")
	WebElement IConfirmMyOrderButton;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div")
	WebElement TextMessage;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
	WebElement SignInButton;
	

    @Test
    public void selectTops() throws InterruptedException {
    	Thread.sleep(4000);
	    
    	if (Topstab.isEnabled()) {
		    Topstab.click();
		    xTest.log(Status.INFO, "Tops subcategories page opened sucessfully ");
		
		if (TShirtstab.isEnabled()) { 
			TShirtstab.click();
			xTest.log(Status.INFO, "T-shirts subcategories page opened successfully with all shopping items");
		}
		
		if (Item1ImageLink.isEnabled()) {
			Item1ImageLink.click();
			xTest.log(Status.INFO, "Selected shopping items opened successfully with all the details");
		}
		
        driver.switchTo().frame(0);
        
		TextBox.click();
		TextBox.sendKeys("2");
		
		Select s=new Select(SizeDropdown);
		s.selectByVisibleText("M");
		
		Color.click();
		
		AddtoCart.click();
		xTest.pass("Selected shopping items added to your shopping cart successfully");
		Thread.sleep(3000);
//		if (ProceedtoCheckout1.isDisplayed()) {
		ProceedtoCheckout1.click();
		xTest.pass("Shopping cart  summary page opened successfully");
		//}
		
		if (ProceedtoCheckout2.isDisplayed()) {
		ProceedtoCheckout2.click();
		xTest.pass(" Authentication page opened successfully");
		}
		//Thread.sleep(2000);
		
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(10000);
		EmailAddress.sendKeys("nspt.dup"+randomInt+"@gmail.com");
		
		if (CreateAnAccount.isEnabled()) {
		CreateAnAccount.click();
		xTest.log(Status.INFO, "Create an account page opened successfully with all the details");
		}
		//Thread.sleep(6000);
		
		if(MrsButton.isEnabled()) {
		MrsButton.click();
		FirstName.sendKeys("clev");
		LastName.sendKeys("land");
		Thread.sleep(2000);
//		Email.sendKeys("nspt.wgl@gmail.com");
//		Thread.sleep(3000);
		PassWord.sendKeys("qya@5yGrbjDZ68H");
		Thread.sleep(2000);
		//SignInButton.click();
		Select s1=new Select(DateDropDown);
		s1.selectByValue("24");
		Thread.sleep(2000);
		Select s2=new Select(MonthDropDown);
		s2.selectByValue("7");
		Thread.sleep(2000);
		Select s3=new Select(YearDropDown);
		s3.selectByValue("1996");
		Thread.sleep(2000);
		FirstName.sendKeys("clev");
		LastName.sendKeys("land");
		CompanyName.sendKeys("KeyBank");
		Address.sendKeys("Pearl Road,12345, KeyBank");
		Address2.sendKeys("M50,123456,2");
		City.sendKeys("Akron");
		Select s4=new Select(State);
		s4.selectByValue("36");
		ZipCode.sendKeys("44145");
		MobilePhone.sendKeys("4401234567");
		AliasAddress.sendKeys("12345, Main Road, P25");
		RegisterButton.click();
		xTest.pass("Address page opened with your delivery address and billing address fields");
		//Thread.sleep(6000);
		}
		if(ProceedtoCheckout3.isEnabled()) {
		ProceedtoCheckout3.click();
		xTest.pass( "Shipping page opened sucessfully");
		}
		//Thread.sleep(6000);
		
		if(CheckBox.isEnabled()) {
		CheckBox.click();
		xTest.log(Status.INFO, "Selected the terms of service successfully");
		ProceedtoCheckout4.click();
		xTest.pass(" Please choose your payment method page opened successfully");
		//Thread.sleep(6000);
		}
		
		if(PaybyBankWire.isEnabled()) {
		PaybyBankWire.click();
		xTest.pass(" Order summary page opened successfully");
		//Thread.sleep(2000);
		}
		
		if(IConfirmMyOrderButton.isEnabled()) {
		IConfirmMyOrderButton.click();
		xTest.pass("Order confirmation page displayed successfully ");
		//Thread.sleep(2000);
		String str=TextMessage.getText();
	
		if(str.contains("Your order")) {
			System.out.println("Pass, it contained Your order");
		}else {
				System.out.println("Fail, it did not contain Your order");
		}
		}
		
		
}
    	}
   
}
