package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BaseClass.MultiBrowsers;
import ObjectRepository.TestCase1_Element;
import ObjectRepository.TestCase3_Element;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 extends MultiBrowsers{
	
@Test
public void guruTEstcase1()
{
	System.out.println("hii");
	TestCase1_Element obj = new TestCase1_Element(wdriver);
	// click on mobile
	obj.mobile_click();
	System.out.println("mobile clicked");
	
	TestCase3_Element obj3 = new TestCase3_Element(wdriver);
	//click on add to cart
	obj3.add_to_cart();
	//enter 1000 in quantity
	
	//click on update
	
	//verify error message,click on empty cart and verify cart is empty
	
	obj3.quantity();
	
	
	
	
}
}
