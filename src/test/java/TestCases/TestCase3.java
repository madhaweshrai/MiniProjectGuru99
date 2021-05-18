package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BaseClass.MultiBrowsers;
import ObjectRepository.TestCase1_Element;
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
	//click on drop down
	obj.dropdown_click();
	System.out.println("drop down clicked");
	//click on name
	obj.click_drpdown_name();
	// verify sorting
	obj.verify_sorting();
	
	
	
}
}
