package com.pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public static WebDriver driver;
	private Pom1 t;
	private Pom2 r;
	private Pom3 d;
	private Pom4 f;
	private Pom5 h;
	
	
	public PageObjectManager(WebDriver driver2) {
		this.driver= driver2;
	}

	
	public Pom1 getInstancePom1()
	{
		return t= new Pom1(driver);
	}
	
	public Pom2 getInstancePom2()
	{
		return r= new Pom2(driver);
	}
	
	public Pom3 getInstancePom3()
	{
		return d= new Pom3(driver);
	}
	public Pom4 getInstancePom4()
	{
		return f= new Pom4(driver);
	}
	
	public Pom5 getInstancePom5()
	{
		return h= new Pom5(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
}
