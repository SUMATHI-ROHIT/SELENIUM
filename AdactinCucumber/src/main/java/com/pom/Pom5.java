package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom5 {
	public static WebDriver driver;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;

	

	public Pom5(WebDriver driver) {
		Pom5.driver=driver;
		PageFactory.initElements(driver, this);
	}



	public WebElement getLogout() {
		return logout;
	}
}
