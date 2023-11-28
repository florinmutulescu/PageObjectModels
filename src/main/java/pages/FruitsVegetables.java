package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class FruitsVegetables extends SeleniumWrappers{

	public FruitsVegetables(WebDriver driver) {
		super(driver);
		
	}
	
	public By melons =By.xpath("//img[@src='https://keyfood.ro/wp-content/"
			+ "uploads/2021/04/product-image-53-346x310.jpg']");

}
