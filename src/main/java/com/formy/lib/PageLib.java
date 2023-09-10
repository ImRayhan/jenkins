package com.formy.lib;



import org.openqa.selenium.WebDriver;
import com.formy.pages.CheckBox_Page;

public class PageLib {
	WebDriver driver;


	CheckBox_Page checkBox_Page;

	public PageLib(WebDriver driver) {
		this.driver = driver;

		checkBox_Page = new CheckBox_Page(driver);

	}


	public CheckBox_Page CheckBoxPage() {
		return checkBox_Page;

	}


}
