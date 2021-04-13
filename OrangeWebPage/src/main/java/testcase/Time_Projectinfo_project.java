package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Time_Projectinfo_project_Object;

public class Time_Projectinfo_project extends CommonFnction {
	
	@Test
	public void Projectinfo_projec() {
	PageFactory.initElements(driver,Time_Projectinfo_project_Object.class) ;
	Actions actions = new Actions(driver);
	actions.moveToElement(Time_Projectinfo_project_Object.Time);
	actions.moveToElement(Time_Projectinfo_project_Object.ProjectInfo);
	actions.moveToElement(Time_Projectinfo_project_Object.project);
	actions.click().build().perform();
			
		}
	    

}
