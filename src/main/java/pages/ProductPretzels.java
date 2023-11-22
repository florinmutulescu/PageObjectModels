package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class ProductPretzels extends SeleniumWrappers{

	public ProductPretzels(WebDriver driver) {
		super(driver);	
	}
	public By buttonAdd =By.xpath("//button[@class='single_add_to_cart_button button alt']");
	public By msgPretzels=By.xpath("//div[@class='woocommerce-notices-wrapper']");
	public By viewCart=By.cssSelector("div>a[class='button wc-forward']");
}
