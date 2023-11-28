package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class Beverages  extends SeleniumWrappers{

	public Beverages(WebDriver driver) {
		super(driver);
	}
	public By zeviaKidsLemonade=By.cssSelector("img[alt='Zevia Kidz Strawberry Lemonade Zero Calorie Soda']");


}
