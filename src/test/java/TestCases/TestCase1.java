package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BaseClass.MultiBrowsers;
import ObjectRepository.TestCase1_Element;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 extends MultiBrowsers{
	
@Test
public void guruTEstcase1()
{
	// open guru99.com-verify title--click on mobile- verify title-click on name dropdown-verify sorting
	
	System.out.println("hii");
	TestCase1_Element obj = new TestCase1_Element(wdriver);
	//verify title
	obj.verify_title_home();
	// click on mobile
	obj.mobile_click();
	System.out.println("mobile clicked");
	//verify title
	obj.verify_title_mobile();
	//click on drop down
	obj.dropdown_click();
	System.out.println("drop down clicked");
	//click on name
	obj.click_drpdown_name();
	// verify sorting
	obj.verify_sorting();
	
	
	
}
}
