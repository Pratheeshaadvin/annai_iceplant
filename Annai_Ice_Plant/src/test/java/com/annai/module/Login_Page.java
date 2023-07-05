package com.annai.module;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.main.Annai_Main;

public class Login_Page {
	@FindBy(xpath = "//input[@id='email']")
	public static WebElement email;
	@FindBy(xpath = "//input[@id='pass']")
	public static WebElement pass;
	@FindBy(xpath = "//button[@name='login']")
	public static WebElement login_Btn;
	

}
