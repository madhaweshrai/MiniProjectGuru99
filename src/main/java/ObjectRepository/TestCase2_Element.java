package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestCase2_Element {

	private WebDriver _webDriver = null;
	String value1;
	
	@FindBy(xpath="//*[text()='Mobile']")
	WebElement mobile;
	
	@FindBy(xpath="(//*[@title='Sort By'])[1]")
	WebElement dropdown;
	
	@FindBy(xpath="(//span[@class='price'])[1]")
	WebElement svalue1;
	
	@FindBy(xpath="//img[@id='product-collection-image-1']")
	WebElement sony;
	
	@FindBy(xpath="//span[@class='price']")
	WebElement sonypage_value;
	//span[@class='price']
	
			
	public TestCase2_Element(WebDriver driver) {
		
		_webDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void mobile_click()
	{
		mobile.click();
	}
	
	public void sony_value1()
	{
		 value1=svalue1.getText();
		System.out.println(value1);
	}
	
	public void sony_click()
	{
		sony.click();
		
	}
	public void price_compare()
	{
		//System.out.println(value1);
		String value2=sonypage_value.getText();
		System.out.println(value2+" s page value2");
		if(value1.contentEquals(value2))
		{
			System.out.println("Value matched");
		}
		
	}
}
