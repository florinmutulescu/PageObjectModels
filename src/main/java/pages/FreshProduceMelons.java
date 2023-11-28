package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class FreshProduceMelons extends SeleniumWrappers{

	public FreshProduceMelons(WebDriver driver) {
		super(driver);
		
	}
	public By addToWishlist  =By.xpath("(//a[@data-tinv-wl-product='401'])[2]");
	
	public By viewMelonsWishlist=By.cssSelector("div[class='tinv-modal-inner']");
    public By buttonClose=By.xpath("//button[@class='button tinvwl_button_close']");
}
