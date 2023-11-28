package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BreakfastDairy extends SeleniumWrappers{

	public BreakfastDairy(WebDriver driver) {
		super(driver);
		
	}
	public By vitalFarms =By.xpath("//img[@src='https://keyfood.ro/"
			+ "wp-content/uploads/2021/04/product-image-5-346x310.jpg']");

}
