package com.test.scripts;

import org.testng.annotations.Test;

import BaseClassPackage.BaseDriver;

public class StoresButtonTest extends BaseDriver {
	@Test
	public void storesButtonClickTest() throws InterruptedException { 
		lp.hoverAndClickFindStores();
		slp.checkStoreLocatorPageText();
	}
}
