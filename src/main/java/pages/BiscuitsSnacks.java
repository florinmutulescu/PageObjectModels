package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BiscuitsSnacks extends SeleniumWrappers {

	public BiscuitsSnacks(WebDriver driver) {
		super(driver);
		
	}
	public By shimmerPastel=By.xpath("//img[@alt='Shimmer Pastel Almond Blend']");

}
