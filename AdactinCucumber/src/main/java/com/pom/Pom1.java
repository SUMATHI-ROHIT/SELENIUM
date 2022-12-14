package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	public static WebDriver driver;
	
	public Pom1(WebDriver driver) {
		Pom1.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath="//input[@type='text']")
			private WebElement username;
	@FindBy(xpath="//input[@type='password']")
	
	private WebElement password;
@FindBy(xpath="//input[@type='Submit']")
	
	private WebElement login;

}
