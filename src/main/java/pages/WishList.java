package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumWrappers;

public class WishList extends SeleniumWrappers{

	public WishList(WebDriver driver) {
		super(driver);
	}
	public By shimmerPastelAlmondLink=By.xpath("(//td[@class='product-name'])[2]");
	public By addToCartShimmerLink=By.xpath("(//span[@class='tinvwl-txt'])[2]");
	
	public By vitalFarmsPastureLink=By.xpath("(//td[@class='product-name'])[1]");
	public By addToCartVitalFarmsLink=By.xpath("(//span[@class='tinvwl-txt'])[1]");
	
	public By melonsLink=By.xpath("(//td[@class='product-name'])[3]");
	public By addToCartFreshProduceMelonsLink=By.xpath("(//span[@class='tinvwl-txt'])[3]");
	
	public By zeviaLink=By.xpath("(//td[@class='product-name'])[4]");
	public By addToCartZeviaLink=By.xpath("(//span[@class='tinvwl-txt'])[4]");
	
	public By selectieTotalaProduseLink=By.xpath("//th[@class='product-cb']");
	
	public By actionsDropDown=By.id("tinvwl_product_actions");
	public By applyActionButton =By.cssSelector("button[title='Apply Action']");
	
	public By eroareProdus=By.cssSelector("ul[class='woocommerce-error']");
	public By produsRamasDefaultWishlist=By.cssSelector("ul[class='woocommerce-error']");
	
	public void filterByIndex(int index) {	
		Select selectObj =  new Select(returnWebElement(actionsDropDown));
		selectObj.selectByIndex(index);
	
}
	public String getCurrentSelectedOption() {
		Select selectObj =  new Select(returnWebElement(actionsDropDown));
		return selectObj.getFirstSelectedOption().getText();
	}
	}
