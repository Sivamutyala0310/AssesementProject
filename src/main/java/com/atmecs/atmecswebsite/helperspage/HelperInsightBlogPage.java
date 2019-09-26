package com.atmecs.atmecswebsite.helperspage;

import com.atmecs.atmecswebsite.dataallocators.AtmecsSiteValidationDataAllocators;
import com.atmecs.atmecswebsite.dataallocators.AtmecsSiteXpathAllocators;
import com.atmecs.atmecswebsite.pageactions.PageActions;
import com.atmecs.atmecswebsite.pageactions.PageActionsScrollDown;
import com.atmecs.atmecswebsite.testbase.TestBase;
import com.atmecs.atmecswebsite.validatetest.ValidateResult;
import com.atmecs.atmecswebsite.waits.Waits;

public class HelperInsightBlogPage extends TestBase
{
	static AtmecsSiteXpathAllocators data = new AtmecsSiteXpathAllocators();
	static AtmecsSiteValidationDataAllocators validateData = new AtmecsSiteValidationDataAllocators();
	
	public static void insightBlog() throws Exception
	{
		data.getData();
		validateData.getData();
		PageActions.findElement(driver, data.getGoToInsightsXpath());
		PageActions.findElement(driver, data.getGoToBlogs());
		PageActions.clickElement(driver, data.getGoToBlogs());
		Waits.explicitWaitClick(driver, data.getSelectBlogXpath());
		String blogTitle=PageActions.fetchAttributeText(driver, data.getSelectBlogXpath());
		ValidateResult.validateData(blogTitle,validateData.getExpectedblogTitle(), "validated blog");
		PageActions.clickElement(driver,data.getClickReadMore());
		PageActionsScrollDown.homePageScrollDown(driver);
		PageActions.clickElement(driver, data.getSubmit());
		String breadcrumb=PageActions.fetchAttributeText(driver, data.getBreadcrumbXpath());
		System.out.println(breadcrumb);
		
	}
}
