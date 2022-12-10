package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4 {
	public static WebDriver driver;
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstname;
	
	public Pom4(WebDriver driver) {
		Pom4.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcno() {
		return ccno;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getExpirydate() {
		return expirydate;
	}
	public WebElement getExpiryyear() {
		return expiryyear;
	}
	public WebElement getCvvno() {
		return cvvno;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	@FindBy(xpath="//input[@name='last_name']")
	
	private WebElement lastname;
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement ccno;
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cctype;
	@FindBy(xpath="//select[@name='cc_exp_month']")
	
	private WebElement expirydate;
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement expiryyear;
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvvno;
	@FindBy(xpath="//input[@type='button']")
	
	private WebElement booknow;
	
	
	
}
