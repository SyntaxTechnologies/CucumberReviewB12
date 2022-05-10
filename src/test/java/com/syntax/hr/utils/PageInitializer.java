package com.syntax.hr.utils;

import com.syntax.hr.pages.AddEmployeePage;
import com.syntax.hr.pages.DashboardPage;
import com.syntax.hr.pages.LoginPage;

public class PageInitializer {

	public static LoginPage login;
	public static AddEmployeePage addEmployeePage;
	public static DashboardPage dash;

	public static void intializePageObjects() {
		login = new LoginPage();
		dash = new DashboardPage();
		addEmployeePage = new AddEmployeePage();
	}
}
