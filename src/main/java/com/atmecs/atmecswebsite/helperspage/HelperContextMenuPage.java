package com.atmecs.atmecswebsite.helperspage;

import org.testng.annotations.Test;

import com.atmecs.atmecswebsite.dataallocators.AtmecsSiteXpathAllocators;
import com.atmecs.atmecswebsite.pageactions.PageActions;
import com.atmecs.atmecswebsite.testbase.TestBase;

public class HelperContextMenuPage extends TestBase
{
	static AtmecsSiteXpathAllocators data = new AtmecsSiteXpathAllocators();
	
	
@Test	
public void validateMenuFields() throws Exception
{   data.getData();
String text=PageActions.fetchAttributeText(driver, "//li[@id='menu-item-25']");
System.out.println(text);
PageActions.findElement(driver, data.getClickOnServicesXpath());
PageActions.findElement(driver, data.getClickOnDigitalLifeXpath());
String texts=PageActions.fetchAttributeText(driver, data.getClickOnDigitalLifeXpath());
System.out.println(texts);



	
			
	
	}
}
