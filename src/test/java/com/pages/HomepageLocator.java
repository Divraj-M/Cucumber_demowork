package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageLocator {
	@FindBy(xpath="//h6[text()='Dashboard']")
	public WebElement DashBoard;

}
