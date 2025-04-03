package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.pages.HomepageLocator;
import com.utilities.HelperClass;

public class HomepageActions {
	HomepageLocator homepagelocator=null;
	public HomepageActions()
	{
		this.homepagelocator=new HomepageLocator();
		PageFactory.initElements(HelperClass.getDriver(), homepagelocator);
	}
	
	public String getHomepageText()
	{
		return homepagelocator.DashBoard.getText();
	}

	
}
