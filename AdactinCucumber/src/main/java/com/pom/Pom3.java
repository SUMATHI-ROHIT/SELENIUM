package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {
	public static WebDriver driver;
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement select;
	
	public Pom3(WebDriver driver) {
		Pom3.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSelect() {
		return select;
	}
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
}
