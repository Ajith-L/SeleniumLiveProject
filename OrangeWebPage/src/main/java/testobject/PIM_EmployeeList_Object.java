package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIM_EmployeeList_Object {

	@FindBy(linkText="PIM")
	public  static WebElement PIM;

    
   @FindBy(xpath="//*[@id='menu_pim_viewEmployeeList']")
   public static WebElement EmployeeList;

   @FindBy(xpath="//input[@id='empsearch_employee_name_empName']")
   public static WebElement Name ;

   @FindBy(xpath="//input[@id='empsearch_id']")
   public static WebElement Id ;
   
   @FindBy(xpath="//input[@id='searchBtn']")
   public static WebElement  SearchBtn;
   
   @FindBy(xpath="//*[@id='tableWrapper']")
   public static WebElement Test;
}
