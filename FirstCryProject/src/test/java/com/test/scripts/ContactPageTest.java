package com.test.scripts;

import org.testng.annotations.Test;

import BaseClassPackage.BaseDriver;

public class ContactPageTest extends BaseDriver {
	@Test
	public void contactUsClickTest() {
		lp.clickContactUs();
		cup.clickContactDetailsButton();
		cup.validateEmailAddress();
	}
}
