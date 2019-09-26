package com.atmecs.atmecswebsite.dataallocators;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.atmecswebsite.constants.ConstantFilePaths;

public class AtmecsSiteValidationDataAllocators
{
	String footerTextDimension;
	String footerTextLength;
	String ExpectedblogTitle;
		Properties properties;

	public void getData() throws IOException {
		properties = com.atmecs.atmecswebsite.utils.ReadLocatorsFile
				.loadProperty(ConstantFilePaths.ValidationTESTDATA_FILE);
		setFooterTextDimension();
		setFooterTextLength();
		setExpectedblogTitle();
	}

	public String getFooterTextDimension() {
		return footerTextDimension;
	}

	public void setFooterTextDimension() {
		footerTextDimension = properties.getProperty("footerTextDimension");
	}

	public String getFooterTextLength() {
		return footerTextLength;
	}

	public void setFooterTextLength() {
		footerTextLength = properties.getProperty("footerTextLength");
	}
	public String getExpectedblogTitle() {
		return ExpectedblogTitle;
	}

	public void setExpectedblogTitle() {
		ExpectedblogTitle = properties.getProperty("expectedblogTitle");
	}


	public static void main(String[] args) throws IOException {
		AtmecsSiteXpathAllocators keys = new AtmecsSiteXpathAllocators();
		keys.getData();
	}
}