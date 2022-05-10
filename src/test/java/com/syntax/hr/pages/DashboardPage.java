package com.syntax.hr.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.syntax.hr.utils.CommonMethods;

public class DashboardPage extends CommonMethods {

	@FindBy(xpath = "//*[@class='menu']/ul/li")
	public List<WebElement> dashboardTabs;

	@FindBy(id = "welcome")
	public WebElement welcomeMessage;

	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

}
