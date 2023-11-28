package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class ShimmerPastelAlmond extends SeleniumWrappers{

	public ShimmerPastelAlmond(WebDriver driver) {
		super(driver);
	}
	public By addToWishlist  =By.xpath("(//a[@data-tinv-wl-product='266'])[2]");
	public By viewShimmerPastelAlmondWishlist=By.cssSelector("div[class='tinv-modal-inner']");
	 public By buttonClose=By.cssSelector("button[class='button tinvwl_button_close']");
	
}
