package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Organization_Location_Object {
   
	@FindBy(linkText="Admin")
	public static WebElement Admin;
	
	@FindBy(xpath="//li[3]//a[@id='menu_admin_Organization']")
	public static WebElement Organization;
	
	
	
	@FindBy(xpath="//ul//li[2]//a[@id='menu_admin_viewLocations']")
	public static WebElement Locations;
	
	
	@FindBy(xpath="//*[@id=\"searchLocation_name\"]")
	public static WebElement Location_name;
	
	
	@FindBy(xpath="//*[@id=\"searchLocation_city\"]")
	public static WebElement City;
	
	
	@FindBy(xpath="//*[@id=\"searchLocation_country\"]/option[1]")
	public static WebElement country;
	
	@FindBy(xpath="//input[@id='btnSearch']")
	public static WebElement  searchBtn;
	
	@FindBy(xpath="")
	public static WebElement ast;
}
