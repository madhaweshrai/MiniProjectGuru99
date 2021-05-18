package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestCase1_Element {

	private WebDriver _webDriver = null;
	
	
	@FindBy(xpath="//*[text()='Mobile']")
	WebElement mobile;
	
	@FindBy(xpath="(//*[@title='Sort By'])[1]")
	WebElement dropdown;
	
	
	public TestCase1_Element(WebDriver driver) {
		
		_webDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verify_title_home()
	{
		String Actualtitle= "Home page";
		String Exp_title=_webDriver.getTitle();
		System.out.println(Exp_title);
		Assert.assertEquals(Actualtitle, Exp_title);
	}
	public void mobile_click()
	{
		mobile.click();
	}
	public void verify_title_mobile()
	{
		String Actualtitle= "Mobile";
		String Exp_title=_webDriver.getTitle();
		System.out.println(Exp_title);
		Assert.assertEquals(Actualtitle, Exp_title);
	}
	public void dropdown_click()
	{
		dropdown.click();
	}
	public void click_drpdown_name()
	{
		Select obj= new Select(dropdown);
		obj.selectByVisibleText("Name");
		
	}
	public void verify_sorting()
	{
		System.out.println("sorting done");
		// store elements one by one and the assert them
		/*
		 * String sortElement =
		 * driver.findElement(By.xpath("//li[1]//a[@class=\"product-image\"]")).
		 * getAttribute("title"); Assert.assertEquals(sortElement, "IPhone");
		 * sortElement =
		 * driver.findElement(By.xpath("//li[2]//a[@class=\"product-image\"]")).
		 * getAttribute("title"); Assert.assertEquals(sortElement, "Samsung Galaxy");
		 * sortElement =
		 * driver.findElement(By.xpath("//li[3]//a[@class=\"product-image\"]")).
		 * getAttribute("title"); Assert.assertEquals(sortElement, "Xperia");
		 */
	}
}
