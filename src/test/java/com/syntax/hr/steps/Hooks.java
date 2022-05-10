package com.syntax.hr.steps;

import com.syntax.hr.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void start() {
		CommonMethods.openBrowserAndLauchApplication();
	}

	@After
	public void end(Scenario scenario) {
		byte[] pic;
		// scenario class from cucumber holds the complete information of our execution
		if (scenario.isFailed()) {
			pic = CommonMethods.takeScreenshot("failed/" + scenario.getName());
		} else {
			pic = CommonMethods.takeScreenshot("passed/" + scenario.getName());
		}
		// it will attach the pic in report
		scenario.attach(pic, "image/png", scenario.getName());
		CommonMethods.tearDown();
	}

}
