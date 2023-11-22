package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class CartPretzels extends SeleniumWrappers {

	public CartPretzels(WebDriver driver) {
		super(driver);
	}
	public By buttonPlus=By.cssSelector("div>i[class='klbth-icon-plus']");
	public By buttonMinus=By.cssSelector("div>i[class='klbth-icon-minus']");
	public By subtotal=By.xpath("//td[@data-title='Subtotal'][1]");
	public By total=By.xpath("//td[@data-title='Total']");
	public By checkoutButtton=By.xpath("//a[@class='checkout-button button alt wc-forward']");
	
	public void updatePlusQty() {
		returnWebElement(buttonPlus).click();
	}
	public void updateMinusQty() {
		returnWebElement(buttonMinus).click();
	}
}
