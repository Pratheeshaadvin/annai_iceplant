package com.annai.module;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class See_All {
	@FindBy(xpath = "//span[text()='See all']")
	public static WebElement see_All_Click;
	@FindBy(xpath = "(//img[@class='x1b0d499 xl1xv1r'])[2]")
	public static WebElement watch;
	@FindBy(xpath = "(//span[text()='Explore'])[1]")
	public static WebElement explore;
	@FindBy(xpath = "//span[text()='Animals & Pets']")
	public static WebElement animals;
	@FindBy(xpath = "//span[text()='Pet Care']")
	public static WebElement pet_Care;
	@FindBy(xpath = "(//img[@alt='Video thumbnail'])[1]")
	public static WebElement video_Click;
	@FindBy(xpath = "//div[@class='x78zum5 x1n2onr6']")
	public static WebElement logout_Icon;
	@FindBy(xpath = "//span[text()='Log out']")
	public static WebElement logout;
	
}
