package ObjectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestCase3_Element {

	private WebDriver _webDriver = null;
	String value1;
	
	@FindBy(xpath="//*[text()='Mobile']")
	WebElement mobile;
	
	@FindBy(xpath="(//span[text()='Add to Cart'])[1]")
	WebElement addtocart;
	
	@FindBy(xpath="//*[@title='Qty']")
	WebElement qty;
	
	@FindBy(xpath="//button[@title='Update']//span//span[contains(text(),'Update')]")
	WebElement update;
	
	@FindBy(xpath="//*[@class='item-msg error']")
	WebElement error;
	
	@FindBy(xpath="//*[text()='Empty Cart']")
	WebElement empty_card;
	
	@FindBy(xpath="(//*[text()='You have no items in your shopping cart.'])[2]")
	WebElement cartmessage;
	
	
			
	public TestCase3_Element(WebDriver driver) {
		
		_webDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void mobile_click()
	{
		mobile.click();
	}
	
	public void add_to_cart()
	{
		addtocart.click();
	}
	public void quantity()
	{
		qty.sendKeys("1000");
		_webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		update.click();
		_webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		String errormsg= error.getText();
		System.out.println(errormsg);
		String Actualerror = "* The maximum quantity allowed for purchase is 500.";
		
	//	if(Actualerror.equalsIgnoreCase(errormsg))
			if(errormsg.contentEquals(Actualerror))
		{
			System.out.println("Error message validated");
		}
			else
			{
				System.out.println("false");
			}
		//click on empty card
		empty_card.click();
		
		String lastcartmessage= "You have no items in your shopping cart.";
		if(cartmessage.getText().equalsIgnoreCase(lastcartmessage))
		{
			System.out.println("cart is empty");
		}
		
		
	}
	
}
