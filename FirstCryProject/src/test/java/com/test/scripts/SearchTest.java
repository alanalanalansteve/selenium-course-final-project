package com.test.scripts;

import org.testng.annotations.Test;

import BaseClassPackage.BaseDriver;

public class SearchTest extends BaseDriver {
	@Test
	public void searchForAnythingTest() {
		lp.enterSearchKey("diaper");
		lp.searchBTNClick();
		srp.checkDiaperSearchHeader();
	}
}
