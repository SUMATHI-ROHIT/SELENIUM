package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Admin\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\feature\\Adactin.feature", glue ="com.stepdefinition")


public class runner {

	
	
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() {
		driver = BaseClass.browser("chrome");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
