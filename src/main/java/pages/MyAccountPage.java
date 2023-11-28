package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class MyAccountPage extends SeleniumWrappers {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	} 
	public By userField =By.id("username");
	public By passField =By.id("password");
	public By loginButton =By.cssSelector("button[name='login']");
	public By errorMsg = By.cssSelector("ul[class='woocommerce-error'] strong");
	public By successMsg = By.cssSelector("div[class='woocommerce-MyAccount-content']");
	public By logoutButton = By.xpath("//a[contains(text(), 'Log out')]");
	//public By allCategories= By.xpath("//a[contains(text(), 'ALL CATEGORIES')]");
	public By allCategories= By.xpath("//div[@class='all-categories locked']");
	public By fruitsVegetables = By.xpath("//div/ul/li/a[contains(text(),'Fruits & Vegetables')]");
	public By breakfastDairy = By.xpath("//li[@class='category-parent  menu-item menu-item-type-taxonomy menu-item-object-product_cat']/a[@href="
			+ "'https://keyfood.ro/product-category/breakfast-dairy/']");
	public By biscuitsSnacks =By.xpath("//a[text()=' Biscuits & Snacks']");
	public By beverages =By.xpath("(//a[@href='https://keyfood.ro/product-category/beverages/'])[2]");
	
	public void loginInApp(String user,String pass) {
		sendKeys(userField,user);
		sendKeys(passField,pass);
		click(loginButton);
	}
	
	
}
