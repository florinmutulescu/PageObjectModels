package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class CheckoutPage extends SeleniumWrappers{

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
    public By checkbox = By.cssSelector("input[type='checkbox']");
    public By btnPlaceOrder=By.cssSelector("button[id='place_order']");
    
    
    public By orderNumber = By.cssSelector("ul>li[class='woocommerce-"
    		+ "order-overview__order order']");
}
