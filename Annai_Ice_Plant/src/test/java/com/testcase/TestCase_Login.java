package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.annai.module.Login_Page;
import com.main.Annai_Main;

public class TestCase_Login extends Annai_Main {
	@Test
	public void login_Auth() {
	PageFactory.initElements(driver, Login_Page.class);	
	Login_Page.email.sendKeys("pratheeshaadvin04@gmail.com");
	Login_Page.pass.sendKeys("prathee04");
	Login_Page.login_Btn.click();
	}
}
