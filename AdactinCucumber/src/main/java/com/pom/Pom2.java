package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
	public static WebDriver driver;
	@FindBy(xpath = "//select[@name='location']")
         private WebElement location;
	
	
	public Pom2(WebDriver driver) {
		Pom2.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomno() {
		return roomno;
	}
	public WebElement getDatein() {
		return datein;
	}
	public WebElement getDateout() {
		return dateout;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	@FindBy(xpath="//select[@name='hotels']")
         private WebElement hotels;
	@FindBy(xpath = "//select[@name='room_type']")
    private WebElement roomtype;
    @FindBy(xpath="//select[@name='room_nos']")
    private WebElement roomno;
    @FindBy(xpath = "//input[@name='datepick_in']")
    private WebElement datein;
@FindBy(xpath="//input[@name='datepick_out']")
    private WebElement dateout;
@FindBy(xpath = "//select[@name='adult_room']")
private WebElement adultroom;
@FindBy(xpath="//select[@name='child_room']")
private WebElement childroom;
@FindBy(xpath="//input[@type='submit']")

	private WebElement search;

public WebElement getSearch() {
	return search;

}
}
