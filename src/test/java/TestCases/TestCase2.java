package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BaseClass.MultiBrowsers;
import ObjectRepository.TestCase1_Element;
import ObjectRepository.TestCase2_Element;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 extends MultiBrowsers{
	
@Test
public void guruTEstcase1()
{
	System.out.println("hii");
	TestCase1_Element obj = new TestCase1_Element(wdriver);
	// click on mobile
	obj.mobile_click();
	System.out.println("mobile clicked");
	TestCase2_Element obj2 = new TestCase2_Element(wdriver);
	//Getting main page sony value
	obj2.sony_value1();
	//click on sony icon
	obj2.sony_click();
	//compare both prices
	obj2.price_compare();
	
	System.out.println("TC2 passed");
	
	
}
}
