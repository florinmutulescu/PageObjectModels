package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class ZeviaKidzStrawberryLemonade extends SeleniumWrappers{

	public ZeviaKidzStrawberryLemonade(WebDriver driver) {
		super(driver);
	}
	public By addToWishlist  =By.xpath("(//a[@data-tinv-wl-product='196'])[2]");
	public By viewZeviaKidzWishlist=By.cssSelector("div[class='tinv-modal-inner']");
	 public By buttonClose=By.cssSelector("button[class='button tinvwl_button_close']");
}
