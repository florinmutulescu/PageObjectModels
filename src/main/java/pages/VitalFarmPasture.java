package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class VitalFarmPasture extends SeleniumWrappers {

	public VitalFarmPasture(WebDriver driver) {
		super(driver);
	}
	
	public By addToWishlist  =By.xpath("(//a[@data-tinv-wl-product='221'])[2]");
	public By viewVitalFarmPastureWishlist=By.xpath("//div[@class='tinv-modal-inner']");
	 public By buttonClose=By.xpath("//button[@class='button tinvwl_button_close']");
}
