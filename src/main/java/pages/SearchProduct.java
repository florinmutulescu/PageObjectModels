package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class SearchProduct extends SeleniumWrappers{

	public SearchProduct(WebDriver driver) {
		super(driver);
	}
	public By searchField =By.cssSelector("input[id='dgwt-wcas-search-input-1']");
	public By searchField1=By.xpath("//a[contains(@class,'dgwt-wcas-suggestion')]");
	
	
	
	
	

}
