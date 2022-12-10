package com.stepdefinition;

import com.baseclass.BaseClass;
import com.pom.PageObjectManager;
import com.pom.Pom1;
import com.pom.Pom2;
import com.pom.Pom3;
import com.pom.Pom4;
import com.pom.Pom5;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{

	PageObjectManager s = new PageObjectManager(driver);
	
	@Given(": User Launch the Url")
	public void user_launch_the_url() throws InterruptedException {
		Thread.sleep(2000);
	   getUrl("https://adactinhotelapp.com/"); 
	}

	@When(": User enter a Username")
	public void user_enter_a_username() throws InterruptedException {
	   Thread.sleep(2000); 
	   sendkeys(s.getInstancePom1().getUsername(), "sumathirohitriyas");
	}

	@When(": User enter the Password")
	public void user_enter_the_password() throws InterruptedException {
		Thread.sleep(2000);
	    sendkeys(s.getInstancePom1().getPassword(), "sairamjesus");
	}

	@When(": User click the login button")
	public void user_click_the_login_button() throws InterruptedException {
		Thread.sleep(2000);
	   clickOnElement(s.getInstancePom1().getLogin()); 
	}

	@When(": User select the Location")
	public void user_select_the_location() throws InterruptedException {
		Thread.sleep(2000);
	    selection(s.getInstancePom2().getLocation(), "byVisibleText", "Paris");
	}

	@When(": User select the Hotels")
	public void user_select_the_hotels() throws InterruptedException {
	   Thread.sleep(2000); 
	   selection(s.getInstancePom2().getHotels(), "byVisibleText", "Hotel Creek");
	}

	@When(": User select the Room Type")
	public void user_select_the_room_type() throws InterruptedException {
		Thread.sleep(2000);
	    selection(s.getInstancePom2().getRoomtype(), "byVisibleText", "Double");
	}

	@When(":User select the no of Rooms")
	public void user_select_the_no_of_rooms() throws InterruptedException {
		Thread.sleep(2000);
		selection(s.getInstancePom2().getRoomno(), "byVisibleText", "2 - Two");
	}

	@When(": User enter a check in Dates")
	public void user_enter_a_check_in_dates() throws InterruptedException {
		Thread.sleep(2000);
		sendkeys(s.getInstancePom2().getDatein(),"11/08/2022");
	}

	@When(": User enter a check out Dates")
	public void user_enter_a_check_out_dates() throws InterruptedException {
		Thread.sleep(2000);
		sendkeys(s.getInstancePom2().getDateout(),"12/08/2022");  
	}

	@When(": User select Adult Rooms")
	public void user_select_adult_rooms() throws InterruptedException {
		Thread.sleep(2000);
		selection(s.getInstancePom2().getAdultroom(), "byVisibleText", "2 - Two");
	}

	@When(": User select child rooms")
	public void user_select_child_rooms() throws InterruptedException {
		Thread.sleep(2000);
		selection(s.getInstancePom2().getChildroom(), "byVisibleText", "1 - One");
	}

	@When(": User click the search button")
	public void user_click_the_search_button() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(s.getInstancePom2().getSearch());
	}

	@When(": User select a Hotel")
	public void user_select_a_hotel() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(s.getInstancePom3().getSelect());
	}

	@When(": User click the continue button")
	public void user_click_the_continue_button() {
		clickOnElement(s.getInstancePom3().getSubmit());
	}

	@When(": User enter a FirstName")
	public void user_enter_a_first_name() throws InterruptedException {
		Thread.sleep(2000);
		sendkeys(s.getInstancePom4().getFirstname(), "sumathi");
	}

	@When(": User enter a Lastname")
	public void user_enter_a_lastname() throws InterruptedException {
			Thread.sleep(2000);
		sendkeys(s.getInstancePom4().getLastname(), "Mahalingam");
	}

	@When(": User enter a billing address")
	public void user_enter_a_billing_address() throws InterruptedException {
		Thread.sleep(2000);
		sendkeys(s.getInstancePom4().getAddress(), "No 15/1Rangiah st,ayanavarm,chennai-23"); 
	}

	@When(": User enter a Credit card number")
	public void user_enter_a_credit_card_number() throws InterruptedException {
	  Thread.sleep(2000);  
	  sendkeys(s.getInstancePom4().getCcno(), "2382478249123456");
	}

	@When(": User select Credit card type")
	public void user_select_credit_card_type() throws InterruptedException {
	    Thread.sleep(2000);
	    selection(s.getInstancePom4().getCctype(), "byVisibleText","VISA");
	}

	@When(": User select Expiry  month")
	public void user_select_expiry_month() throws InterruptedException {
	   Thread.sleep(2000); 
	   selection(s.getInstancePom4().getExpirydate(), "byVisibleText","December");
	}

	@When(": User select Expiry year")
	public void user_select_expiry_year() throws InterruptedException {
	  Thread.sleep(2000);  
	  selection(s.getInstancePom4().getExpiryyear(), "byVisibleText","2022");
	}
	@When(": User enter a cvv number")
	public void user_enter_a_cvv_number() throws InterruptedException {
		Thread.sleep(2000);
		sendkeys(s.getInstancePom4().getCvvno(), "6327"); 
	}

	@When(": User click the Booknow button")
	public void user_click_the_booknow_button() throws InterruptedException {
		Thread.sleep(3000);
		clickOnElement(s.getInstancePom4().getBooknow()); 
	}

	@When(":User click the Logout button")
	public void user_click_the_logout_button() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(s.getInstancePom5().getLogout());
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
