package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Performance_MangeReview_Review_Object;

public class Performance_MangeReview_Review extends CommonFnction{
	@Test
	public void Review() {
		PageFactory.initElements(driver,Performance_MangeReview_Review_Object.class);
		
		 Actions actions= new Actions(driver);
		 actions.moveToElement(Performance_MangeReview_Review_Object.Performance);
		 actions.moveToElement(Performance_MangeReview_Review_Object.ManageReviews);
		 actions.moveToElement(Performance_MangeReview_Review_Object.Reviews);
		 actions.click().build().perform();
		 
		 String txt = Performance_MangeReview_Review_Object.Test.getText();
		 assertEquals(txt.contains("Employee"), true);
		
	}

}
