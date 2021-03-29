package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Organization_GeneralInformation_Object {
	
	@FindBy(linkText="Admin")
	public static  WebElement Admin;
	
	@FindBy(xpath="//ul//li[3]//a[@id='menu_admin_Organization']")
	public static  WebElement Organization;
	
	@FindBy(xpath="//ul//li[1]//a[@id='menu_admin_viewOrganizationGeneralInformation']")
	public static  WebElement GeneralInformation;
	
	@FindBy(xpath="//p//input[@id='btnSaveGenInfo']")
	public static  WebElement Editbtn;
	
	@FindBy(xpath="//*[@id='organization_note']")
	public static  WebElement Note;
	
	@FindBy(xpath="//*[@id=\"btnSaveGenInfo\"]")
	public static  WebElement  SaveBtn;
	
	@FindBy(xpath="//*[@id=\"content\"]/script[1]")
	public static  WebElement Ast;

}
