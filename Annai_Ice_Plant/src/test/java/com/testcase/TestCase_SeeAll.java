package com.testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.annai.module.See_All;
import com.main.Annai_Main;

public class TestCase_SeeAll extends Annai_Main{
	@Test
		public void about() {
		PageFactory.initElements(driver, See_All.class);
		See_All.see_All_Click.click();
		See_All.watch.click();
		See_All.explore.click();
		See_All.animals.click();
		See_All.pet_Care.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", See_All.video_Click);
		driver.navigate().back();
		See_All.logout_Icon.click();
		See_All.logout.click();
}
}
