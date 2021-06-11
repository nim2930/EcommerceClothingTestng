package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageObjects {
	public WebDriver driver;

	public MainPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement WomenButtonLink;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement DressesButtonLink;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	WebElement TShirtsButtonLink;
	
	@FindBy(xpath="//*[@id=\"home-page-tabs\"]/li[1]/a")
	WebElement PopularLink;
	
	@FindBy(xpath="//*[@id=\"home-page-tabs\"]/li[2]/a")
	WebElement BestSellersLink;
	
	@FindBy(xpath="//*[@id=\"footer\"]/div/section[5]/h4/a")
	WebElement MyaccountLink;
	
	
	
	
	
	 public void clickWomenButtonLink() {
		 WomenButtonLink.click();
		 
	  }
	 
	 public void clickDressesButtonLink() {
		 DressesButtonLink.click();
      }
	 
	 public void clickTShirtsButtonLink() {
		 TShirtsButtonLink.click();
      }


}
