package com.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Base_Annai {

public static void sendkeys(String str, WebElement element) {
	element.sendKeys(str);
}




public static void selection(int index, WebElement element) {
	Select select_Main = new Select(element);
	select_Main.selectByIndex(index);
}
public static void alert(WebDriver diver) {
	Alert alertt = diver.switchTo().alert();
	alertt.accept();
}
}
